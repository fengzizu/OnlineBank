package com.fourgroup.service.impl;

import com.fourgroup.dao.DealdetailDao;
import com.fourgroup.pojo.Dealdetail;
import com.fourgroup.service.DealdetailService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

/**
 * (Dealdetail)表服务实现类
 *
 * @author makejava
 * @since 2020-09-02 21:46:32
 */
@Service("dealdetailService")
public class DealdetailServiceImpl implements DealdetailService {
    @Autowired
    private DealdetailDao dealdetailDao;

    /**
     * 通过ID查询单条数据
     *
     * @param ddid 主键
     * @return 实例对象
     */
    @Override
    public Dealdetail queryById(Long ddid) {
        return this.dealdetailDao.queryById(ddid);
    }

    /**
     * 查询多条数据
     *
     * @param offset 查询起始位置
     * @param limit  查询条数
     * @return 对象列表
     */
    @Override
    public List<Dealdetail> queryAllByLimit(int offset, int limit) {
        return this.dealdetailDao.queryAllByLimit(offset, limit);
    }

    /**
     * 新增数据
     *
     * @param dealdetail 实例对象
     * @return 实例对象
     */
    @Override
    public Dealdetail insert(Dealdetail dealdetail) {
        this.dealdetailDao.insert(dealdetail);
        return dealdetail;
    }

    /**
     * 修改数据
     *
     * @param dealdetail 实例对象
     * @return 实例对象
     */
    @Override
    public Dealdetail update(Dealdetail dealdetail) {
        this.dealdetailDao.update(dealdetail);
        return this.queryById(dealdetail.getDdid());
    }

    /**
     * 通过主键删除数据
     *
     * @param ddid 主键
     * @return 是否成功
     */
    @Override
    public boolean deleteById(Long ddid) {
        return this.dealdetailDao.deleteById(ddid) > 0;
    }

    @Override
    public List<Dealdetail> queryByCardid(String cardid) {
        return dealdetailDao.queryByCardid(cardid);
    }

    @Override
    public List<Dealdetail> queryByCardidInternet(String cardid) {
        return dealdetailDao.queryByCardidInternet(cardid);
    }

    @Override
    public List<Dealdetail> queryByCardidTransfer(String cardid) {
        return dealdetailDao.queryByCardidTransfer(cardid);
    }
}