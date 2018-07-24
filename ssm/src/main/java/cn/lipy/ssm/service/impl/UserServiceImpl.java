package cn.lipy.ssm.service.impl;


import cn.lipy.ssm.dao.BaseDao;
import cn.lipy.ssm.domain.Item;
import cn.lipy.ssm.domain.Order;
import cn.lipy.ssm.domain.User;
import cn.lipy.ssm.service.UserService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

/**
 * Created by lipyong on 2018/6/26.
 */
@Service("userService")
public class UserServiceImpl extends BaseServiceImpl <User> implements UserService{
    //诸如指定的dao
    @Resource(name = "itemDao")
    private BaseDao<Item> itemDao;

    @Resource(name = "userDao")
    public void setDao(BaseDao<User> dao) {

        super.setDao(dao);
    }
    public void longTx(){
        Item i = new Item();
        i.setItemName("ttt");
        Order o = new Order();
        o.setId(2);
        itemDao.insert(i);
        this.delete(1);
    }
    public void save(User u) {
        if(u.getId() != null){
            this.update(u);
        }
        else{
            this.insert(u);
        }
    }

}













