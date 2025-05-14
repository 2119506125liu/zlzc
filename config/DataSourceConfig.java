package com.zlzc.config;
import java.util.Properties;
import javax.sql.DataSource;
import org.apache.ibatis.session.SqlSessionFactory;
import org.mybatis.spring.SqlSessionFactoryBean;
import org.mybatis.spring.SqlSessionTemplate;
import org.mybatis.spring.annotation.MapperScan;
import org.springframework.aop.framework.autoproxy.BeanNameAutoProxyCreator;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.boot.web.servlet.FilterRegistrationBean;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;
import org.springframework.core.io.support.PathMatchingResourcePatternResolver;
import org.springframework.jdbc.datasource.DataSourceTransactionManager;
import org.springframework.transaction.PlatformTransactionManager;
import org.springframework.transaction.annotation.EnableTransactionManagement;
import org.springframework.transaction.interceptor.TransactionInterceptor;
import org.springframework.context.annotation.PropertySource;
import com.alibaba.druid.pool.DruidDataSource;
@Configuration
@EnableTransactionManagement
@MapperScan(basePackages = { "com.zlzc.dao" }, sqlSessionFactoryRef = "sqlSessionFactory")

public class DataSourceConfig {
    @Bean(name = "datasource")
  //配置文件里的属性名是不需要写成spring.datasource.xxx的形式的，写成a.b.c.url也没有问题，只要在配置bean时指定前缀为a.b.c
    @ConfigurationProperties(prefix = "spring.datasource.dev")
    @Primary
    public DataSource testDataSource() {
        return new DruidDataSource();
    }
    @Bean(name = "sqlSessionFactory")
    @Primary
    public SqlSessionFactory testSqlSessionFactory(@Qualifier("datasource") DataSource dataSource) throws Exception {
        SqlSessionFactoryBean bean = new SqlSessionFactoryBean();
        System.out.println("数据库配置："+dataSource);
        bean.setDataSource(dataSource);
        bean.setMapperLocations(new PathMatchingResourcePatternResolver().getResources("classpath:/mapper/*.xml"));
        // 开启驼峰命名转换
        org.apache.ibatis.session.Configuration configuration = new org.apache.ibatis.session.Configuration();
        configuration.setMapUnderscoreToCamelCase(true);
        bean.setConfiguration(configuration);
        return bean.getObject();
    }
    @Bean(name = "transactionManager")
    @Primary
    public DataSourceTransactionManager testTransactionManager(@Qualifier("datasource") DataSource dataSource) {
        return new DataSourceTransactionManager(dataSource);
    }
    @Bean(name = "sqlSessionTemplate")
    @Primary
    public SqlSessionTemplate testSqlSessionTemplate(@Qualifier("sqlSessionFactory") SqlSessionFactory sqlSessionFactory) throws Exception {
        return new SqlSessionTemplate(sqlSessionFactory);
    }
    @Bean(name = "txAdvice")
    @Primary
    public TransactionInterceptor transactionInterceptor(PlatformTransactionManager transactionManager) {
        final String PROPAGATION_REQUIRED = "PROPAGATION_REQUIRED,-Exception";
        TransactionInterceptor interceptor = new TransactionInterceptor();
        interceptor.setTransactionManager(transactionManager);
        Properties transactionAttributes = new Properties();
        // TransactionDefinition.PROPAGATION_REQUIRED;
        transactionAttributes.setProperty("insert*", PROPAGATION_REQUIRED);
        transactionAttributes.setProperty("update*", PROPAGATION_REQUIRED);
        transactionAttributes.setProperty("delete*", PROPAGATION_REQUIRED);
        transactionAttributes.setProperty("select*", PROPAGATION_REQUIRED + ",readOnly");
        interceptor.setTransactionAttributes(transactionAttributes);
        return interceptor;
    }
    @Bean
    @Primary
    public BeanNameAutoProxyCreator transactionAutoProxy() {
        BeanNameAutoProxyCreator bapc = new BeanNameAutoProxyCreator();
        bapc.setExposeProxy(true);
        bapc.setBeanNames("*ServiceImpl");
        bapc.setInterceptorNames("txAdvice");
        return bapc;
    }
}
