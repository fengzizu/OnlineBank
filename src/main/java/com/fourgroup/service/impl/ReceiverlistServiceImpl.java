package com.fourgroup.service.impl;

import com.fourgroup.pojo.Receiverlist;
import com.fourgroup.dao.ReceiverlistDao;
import com.fourgroup.service.ReceiverlistService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

/**
 * (Receiverlist)表服务实现类
 *
 * @author makejava
 * @since 2020-08-27 23:45:45
 */
@Service("receiverlistService")
public class ReceiverlistServiceImpl implements ReceiverlistService {
    @Autowired
    private ReceiverlistDao receiverlistDao;

    /**
     * 通过ID查询单条数据
     *
     * @param receiverid 主键
     * @return 实例对象
     */
    @Override
    public Receiverlist queryById(Integer receiverid) {
        return this.receiverlistDao.queryById(receiverid);
    }

    /**
     * 查询多条数据
     *
     * @param offset 查询起始位置
     * @param limit 查询条数
     * @return 对象列表
     */
    @Override
    public List<Receiverlist> queryAllByLimit(int offset, int limit) {
        return this.receiverlistDao.queryAllByLimit(offset, limit);
    }

    /**
     * 新增数据
     *
     * @param receiverlist 实例对象
     * @return 实例对象
     */
    @Override
    public Receiverlist insert(Receiverlist receiverlist) {
        this.receiverlistDao.insert(receiverlist);
        return receiverlist;
    }

    /**
     * 修改数据
     *
     * @param receiverlist 实例对象
     * @return 实例对象
     */
    @Override
    public Receiverlist update(Receiverlist receiverlist) {
        this.receiverlistDao.update(receiverlist);
        return this.queryById(receiverlist.getReceiverid());
    }

    /**
     * 通过主键删除数据
     *
     * @param receiverid 主键
     * @return 是否成功
     */
    @Override
    public boolean deleteById(Integer receiverid) {
        return this.receiverlistDao.deleteById(receiverid) > 0;
    }

    @Override
    public List<Receiverlist> findlist(String obuserid) {
        return receiverlistDao.findlist(obuserid);
    }

    @Override
    public List<Receiverlist> findotherlist(String obuserid) {
        return receiverlistDao.findotherlist(obuserid);
    }

    @Override
    public Receiverlist queryByObuseridAndCardid(Receiverlist receiverlist) {
        return receiverlistDao.queryByObuseridAndCardid(receiverlist);
    }
}