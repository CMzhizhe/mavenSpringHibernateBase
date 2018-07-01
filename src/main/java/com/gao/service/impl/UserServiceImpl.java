package com.gao.service.impl;
import java.util.ArrayList;
import java.util.LinkedList;  
import java.util.List;  
import java.util.Map;  
  
import org.springframework.beans.factory.annotation.Autowired;  
import org.springframework.stereotype.Service;  

import com.gao.dao.UserDao;
import com.gao.model.User;
import com.gao.service.UserService;
  
  
@Service  
public class UserServiceImpl implements UserService {  
      
    @Autowired  
    private UserDao userDao;  
      
    public void addUser(User user) {  
        userDao.saveUser(user);  
    }  
  
    public User queryUser(User user) {  
        return userDao.queryUser(user);  
    }  
  
    public User getUserById(Integer id) {  
        return userDao.findUserById(id);  
    }  
  
    public User findUserPassword(String userName, String email) {  
        return userDao.findUserPassword(userName, email);  
    }  
  
    public void updateUser(User user) {  
        userDao.updateUser(user);  
    }  
  
    public List<User> findUsers(Map<String, Object> map) {  
        StringBuffer hql=new StringBuffer("from User where 1=1 ");  
        List<Object> params=new LinkedList<Object>();  
          
        if (map.get("userName")!=null) {  
            hql.append(" and userName=? ");  
            params.add(map.get("userName"));  
        }  
        if (map.get("email")!=null) {  
            hql.append(" and email=? ");  
            params.add(map.get("email"));  
        }  
        if (map.get("sex")!=null) {  
            hql.append(" and sex=? ");  
            params.add(map.get("sex"));  
        }  
        if (map.get("validateOverDate")!=null) {  
            hql.append(" and validateOverDate=? ");  
            params.add(map.get("validateOverDate"));  
        }  
        if (map.get("validateSerCode")!=null) {  
            hql.append(" and validateSerCode=? ");  
            params.add(map.get("validateSerCode"));  
        }  
        if (map.get("userNameEncodes")!=null) {  
            hql.append(" and userNameEncodes=? ");  
            params.add(map.get("userNameEncodes"));  
        }  
          
        System.out.println(hql.toString());  
        return userDao.findUser(params, hql.toString());  
    }  
  
    public User findUserByUserName(String userName) {  
        return userDao.findUserByUserName(userName);  
    }  
  
    public void saveUser(User user) { 
        userDao.saveUser(user);  
    }  
      
}  