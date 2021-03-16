package com.fourgroup.controller;

import com.fourgroup.pojo.Obuser;
import com.fourgroup.service.ObuserService;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;

/**
 * (Obuser)表控制层
 *
 * @author makejava
 * @since 2020-08-26 17:02:37
 */
@RestController
public class ObuserController {
    /**
     * 服务对象
     */
    @Autowired
    private ObuserService obuserService;

    /**
     * 通过主键查询单条数据
     *
     * @param id 主键
     * @return 单条数据
     */
    @GetMapping("selectOne")
    public Obuser selectOne(String id) {
        return this.obuserService.queryById(id);
    }

}