package com.NaiGeLan.dianshangWeb.service;

import com.NaiGeLan.dianshangWeb.dataObj.UserDO;
import com.NaiGeLan.dianshangWeb.model.Result;

public interface UserService {
    public Result<UserDO> register(String username, String password);

}
