package cn.lipy.ssm.service.impl;


import cn.lipy.ssm.dao.BaseDao;
import cn.lipy.ssm.service.BaseService;

import java.util.List;

/**
 * Created by lipyong on 2018/6/26.
 */
public abstract class BaseServiceImpl<T> implements BaseService<T> {

    private BaseDao<T> dao ;

    public void setDao(BaseDao<T> dao) {
        this.dao = dao;
    }

    public void insert(T t) {
        dao.insert(t);
    }

    public void update(T t) {
        dao.update(t);
    }

    public void delete(Integer id) {
        dao.delete(id);

    }

    public T selectOne(Integer id) {
        return dao.selectOne(id);
    }

    public List<T> selectAll() {
        return dao.selectAll();
    }
}

