package com.fourgroup.controller;

import com.fourgroup.pojo.Otherbank;
import com.fourgroup.service.OtherbankService;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;

/**
 * (Otherbank)表控制层
 *
 * @author makejava
 * @since 2020-08-27 23:46:33
 */
@RestController
@RequestMapping("otherbank")
public class OtherbankController {
    /**
     * 服务对象
     */
    @Autowired
    private OtherbankService otherbankService;

    /**
     * 通过主键查询单条数据
     *
     * @param id 主键
     * @return 单条数据
     */
    @GetMapping("selectOne")
    public Otherbank selectOne(String id) {
        return this.otherbankService.queryById(id);
    }

}