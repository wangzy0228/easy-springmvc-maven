//package com.yuncang.service;
//
//import org.junit.runner.RunWith;
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.test.context.ContextConfiguration;
//import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
//
///**
// * Created by lzw on 2017/5/11.
// */
//@RunWith(SpringJUnit4ClassRunner.class)
//@ContextConfiguration({"classpath:/spring/spring-dao.xml",
//        "classpath:/spring/spring-service.xml"})
//public class UserServiceTest {
//    @Autowired
//    UserService userService;
//
////    @Test
////    public void queryAll() throws Exception {
////        int page = 1;
////        int limit = 2;
////        PageBounds pageBounds = new PageBounds(page, limit);
////        Map<String, Object> map = userService.queryAll(pageBounds);
////        List<UserEntity> userlists = (List<UserEntity>) map.get("userlists");
////        for (UserEntity userEntity :
////                userlists) {
////            System.out.println(userEntity.toString());
////        }
////        Paginator paginator = (Paginator) map.get("paginator");
////        System.out.println(paginator.getTotalCount());
////    }
//
//}