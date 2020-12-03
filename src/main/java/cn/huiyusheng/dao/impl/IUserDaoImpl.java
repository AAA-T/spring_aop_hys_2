package cn.huiyusheng.dao.impl;

import cn.huiyusheng.dao.IUserDao;
import cn.huiyusheng.entity.User;
import org.springframework.stereotype.Repository;

/**
 * @author 悔余生
 * @ClassName:IUserDaoImpl
 * @Description:TODO
 * @Date 2020/12/1 下午5:01
 * @Version V1.0
 **/

@Repository
public class IUserDaoImpl implements IUserDao {

    @Override
    public User select(Integer id) throws Exception {
        // 访问数据库，查询User
        if(id == null){
            throw new Exception("id不能为null");
        }
        return new User();
    }

    @Override
    public void add(User user) throws Exception {
        if(user == null){
            throw new Exception("user不能为null");
        }
    }

    @Override
    public void update(User user) throws Exception {
        if(user == null){
            throw new Exception("user不能为null");
        }
    }

    @Override
    public void delete(Integer id) throws Exception {
        if(id == null){
            throw new Exception("id不能为null");
        }
    }
}
