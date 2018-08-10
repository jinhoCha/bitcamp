// 업무로직 구현체 - 고객사 마다 다른 구현을 할 수 있다.
package challenge.service.impl;

import java.util.HashMap;
import java.util.List;

import org.springframework.stereotype.Service;

import challenge.dao.UserDao;
import challenge.domain.User;
import challenge.service.UserService;


@Service
public class UserServiceImpl implements UserService {

    UserDao userDao;
    
    public UserServiceImpl(UserDao userDao) {
        this.userDao = userDao;
    }
    
    @Override
    public User getWithId(String id) {
        User user = userDao.selectOneWithId(id);
        return user;
    }
    
    @Override
    public boolean isExist(String id, String password) {
        HashMap<String,Object> params = new HashMap<>();
        params.put("id", id);
        params.put("password", password);
        
        System.out.println("UserServiceImpl의 아이디 : " + id + ", 비번 : " + password);
        
        System.out.println(userDao.count(params));
        
        return userDao.count(params) > 0 ? true : false;
    }
    
    @Override
    public List<User> list() {
//        HashMap<String,Object> params = new HashMap<>();
//        params.put("startRowNo", (pageNo - 1) * pageSize);
//        params.put("pageSize", pageSize);
        
        return userDao.selectList();
    }
    
    @Override
    public int delete(int userNo) {
        return userDao.delete(userNo);
    }

    @Override
    public User get(int userNo) {
        User user = userDao.selectOne(userNo);
        return user;
    }
    
    @Override
    public int add(User user) {
        return userDao.insert(user);
    }
    
    public int update(User user) {
        return userDao.update(user);
    }
}