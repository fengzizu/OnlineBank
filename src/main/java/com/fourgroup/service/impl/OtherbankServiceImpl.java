package com.fourgroup.service.impl;

import com.fourgroup.pojo.Otherbank;
import com.fourgroup.dao.OtherbankDao;
import com.fourgroup.service.OtherbankService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

/**
 * (Otherbank)表服务实现类
 *
 * @author makejava
 * @since 2020-08-27 23:46:33
 */
@Service("otherbankService")
public class OtherbankServiceImpl implements OtherbankService {
    @Autowired
    private OtherbankDao otherbankDao;

    /**
     * 通过ID查询单条数据
     *
     * @param obcardid 主键
     * @return 实例对象
     */
    @Override
    public Otherbank queryById(String obcardid) {
        return this.otherbankDao.queryById(obcardid);
    }

    /**
     * 查询多条数据
     *
     * @param offset 查询起始位置
     * @param limit 查询条数
     * @return 对象列表
     */
    @Override
    public List<Otherbank> queryAllByLimit(int offset, int limit) {
        return this.otherbankDao.queryAllByLimit(offset, limit);
    }

    /**
     * 新增数据
     *
     * @param otherbank 实例对象
     * @return 实例对象
     */
    @Override
    public Otherbank insert(Otherbank otherbank) {
        this.otherbankDao.insert(otherbank);
        return otherbank;
    }

    /**
     * 修改数据
     *
     * @param otherbank 实例对象
     * @return 实例对象
     */
    @Override
    public Otherbank update(Otherbank otherbank) {
        this.otherbankDao.update(otherbank);
        return this.queryById(otherbank.getObcardid());
    }

    /**
     * 通过主键删除数据
     *
     * @param obcardid 主键
     * @return 是否成功
     */
    @Override
    public boolean deleteById(String obcardid) {
        return this.otherbankDao.deleteById(obcardid) > 0;
    }
}