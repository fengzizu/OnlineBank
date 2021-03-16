package com.fourgroup.dao;

import com.fourgroup.pojo.Otherbank;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import java.util.List;

/**
 * (Otherbank)表数据库访问层
 *
 * @author makejava
 * @since 2020-08-27 23:46:32
 */
@Mapper
public interface OtherbankDao {

    /**
     * 通过ID查询单条数据
     *
     * @param obcardid 主键
     * @return 实例对象
     */
    Otherbank queryById(String obcardid);

    /**
     * 查询指定行数据
     *
     * @param offset 查询起始位置
     * @param limit 查询条数
     * @return 对象列表
     */
    List<Otherbank> queryAllByLimit(@Param("offset") int offset, @Param("limit") int limit);


    /**
     * 通过实体作为筛选条件查询
     *
     * @param otherbank 实例对象
     * @return 对象列表
     */
    List<Otherbank> queryAll(Otherbank otherbank);

    /**
     * 新增数据
     *
     * @param otherbank 实例对象
     * @return 影响行数
     */
    int insert(Otherbank otherbank);

    /**
     * 修改数据
     *
     * @param otherbank 实例对象
     * @return 影响行数
     */
    int update(Otherbank otherbank);

    /**
     * 通过主键删除数据
     *
     * @param obcardid 主键
     * @return 影响行数
     */
    int deleteById(String obcardid);

}