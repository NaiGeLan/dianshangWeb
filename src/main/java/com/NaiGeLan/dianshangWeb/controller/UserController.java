package com.NaiGeLan.dianshangWeb.controller;

import com.NaiGeLan.dianshangWeb.DAO.UserDAO;
import com.NaiGeLan.dianshangWeb.dataObj.UserDO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class UserController {
    @Autowired
    private UserDAO userDAO;

    @PostMapping("/user")
    @ResponseBody
    public UserDO addUser(@RequestBody UserDO userDO){
        userDAO.addUser(userDO);
        return userDO;
    }

}
