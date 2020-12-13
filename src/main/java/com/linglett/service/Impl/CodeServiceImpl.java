package com.linglett.service.Impl;

import com.linglett.pojo.ReturnEntity;
import com.linglett.service.CodeService;
import org.apache.commons.mail.EmailException;
import org.apache.commons.mail.HtmlEmail;
import org.springframework.stereotype.Service;;

import java.util.Random;
@Service
public class CodeServiceImpl implements CodeService {

    @Override
    public String getCode(String email) {
        //生成随机验证码
        String code = "";
        Random random = new Random();
        for(int i=0;i<6;i++){
            int r = random.nextInt(10);
            code = code + r;
        }
        HtmlEmail send = new HtmlEmail();//创建一个HtmlEmail实例对象
        // 获取随机验证码
        String resultCode = code;
        try {
            send.setHostName("smtp.qq.com");
            send.setAuthentication("2274748854@qq.com", "hfmzdpghxlltdhja"); //第一个参数是发送者的QQEamil邮箱   第二个参数是刚刚获取的授权码

            send.setFrom("2274748854@qq.com", "KMall商城");//发送人的邮箱为自己的，用户名可以随便填  记得是自己的邮箱不是qq
            send.setSSLOnConnect(true); //开启SSL加密
            send.setCharset("utf-8");
            send.addTo(email);  //设置收件人    email为你要发送给谁的邮箱账户   上方参数
            send.setSubject("KMall商城短信验证码"); //邮箱标题
            send.setMsg(resultCode); //Email发送的内容
            send.send();  //发送
        } catch (EmailException e) {
            e.printStackTrace();
        }
        return resultCode;
    }

    @Override
    public ReturnEntity regularEmail(String email) {
        String reg = "^[a-z0-9]+([._\\-]*[a-z0-9])*@([a-z0-9]+[-a-z0-9]*[a-z0-9]+.){1,63}[a-z0-9]+$";
        ReturnEntity returnEntity = new ReturnEntity();
        System.out.println("email正则="+email.matches(reg));
        if(email.matches(reg)){
            return ReturnEntity.successResult(getCode(email));
        }
        else{
            return ReturnEntity.failedResult("获取验证码失败");
        }
    }
}
