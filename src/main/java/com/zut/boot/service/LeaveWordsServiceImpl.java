package com.zut.boot.service;

import com.zut.boot.dao.LeaveWordsDao;
import com.zut.boot.entity.LeaveWords;
import com.zut.boot.vo.ResponseVo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

/**
 * @author 梁贵莹
 * @create 2021/6/28 下午 5:14
 */
@Service
public class LeaveWordsServiceImpl implements LeaveWordsService{
    @Autowired
    private LeaveWordsDao leaveWordsDao;
    @Override
    public List<String> findWordsByPid(Integer pid, Integer page, Integer size) {
        Pageable pageable= PageRequest.of(page,size);
        List<LeaveWords> list=leaveWordsDao.getWordsByPid(pid,pageable);
        List<String> list1=new ArrayList<>();
        for (LeaveWords l : list) {
            list1.add(l.getWords());
        }
        return list1;
    }

    @Override
    public void addOne(LeaveWords leaveWords) {
        leaveWordsDao.save(leaveWords);

    }

    @Override
    public void deleteOne(Integer lid) {
        LeaveWords leaveWords=leaveWordsDao.findById(lid).get();
        leaveWordsDao.delete(leaveWords);

    }

    @Override
    public void updateOne(LeaveWords leaveWords) {
        leaveWordsDao.save(leaveWords);

    }

    @Override
    public ResponseVo<Integer> getCountByPid(Integer pid) {
        Integer count=leaveWordsDao.getCountByPid(pid);
        return new ResponseVo<>("获取项目id为："+pid+"的项目留言量成功",200,count);
    }
}
