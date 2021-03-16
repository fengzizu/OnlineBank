package com.fourgroup.dao;

import com.fourgroup.pojo.Card;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import java.util.List;
@Mapper
/**
 * (Card)表数据库访问层
 *
 * @author makejava
 * @since 2020-08-27 15:48:32
 */
public interface CardDao {

    /**
     * 通过ID查询单条数据
     *
     * @param cardid 主键
     * @return 实例对象
     */
    Card queryById(String cardid);

    /**
     * 查询指定行数据
     *
     * @param offset 查询起始位置
     * @param limit 查询条数
     * @return 对象列表
     */
    List<Card> queryAllByLimit(@Param("offset") int offset, @Param("limit") int limit);


    /**
     * 通过实体作为筛选条件查询
     *
     * @param card 实例对象
     * @return 对象列表
     */
    List<Card> queryAll(Card card);

    /**
     * 新增数据
     *
     * @param card 实例对象
     * @return 影响行数
     */
    int insert(Card card);

    /**
     * 修改数据
     *
     * @param card 实例对象
     * @return 影响行数
     */
    int update(Card card);

    /**
     * 通过主键删除数据
     *
     * @param cardid 主键
     * @return 影响行数
     */
    int deleteById(String cardid);

    /**
     *
     * @param obuserid
     * @return
     */
    List<Card> finduser(String obuserid);

    List<Card> findCreditcardlist(String obuserid);

    void deleteobuser(Card c);
}