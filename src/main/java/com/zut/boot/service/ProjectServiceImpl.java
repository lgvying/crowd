package com.zut.boot.service;

import com.zut.boot.dao.ProjectJpaRepositoryDao;
import com.zut.boot.entity.LeaveWords;
import com.zut.boot.entity.Project;
import com.zut.boot.entity.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.*;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

/**
 * @author 梁贵莹
 * @create 2021/6/28 下午 1:33
 */
@Service
public class ProjectServiceImpl implements ProjectService{
    @Autowired
    ProjectJpaRepositoryDao projedtDao;
    @Override
    public void addOne(Project project) {
        projedtDao.save(project);
    }

    @Override
    public void update(Project project) {
        projedtDao.save(project);

    }

    @Override
    public void deleteOne(Integer pid) {
        projedtDao.deleteById(pid);

    }

    @Override
    public Project getOneByPid(Integer pid) {
        Project project=projedtDao.findById(pid).get();
        return project;
    }

    @Override
    public List<Project> getAll() {
        List<Project> list=projedtDao.findAll();
        return list;
    }

    @Override
    public List<Project> findByType(String type, Integer page, Integer size) {
        Pageable pageable=PageRequest.of(page,size);
        List<Project> list=projedtDao.getAllByType(type,pageable);
        return list;
    }

    @Override
    public List<Project> findByStatus(Integer status, Integer page, Integer size) {
        Pageable pageable=PageRequest.of(page,size);
        List<Project> list=projedtDao.getAllByStatus(status,pageable);
        return list;
    }

    @Override
    public Page<Project> findByCreateTime( Integer page, Integer size) {
        Sort sort = Sort.by("createTime").descending();
        Pageable pageable=PageRequest.of(page,size,sort);
        Page<Project> page1= projedtDao.findAll(pageable);
        return page1;
    }

    @Override
    public Page<Project> findByToMoney(Integer page, Integer size) {
        Sort sort=Sort.by("toMoney").descending();
        Pageable pageable=PageRequest.of(page,size,sort);
        Page<Project> list=  projedtDao.findAll(pageable);
        return list;
    }

    @Override
    public Page<Project> findByScore( Integer page, Integer size) {
        Sort sort=Sort.by("score").descending();
        Pageable pageable=PageRequest.of(page,size,sort);
        Page<Project> list=  projedtDao.findAll(pageable);
        return list;
    }

    @Override
    public String findDetailByPid(Integer pid) {
        String s=projedtDao.getDetailByPid(pid);
        return s;
    }

//    @Override
//    public List<LeaveWords> findWordsByPid(Integer pid) {
//
//        return null;
//    }
//
//    @Override
//    public List<User> findAllSupporterByPid(Integer pid) {
//        return null;
//    }
}
