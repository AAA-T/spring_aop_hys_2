package cn.huiyusheng.dao;

import cn.huiyusheng.entity.User;

/**
 * @author 悔余生
 * @ClassName:IUserDao
 * @Description:TODO
 * @Date 2020/12/1 下午5:01
 * @Version V1.0
 **/
public interface IUserDao {

    User select(Integer id) throws Exception;

    void add(User user) throws Exception;

    void update(User user) throws Exception;

    void delete(Integer id) throws Exception;
}
