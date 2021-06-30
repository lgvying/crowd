package com.zut.boot.controller;

import com.zut.boot.entity.LeaveWords;
import com.zut.boot.service.LeaveWordsService;
import com.zut.boot.vo.ResponseVo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.web.bind.annotation.*;

import java.util.List;

/**
 * @author 梁贵莹
 * @create 2021/6/28 下午 9:02
 */
@RestController
@RequestMapping("/leaveWords")
public class LeaveWordsController {
    @Autowired
    private LeaveWordsService leaveWordsService;

    /**
     * 添加一个
     * @param leaveWords
     * @return
     */
    @RequestMapping(value = "/addOne",method = RequestMethod.POST)
    public ResponseVo<String> addOne(LeaveWords leaveWords){
        leaveWordsService.addOne(leaveWords);
        return new ResponseVo("添加留言"+leaveWords.getWords()+"成功",200,null);
    }

    /**
     * 删除一个
     * @param lid
     * @return
     */
    @DeleteMapping
    public ResponseVo<String> deleteOne(Integer lid){
        leaveWordsService.deleteOne(lid);
        return new ResponseVo<>("删除lid+"+lid+"的项目成功",200,null);
    }

    /**
     * 修改一个
     * @param leaveWords
     * @return
     */
    @RequestMapping(value = "/updateOne",method = RequestMethod.PUT)
    public ResponseVo<String> updateOne(LeaveWords leaveWords){
        leaveWordsService.updateOne(leaveWords);
        return new ResponseVo<>("更新留言"+leaveWords.getWords()+"成功",200,null);
    }

    /**
     * 根据pid获取项目的留言
     * @param pid
     * @param page
     * @param size
     * @return
     */
    @RequestMapping(value = "/getWordsByPid/{pid}/{page}/{size}",method = RequestMethod.GET)
    public ResponseVo<List<String>> getWordsByPid(@PathVariable("pid") Integer pid,
                                          @PathVariable("page")Integer page,
                                          @PathVariable("size")Integer size){
        List<String> wordsByPid = leaveWordsService.findWordsByPid(pid, page, size);
        return new ResponseVo<>("获取id为"+pid+"的项目的留言成功",200,wordsByPid);
    }

    /**
     * 根据pid获取项目的留言量
     * @param pid
     * @return
     */
    @RequestMapping(value = "/getCountByPid/{pid}",method = RequestMethod.GET)
    public ResponseVo<Integer> getCountByPid(@PathVariable("pid") Integer pid){
       return leaveWordsService.getCountByPid(pid);
    }


}
