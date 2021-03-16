package com.fourgroup.service;

import com.fourgroup.pojo.Creditcard;
import java.util.List;

/**
 * (Creditcard)表服务接口
 *
 * @author makejava
 * @since 2020-08-28 09:59:00
 */
public interface CreditcardService {

    /**
     * 通过ID查询单条数据
     *
     * @param ccid 主键
     * @return 实例对象
     */
    Creditcard queryById(Integer ccid);

    /**
     * 查询多条数据
     *
     * @param offset 查询起始位置
     * @param limit 查询条数
     * @return 对象列表
     */
    List<Creditcard> queryAllByLimit(int offset, int limit);

    /**
     * 新增数据
     *
     * @param creditcard 实例对象
     * @return 实例对象
     */
    Creditcard insert(Creditcard creditcard);

    /**
     * 修改数据
     *
     * @param creditcard 实例对象
     * @return 实例对象
     */
    Creditcard update(Creditcard creditcard);

    /**
     * 通过主键删除数据
     *
     * @param ccid 主键
     * @return 是否成功
     */
    boolean deleteById(Integer ccid);

    Creditcard queryByCidAndPassword(Creditcard creditcard);
    Creditcard queryByCid(String ccid);
}