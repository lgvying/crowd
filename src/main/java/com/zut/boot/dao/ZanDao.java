package com.zut.boot.dao;

import com.zut.boot.entity.Zan;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

/**
 * @author 梁贵莹
 * @create 2021/6/29 上午 11:49
 */
public interface ZanDao extends JpaRepository<Zan,Integer> {

    @Query("select z from Zan z where z.pid=?1 and z.uid=?2")
    public Zan getOneByPidUid(Integer pid,Integer uid);
}
