package com.zlzc.dao;
import com.zlzc.model.ZbMsg;
import com.zlzc.model.ZbMsgExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;
public interface ZbMsgMapper {
	long countByExample(ZbMsgExample example);
	int deleteByExample(ZbMsgExample example);
	int deleteByPrimaryKey(Integer id);
	int insert(ZbMsg record);
	int insertSelective(ZbMsg record);
	List<ZbMsg> selectByExample(ZbMsgExample example);
	ZbMsg selectByPrimaryKey(Integer id);
	int updateByExampleSelective(@Param("record") ZbMsg record, @Param("example") ZbMsgExample example);
	int updateByExample(@Param("record") ZbMsg record, @Param("example") ZbMsgExample example);
	int updateByPrimaryKeySelective(ZbMsg record);
	int updateByPrimaryKey(ZbMsg record);
}
