package vip.epss.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.validation.ObjectError;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import vip.epss.domain.Stockpool;
import vip.epss.service.StockpoolService;

import java.util.List;

@Controller
@RequestMapping(value = "/stockPool")
public class StockPoolController {

    @Autowired
    private StockpoolService stockpoolService;


    //录入股票池的时候对关键数据进行校验
    @RequestMapping(value = "/add")
    public String add(@Validated @ModelAttribute("stockPool") Stockpool stockpool, BindingResult bindingResult){
        //System.out.println(stockpool);
        //判断是否有错误的消息
        if(bindingResult.hasErrors()){
            //将报错的信息获得
            List<ObjectError> allErrors = bindingResult.getAllErrors();
            //在后台输出
            for(ObjectError error:allErrors){
                System.out.println(error.getDefaultMessage());
            }
            //将出错信息传递到前台
            //model.addAttribute("allErrors",allErrors);
            //model.addAttribute("stockPool",stockpool);
            //返回表单的页面
            return "forward:/index.jsp";
        }
        Integer faid = stockpool.getShaccount().getAid();
        stockpoolService.insertSelective(stockpool);
        return "abc";
    }
}
