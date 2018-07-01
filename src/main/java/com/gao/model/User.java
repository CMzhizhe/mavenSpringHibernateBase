package com.gao.model;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;


@Entity  
@Table(name="tb_user")  
public class User implements Serializable{  
      
    /** 
     *  
     */  
    private static final long serialVersionUID = -5813264827007873950L;  
  
    private Integer id;  
      
    private String userName;  
      
    private String password;  
      
    private String email;  
      
    //1-男  0-女  
    private Integer sex;   
      
    //序列码  
    private String validateSerCode;  
      
    //序列码过时日期  
    private Date validateOverDate;  
      
    //用户名的字节编码  
    private String userNameEncodes;  
      
    //是否已经被验证：0表示未验证 1表示已经验证  
    private Integer isValidated=0;  
      
    @Id  
    @GeneratedValue(strategy = GenerationType.AUTO)  
    public Integer getId() {  
        return id;  
    }  
  
    public void setId(Integer id) {  
        this.id = id;  
    }  
  
    @Column(name="user_name")  
    public String getUserName() {  
        return userName;  
    }  
  
    public void setUserName(String userName) {  
        this.userName = userName;  
    }  
  
    public String getPassword() {  
        return password;  
    }  
  
    public void setPassword(String password) {  
        this.password = password;  
    }  
  
    public Integer getSex() {  
        return sex;  
    }  
  
    public void setSex(Integer sex) {  
        this.sex = sex;  
    }  
      
    public String getEmail() {  
        return email;  
    }  
  
    public void setEmail(String email) {  
        this.email = email;  
    }  
      
    @Column(name="validate_ser_code")  
    public String getValidateSerCode() {  
        return validateSerCode;  
    }  
  
    public void setValidateSerCode(String validateSerCode) {  
        this.validateSerCode = validateSerCode;  
    }  
  
    @Column(name="validate_over_date")  
    public Date getValidateOverDate() {  
        return validateOverDate;  
    }  
  
    public void setValidateOverDate(Date validateOverDate) {  
        this.validateOverDate = validateOverDate;  
    }  
      
    @Column(name="user_name_encodes")  
    public String getUserNameEncodes() {  
        return userNameEncodes;  
    }  
  
    @Column(name="is_validated")  
    public Integer getIsValidated() {  
        return isValidated;  
    }  
  
    public void setIsValidated(Integer isValidated) {  
        this.isValidated = isValidated;  
    }  
  
    public void setUserNameEncodes(String userNameEncodes) {  
        this.userNameEncodes = userNameEncodes;  
    }  
  
    @Override  
    public String toString() {  
        return "User [id=" + id + ", userName=" + userName + ", password="  
                + password + ", email=" + email + ", sex=" + sex + "]";  
    }  
  
}  
