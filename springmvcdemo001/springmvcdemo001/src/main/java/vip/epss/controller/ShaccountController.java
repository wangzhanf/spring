package vip.epss.controller;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Configuration;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import vip.epss.domain.Shaccount;
import vip.epss.service.ShaccountService;

import java.util.Date;
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

    @RequestMapping(value = "/add1")
    public String add1(Shaccount shaccount){
        System.out.println(shaccount);
        //shaccountService.insertSelective(shaccount);
        return "abc";
    }

    @RequestMapping(value = "/add2")
    public String add2(@RequestParam(value = "myaid",defaultValue = "98")Integer aid,@RequestParam(value = "myaname",required = true) String aname,@RequestParam(value = "myainmarket") String ainmarket){
        System.out.println(aid);
        System.out.println(aname);
        System.out.println(ainmarket);

        Shaccount shaccount = new Shaccount();
        shaccount.setAid(aid);
        shaccount.setAname(aname);
        //将字符串转换为日期类型,每个方法如果使用到了date类型都需要硬编码转换,springMVC中可以采用转换器的方式
        //shaccount.setAinmarket(ainmarket);

        shaccountService.insertSelective(shaccount);
        return "abc";
    }

}
