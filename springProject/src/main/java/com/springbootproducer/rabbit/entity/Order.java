package com.springbootproducer.rabbit.entity;

import lombok.Data;

import java.io.Serializable;

@Data
public class Order implements Serializable {

    private static final long serialVersionUID = 6147623278585956352L;

    private String id;

    private String name;

    private String messageId;  //存储消息发送的唯一标识

    public Order(String id, String name, String messageId) {
        this.id = id;
        this.name = name;
        this.messageId = messageId;
    }

    public Order() {
    }
}
