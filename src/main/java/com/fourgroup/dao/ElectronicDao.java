package com.fourgroup.dao;

import com.fourgroup.pojo.Account;
import com.fourgroup.pojo.ElectronicReceipt;
import org.apache.ibatis.annotations.Mapper;

@Mapper  //对应数据库除主键外的值
public interface ElectronicDao {
    ElectronicReceipt findEle(ElectronicReceipt electronicReceipt);

    Account findAcc(String account);
}
