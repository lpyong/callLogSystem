package cn.lipy.ssm.web.controller;


import cn.lipy.ssm.domain.User;
import cn.lipy.ssm.service.UserService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import javax.annotation.Resource;
import java.util.List;

/**
 * Created by lipyong on 2018/6/28.
 */
@Controller
public class UserController {

    @Resource(name="userService")
    private UserService us ;

    /**
     * 查看全部user
     */
    @RequestMapping("/user/findall")
    public String findAll(Model m ){
        List<User> list = us.selectAll();
        m.addAttribute("allUsers",list);
        return "user/userList" ;
    }
    /**
     * 删除用户
     */
    @RequestMapping("/user/deleteUser")
    public String deleteUser(@RequestParam("uid") Integer uid){
        us.delete(uid);
        return "redirect:/user/findall" ;
    }

    @RequestMapping("/user/hello")
    public String accessHtml(){
        System.out.println("kkkk");
        return "forward:/html/hello.html" ;
    }

    @RequestMapping(value = "/user/userSave",method = RequestMethod.POST)
    public String saveUser(User u){
        us.save(u);
        return "redirect:/user/findall" ;
    }

    @RequestMapping("/user/toAddUserPage")
    public String toAddUserPage(){
        return "user/userEdit" ;
    }

}
