package net.xdclass.online_xdclass.service;

import net.xdclass.online_xdclass.model.entity.User;

import java.util.Map;

public interface UserService {

    int save(Map userInfo);

    User findByPhone(String phone);

    User findByPhoneAndPwd(String phone, String pwd);
}
