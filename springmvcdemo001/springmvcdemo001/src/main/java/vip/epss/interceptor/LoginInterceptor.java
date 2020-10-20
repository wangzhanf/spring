package vip.epss.interceptor;

import org.springframework.web.servlet.HandlerInterceptor;
import vip.epss.domain.User;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

//登录拦截器,实现
public class LoginInterceptor implements HandlerInterceptor {
    public boolean preHandle(HttpServletRequest request, HttpServletResponse response, Object handler) throws Exception {
        //如果访问的是 /user/login   则放行

        String requestURI = request.getRequestURI();

        if(requestURI.indexOf("/user/login") > 0){//

            return true;
        }
        //如果从session中能够获得 USER_SESSION 则放行
        User byUser = (User)request.getSession().getAttribute("USER_SESSION");
        System.out.println("byuser");
        System.out.println(byUser);
        if(byUser!=null){
            return true;
        }

        //如果不放行则给用户提示信息
        request.setAttribute("msg","亲,请先登录");
        //转发到登录页
        request.getRequestDispatcher("/user/login").forward(request,response);

        //默认情况下所有的请求都不放行
        return false;
    }
}
