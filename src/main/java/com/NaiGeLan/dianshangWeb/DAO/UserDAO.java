package com.NaiGeLan.dianshangWeb.DAO;
import com.NaiGeLan.dianshangWeb.dataObj.UserDO;
import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface UserDAO {
    int addUser(UserDO userDO);

}
