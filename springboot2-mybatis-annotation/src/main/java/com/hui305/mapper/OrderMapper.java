package com.hui305.mapper;

import com.hui305.domain.Order;
import org.apache.ibatis.annotations.*;

import java.util.List;

/**
 * Created by hui_stone on 2018/5/14 0014.
 */
public interface OrderMapper {

//    @Insert("INSERT INTO orders(order_no,order_name,amount,add_time) "
//            + "VALUES(#{orderNo}, #{orderName}, #{amount}, #{addTime})")
    void addOrder(Order order);


//    @Delete("DELETE FROM orders WHERE id=#{id}")
    void delOrder(Integer id);
//    @Update("UPDATE orders SET order_name=#{orderName} WHERE id=#{id}")
//    void updOrder(Order order);

//    @Update("UPDATE orders SET order_name = #{orderName} WHERE order_no =#{orderNo}")
    void updateOrder(Order order);

//    @Select("SELECT * FROM orders")
//    @Results({
//            @Result(property = "orderNo",  column = "order_no"),
//            @Result(property = "orderName", column = "order_name"),
//            @Result(property = "addTime", column = "add_time"),
//    })
    List<Order> queryOrders();

//    @Select("SELECT * FROM orders WHERE order_no=#{orderNo}")
//    @Results({
//            @Result(property = "orderNo",  column = "order_no"),
//            @Result(property = "orderName", column = "order_name"),
//            @Result(property = "addTime", column = "add_time"),
//    })
    Order queryOrderByNo(String orderNo);
}
