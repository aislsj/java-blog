package com.ais.config;

import org.springframework.web.servlet.HandlerInterceptor;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class LoginHandlerInterceptor implements HandlerInterceptor {

    @Override
    public boolean preHandle(
            HttpServletRequest request,
            HttpServletResponse response,
            Object handler) throws Exception {
        //登录成功后  有用户的session
//        Object loginUser = request.getSession().getAttribute("user");
//        if(loginUser==null){//没有登录
//            request.setAttribute("msg","没有权限,请先登录");
//            response.sendRedirect("/admin/login");
////            request.getRequestDispatcher("/admin/index/index").forward(request,response);
//            return  false;
//        }else {
//            return  true;
//        }
        return  true;

    }


}
