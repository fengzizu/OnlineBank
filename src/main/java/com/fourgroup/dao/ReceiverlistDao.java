package com.fourgroup.dao;

import com.fourgroup.pojo.Receiverlist;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import java.util.List;

/**
 * (Receiverlist)表数据库访问层
 *
 * @author makejava
 * @since 2020-08-27 23:45:45
 */
@Mapper
public interface ReceiverlistDao {

    /**
     * 通过ID查询单条数据
     *
     * @param receiverid 主键
     * @return 实例对象
     */
    Receiverlist queryById(Integer receiverid);

    /**
     * 查询指定行数据
     *
     * @param offset 查询起始位置
     * @param limit 查询条数
     * @return 对象列表
     */
    List<Receiverlist> queryAllByLimit(@Param("offset") int offset, @Param("limit") int limit);


    /**
     * 通过实体作为筛选条件查询
     *
     * @param receiverlist 实例对象
     * @return 对象列表
     */
    List<Receiverlist> queryAll(Receiverlist receiverlist);

    /**
     * 新增数据
     *
     * @param receiverlist 实例对象
     * @return 影响行数
     */
    int insert(Receiverlist receiverlist);

    /**
     * 修改数据
     *
     * @param receiverlist 实例对象
     * @return 影响行数
     */
    int update(Receiverlist receiverlist);

    /**
     * 通过主键删除数据
     *
     * @param receiverid 主键
     * @return 影响行数
     */
    int deleteById(Integer receiverid);

    List<Receiverlist> findlist(String obuserid);

    List<Receiverlist> findotherlist(String obuserid);

    Receiverlist queryByObuseridAndCardid(Receiverlist receiverlist);
}