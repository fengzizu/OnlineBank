package com.fourgroup.service.impl;

import com.fourgroup.pojo.Obuser;
import com.fourgroup.dao.ObuserDao;
import com.fourgroup.service.ObuserService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

/**
 * (Obuser)表服务实现类
 *
 * @author makejava
 * @since 2020-08-26 17:36:50
 */
@Service("obuserService")
public class ObuserServiceImpl implements ObuserService {
    @Autowired
    private ObuserDao obuserDao;

    /**
     * 通过ID查询单条数据
     *
     * @param obuserid 主键
     * @return 实例对象
     */
    @Override
    public Obuser queryById(String obuserid) {
        return this.obuserDao.queryById(obuserid);
    }

    /**
     * 查询多条数据
     *
     * @param offset 查询起始位置
     * @param limit 查询条数
     * @return 对象列表
     */
    @Override
    public List<Obuser> queryAllByLimit(int offset, int limit) {
        return this.obuserDao.queryAllByLimit(offset, limit);
    }

    /**
     * 新增数据
     *
     * @param obuser 实例对象
     * @return 实例对象
     */
    @Override
    public Obuser insert(Obuser obuser) {
        this.obuserDao.insert(obuser);
        return obuser;
    }

    /**
     * 修改数据
     *
     * @param obuser 实例对象
     * @return 实例对象
     */
    @Override
    public Obuser update(Obuser obuser) {
        this.obuserDao.update(obuser);
        return this.queryById(obuser.getObuserid());
    }

    /**
     * 通过主键删除数据
     *
     * @param obuserid 主键
     * @return 是否成功
     */
    @Override
    public boolean deleteById(String obuserid) {
        return this.obuserDao.deleteById(obuserid) > 0;
    }

    @Override
    public Obuser login(Obuser obuser) {
        return this.obuserDao.login(obuser);
    }
}