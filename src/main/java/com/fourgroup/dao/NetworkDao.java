package com.fourgroup.dao;

import com.fourgroup.pojo.Network;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import java.util.List;

/**
 * (Network)表数据库访问层
 *
 * @author makejava
 * @since 2020-09-01 17:09:44
 */
@Mapper
public interface NetworkDao {

    /**
     * 通过ID查询单条数据
     *
     * @param networkid 主键
     * @return 实例对象
     */
    Network queryById(Integer networkid);

    /**
     * 查询指定行数据
     *
     * @param offset 查询起始位置
     * @param limit 查询条数
     * @return 对象列表
     */
    List<Network> queryAllByLimit(@Param("offset") int offset, @Param("limit") int limit);


    /**
     * 通过实体作为筛选条件查询
     *
     * @param network 实例对象
     * @return 对象列表
     */
    List<Network> queryAll(Network network);

    /**
     * 新增数据
     *
     * @param network 实例对象
     * @return 影响行数
     */
    int insert(Network network);

    /**
     * 修改数据
     *
     * @param network 实例对象
     * @return 影响行数
     */
    int update(Network network);

    /**
     * 通过主键删除数据
     *
     * @param networkid 主键
     * @return 影响行数
     */
    int deleteById(Integer networkid);

}