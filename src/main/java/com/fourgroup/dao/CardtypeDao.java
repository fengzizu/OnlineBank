package com.fourgroup.dao;

import com.fourgroup.pojo.Cardtype;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import java.util.List;

/**
 * (Cardtype)表数据库访问层
 *
 * @author makejava
 * @since 2020-09-01 17:31:31
 */
@Mapper
public interface CardtypeDao {

    /**
     * 通过ID查询单条数据
     *
     * @param cardtypeid 主键
     * @return 实例对象
     */
    Cardtype queryById(Integer cardtypeid);

    /**
     * 查询指定行数据
     *
     * @param offset 查询起始位置
     * @param limit 查询条数
     * @return 对象列表
     */
    List<Cardtype> queryAllByLimit(@Param("offset") int offset, @Param("limit") int limit);


    /**
     * 通过实体作为筛选条件查询
     *
     * @param cardtype 实例对象
     * @return 对象列表
     */
    List<Cardtype> queryAll(Cardtype cardtype);

    /**
     * 新增数据
     *
     * @param cardtype 实例对象
     * @return 影响行数
     */
    int insert(Cardtype cardtype);

    /**
     * 修改数据
     *
     * @param cardtype 实例对象
     * @return 影响行数
     */
    int update(Cardtype cardtype);

    /**
     * 通过主键删除数据
     *
     * @param cardtypeid 主键
     * @return 影响行数
     */
    int deleteById(Integer cardtypeid);

}