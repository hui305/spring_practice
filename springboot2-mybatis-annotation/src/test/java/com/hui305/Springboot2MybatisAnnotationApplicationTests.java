package com.hui305;

import com.github.pagehelper.PageHelper;
import com.hui305.domain.Order;
import com.hui305.mapper.OrderMapper;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.math.BigDecimal;
import java.util.List;
import java.util.stream.Collectors;

@RunWith(SpringRunner.class)
@SpringBootTest
public class Springboot2MybatisAnnotationApplicationTests {

	@Test
	public void contextLoads() {
	}
	@Autowired
	private OrderMapper orderMapper;

	@Test
	public void test1_Add() {
		orderMapper.addOrder(new Order("100004", "nokia 3000 ", new BigDecimal("2000")));
	}

	@Test
	public void test_update(){
		Order order = new Order();
		order.setOrderName("iphone8");
		order.setOrderNo("100002");
		orderMapper.updateOrder(order);
	}
	@Test
	public void test2_Query() {
		Order order = orderMapper.queryOrderByNo("100001");
		System.out.println("ordername = : "+order.getOrderName());
		Assert.assertNotNull(order);
	}

	@Test
	public void test_QueryList(){

		PageHelper.startPage(1,5);
		List<Order> orders =  orderMapper.queryOrders();
		System.out.println("==============> list size:"+orders.size()+"===============");
		orders.stream().forEach((o)-> System.out.println(o.getOrderName()));
//		List<Order> orderList2 = orders.stream().filter(s->s.getOrderNo().equals("100001")).collect(Collectors.toList());
//		System.out.println(orderList2.get(0).getOrderName());
		Assert.assertNotNull(orders);
	}
}
