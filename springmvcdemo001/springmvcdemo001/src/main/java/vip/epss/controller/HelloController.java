package vip.epss.controller;

import com.alibaba.fastjson.JSONArray;
import org.springframework.http.HttpRequest;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.ModelAndViewDefiningException;
import vip.epss.domain.Shaccount;
import vip.epss.domain.User;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

@Controller
@RequestMapping(value = "/hello")
public class HelloController {


//    @ResponseBody
//    设置虚拟路径的映射,当前的路径和对应的handler放在映射处理器中
    @RequestMapping(value = "/index",method = {RequestMethod.GET})
    public String sayHello(){
        return "abc";
    }
//    springMVC中controller返回字符串,默认返回的是视图的名称
//    如果方法的返回值是void类型,当前的url虚拟路径作为视图的名称

    @RequestMapping(value = "/user")
    public String toUser(){
        return "redirec:index";//如果字符串的开始是redirect:重定向到其他url上
    }

    //如何在方法中使用servlet对象
    @RequestMapping(value = "/req")
    public void testRequest(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
//        String app = request.getContextPath();
//        System.out.println(app);
        request.getRequestDispatcher("/WEB-INF/abc.jsp").forward(request,response);//转发
    }

    @RequestMapping(value = "/res1")
    public void testResponse1(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        response.sendRedirect("http://localhost:8080/springmvcdemo001_war_exploded/WEB-INF/abc.jsp");//重定向
    }

    @RequestMapping(value = "/res2")
    public void testResponse2(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        response.sendRedirect("http://localhost:8080/springmvcdemo001_war_exploded/index.jsp");
    }

    @RequestMapping(value = "/login")
    public void testLogin(HttpSession session, HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        session.setAttribute("user","User");
        response.sendRedirect("http://localhost:8080/springmvcdemo001_war_exploded/index.jsp");
    }

    @RequestMapping(value ="/jsonStr")
    public void testJson1(HttpServletResponse response) throws IOException {

        response.setCharacterEncoding("utf-8");
        response.setContentType("application/json;charset=utf-8");
        response.getWriter().write("我是提示消息");
    }

    @RequestMapping(value ="/jsonObj")
    public void testJson2(HttpServletResponse response) throws IOException {
        response.setCharacterEncoding("utf-8");
        response.setContentType("application/json;charset=utf-8");
        User user = new User(1, "zs", "123");
//        response.getWriter().write(user.toString());
        //如果通过覆写toString的方式返回json格式的数据[易错],需要客户端通过js将字符串转换为json
        //推荐使用json的转换库   fastjson   ,导入依赖库
        response.getWriter().write(JSONArray.toJSONString(user));
    }

    @RequestMapping(value = "/model")
    public String test001(Model model){
        User user = new User(1, "zs", "123");
        model.addAttribute("user",user);//model填充数据的方式是 map集合, 一次request有效
       return "abc";
    }

    @RequestMapping(value = "/mav")
    public ModelAndView test002(){
        ModelAndView modelAndView = new ModelAndView();

        List<User> users = new ArrayList<>();
        users.add(new User(1, "zs", "123"));
        users.add(new User(1, "ls", "123"));
        users.add(new User(1, "ww", "123"));
        users.add(new User(1, "mal", "123"));

        if(users.size() == 0){
            modelAndView.setViewName("register");
        }else{
            modelAndView.setViewName("abc");
        }

        modelAndView.addObject("users",users);
        return modelAndView;
    }

}
