package com.fourgroup.controller;

import com.fourgroup.pojo.Network;
import com.fourgroup.service.NetworkService;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;

/**
 * (Network)表控制层
 *
 * @author makejava
 * @since 2020-09-01 17:09:44
 */
@RestController
@RequestMapping("network")
public class NetworkController {
    /**
     * 服务对象
     */
    @Autowired
    private NetworkService networkService;

    /**
     * 通过主键查询单条数据
     *
     * @param id 主键
     * @return 单条数据
     */
    @GetMapping("selectOne")
    public Network selectOne(Integer id) {
        return this.networkService.queryById(id);
    }

}