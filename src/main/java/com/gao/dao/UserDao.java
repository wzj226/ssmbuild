package com.gao.dao;

import com.gao.pojo.User;
import org.apache.ibatis.annotations.Param;
import org.springframework.web.bind.annotation.PathVariable;

public interface UserDao {

    /**
     * 根据id查用户
     * @param id
     * @return
     */
    User queryById(@Param("username") String username, @Param("password") String password);

    /**
     * 添加用户
     * @param user
     * @return
     */
    int addUser(User user);
}
