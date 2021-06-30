package com.zut.boot.dao;

import com.zut.boot.entity.Guanzhu;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;

/**
 * @author 梁贵莹
 * @create 2021/6/28 下午 5:33
 */
public interface GuanzhuDao extends JpaRepository<Guanzhu,Integer> {
    @Query("select f from Guanzhu f where f.pid=?1 and f.uid=?2")
    public Guanzhu getOneByPidUid(Integer pid,Integer uid);
}
