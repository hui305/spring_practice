package com.hui305;

import com.hui305.service.UserManagerApplogic;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

/**
 * Created by hui_stone on 2020/5/26 0026.
 */
@SpringBootTest
public class SpringbootAppTest {

    @Autowired
    private UserManagerApplogic userManagerApplogic;

    @Test
    public void testAopAddUser(){
        userManagerApplogic.addUser("You you ");
    }

}
