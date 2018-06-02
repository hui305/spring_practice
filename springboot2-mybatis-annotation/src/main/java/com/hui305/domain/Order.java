package com.hui305.domain;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

import java.math.BigDecimal;
import java.util.Date;

/**
 * Created by hui_stone on 2018/5/14 0014.
 */
@Getter
@Setter
public class Order {

    private Integer id;
    private String orderNo;
    private String orderName;
    private BigDecimal amount;
    private Date addTime;

    public Order(){}

    public Order(String orderNo, String orderName, BigDecimal amount){
        this.orderNo = orderNo;
        this.orderName = orderName;
        this.amount = amount;
        this.addTime = new Date();
    }


}
