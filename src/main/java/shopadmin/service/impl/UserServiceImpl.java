package shopadmin.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import shopadmin.mapper.UserMapper;
import shopadmin.model.User;
import shopadmin.service.UserService;

@Service
public class UserServiceImpl implements UserService {
    @Autowired
    private UserMapper userMapper;
    

    @Override
    public List<User> findAll() {
        return userMapper.findAll();
    }

}
