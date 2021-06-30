package com.zut.boot.service;

import com.zut.boot.dao.UserJpaRepositoryDao;
import com.zut.boot.entity.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @author 梁贵莹
 * @create 2021/6/28 上午 9:23
 */
@Service
public class UserServiceImpl implements UserService{
    @Autowired
    private UserJpaRepositoryDao userDao;

    @Override
    public void addOne(User user) {
        userDao.save(user);
    }

    @Override
    public void deleteOne(int uid) {
        User user=userDao.findById(uid).get();
        userDao.delete(user);
    }

    @Override
    public void update(User user) {
        userDao.save(user);
    }

    @Override
    public User getOne(int uid) {
        User user=userDao.findById(uid).get();
        return user;
    }

    @Override
    public List<User> getAll() {
        List<User> list=userDao.findAll();
        return list;
    }

    @Override
    public User getOneByPhone(String phone) {
        int uid=userDao.getOneByPhone(phone);
        User user=userDao.findById(uid).get();
        return user;
    }

    @Override
    public Page<User> findAllByUserIdIn(List<Long> userIds, Pageable pageable) {
        return null;
    }


}
