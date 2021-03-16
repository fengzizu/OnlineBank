package com.fourgroup.service.impl;

import com.fourgroup.pojo.Card;
import com.fourgroup.dao.CardDao;
import com.fourgroup.service.CardService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

/**
 * (Card)表服务实现类
 *
 * @author makejava
 * @since 2020-08-27 15:48:32
 */
@Service("cardService")
public class CardServiceImpl implements CardService {
    @Autowired
    private CardDao cardDao;

    /**
     * 通过ID查询单条数据
     *
     * @param cardid 主键
     * @return 实例对象
     */
    @Override
    public Card queryById(String cardid) {
        return this.cardDao.queryById(cardid);
    }

    /**
     * 查询多条数据
     *
     * @param offset 查询起始位置
     * @param limit 查询条数
     * @return 对象列表
     */
    @Override
    public List<Card> queryAllByLimit(int offset, int limit) {
        return this.cardDao.queryAllByLimit(offset, limit);
    }

    /**
     * 新增数据
     *
     * @param card 实例对象
     * @return 实例对象
     */
    @Override
    public Card insert(Card card) {
        this.cardDao.insert(card);
        return card;
    }

    /**
     * 修改数据
     *
     * @param card 实例对象
     * @return 实例对象
     */
    @Override
    public Card update(Card card) {
        this.cardDao.update(card);
        return this.queryById(card.getCardid());
    }

    /**
     * 通过主键删除数据
     *
     * @param cardid 主键
     * @return 是否成功
     */
    @Override
    public boolean deleteById(String cardid) {
        return this.cardDao.deleteById(cardid) > 0;
    }

    @Override
    public List<Card> findcard(String obuserid) {
        return cardDao.finduser(obuserid);
    }

    @Override
    public List<Card> findCreditcardlist(String obuserid) {
        return cardDao.findCreditcardlist(obuserid);
    }

    @Override
    public void deleteobuser(Card c) {
         cardDao.deleteobuser(c);
    }
}