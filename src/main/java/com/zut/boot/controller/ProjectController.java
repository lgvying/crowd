package com.zut.boot.controller;

import com.zut.boot.entity.Project;
import com.zut.boot.service.ProjectService;
import com.zut.boot.vo.ResponseVo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.convert.ReadingConverter;
import org.springframework.data.domain.Page;
import org.springframework.web.bind.annotation.*;

import java.util.List;

/**
 * @author 梁贵莹
 * @create 2021/6/28 下午 2:37
 */
@RestController
@RequestMapping("/project")
public class ProjectController {
    @Autowired
    private ProjectService projectService;

    /**
     * 添加项目
     * @param project
     */
    @RequestMapping(value="/addOne",method = RequestMethod.POST)
    public ResponseVo<String> addOne(Project project){
        projectService.addOne(project);
        return new ResponseVo<>("添加"+project.getPname()+"成功",200,null);
    }

    /**
     * 更新
     * @param project
     */
    @RequestMapping(value = "/update",method = RequestMethod.PUT)
    public ResponseVo<String> updateOne(Project project){
        projectService.update(project);
        System.out.println(project.getPname());
        return new ResponseVo<>("修改"+project.getPname()+"成功",200,null);
    }
    @RequestMapping(value = "/getByType/{type}/{page}/{size}",method = RequestMethod.GET)
    public ResponseVo<List<Project>> getByType(@PathVariable("type") String type,
                                               @PathVariable("page") Integer page,
                                               @PathVariable("size") Integer size){
        List<Project> list=projectService.findByType(type,page,size);
        return new ResponseVo<List<Project>>("获取"+type+"类型的项目成功",200,list);
    }

    /**
     * 删除一个项目
     * @param pid
     * @return
     */
    @DeleteMapping
    public ResponseVo<String> deleteOne(Integer pid){
        projectService.deleteOne(pid);
        return new ResponseVo<>("删除id为"+pid+"的项目成功",200,null);
    }

    /**
     * 根据状态分页
     * @return
     */
    @RequestMapping(value = "/getByStatus/{status}/{page}/{size}",method = RequestMethod.GET)
    public ResponseVo<List<Project>> getByStatus(@PathVariable("status") Integer status,
                                                 @PathVariable("page") Integer page,
                                                 @PathVariable("size") Integer size){
       List<Project> list= projectService.findByStatus(status,page,size);
       return new ResponseVo<>("获取"+status+"状态的项目成功",200,list);
    }

    /**
     * 根据发布时间分页
     * @param page
     * @param size
     * @return
     */
    @RequestMapping(value = "/getByCreateTime/{page}/{size}",method = RequestMethod.GET)
    public ResponseVo<Page<Project>> getByCreateTime(@PathVariable("page") Integer page,
                                                     @PathVariable("size") Integer size){
        Page<Project> page1= projectService.findByCreateTime(page,size);
        return new ResponseVo<>("根据创建时间排序,并分页成功",200,page1);
    }

    /**
     * 根据金额排序分页查询
     * @param page
     * @param size
     * @return
     */
    @RequestMapping(value = "/getByToMoney/{page}/{size}",method = RequestMethod.GET)
    public ResponseVo<Page<Project>> getByToMoney(@PathVariable("page")Integer page,
                                                  @PathVariable("size")Integer size){
        Page<Project> byToMoney = projectService.findByToMoney(page, size);
        return new ResponseVo<>("根据目标钱数排序分页获取项目成功",200,byToMoney);

    }

    /**
     * 根据积分数排序分页获取项目
     * @param page
     * @param size
     * @return
     */
    @RequestMapping(value = "/getByScore/{page}/{size}",method = RequestMethod.GET)
    public ResponseVo<Page<Project>> getByScore(@PathVariable("page")Integer page,
                                                  @PathVariable("size")Integer size){
        Page<Project> byToMoney = projectService.findByToMoney(page, size);
        return new ResponseVo<>("根据积分数排序分页获取项目成功",200,byToMoney);

    }

    /**
     * 根据id获取项目详情
     * @param pid
     * @return
     */
    @RequestMapping(value = "/findDetailByPid/{pid}",method = RequestMethod.GET)
    public ResponseVo<String> findDetailByPid(@PathVariable("pid") Integer pid){
        String  s=projectService.findDetailByPid(pid);
        return new ResponseVo<>("获取id为"+pid+"的项目的详情成功",200,s);
    }


}
