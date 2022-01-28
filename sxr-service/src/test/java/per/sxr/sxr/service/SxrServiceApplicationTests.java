package per.sxr.sxr.service;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import per.sxr.sxr.service.domain.User;
import per.sxr.sxr.service.mapper.UserMapper;

import javax.annotation.Resource;

@SpringBootTest
class SxrServiceApplicationTests {
    @Resource
    private UserMapper userMapper;

    @Test
    void contextLoads() {

    }

    @Test
    void insertTest() {
        User user = new User();
        user.setName("孙熙冉");
        user.setAddress("河北唐山");
        user.setOperator("sxr");
        int insert = userMapper.insert(user);
        System.out.println(insert);
    }

    @Test
    void selectTest() {
        User user = userMapper.selectById(1L);
        System.out.println(user.toString());
    }

}
