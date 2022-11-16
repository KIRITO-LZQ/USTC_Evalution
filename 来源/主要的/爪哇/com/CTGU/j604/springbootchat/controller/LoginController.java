package com.ctgu.j604.springbootchat.controller;

import com.ctgu.j604.springbootchat.model.TUser;
import com.ctgu.j604.springbootchat.utils.Result;
import com.ctgu.j604.springbootchat.service.TUserService;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;


@RestController
@Api(value = "用户登录的接口", tags = {"登录的controller"})
public class LoginController {
    @Resource
    private TUserService tUserService;

    @RequestMapping("/login")
    @ApiOperation(value = "用户登录的接口", notes = "用户登录的接口")
    public Result login(HttpServletRequest request,TUser user){

        if(null==user){
            return null;
        }

        user.setEmail(user.getUserNum());
        user.setPhoneNum(user.getUserNum());
        user.setNickName(user.getUserNum());
        TUser tUser = tUserService.login(user);
        if(null!=tUser){
            request.getSession().setAttribute("status","on");
            request.getSession().setAttribute("curUserId",tUser.getUserId());
            request.getSession().setAttribute("userNum",tUser.getUserNum());
            request.getSession().setAttribute("curUser",tUser);
            return new Result(true,"");
        }
        else{
            return new Result(false, Result.WRONG_ACCOUNT_OR_PASSWORD);
        }
  }
//        public JSONResult login(HttpServletRequest request,TUser user){
//            if(null==user){
//                return null;
//            }
//        if(StringUtils.isEmptyOrWhitespaceOnly(user.getUserNum()) || StringUtils.isEmptyOrWhitespaceOnly(user.getPassword())){
//            return JSONResult.errorMsg("学号和密码不能为空");
//        }
//
//            TUser tUser = tUserService.login(user);
//            return JSONResult.ok(user);
//        }

    @GetMapping("/logout")
    public void logout(HttpServletRequest request, HttpServletResponse response){
        request.getSession().setAttribute("status","off");
        try {
            response.sendRedirect("/");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
