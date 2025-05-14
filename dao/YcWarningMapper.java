package com.zlzc.dao;
import com.zlzc.model.YcWarning;
import com.zlzc.model.YcWarningExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;
public interface YcWarningMapper {
	long countByExample(YcWarningExample example);
	int deleteByExample(YcWarningExample example);
	int deleteByPrimaryKey(Integer id);
	int insert(YcWarning record);
	int insertSelective(YcWarning record);
	List<YcWarning> selectByExample(YcWarningExample example);
	YcWarning selectByPrimaryKey(Integer id);
	int updateByExampleSelective(@Param("record") YcWarning record, @Param("example") YcWarningExample example);
	int updateByExample(@Param("record") YcWarning record, @Param("example") YcWarningExample example);
	int updateByPrimaryKeySelective(YcWarning record);
	int updateByPrimaryKey(YcWarning record);
}
