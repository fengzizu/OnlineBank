package com.fourgroup.service;

import com.fourgroup.pojo.Cardtype;
import java.util.List;

/**
 * (Cardtype)表服务接口
 *
 * @author makejava
 * @since 2020-09-01 17:31:31
 */
public interface CardtypeService {

    /**
     * 通过ID查询单条数据
     *
     * @param cardtypeid 主键
     * @return 实例对象
     */
    Cardtype queryById(Integer cardtypeid);

    /**
     * 查询多条数据
     *
     * @param offset 查询起始位置
     * @param limit 查询条数
     * @return 对象列表
     */
    List<Cardtype> queryAllByLimit(int offset, int limit);

    /**
     * 新增数据
     *
     * @param cardtype 实例对象
     * @return 实例对象
     */
    Cardtype insert(Cardtype cardtype);

    /**
     * 修改数据
     *
     * @param cardtype 实例对象
     * @return 实例对象
     */
    Cardtype update(Cardtype cardtype);

    /**
     * 通过主键删除数据
     *
     * @param cardtypeid 主键
     * @return 是否成功
     */
    boolean deleteById(Integer cardtypeid);

}