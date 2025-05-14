package com.zlzc.dao;
import com.zlzc.model.CgMsg;
import com.zlzc.model.CgMsgExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;
public interface CgMsgMapper {
	long countByExample(CgMsgExample example);
	int deleteByExample(CgMsgExample example);
	int deleteByPrimaryKey(Integer id);
	int insert(CgMsg record);
	int insertSelective(CgMsg record);
	List<CgMsg> selectByExample(CgMsgExample example);
	CgMsg selectByPrimaryKey(Integer id);
	int updateByExampleSelective(@Param("record") CgMsg record, @Param("example") CgMsgExample example);
	int updateByExample(@Param("record") CgMsg record, @Param("example") CgMsgExample example);
	int updateByPrimaryKeySelective(CgMsg record);
	int updateByPrimaryKey(CgMsg record);
}
