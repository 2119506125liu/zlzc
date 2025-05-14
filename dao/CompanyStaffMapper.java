package com.zlzc.dao;
import com.zlzc.model.CompanyStaff;
import com.zlzc.model.CompanyStaffExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;
public interface CompanyStaffMapper {
	long countByExample(CompanyStaffExample example);
	int deleteByExample(CompanyStaffExample example);
	int deleteByPrimaryKey(Integer id);
	int insert(CompanyStaff record);
	int insertSelective(CompanyStaff record);
	List<CompanyStaff> selectByExample(CompanyStaffExample example);
	CompanyStaff selectByPrimaryKey(Integer id);
	int updateByExampleSelective(@Param("record") CompanyStaff record, @Param("example") CompanyStaffExample example);
	int updateByExample(@Param("record") CompanyStaff record, @Param("example") CompanyStaffExample example);
	int updateByPrimaryKeySelective(CompanyStaff record);
	int updateByPrimaryKey(CompanyStaff record);
}
