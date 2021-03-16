package com.fourgroup.service;

import com.fourgroup.pojo.Accountremain;

import java.util.List;

/**
 * (Accountremain)表服务接口
 *
 * @author makejava
 * @since 2020-09-01 16:56:20
 */
public interface AccountremainService {

    /**
     * 通过ID查询单条数据
     *
     * @param arid 主键
     * @return 实例对象
     */
    Accountremain queryById(Integer arid);

    /**
     * 查询多条数据
     *
     * @param offset 查询起始位置
     * @param limit 查询条数
     * @return 对象列表
     */
    List<Accountremain> queryAllByLimit(int offset, int limit);

    /**
     * 新增数据
     *
     * @param accountremain 实例对象
     * @return 实例对象
     */
    Accountremain insert(Accountremain accountremain);

    /**
     * 修改数据
     *
     * @param accountremain 实例对象
     * @return 实例对象
     */
    Accountremain update(Accountremain accountremain);

    /**
     * 通过主键删除数据
     *
     * @param arid 主键
     * @return 是否成功
     */
    boolean deleteById(Integer arid);

    Accountremain queryByCardId(String cardid);
}