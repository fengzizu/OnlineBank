package com.fourgroup.service.impl;

import com.fourgroup.pojo.Accountremain;
import com.fourgroup.dao.AccountremainDao;
import com.fourgroup.service.AccountremainService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

/**
 * (Accountremain)表服务实现类
 *
 * @author makejava
 * @since 2020-09-01 16:56:20
 */
//实现在界面中的增删查改
@Service("accountremainService")//扫描Service中的accountremainService
public class AccountremainServiceImpl implements AccountremainService {
    @Autowired
    private AccountremainDao accountremainDao;

    /**
     * 通过ID查询单条数据
     *
     * @param arid 主键
     * @return 实例对象
     */
    @Override //重载实现方法
    public Accountremain queryById(Integer arid) {
        return this.accountremainDao.queryById(arid);
    }

    /**
     * 查询多条数据
     *
     * @param offset 查询起始位置
     * @param limit 查询条数
     * @return 对象列表
     */
    @Override
    public List<Accountremain> queryAllByLimit(int offset, int limit) {
        return this.accountremainDao.queryAllByLimit(offset, limit);
    }

    /**
     * 新增数据
     *
     * @param accountremain 实例对象
     * @return 实例对象
     */
    @Override
    public Accountremain insert(Accountremain accountremain) {
        this.accountremainDao.insert(accountremain);
        return accountremain;
    }

    /**
     * 修改数据
     *
     * @param accountremain 实例对象
     * @return 实例对象
     */
    @Override
    public Accountremain update(Accountremain accountremain) {
        this.accountremainDao.update(accountremain);
        return this.queryById(accountremain.getArid());
    }

    /**
     * 通过主键删除数据
     *
     * @param arid 主键
     * @return 是否成功
     */
    @Override
    public boolean deleteById(Integer arid) {
        return this.accountremainDao.deleteById(arid) > 0;
    }

    @Override
    public Accountremain queryByCardId(String cardid) {
        return accountremainDao.queryByCardId(cardid);
    }
}