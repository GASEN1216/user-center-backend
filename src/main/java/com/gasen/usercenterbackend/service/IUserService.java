package com.gasen.usercenterbackend.service;

import com.gasen.usercenterbackend.common.BaseResponse;
import com.gasen.usercenterbackend.model.Request.UserBannedDaysRequest;
import com.gasen.usercenterbackend.model.User;
import com.baomidou.mybatisplus.extension.service.IService;
import jakarta.servlet.http.HttpServletRequest;

import java.util.List;

/**
 * <p>
 * 用户信息 服务类
 * </p>
 *
 * @author gasen
 * @since 2024-02-22
 */
public interface IUserService extends IService<User> {

    long userRegister(String userAccount, String password);

    User userLogin(String userAccount, String password, HttpServletRequest request);

    boolean userLogout(HttpServletRequest request);

    Boolean userBannedDays(UserBannedDaysRequest userBannedDaysRequest);

    List<User> usersList();
}
