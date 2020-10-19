package vip.epss.utils;

import org.springframework.core.convert.converter.Converter;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

//实现 Convert接口
public class StringToDateConvert implements Converter<String, Date> {
    @Override
    public Date convert(String s) {
        System.out.println("STD开始工作");
        //如果传递的原始数据是空的
        if(s == null){
            throw new RuntimeException("输入的日期字符串为空");
        }
        //开始转换的业务
        String fmtStr = "";
        if(s.length() > 10){
            s = s.replace("T"," ");
            fmtStr = "yyyy-MM-dd HH:mm:ss";
        }else{
            fmtStr = "yyyy-MM-dd";
        }
        Date date=null;

        SimpleDateFormat simpleDateFormat = new SimpleDateFormat(fmtStr);
        try {
            date = simpleDateFormat.parse(s);
        } catch (ParseException e) {
            e.printStackTrace();
        }

        //new SimpleDateFormat("yyyy-MM-dd HH:mm:ss")
        return date;
    }
}
