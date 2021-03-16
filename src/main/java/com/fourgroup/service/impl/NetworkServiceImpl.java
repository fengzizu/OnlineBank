package com.fourgroup.service.impl;

import com.fourgroup.pojo.Network;
import com.fourgroup.dao.NetworkDao;
import com.fourgroup.service.NetworkService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

/**
 * (Network)表服务实现类
 *
 * @author makejava
 * @since 2020-09-01 17:09:44
 */
@Service("networkService")
public class NetworkServiceImpl implements NetworkService {
    @Autowired
    private NetworkDao networkDao;

    /**
     * 通过ID查询单条数据
     *
     * @param networkid 主键
     * @return 实例对象
     */
    @Override
    public Network queryById(Integer networkid) {
        return this.networkDao.queryById(networkid);
    }

    /**
     * 查询多条数据
     *
     * @param offset 查询起始位置
     * @param limit 查询条数
     * @return 对象列表
     */
    @Override
    public List<Network> queryAllByLimit(int offset, int limit) {
        return this.networkDao.queryAllByLimit(offset, limit);
    }

    /**
     * 新增数据
     *
     * @param network 实例对象
     * @return 实例对象
     */
    @Override
    public Network insert(Network network) {
        this.networkDao.insert(network);
        return network;
    }

    /**
     * 修改数据
     *
     * @param network 实例对象
     * @return 实例对象
     */
    @Override
    public Network update(Network network) {
        this.networkDao.update(network);
        return this.queryById(network.getNetworkid());
    }

    /**
     * 通过主键删除数据
     *
     * @param networkid 主键
     * @return 是否成功
     */
    @Override
    public boolean deleteById(Integer networkid) {
        return this.networkDao.deleteById(networkid) > 0;
    }
}