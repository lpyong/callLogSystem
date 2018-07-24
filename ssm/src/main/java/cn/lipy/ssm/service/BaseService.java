package cn.lipy.ssm.service;

import java.util.List;

/**
 * Created by lipyong on 2018/6/26.
 */
public interface BaseService<T> {
    public void insert(T t);

    public void update(T t);

    public void delete(Integer id);

    public T selectOne(Integer id);

    public List<T> selectAll();
}

