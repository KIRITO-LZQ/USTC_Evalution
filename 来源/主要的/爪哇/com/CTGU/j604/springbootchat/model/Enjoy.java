package com.ctgu.j604.springbootchat.model;


import java.util.Date;

public class Enjoy {

    private Integer id;


    private Integer stuId;


    private String stuNum;


    private String groupNum;

    private Integer value;


    private Date sendTime;

    /**
     * @return id
     */
    public Integer getId() {
        return id;
    }

    /**
     * @param id
     */
    public void setId(Integer id) {
        this.id = id;
    }

    /**
     * @return stu_id
     */
    public Integer getStuId() {
        return stuId;
    }

    /**
     * @param stuId
     */
    public void setStuId(Integer stuId) {
        this.stuId = stuId;
    }

    /**
     * @return stu_num
     */
    public String getStuNum() {
        return stuNum;
    }

    /**
     * @param stuNum
     */
    public void setStuNum(String stuNum) {
        this.stuNum = stuNum;
    }

    /**
     * @return group_num
     */
    public String getGroupNum() {
        return groupNum;
    }

    /**
     * @param groupNum
     */
    public void setGroupNum(String groupNum) {
        this.groupNum = groupNum;
    }

    /**
     * @return value
     */
    public Integer getValue() {
        return value;
    }

    /**
     * @param value
     */
    public void setValue(Integer value) {
        this.value = value;
    }

    /**
     * @return create_time
     */
    public Date getSendTime() {
        return sendTime;
    }

    /**
     * @param sendTime
     */
    public void setsendTime(Date sendTime) {
        this.sendTime = sendTime;
    }
}