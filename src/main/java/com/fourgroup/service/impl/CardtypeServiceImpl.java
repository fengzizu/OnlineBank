package com.fourgroup.service.impl;

import com.fourgroup.pojo.Cardtype;
import com.fourgroup.dao.CardtypeDao;
import com.fourgroup.service.CardtypeService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

/**
 * (Cardtype)表服务实现类
 *
 * @author makejava
 * @since 2020-09-01 17:31:31
 */
@Service("cardtypeService")
public class CardtypeServiceImpl implements CardtypeService {
    @Autowired
    private CardtypeDao cardtypeDao;

    /**
     * 通过ID查询单条数据
     *
     * @param cardtypeid 主键
     * @return 实例对象
     */
    @Override
    public Cardtype queryById(Integer cardtypeid) {
        return this.cardtypeDao.queryById(cardtypeid);
    }

    /**
     * 查询多条数据
     *
     * @param offset 查询起始位置
     * @param limit 查询条数
     * @return 对象列表
     */
    @Override
    public List<Cardtype> queryAllByLimit(int offset, int limit) {
        return this.cardtypeDao.queryAllByLimit(offset, limit);
    }

    /**
     * 新增数据
     *
     * @param cardtype 实例对象
     * @return 实例对象
     */
    @Override
    public Cardtype insert(Cardtype cardtype) {
        this.cardtypeDao.insert(cardtype);
        return cardtype;
    }

    /**
     * 修改数据
     *
     * @param cardtype 实例对象
     * @return 实例对象
     */
    @Override
    public Cardtype update(Cardtype cardtype) {
        this.cardtypeDao.update(cardtype);
        return this.queryById(cardtype.getCardtypeid());
    }

    /**
     * 通过主键删除数据
     *
     * @param cardtypeid 主键
     * @return 是否成功
     */
    @Override
    public boolean deleteById(Integer cardtypeid) {
        return this.cardtypeDao.deleteById(cardtypeid) > 0;
    }
}