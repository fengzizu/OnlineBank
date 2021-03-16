package com.fourgroup.service;

import com.fourgroup.pojo.Card;
import java.util.List;

/**
 * (Card)表服务接口
 *
 * @author makejava
 * @since 2020-08-27 15:48:32
 */
public interface CardService {

    /**
     * 通过ID查询单条数据
     *
     * @param cardid 主键
     * @return 实例对象
     */
    Card queryById(String cardid);

    /**
     * 查询多条数据
     *
     * @param offset 查询起始位置
     * @param limit 查询条数
     * @return 对象列表
     */
    List<Card> queryAllByLimit(int offset, int limit);

    /**
     * 新增数据
     *
     * @param card 实例对象
     * @return 实例对象
     */
    Card insert(Card card);

    /**
     * 修改数据
     *
     * @param card 实例对象
     * @return 实例对象
     */
    Card update(Card card);

    /**
     * 通过主键删除数据
     *
     * @param cardid 主键
     * @return 是否成功
     */
    boolean deleteById(String cardid);

    List<Card> findcard(String obuserid);

    List<Card> findCreditcardlist(String obuserid);

    void deleteobuser(Card c);
}