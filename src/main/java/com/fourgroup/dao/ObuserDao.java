package com.fourgroup.dao;

import com.fourgroup.pojo.Obuser;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import java.util.List;

/**
 * (Obuser)表数据库访问层
 *
 * @author makejava
 * @since 2020-08-26 17:02:35
 */
@Mapper
public interface ObuserDao {

    /**
     * 通过ID查询单条数据
     *
     * @param obuserid 主键
     * @return 实例对象
     */
    Obuser queryById(String obuserid);

    /**
     * 查询指定行数据
     *
     * @param offset 查询起始位置
     * @param limit 查询条数
     * @return 对象列表
     */
    List<Obuser> queryAllByLimit(@Param("offset") int offset, @Param("limit") int limit);


    /**
     * 通过实体作为筛选条件查询
     *
     * @param obuser 实例对象
     * @return 对象列表
     */
    List<Obuser> queryAll(Obuser obuser);

    /**
     * 新增数据
     *
     * @param obuser 实例对象
     * @return 影响行数
     */
    int insert(Obuser obuser);

    /**
     * 修改数据
     *
     * @param obuser 实例对象
     * @return 影响行数
     */
    int update(Obuser obuser);

    /**
     * 通过主键删除数据
     *
     * @param obuserid 主键
     * @return 影响行数
     */
    int deleteById(String obuserid);
    /**
     * 通过主键删除数据
     *
     * @param  obuser 实例对象
     * @return 实例对象
     */
    Obuser login(Obuser obuser);
}