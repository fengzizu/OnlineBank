package com.fourgroup.biz;

import com.fourgroup.pojo.Account;
import com.fourgroup.pojo.ElectronicReceipt;
//对应Electronic相关实现接口
public interface ElectronicBiz {
    ElectronicReceipt findElectronic(ElectronicReceipt elec);

    Account findAccount(String account);
}
