package com.wyy.titan.user.service.impl;

import com.wyy.titan.user.service.UserService;
import org.springframework.stereotype.Service;

/**
 * Created by wangyangyang on 16/8/17.
 */
@Service
public class UserServiceImpl implements UserService {
    @Override
    public String createUser() {
        return "Create a user successfully!";
    }
}
