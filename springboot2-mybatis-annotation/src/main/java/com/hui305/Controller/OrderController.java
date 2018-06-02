package com.hui305.Controller;

import com.hui305.domain.Order;
import com.hui305.mapper.OrderMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Date;
import java.util.List;

/**
 * Created by hui_stone on 2018/5/14 0014.
 */
@RestController
@RequestMapping("/order")
public class OrderController {

    @Autowired
    private OrderMapper orderMapper;

    @RequestMapping("/add")
    public String addOrder(Order order){
        order.setAddTime(new Date());
        orderMapper.addOrder(order);
        return "add success!";
    }

    @RequestMapping("/update")
    public String updOrder(Order order){
        orderMapper.updateOrder(order);
        return "update success!";
    }

    @RequestMapping("/query")
    public Order queryOrder(String orderNo){
        return orderMapper.queryOrderByNo(orderNo);
    }

    @RequestMapping("/queryAll")
    public List<Order> queryAll(){
        return orderMapper.queryOrders();
    }

    @RequestMapping("/delete")
    public String delOrder(Integer id){
        orderMapper.delOrder(id);

        return "delete success!";
    }
}
