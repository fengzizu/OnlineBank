package com.fourgroup.service;

import com.fourgroup.pojo.Dealdetail;

import java.util.List;

/**
 * (Dealdetail)表服务接口
 *
 * @author makejava
 * @since 2020-09-02 21:46:32
 */
public interface DealdetailService {

    /**
     * 通过ID查询单条数据
     *
     * @param ddid 主键
     * @return 实例对象
     */
    Dealdetail queryById(Long ddid);

    /**
     * 查询多条数据
     *
     * @param offset 查询起始位置
     * @param limit  查询条数
     * @return 对象列表
     */
    List<Dealdetail> queryAllByLimit(int offset, int limit);

    /**
     * 新增数据
     *
     * @param dealdetail 实例对象
     * @return 实例对象
     */
    Dealdetail insert(Dealdetail dealdetail);

    /**
     * 修改数据
     *
     * @param dealdetail 实例对象
     * @return 实例对象
     */
    Dealdetail update(Dealdetail dealdetail);

    /**
     * 通过主键删除数据
     *
     * @param ddid 主键
     * @return 是否成功
     */
    boolean deleteById(Long ddid);

    List<Dealdetail> queryByCardid(String cardid);

    List<Dealdetail> queryByCardidInternet(String cardid);

    List<Dealdetail> queryByCardidTransfer(String cardid);
}