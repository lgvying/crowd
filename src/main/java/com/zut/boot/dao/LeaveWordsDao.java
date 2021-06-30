package com.zut.boot.dao;

import com.zut.boot.entity.LeaveWords;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;

/**
 * @author 梁贵莹
 * @create 2021/6/28 下午 5:08
 */
public interface LeaveWordsDao extends JpaRepository<LeaveWords,Integer> {
    /**
     * 根据项目id获取项目的所有留言
     * @param pid
     * @param pageable
     * @return
     */
    public List<LeaveWords> getWordsByPid(Integer pid, Pageable pageable);

    /**
     * 根据项目id获取留言量
     * @param pid
     * @return
     */
    @Query("select count (l) from LeaveWords l where l.pid=?1")
    public Integer getCountByPid(Integer pid);
}
