package com.fourgroup.service;

import com.fourgroup.pojo.Otherbank;
import java.util.List;

/**
 * (Otherbank)表服务接口
 *
 * @author makejava
 * @since 2020-08-27 23:46:33
 */
public interface OtherbankService {

    /**
     * 通过ID查询单条数据
     *
     * @param obcardid 主键
     * @return 实例对象
     */
    Otherbank queryById(String obcardid);

    /**
     * 查询多条数据
     *
     * @param offset 查询起始位置
     * @param limit 查询条数
     * @return 对象列表
     */
    List<Otherbank> queryAllByLimit(int offset, int limit);

    /**
     * 新增数据
     *
     * @param otherbank 实例对象
     * @return 实例对象
     */
    Otherbank insert(Otherbank otherbank);

    /**
     * 修改数据
     *
     * @param otherbank 实例对象
     * @return 实例对象
     */
    Otherbank update(Otherbank otherbank);

    /**
     * 通过主键删除数据
     *
     * @param obcardid 主键
     * @return 是否成功
     */
    boolean deleteById(String obcardid);


}