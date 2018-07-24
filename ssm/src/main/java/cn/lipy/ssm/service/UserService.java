package cn.lipy.ssm.service;


import cn.lipy.ssm.domain.User;

import java.util.List;

/**
 * Created by lipyong on 2018/6/26.
 */

public interface UserService extends BaseService<User> {

   public void longTx();
   public void save(User u);






}
