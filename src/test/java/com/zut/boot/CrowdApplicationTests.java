package com.zut.boot;

import com.zut.boot.entity.Project;
import com.zut.boot.entity.User;
import com.zut.boot.service.ProjectService;
import com.zut.boot.service.UserService;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.List;

@SpringBootTest
class CrowdApplicationTests {
    @Autowired
    private UserService userService;
    @Autowired
    private ProjectService projectService;
    private String name;
    private int age;

    @Test
    void contextLoads() {
//        User user=userService.getOneByPhone("123");
        User user=userService.getOne(1);
        System.out.println(user);
    }
    @Test
    void addOne(){
        userService.addOne(new User(null,"李梅",null,null,null,"女",null,"郑州市",null,null,"12345678910","女",null,null));

    }
    @Test
    void getOneById(){
        User user=userService.getOne(1);
        System.out.println(user);
    }
    @Test
    void getOneByPhone(){
        User user=userService.getOneByPhone("12345678910");
        System.out.println(user);
    }
    @Test
    void updateOne(){
        User user1=new User(1,null,null,null,null,null,null,null,null,null,null,null,null,null);
        userService.update(user1);
    }
    @Test
    void getAllByType(){
       List<Project> list= projectService.findByType("公益",1,2);
       System.out.println(list.get(0));
    }

    public static void main(String[] args) {
        CrowdApplicationTests c1=new CrowdApplicationTests();
        CrowdApplicationTests c2=new CrowdApplicationTests();
        c1.name="aa";
        c1.age=15;
        c2.name="aa";
        c2.age=15;
        System.out.println(c1.equals(c2));
    }

}
