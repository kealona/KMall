package com.linglett.service;

import com.linglett.pojo.ReturnEntity;

public interface CodeService {
    /**
     * 获取验证码
     * @param email 要发送的邮箱
     * @return 返回随机验证码
     */
    String getCode(String email);

    /**
     * 对邮箱格式进行正则
     * @param email 要验证的邮箱
     */
     ReturnEntity regularEmail(String email);
}
