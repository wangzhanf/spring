package vip.epss.controller;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Configuration;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import vip.epss.domain.Shaccount;
import vip.epss.service.ShaccountService;

import java.util.List;

@Controller
@RequestMapping("/shaccount")
public class ShaccountController {
    @Autowired
    private ShaccountService shaccountService;

    @RequestMapping(value = "/addShaccount",method = {RequestMethod.POST})
    public void addShaccount(Shaccount shaccount){

        int i = shaccountService.insertSelective(shaccount);
        System.out.println("成功插入了"+i+"条记录");
    }

    @RequestMapping(value = "/list",method = {RequestMethod.POST},params = {"pageSize"})
    public void listShaccount(Integer pageNum,Integer pageSize){
        //分页插件的初始化 pn 当前页码数,   每页的记录数
        PageHelper.startPage(pageNum, pageSize);
//查询第3页
        //将获取到的记录集合封装到pageInfo对象中
        List<Shaccount> shaccounts = shaccountService.selectByExample(null);
        PageInfo<Shaccount> pageInfo = new PageInfo<>(shaccounts);
    }
}
