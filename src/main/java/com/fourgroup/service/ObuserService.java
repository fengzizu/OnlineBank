package com.fourgroup.service;

import com.fourgroup.pojo.Obuser;
import java.util.List;

/**
 * (Obuser)表服务接口
 *
 * @author makejava
 * @since 2020-08-26 17:36:49
 */
public interface ObuserService {

    /**
     * 通过ID查询单条数据
     *
     * @param obuserid 主键
     * @return 实例对象
     */
    Obuser queryById(String obuserid);

    /**
     * 查询多条数据
     *
     * @param offset 查询起始位置
     * @param limit 查询条数
     * @return 对象列表
     */
    List<Obuser> queryAllByLimit(int offset, int limit);

    /**
     * 新增数据
     *
     * @param obuser 实例对象
     * @return 实例对象
     */
    Obuser insert(Obuser obuser);

    /**
     * 修改数据
     *
     * @param obuser 实例对象
     * @return 实例对象
     */
    Obuser update(Obuser obuser);

    /**
     * 通过主键删除数据
     *
     * @param obuserid 主键
     * @return 是否成功
     */
    boolean deleteById(String obuserid);

    /**
     *
     * @param obuser
     * @return
     */
    Obuser login(Obuser obuser);
}