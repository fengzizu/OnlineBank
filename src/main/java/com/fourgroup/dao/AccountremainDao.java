package com.fourgroup.dao;

import com.fourgroup.pojo.Accountremain;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import java.util.List;

/**
 * (Accountremain)表数据库访问层
 *
 * @author makejava
 * @since 2020-09-01 16:56:20
 */
@Mapper
public interface AccountremainDao {

    /**
     * 通过ID查询单条数据
     *
     * @param arid 主键
     * @return 实例对象
     */
    Accountremain queryById(Integer arid);

    /**
     * 查询指定行数据
     *
     * @param offset 查询起始位置
     * @param limit 查询条数
     * @return 对象列表
     */
    List<Accountremain> queryAllByLimit(@Param("offset") int offset, @Param("limit") int limit);


    /**
     * 通过实体作为筛选条件查询
     *
     * @param accountremain 实例对象
     * @return 对象列表
     */
    List<Accountremain> queryAll(Accountremain accountremain);

    /**
     * 新增数据
     *
     * @param accountremain 实例对象
     * @return 影响行数
     */
    int insert(Accountremain accountremain);

    /**
     * 修改数据
     *
     * @param accountremain 实例对象
     * @return 影响行数
     */
    int update(Accountremain accountremain);

    /**
     * 通过主键删除数据
     *
     * @param arid 主键
     * @return 影响行数
     */
    int deleteById(Integer arid);

    Accountremain queryByCardId(String cardid);
}