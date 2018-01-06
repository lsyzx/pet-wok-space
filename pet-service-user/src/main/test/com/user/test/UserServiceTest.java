package com.user.test;

import com.github.pagehelper.PageInfo;
import com.pet.api.user.entity.User;
import com.pet.api.user.request.QUERY_USER_REQ;
import com.pet.api.user.response.QUERY_USER_RES;
import com.pet.api.user.service.UserApiService;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import java.util.List;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration("classpath:spring/spring-mvc.xml")
public class UserServiceTest {
    @Autowired
    private UserApiService userApiService;

    @Test
    public void test(){

        QUERY_USER_REQ QUERYUSERREQ = new QUERY_USER_REQ();
        QUERYUSERREQ.setPageNum(1);
        QUERYUSERREQ.setPageSize(2);
        QUERY_USER_RES QUERYUSERRES = userApiService.queryUserList(QUERYUSERREQ);
        PageInfo<User> pageInfo = (PageInfo<User>) QUERYUSERRES.getData();
        List<User> userList = pageInfo.getList();
        if(userList!=null && userList.size()!=0)
        {
            for(User user :userList)
            {
                System.out.println("id:"+user.getId());
                System.out.println("name:"+user.getName());
                System.out.println("sex:"+user.getSex());
                System.out.println("age:"+user.getAge());
            }
        }
        System.out.println(pageInfo.getTotal());
    }
}

