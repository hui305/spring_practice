package com.hui305.service;

import com.hui305.annotation.BussAnnotation;
import org.springframework.stereotype.Service;

/**
 * Created by hui_stone on 2020/5/26 0026.
 */
@Service
public class UserManagerApplogicImpl implements UserManagerApplogic  {

    @BussAnnotation(moduleName = "人员管理",option="添加用户")
    @Override
    public void addUser(String name) {
        System.out.println("add a User name is "+name);
    }

    @BussAnnotation(moduleName="人员管理",option="添加新人")
    @Override
    public void addOne(int type, int parentid) {
        System.out.println("add a new one type : "+type+" \t perentid : "+parentid);
    }
}
