package com.imsystem.mapper;

import com.imsystem.domain.Customer;
import com.imsystem.domain.CustomerExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface CustomerMapper {
	List<Customer> queryCustomerByPage(@Param("zero") Double zero, @Param("content") String content);
	
	int updateCustomer(Customer cObj);
	
	int deleteCustomer(String id);
	
	List<Customer> selectAllCustomer();
	
	List<Customer> selectCustomerByStore(@Param("sid")String sid);
	
	int update(@Param("id")String id,@Param("money")Double money);
	
	int updateplug(@Param("id")String id,@Param("money")Double money);
	
    int countByExample(CustomerExample example);

    int deleteByExample(CustomerExample example);

    int deleteByPrimaryKey(String id);

    int insert(Customer record);

    int insertSelective(Customer record);

    List<Customer> selectByExampleWithBLOBs(CustomerExample example);

    List<Customer> selectByExample(CustomerExample example);

    Customer selectByPrimaryKey(String id);

    int updateByExampleSelective(@Param("record") Customer record, @Param("example") CustomerExample example);

    int updateByExampleWithBLOBs(@Param("record") Customer record, @Param("example") CustomerExample example);

    int updateByExample(@Param("record") Customer record, @Param("example") CustomerExample example);

    int updateByPrimaryKeySelective(Customer record);

    int updateByPrimaryKeyWithBLOBs(Customer record);

    int updateByPrimaryKey(Customer record);
}