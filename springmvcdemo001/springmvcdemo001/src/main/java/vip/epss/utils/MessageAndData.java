package vip.epss.utils;

import java.util.HashMap;
import java.util.Map;

//对前端调用的数据进行统一封装
public class MessageAndData {
    private Integer statusCode;//状态码
    private String message;//消息内容
    private Map<String,Object> dataZone = new HashMap<>();//数据区

    public Integer getStatusCode() {
        return statusCode;
    }

    public void setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public Map<String, Object> getDataZone() {
        return dataZone;
    }

    public void setDataZone(Map<String, Object> dataZone) {
        this.dataZone = dataZone;
    }

    public static  MessageAndData success(){
        MessageAndData messageAndData = new MessageAndData();
        messageAndData.setStatusCode(200);
        messageAndData.setMessage("调用成功");
        return messageAndData;
    }

    public static  MessageAndData error(){
        MessageAndData messageAndData = new MessageAndData();
        messageAndData.setStatusCode(400);
        messageAndData.setMessage("调用失败");
        return messageAndData;
    }
    
    //提供将数据填充到数据区的方法
    public MessageAndData add(String key,Object value){
        this.getDataZone().put(key,value);
        return this;
    }
//填写状态一级填充数据的时候应该要方便调用,所以 提供静态方法 ,   应该提供链式的操作方式

}


