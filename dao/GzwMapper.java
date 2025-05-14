package com.zlzc.dao;
import com.zlzc.model.Gzw;
import com.zlzc.model.GzwExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;
public interface GzwMapper {
	long countByExample(GzwExample example);
	int deleteByExample(GzwExample example);
	int deleteByPrimaryKey(Integer id);
	int insert(Gzw record);
	int insertSelective(Gzw record);
	List<Gzw> selectByExample(GzwExample example);
	Gzw selectByPrimaryKey(Integer id);
	int updateByExampleSelective(@Param("record") Gzw record, @Param("example") GzwExample example);
	int updateByExample(@Param("record") Gzw record, @Param("example") GzwExample example);
	int updateByPrimaryKeySelective(Gzw record);
	int updateByPrimaryKey(Gzw record);
}
