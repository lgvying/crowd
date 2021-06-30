package com.zut.boot.dao;

import com.zut.boot.entity.LeaveWords;
import com.zut.boot.entity.Project;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;

/**
 * @author 梁贵莹
 * @create 2021/6/28 上午 11:29
 */
public interface ProjectJpaRepositoryDao extends JpaRepository<Project, Integer> {
    public List<Project> getAllByType(String type, Pageable pageable);
    public List<Project> getAllByStatus(Integer status, Pageable pageable);
    @Query("select p.detail from Project p where p.pid=?1")
    public String getDetailByPid(Integer pid);

}
