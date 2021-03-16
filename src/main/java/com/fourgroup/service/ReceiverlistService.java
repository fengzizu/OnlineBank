package com.fourgroup.service;

import com.fourgroup.pojo.Receiverlist;
import java.util.List;

/**
 * (Receiverlist)表服务接口
 *
 * @author makejava
 * @since 2020-08-27 23:45:45
 */
public interface ReceiverlistService {

    /**
     * 通过ID查询单条数据
     *
     * @param receiverid 主键
     * @return 实例对象
     */
    Receiverlist queryById(Integer receiverid);

    /**
     * 查询多条数据
     *
     * @param offset 查询起始位置
     * @param limit 查询条数
     * @return 对象列表
     */
    List<Receiverlist> queryAllByLimit(int offset, int limit);

    /**
     * 新增数据
     *
     * @param receiverlist 实例对象
     * @return 实例对象
     */
    Receiverlist insert(Receiverlist receiverlist);

    /**
     * 修改数据
     *
     * @param receiverlist 实例对象
     * @return 实例对象
     */
    Receiverlist update(Receiverlist receiverlist);

    /**
     * 通过主键删除数据
     *
     * @param receiverid 主键
     * @return 是否成功
     */
    boolean deleteById(Integer receiverid);

    List<Receiverlist> findlist(String obuserid);

    List<Receiverlist> findotherlist(String obuserid);

    Receiverlist queryByObuseridAndCardid(Receiverlist receiverlist);
}