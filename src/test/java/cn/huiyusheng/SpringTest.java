package cn.huiyusheng;


import cn.huiyusheng.service.UserService;
import cn.huiyusheng.service.impl.UserServiceImpl;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * @author 悔余生
 * @ClassName:test01
 * @Description:TODO
 * @Date 2020/12/1 下午5:11
 * @Version V1.0
 **/
public class SpringTest {

    ClassPathXmlApplicationContext ioc;

    @Before
    public void before(){
        ioc = new ClassPathXmlApplicationContext("spring.xml");
    }

    @Test
    public void test01(){
        UserService bean = ioc.getBean(UserService.class);
        System.out.println(bean.getClass());
        //在没有使用aop的情况下 ： class cn.huiyusheng.service.Impl.userServiceImpl
        //当使用了aop的情况下： class com.sun.proxy.$Proxy21 jdk代理产生的一个动态代理类 当被代理的类实现了接口 会默认使用jdk代理
        //没有实现接口：       class cn.huiyusheng.service.impl.UserServiceImpl$$EnhancerBySpringCGLIB$$eb28ad9f
        // cglib代理所产生的一个动态代理类，当被代理的类没有实现接口就会使用cglib代理   
    }

    @After
    public void after(){
        Date date = new Date();
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy-MM-dd hh:mm:ss");
        System.out.println("\n\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t悔余生\t" + simpleDateFormat.format(date));
    }
}
