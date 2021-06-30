package com.zut.boot.dao;

import com.zut.boot.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * @author 梁贵莹
 * @create 2021/6/25 上午 9:48
 */

public interface UserJpaRepositoryDao extends JpaRepository<User,Integer> {

    @Query(value = "select u.uid from User u where u.phone=?1")
    public int getOneByPhone(String phone);
}
