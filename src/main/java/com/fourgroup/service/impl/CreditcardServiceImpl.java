package com.fourgroup.service.impl;

import com.fourgroup.pojo.Creditcard;
import com.fourgroup.dao.CreditcardDao;
import com.fourgroup.service.CreditcardService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

/**
 * (Creditcard)表服务实现类
 *
 * @author makejava
 * @since 2020-08-28 09:59:00
 */
@Service("creditcardService")
public class CreditcardServiceImpl implements CreditcardService {
    @Autowired
    private CreditcardDao creditcardDao;

    /**
     * 通过ID查询单条数据
     *
     * @param ccid 主键
     * @return 实例对象
     */
    @Override
    public Creditcard queryById(Integer ccid) {
        return this.creditcardDao.queryById(ccid);
    }

    /**
     * 查询多条数据
     *
     * @param offset 查询起始位置
     * @param limit 查询条数
     * @return 对象列表
     */
    @Override
    public List<Creditcard> queryAllByLimit(int offset, int limit) {
        return this.creditcardDao.queryAllByLimit(offset, limit);
    }

    /**
     * 新增数据
     *
     * @param creditcard 实例对象
     * @return 实例对象
     */
    @Override
    public Creditcard insert(Creditcard creditcard) {
        this.creditcardDao.insert(creditcard);
        return creditcard;
    }

    /**
     * 修改数据
     *
     * @param creditcard 实例对象
     * @return 实例对象
     */
    @Override
    public Creditcard update(Creditcard creditcard) {
        this.creditcardDao.update(creditcard);
        return this.queryById(creditcard.getCcid());
    }

    /**
     * 通过主键删除数据
     *
     * @param ccid 主键
     * @return 是否成功
     */
    @Override
    public boolean deleteById(Integer ccid) {
        return this.creditcardDao.deleteById(ccid) > 0;
    }

    @Override
    public Creditcard queryByCidAndPassword(Creditcard creditcard) {
        return creditcardDao.queryByCidAndPassword(creditcard);
    }

    @Override
    public Creditcard queryByCid(String ccid) {
        return creditcardDao.queryByCid(ccid);
    }
}