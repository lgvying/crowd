//package com.zut.boot.service;
//
//import com.zut.boot.dao.GuanzhuDao;
//import com.zut.boot.dao.UserJpaRepositoryDao;
//import com.zut.boot.entity.Guanzhu;
//import com.zut.boot.entity.User;
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.stereotype.Service;
//
//import java.util.ArrayList;
//import java.util.List;
//
///**
// * @author 梁贵莹
// * @create 2021/6/28 下午 5:37
// */
//@Service
//public class GuanzhuServiceImpl implements GuanzhuService {
//    @Autowired
//    private GuanzhuDao focusDao;
//    @Autowired
//    private UserJpaRepositoryDao userJpaRepositoryDao;
//    @Override
//    public List<User> findAllSupporterByPid(Integer pid) {
//        List<Integer> list=focusDao.getAllByPid(pid);
//        ArrayList<User> list1 = new ArrayList<>();
//        for (Integer i: list
//             ) {
//            User user=userJpaRepositoryDao.findById(i).get();
//            list1.add(user);
//        }
//
//        return list1;
//    }
//
//    @Override
//    public void addOne(Guanzhu focus) {
//        focusDao.save(focus);
//
//    }
//
//    @Override
//    public void deleteOne(Integer fid) {
//        Guanzhu focus=focusDao.findById(fid).get();
//        focusDao.delete(focus);
//
//    }
//}
