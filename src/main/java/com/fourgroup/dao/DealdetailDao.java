package com.fourgroup.dao;

import com.fourgroup.pojo.Dealdetail;
import org.apache.ibatis.annotations.Param;

import java.util.List;

/**
 * (Dealdetail)表数据库访问层
 *
 * @author makejava
 * @since 2020-09-02 21:46:32
 */
public interface DealdetailDao {

    /**
     * 通过ID查询单条数据
     *
     * @param ddid 主键
     * @return 实例对象
     */
    Dealdetail queryById(Long ddid);

    /**
     * 查询指定行数据
     *
     * @param offset 查询起始位置
     * @param limit  查询条数
     * @return 对象列表
     */
    List<Dealdetail> queryAllByLimit(@Param("offset") int offset, @Param("limit") int limit);


    /**
     * 通过实体作为筛选条件查询
     *
     * @param dealdetail 实例对象
     * @return 对象列表
     */
    List<Dealdetail> queryAll(Dealdetail dealdetail);

    /**
     * 新增数据
     *
     * @param dealdetail 实例对象
     * @return 影响行数
     */
    int insert(Dealdetail dealdetail);

    /**
     * 修改数据
     *
     * @param dealdetail 实例对象
     * @return 影响行数
     */
    int update(Dealdetail dealdetail);

    /**
     * 通过主键删除数据
     *
     * @param ddid 主键
     * @return 影响行数
     */
    int deleteById(Long ddid);

    List<Dealdetail> queryByCardid(String cardid);

    List<Dealdetail> queryByCardidInternet(String cardid);

    List<Dealdetail> queryByCardidTransfer(String cardid);

}