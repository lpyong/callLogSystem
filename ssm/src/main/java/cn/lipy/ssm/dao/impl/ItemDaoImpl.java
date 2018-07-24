package cn.lipy.ssm.dao.impl;


import cn.lipy.ssm.dao.BaseDao;
import cn.lipy.ssm.domain.Item;
import org.mybatis.spring.support.SqlSessionDaoSupport;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * Created by lipyong on 2018/6/26.
 */
@Repository("itemDao")
public class ItemDaoImpl extends SqlSessionDaoSupport implements BaseDao<Item> {
    public void insert(Item item) {
        getSqlSession().insert("items.insert",item);

    }

    public void update(Item item) {

    }

    public void delete(Integer id) {

    }

    public Item selectOne(Integer id) {
        return null;
    }

    public List<Item> selectAll() {
        return null;
    }
}
