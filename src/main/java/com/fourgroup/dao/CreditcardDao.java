package com.fourgroup.dao;

import com.fourgroup.pojo.Creditcard;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import java.util.List;

/**
 * (Creditcard)表数据库访问层
 *
 * @author makejava
 * @since 2020-08-28 09:59:00
 */
@Mapper
public interface CreditcardDao {

    /**
     * 通过ID查询单条数据
     *
     * @param ccid 主键
     * @return 实例对象
     */
    Creditcard queryById(Integer ccid);

    /**
     * 查询指定行数据
     *
     * @param offset 查询起始位置
     * @param limit 查询条数
     * @return 对象列表
     */
    List<Creditcard> queryAllByLimit(@Param("offset") int offset, @Param("limit") int limit);


    /**
     * 通过实体作为筛选条件查询
     *
     * @param creditcard 实例对象
     * @return 对象列表
     */
    List<Creditcard> queryAll(Creditcard creditcard);

    /**
     * 新增数据
     *
     * @param creditcard 实例对象
     * @return 影响行数
     */
    int insert(Creditcard creditcard);

    /**
     * 修改数据
     *
     * @param creditcard 实例对象
     * @return 影响行数
     */
    int update(Creditcard creditcard);

    /**
     * 通过主键删除数据
     *
     * @param ccid 主键
     * @return 影响行数
     */
    int deleteById(Integer ccid);

    Creditcard queryByCidAndPassword(Creditcard creditcard);

    Creditcard queryByCid(String cardid);
}