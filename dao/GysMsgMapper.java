package com.zlzc.dao;
import com.zlzc.model.GysMsg;
import com.zlzc.model.GysMsgExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;
public interface GysMsgMapper {
	long countByExample(GysMsgExample example);
	int deleteByExample(GysMsgExample example);
	int deleteByPrimaryKey(Integer id);
	int insert(GysMsg record);
	int insertSelective(GysMsg record);
	List<GysMsg> selectByExample(GysMsgExample example);
	GysMsg selectByPrimaryKey(Integer id);
	int updateByExampleSelective(@Param("record") GysMsg record, @Param("example") GysMsgExample example);
	int updateByExample(@Param("record") GysMsg record, @Param("example") GysMsgExample example);
	int updateByPrimaryKeySelective(GysMsg record);
	int updateByPrimaryKey(GysMsg record);
}
