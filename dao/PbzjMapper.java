package com.zlzc.dao;
import com.zlzc.model.Pbzj;
import com.zlzc.model.PbzjExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;
public interface PbzjMapper {
	long countByExample(PbzjExample example);
	int deleteByExample(PbzjExample example);
	int deleteByPrimaryKey(Integer id);
	int insert(Pbzj record);
	int insertSelective(Pbzj record);
	List<Pbzj> selectByExample(PbzjExample example);
	Pbzj selectByPrimaryKey(Integer id);
	int updateByExampleSelective(@Param("record") Pbzj record, @Param("example") PbzjExample example);
	int updateByExample(@Param("record") Pbzj record, @Param("example") PbzjExample example);
	int updateByPrimaryKeySelective(Pbzj record);
	int updateByPrimaryKey(Pbzj record);
}
