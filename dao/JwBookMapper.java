package com.zlzc.dao;
import com.zlzc.model.JwBook;
import com.zlzc.model.JwBookExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;
public interface JwBookMapper {
	long countByExample(JwBookExample example);
	int deleteByExample(JwBookExample example);
	int deleteByPrimaryKey(Integer id);
	int insert(JwBook record);
	int insertSelective(JwBook record);
	List<JwBook> selectByExample(JwBookExample example);
	JwBook selectByPrimaryKey(Integer id);
	int updateByExampleSelective(@Param("record") JwBook record, @Param("example") JwBookExample example);
	int updateByExample(@Param("record") JwBook record, @Param("example") JwBookExample example);
	int updateByPrimaryKeySelective(JwBook record);
	int updateByPrimaryKey(JwBook record);
}
