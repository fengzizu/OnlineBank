package com.fourgroup.controller;

import com.fourgroup.pojo.Cardtype;
import com.fourgroup.service.CardtypeService;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;

/**
 * (Cardtype)表控制层
 *
 * @author makejava
 * @since 2020-09-01 17:31:31
 */
@RestController
@RequestMapping("cardtype")
public class CardtypeController {
    /**
     * 服务对象
     */
    @Autowired
    private CardtypeService cardtypeService;

    /**
     * 通过主键查询单条数据
     *
     * @param id 主键
     * @return 单条数据
     */
    @GetMapping("selectOne")
    public Cardtype selectOne(Integer id) {
        return this.cardtypeService.queryById(id);
    }

}