package cn.lipy.ssm.dao.impl;


import cn.lipy.ssm.dao.BaseDao;
import cn.lipy.ssm.domain.User;
import org.mybatis.spring.support.SqlSessionDaoSupport;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * Created by lipyong on 2018/6/26.
 */
@Repository("userDao")
public class UserDaoImpl extends SqlSessionDaoSupport implements BaseDao<User> {
    public void insert(User user) {
        getSqlSession().insert("users.insert",user);
    }

    public void update(User user) {
        getSqlSession().update("users.update", user);
    }

    public void delete(Integer id ) {
        getSqlSession().delete("users.delete", id);
    }

    public User selectOne(Integer id) {

        return getSqlSession().selectOne("users.selectOne",id) ;
    }

    public List<User> selectAll() {

        return getSqlSession().selectList("users.selectAll");
    }
}
