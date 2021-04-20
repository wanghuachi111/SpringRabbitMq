package com.springbootproducer.rabbit;

import com.springbootproducer.rabbit.entity.Order;
import com.springbootproducer.rabbit.producer.OderSender;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.UUID;

@SpringBootTest
class RabbitApplicationTests {

    @Test
    void contextLoads() {
    }

    @Autowired
    private OderSender oderSender;

    @Test
    public void testSend1() throws Exception {
        Order order = new Order();
        order.setId("2020042000000001");
        order.setName("测试订单1");
        order.setMessageId(System.currentTimeMillis() + "$" + UUID.randomUUID().toString());
        oderSender.sendOrder(order);
    }
}
