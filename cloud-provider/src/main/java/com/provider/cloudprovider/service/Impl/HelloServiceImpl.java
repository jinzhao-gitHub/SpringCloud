package com.provider.cloudprovider.service.Impl;

import com.provider.cloudprovider.service.HelloService;
import org.springframework.stereotype.Service;

/**
 *  @author: jinzhao
 *  @Date: 2021/1/6 16:47
 *  @Description:
 */
@Service
public class HelloServiceImpl implements HelloService {

    /**
     * @Description 测试类
     * @Author  jinzhao
     * @Date   2021/1/6 16:48
     * @param
     * @Return      java.lang.String
     * @Exception
     *
     */
    @Override
    public String getHello() {

        return "hello world provider";
    }
}
