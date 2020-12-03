package cn.huiyusheng.aspects;


import org.aspectj.lang.annotation.*;
import org.springframework.stereotype.Component;

/**
 * @author 悔余生
 * @ClassName:LogAspect
 * @Description:TODO
 * @Date 2020/12/1 下午5:28
 * @Version V1.0
 **/

@Aspect     //标记为切面
@Component  //标记为bean组件，才能切入到ioc当中的bean
public class LogAspect {

    //            访问修饰符             防范返回值(必须)  包名，类名                方法名称    方法参数
    // execution(modifiers-pattern? ret-type-pattern declaring-type-pattern?name-pattern(param-pattern)？throw-pattern)
    // 前置通知 第一个* 表示忽略掉 public 和返回值类型
    @Before("execution(* cn.huiyusheng.service.impl.*.*(..))")
    public void before(){
        System.out.println("前置通知");
    }

    //后置通知
    @After("execution(* cn.huiyusheng.service.impl.*.*(..))")
    public void after(){
        System.out.println("后置通知");
    }
    //后置异常通知
    @AfterThrowing("execution(* cn.huiyusheng.service.impl.*.*(..))")
    public void afterThrowing(){
        System.out.println("后置异常通知");
    }
    //后置返回通知
    @AfterReturning("execution(* cn.huiyusheng.service.impl.*.*(..))")
    public void afterReturning(){
        System.out.println("后置返回通知");
    }

    //环绕通知
}
