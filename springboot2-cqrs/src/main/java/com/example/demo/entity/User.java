package com.example.demo.entity;

import com.baomidou.mybatisplus.annotation.TableName;
import lombok.Builder;
import lombok.Getter;
import lombok.Setter;

/**
 * <p>
 * 
 * </p>
 *
 * @author author
 * @since 2022-08-05
 */
@Getter
@Setter
@TableName("t_user")
@Builder
public class User {

    private Integer id;

    private String name;


}
