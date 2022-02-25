package net.xdclass.online_xdclass.controller;

import net.xdclass.online_xdclass.model.entity.User;
import net.xdclass.online_xdclass.model.request.LoginRequest;
import net.xdclass.online_xdclass.service.UserService;
import net.xdclass.online_xdclass.utils.JWTUtils;
import net.xdclass.online_xdclass.utils.JsonData;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Map;

@RestController
@RequestMapping("api/v1/pri/user")
public class UserController {

    @Autowired
    private UserService userService;


    @PostMapping("/register")
    public JsonData register(@RequestBody Map UserInfo){
        int rows = userService.save(UserInfo);
        return rows == 1 ? JsonData.buildSucces() : JsonData.buildError("注册失败请重试");
    }


    @PostMapping("/login")
    public JsonData login(@RequestBody LoginRequest loginRequest){
        User user = userService.findByPhoneAndPwd(loginRequest.getPhone(), loginRequest.getPwd());
        if (user == null) {
            return JsonData.buildError("登陆失败");
        }else {
            String token = JWTUtils.geneJsonWebToken(user);
            return JsonData.buildSucces(token);
        }
    }

}
