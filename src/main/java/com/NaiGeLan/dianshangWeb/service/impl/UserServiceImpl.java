package com.NaiGeLan.dianshangWeb.service.impl;

import com.NaiGeLan.dianshangWeb.DAO.UserDAO;
import com.NaiGeLan.dianshangWeb.dataObj.UserDO;
import com.NaiGeLan.dianshangWeb.model.Result;
import com.NaiGeLan.dianshangWeb.service.UserService;
// import org.apache.commons.lang3.StringUtils;
import org.springframework.stereotype.Service;
import org.springframework.util.StringUtils;
import org.springframework.beans.factory.annotation.Autowired;

@Service()
public class UserServiceImpl implements UserService {

    @Autowired
    private UserDAO userDAO;

    @Override
    public Result<UserDO> register(String username, String password) {
        Result<UserDO> result = new Result<>();
        if (StringUtils.isEmpty(username)) {
            result.setCode("600");
            result.setMessage("用户名不能为空");
            return result;
        }
        if (StringUtils.isEmpty(password)) {
            result.setCode("601");
            result.setMessage("密码不能为空");
            return result;
        }
        UserDO userDO = new UserDO();
        userDO.setUsername(username);
        userDO.setNickname("sddsss");
        userDO.setPassword(password);
        userDO.setIP("1.1.1.1");
        userDO.setRole("admin");
        userDO.setStatus("online");
        userDO.setAvatar("pic");
        userDAO.addUser(userDO);
        result.setSuccess(true);
        result.setData(userDO);
        return result;
    }
}
