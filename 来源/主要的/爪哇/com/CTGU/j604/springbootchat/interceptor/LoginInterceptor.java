package com.ctgu.j604.springbootchat.interceptor;

import com.ctgu.j604.springbootchat.model.TUser;
import org.springframework.stereotype.Component;
import org.springframework.web.servlet.HandlerInterceptor;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@Component
public class LoginInterceptor implements HandlerInterceptor {
    @Override
    public boolean preHandle(HttpServletRequest request, HttpServletResponse response, Object handler) throws Exception {
        String status = (String)request.getSession().getAttribute("status");
        if (status == null || "off".equals(status)) {
            response.sendRedirect("/");
            return false;
        }
        else{
            return true;
        }
    }
}
