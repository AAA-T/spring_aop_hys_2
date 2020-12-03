package cn.huiyusheng.service.impl;

import cn.huiyusheng.dao.IUserDao;
import cn.huiyusheng.entity.User;
import cn.huiyusheng.service.UserService;
import org.springframework.stereotype.Service;

/**
 * @author 悔余生
 * @ClassName:UserServiceImpl
 * @Description:TODO
 * @Date 2020/12/1 下午5:01
 * @Version V1.0
 **/

@Service
public class UserServiceImpl implements UserService {

    IUserDao userDao;
    @Override
    public User select(Integer id) throws Exception {
        System.out.println("查询user");
        return userDao.select(id);
    }

    @Override
    public void add(User user) throws Exception {
        System.out.println("添加user");
        userDao.add(user);
    }

    @Override
    public void update(User user) throws Exception {
        System.out.println("修改user");
        userDao.update(user);
    }

    @Override
    public void delete(Integer id) throws Exception {
        System.out.println("删除user");
        userDao.delete(id);
    }
}
