package com.ctgu.j604.springbootchat.model;

import java.io.Serializable;
import java.util.Date;

public class TUser implements Serializable {
    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column t_user.user_id
     *
     * @mbg.generated Sun Aug 15 16:06:12 CST 2021
     */
    private Integer userId;
//    private String userId;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column t_user.user_num
     *
     * @mbg.generated Sun Aug 15 16:06:12 CST 2021
     */
    private String userNum;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column t_user.password
     *
     * @mbg.generated Sun Aug 15 16:06:12 CST 2021
     */
    private String password;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column t_user.phone_num
     *
     * @mbg.generated Sun Aug 15 16:06:12 CST 2021
     */
    private String phoneNum;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column t_user.email
     *
     * @mbg.generated Sun Aug 15 16:06:12 CST 2021
     */
    private String email;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column t_user.nick_name
     *
     * @mbg.generated Sun Aug 15 16:06:12 CST 2021
     */
    private String nickName;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column t_user.sex
     *
     * @mbg.generated Sun Aug 15 16:06:12 CST 2021
     */
    private String sex;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column t_user.age
     *
     * @mbg.generated Sun Aug 15 16:06:12 CST 2021
     */
    private Integer age;

    private Integer flag;

    // 新增的字段
    private String grade;

    private String classes;

    private String major;

    public String getGrade() {
        return grade;
    }

    public void setGrade(String grade) {
        this.grade = grade;
    }

    public String getClasses() {
        return classes;
    }

    public void setClasses(String classes) {
        this.classes = classes;
    }

    public String getMajor() {
        return major;
    }

    public void setMajor(String major) {
        this.major = major;
    }

    public Integer getFlag() {
        return flag;
    }

    public void setFlag(Integer flag) {
        this.flag = flag;
    }

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column t_user.created_time
     *
     * @mbg.generated Sun Aug 15 16:06:12 CST 2021
     */
    private Date createdTime;

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column t_user.user_id
     *
     * @return the value of t_user.user_id
     *
     * @mbg.generated Sun Aug 15 16:06:12 CST 2021
     */
    public Integer getUserId() {
        return userId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column t_user.user_id
     *
     * @param userId the value for t_user.user_id
     *
     * @mbg.generated Sun Aug 15 16:06:12 CST 2021
     */
    public void setUserId(Integer userId) {
        this.userId = userId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column t_user.user_num
     *
     * @return the value of t_user.user_num
     *
     * @mbg.generated Sun Aug 15 16:06:12 CST 2021
     */
    public String getUserNum() {
        return userNum;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column t_user.user_num
     *
     * @param userNum the value for t_user.user_num
     *
     * @mbg.generated Sun Aug 15 16:06:12 CST 2021
     */
    public void setUserNum(String userNum) {
        this.userNum = userNum == null ? null : userNum.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column t_user.password
     *
     * @return the value of t_user.password
     *
     * @mbg.generated Sun Aug 15 16:06:12 CST 2021
     */
    public String getPassword() {
        return password;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column t_user.password
     *
     * @param password the value for t_user.password
     *
     * @mbg.generated Sun Aug 15 16:06:12 CST 2021
     */
    public void setPassword(String password) {
        this.password = password == null ? null : password.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column t_user.phone_num
     *
     * @return the value of t_user.phone_num
     *
     * @mbg.generated Sun Aug 15 16:06:12 CST 2021
     */
    public String getPhoneNum() {
        return phoneNum;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column t_user.phone_num
     *
     * @param phoneNum the value for t_user.phone_num
     *
     * @mbg.generated Sun Aug 15 16:06:12 CST 2021
     */
    public void setPhoneNum(String phoneNum) {
        this.phoneNum = phoneNum == null ? null : phoneNum.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column t_user.email
     *
     * @return the value of t_user.email
     *
     * @mbg.generated Sun Aug 15 16:06:12 CST 2021
     */
    public String getEmail() {
        return email;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column t_user.email
     *
     * @param email the value for t_user.email
     *
     * @mbg.generated Sun Aug 15 16:06:12 CST 2021
     */
    public void setEmail(String email) {
        this.email = email == null ? null : email.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column t_user.nick_name
     *
     * @return the value of t_user.nick_name
     *
     * @mbg.generated Sun Aug 15 16:06:12 CST 2021
     */
    public String getNickName() {
        return nickName;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column t_user.nick_name
     *
     * @param nickName the value for t_user.nick_name
     *
     * @mbg.generated Sun Aug 15 16:06:12 CST 2021
     */
    public void setNickName(String nickName) {
        this.nickName = nickName == null ? null : nickName.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column t_user.sex
     *
     * @return the value of t_user.sex
     *
     * @mbg.generated Sun Aug 15 16:06:12 CST 2021
     */
    public String getSex() {
        return sex;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column t_user.sex
     *
     * @param sex the value for t_user.sex
     *
     * @mbg.generated Sun Aug 15 16:06:12 CST 2021
     */
    public void setSex(String sex) {
        this.sex = sex == null ? null : sex.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column t_user.age
     *
     * @return the value of t_user.age
     *
     * @mbg.generated Sun Aug 15 16:06:12 CST 2021
     */
    public Integer getAge() {
        return age;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column t_user.age
     *
     * @param age the value for t_user.age
     *
     * @mbg.generated Sun Aug 15 16:06:12 CST 2021
     */
    public void setAge(Integer age) {
        this.age = age;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column t_user.created_time
     *
     * @return the value of t_user.created_time
     *
     * @mbg.generated Sun Aug 15 16:06:12 CST 2021
     */
    public Date getCreatedTime() {
        return createdTime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column t_user.created_time
     *
     * @param createdTime the value for t_user.created_time
     *
     * @mbg.generated Sun Aug 15 16:06:12 CST 2021
     */
    public void setCreatedTime(Date createdTime) {
        this.createdTime = createdTime;
    }
}