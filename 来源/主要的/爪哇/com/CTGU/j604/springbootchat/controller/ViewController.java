package com.ctgu.j604.springbootchat.controller;

import com.ctgu.j604.springbootchat.model.FriendListInfo;
import com.ctgu.j604.springbootchat.model.GroupAndUser;
import com.ctgu.j604.springbootchat.model.TUser;
import com.ctgu.j604.springbootchat.service.GroupService;
import com.ctgu.j604.springbootchat.service.TUserService;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;
import java.util.List;

@Controller
public class ViewController {
    @Resource
    private TUserService tUserService;
    @Resource
    private GroupService groupService;

    @RequestMapping("/main")
    public ModelAndView retMain(HttpServletRequest request){
        ModelAndView mv = new ModelAndView();
//        mv.setViewName("HeartChat2");
        Integer curUserId = (Integer) request.getSession().getAttribute("curUserId");
        Integer userType=tUserService.queryUserType(curUserId);
        if(userType==0){
            mv.setViewName("HeartChat2");
        }else{
            mv.setViewName("HeartChat");
        }
//        List<FriendListInfo> friendListInfoList = tUserService.getAllFriend(curUserId);
        List<GroupAndUser> groupAndUserList = groupService.getAllGroup(curUserId);
        TUser tUser = (TUser)request.getSession().getAttribute("curUser");
        mv.addObject("curUser",tUser);
//        mv.addObject("friendListInfoList",friendListInfoList);
        mv.addObject("groupAndUserList", groupAndUserList);
        return mv;
    }
    @RequestMapping("/")
    public ModelAndView loginHtml(){
        ModelAndView modelAndView = new ModelAndView();
        modelAndView.setViewName("login");
        return modelAndView;
    }

    @RequestMapping("/registerView")
    public ModelAndView registerHtml(){
        ModelAndView modelAndView = new ModelAndView();
        modelAndView.setViewName("register");
        return  modelAndView;
    }

    @RequestMapping("/ctgu")
    public ModelAndView ctgu(){
        ModelAndView mv = new ModelAndView();
        mv.setViewName("auto-report-safety");
        return mv;
    }
}
