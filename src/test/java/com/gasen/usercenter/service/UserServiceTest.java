package com.gasen.usercenter.service;

import com.gasen.usercenter.Model.domain.User;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

import javax.annotation.Resource;

@SpringBootTest
class UserServiceTest {

    @Resource
    private UserService userService;

    @Test
    void testAddUser() {
        User user = new User();
        user.setUsername("gasen");
        user.setUserAccount("123");
        user.setAvatarUrl("https://mdn.alipayobjects.com/huamei_0prmtq/afts/img/A*9uyGR6gGcI4AAAAAAAAAAAAADvuFAQ/original");
        user.setGender(0);
        user.setUserPassword("xxx");
        user.setPhone("123");
        user.setEmail("456");
        user.setUserStatus(0);
        boolean save = userService.save(user);
        System.out.println(user.getId());
        Assertions.assertTrue(save);
    }

    @Test
    void userRegister() {
        String userAccount = "1234";
        String userPassword = "";
        String checkPassword = "12345678";
        String planetCode = "1";
        long result = userService.userRegister(userAccount, userPassword, checkPassword, planetCode);
        Assertions.assertEquals(-1,result);
        userPassword = "12345678";
        userAccount = "";
        result = userService.userRegister(userAccount, userPassword, checkPassword, planetCode);
        Assertions.assertEquals(-1,result);
        userAccount = "1234";
        userPassword = "123";
        checkPassword = "123";
        result = userService.userRegister(userAccount, userPassword, checkPassword, planetCode);
        Assertions.assertEquals(-1,result);
        userAccount = "gasen";
        userPassword = "12345678";
        checkPassword = "12345678";
        result = userService.userRegister(userAccount, userPassword, checkPassword, planetCode);
        Assertions.assertEquals(-1,result);
        userPassword = "123456789";
        checkPassword = "12345678";
        result = userService.userRegister(userAccount, userPassword, checkPassword, planetCode);
        Assertions.assertEquals(-1,result);
        userAccount = "gasen*";
        result = userService.userRegister(userAccount, userPassword, checkPassword, planetCode);
        Assertions.assertEquals(-1,result);

        userAccount = "tsetCode2";
        userPassword = "12345678";
        checkPassword = "12345678";
        planetCode = "3";
        result = userService.userRegister(userAccount, userPassword, checkPassword, planetCode);
        Assertions.assertNotEquals(-1,result);
    }
}