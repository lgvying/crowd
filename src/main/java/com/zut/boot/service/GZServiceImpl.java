package com.zut.boot.service;

import com.zut.boot.dao.GuanzhuDao;
import com.zut.boot.entity.Guanzhu;
import com.zut.boot.vo.ResponseVo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * @author 梁贵莹
 * @create 2021/6/29 下午 2:20
 */
@Service
public class GZServiceImpl implements GZService{
    @Autowired
    private GuanzhuDao guanzhuDao;
    @Override
    public ResponseVo<String> addOne(Guanzhu guanzhu) {
        guanzhuDao.save(guanzhu);
        return new ResponseVo<>("添加关注成功",200,null);
    }

    @Override
    public ResponseVo<String> deleteOne(Integer gid) {
        Guanzhu guanzhu=guanzhuDao.findById(gid).get();
        guanzhuDao.delete(guanzhu);
        return new ResponseVo<>("删除id为+"+gid+"的关注记录成功",200,null);
    }

    @Override
    public ResponseVo<Guanzhu> getOneByPidUid(Integer pid, Integer uid) {
        Guanzhu guanzhu = guanzhuDao.getOneByPidUid(pid, uid);

        return new ResponseVo<>("根据pid为："+pid+",uid为："+uid+"的关注记录成功",200,guanzhu);
    }
}
