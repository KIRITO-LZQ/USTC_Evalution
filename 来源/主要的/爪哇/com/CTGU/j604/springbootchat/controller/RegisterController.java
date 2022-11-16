package com.ctgu.j604.springbootchat.controller;

import com.ctgu.j604.springbootchat.model.Student;
import com.ctgu.j604.springbootchat.model.TUser;
import com.ctgu.j604.springbootchat.service.RegisterService;
import com.ctgu.j604.springbootchat.service.TUserService;
import com.ctgu.j604.springbootchat.utils.Result;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.data.redis.core.RedisTemplate;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;


import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;


@RestController
public class RegisterController {
    @Resource
    private TUserService tUserService;
    @Resource
    private RegisterService registerService;
    @Resource
    private LoginController loginController;
    @Resource
    private RedisTemplate<Object,Object> redisTemplate;

    @PostMapping("/register")
    @ApiOperation(value = "用户注册的接口", notes = "用户注册的接口")
    public Result registerUser(TUser registertuser, HttpServletRequest req) {

        if(null==registertuser){
            return null;
        }
//        System.out.println("账户的用户名为:"+registertuser.getName());
        TUser tUser = registerService.addTUser(registertuser);

       if (null!=tUser){
                return new Result(true, "");
            } else {

//                return new Result(false, Result.REPEAT_INFORMATION );
                return new Result(false,"学号重复");
            }

        }


    }




