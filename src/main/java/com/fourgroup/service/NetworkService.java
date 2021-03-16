package com.fourgroup.service;

import com.fourgroup.pojo.Network;
import java.util.List;

/**
 * (Network)表服务接口
 *
 * @author makejava
 * @since 2020-09-01 17:09:44
 */
public interface NetworkService {

    /**
     * 通过ID查询单条数据
     *
     * @param networkid 主键
     * @return 实例对象
     */
    Network queryById(Integer networkid);

    /**
     * 查询多条数据
     *
     * @param offset 查询起始位置
     * @param limit 查询条数
     * @return 对象列表
     */
    List<Network> queryAllByLimit(int offset, int limit);

    /**
     * 新增数据
     *
     * @param network 实例对象
     * @return 实例对象
     */
    Network insert(Network network);

    /**
     * 修改数据
     *
     * @param network 实例对象
     * @return 实例对象
     */
    Network update(Network network);

    /**
     * 通过主键删除数据
     *
     * @param networkid 主键
     * @return 是否成功
     */
    boolean deleteById(Integer networkid);

}