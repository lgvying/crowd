package com.zut.boot.service;

import com.zut.boot.dao.ZanDao;
import com.zut.boot.entity.Zan;
import com.zut.boot.vo.ResponseVo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * @author 梁贵莹
 * @create 2021/6/29 上午 11:54
 */
@Service
public class ZanServiceImpl implements ZanService{
    @Autowired
    private ZanDao zanDao;

    @Override
    public ResponseVo<String> addOne(Zan zan) {
        zanDao.save(zan);
        return new ResponseVo<>("点赞成功,zid为"+zan.getZid(),200,null);
    }

    @Override
    public ResponseVo<String> deleteOne(Integer zid) {
        Zan zan = zanDao.findById(zid).get();
        zanDao.delete(zan);
        return new ResponseVo<>("取消zid为"+zid+"成功",200,null);
    }


    @Override
    public ResponseVo<Zan> getOneByPidUid(Integer pid,Integer uid) {
        Zan zan = zanDao.getOneByPidUid(pid,uid);
        return new ResponseVo<>("获取项目id为"+pid+"用户id为"+uid+"的点赞情况成功",200,zan);
    }
}
