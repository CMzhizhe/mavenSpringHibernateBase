package com.gao.dao.impl;

import java.util.ArrayList;
import java.util.List;  

import org.hibernate.Query;  
import org.springframework.stereotype.Repository;  

import com.gao.dao.UserDao;
import com.gao.model.User;
  
  
@Repository  
public class UserDaoImpl extends BaseDaoImpl implements UserDao {  
  
    @SuppressWarnings("unchecked")  
    public User queryUser(User user) {  
        String hql="from User where userName=? and password=?";  
        Query query=getSession().createQuery(hql);  
        query.setParameter(0, user.getUserName());  
        query.setParameter(1, user.getPassword());  
          
        User currentUser=null;  
          
        List<User> userList=query.list();  
        if (userList!=null && userList.size()>0) {  
            currentUser=userList.get(0);  
        }  
          
        return currentUser;  
    }  
      
    public void saveUser(User user) { 
        getSession().save(user);  
    }  
  
    public User findUserById(Integer id) {  
        String hql="from User where id=?";  
        Query query=getSession().createQuery(hql);  
        query.setParameter(0, id);  
        User user=(User) query.uniqueResult();  
        return user;  
    }  
  
    public User findUserPassword(String userName, String email) {  
        String hql="from User where userName=? and email=?";  
        Query query=getSession().createQuery(hql);  
        query.setParameter(0, userName);  
        query.setParameter(1, email);  
        User currentUser=(User) query.uniqueResult();  
          
        return currentUser;  
    }  
  
    public void updateUser(User user) {  
        getSession().update(user);  
    }  
  
    @SuppressWarnings("unchecked")  
    public List<User> findUser(List<Object> params,String hql) {  
        Query query=getSession().createQuery(hql);  
        if (params!=null && params.size()>0) {  
            for(int i=0;i<params.size();i++){  
                query.setParameter(i, params.get(i));  
            }  
        }  
        return query.list();  
    }  
  
    public User findUserByUserName(String userName) {  
        String hql="from User where userName=?";  
        Query query=getSession().createQuery(hql);  
        query.setParameter(0, userName);  
        return (User) query.uniqueResult();  
    }  
      
}  
