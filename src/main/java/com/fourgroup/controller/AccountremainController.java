package com.fourgroup.controller;

import com.fourgroup.pojo.Accountremain;
import com.fourgroup.service.AccountremainService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;

/**
 * (Accountremain)表控制层
 *
 * @author makejava
 * @since 2020-09-01 16:56:20
 */
@RestController
@RequestMapping("accountremain")//在浏览器中请求映射
public class AccountremainController {
    /**
     * 服务对象
     */
    @Autowired
    private AccountremainService accountremainService;

    /**
     * 通过主键查询单条数据
     *
     * @param id 主键
     * @return 单条数据
     */
    @GetMapping("selectOne") //对应数据库中的映射
    public Accountremain selectOne(Integer id) {
        return this.accountremainService.queryById(id);
    }

}