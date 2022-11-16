package com.ctgu.j604.springbootchat.model;

import java.io.Serializable;
import java.util.Date;

public class Group implements Serializable {
    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column t_group.group_id
     *
     * @mbg.generated Sat Aug 21 23:34:51 CST 2021
     */
    private Integer groupId;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column t_group.group_num
     *
     * @mbg.generated Sat Aug 21 23:34:51 CST 2021
     */
    private String groupNum;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column t_group.group_member_count
     *
     * @mbg.generated Sat Aug 21 23:34:51 CST 2021
     */
    private Integer groupMemberCount;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column t_group.group_name
     *
     * @mbg.generated Sat Aug 21 23:34:51 CST 2021
     */
    private String groupName;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column t_group.group_master_id
     *
     * @mbg.generated Sat Aug 21 23:34:51 CST 2021
     */
    private Integer groupMasterId;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column t_group.create_time
     *
     * @mbg.generated Sat Aug 21 23:34:51 CST 2021
     */
    private Date createTime;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column t_group.group_icon
     *
     * @mbg.generated Sat Aug 21 23:34:51 CST 2021
     */
    private String groupIcon;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column t_group.brief_info
     *
     * @mbg.generated Sat Aug 21 23:34:51 CST 2021
     */
    private String briefInfo;

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column t_group.group_id
     *
     * @return the value of t_group.group_id
     *
     * @mbg.generated Sat Aug 21 23:34:51 CST 2021
     */
    public Integer getGroupId() {
        return groupId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column t_group.group_id
     *
     * @param groupId the value for t_group.group_id
     *
     * @mbg.generated Sat Aug 21 23:34:51 CST 2021
     */
    public void setGroupId(Integer groupId) {
        this.groupId = groupId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column t_group.group_num
     *
     * @return the value of t_group.group_num
     *
     * @mbg.generated Sat Aug 21 23:34:51 CST 2021
     */
    public String getGroupNum() {
        return groupNum;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column t_group.group_num
     *
     * @param groupNum the value for t_group.group_num
     *
     * @mbg.generated Sat Aug 21 23:34:51 CST 2021
     */
    public void setGroupNum(String groupNum) {
        this.groupNum = groupNum == null ? null : groupNum.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column t_group.group_member_count
     *
     * @return the value of t_group.group_member_count
     *
     * @mbg.generated Sat Aug 21 23:34:51 CST 2021
     */
    public Integer getGroupMemberCount() {
        return groupMemberCount;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column t_group.group_member_count
     *
     * @param groupMemberCount the value for t_group.group_member_count
     *
     * @mbg.generated Sat Aug 21 23:34:51 CST 2021
     */
    public void setGroupMemberCount(Integer groupMemberCount) {
        this.groupMemberCount = groupMemberCount;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column t_group.group_name
     *
     * @return the value of t_group.group_name
     *
     * @mbg.generated Sat Aug 21 23:34:51 CST 2021
     */
    public String getGroupName() {
        return groupName;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column t_group.group_name
     *
     * @param groupName the value for t_group.group_name
     *
     * @mbg.generated Sat Aug 21 23:34:51 CST 2021
     */
    public void setGroupName(String groupName) {
        this.groupName = groupName == null ? null : groupName.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column t_group.group_master_id
     *
     * @return the value of t_group.group_master_id
     *
     * @mbg.generated Sat Aug 21 23:34:51 CST 2021
     */
    public Integer getGroupMasterId() {
        return groupMasterId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column t_group.group_master_id
     *
     * @param groupMasterId the value for t_group.group_master_id
     *
     * @mbg.generated Sat Aug 21 23:34:51 CST 2021
     */
    public void setGroupMasterId(Integer groupMasterId) {
        this.groupMasterId = groupMasterId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column t_group.create_time
     *
     * @return the value of t_group.create_time
     *
     * @mbg.generated Sat Aug 21 23:34:51 CST 2021
     */
    public Date getCreateTime() {
        return createTime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column t_group.create_time
     *
     * @param createTime the value for t_group.create_time
     *
     * @mbg.generated Sat Aug 21 23:34:51 CST 2021
     */
    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column t_group.group_icon
     *
     * @return the value of t_group.group_icon
     *
     * @mbg.generated Sat Aug 21 23:34:51 CST 2021
     */
    public String getGroupIcon() {
        return groupIcon;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column t_group.group_icon
     *
     * @param groupIcon the value for t_group.group_icon
     *
     * @mbg.generated Sat Aug 21 23:34:51 CST 2021
     */
    public void setGroupIcon(String groupIcon) {
        this.groupIcon = groupIcon == null ? null : groupIcon.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column t_group.brief_info
     *
     * @return the value of t_group.brief_info
     *
     * @mbg.generated Sat Aug 21 23:34:51 CST 2021
     */
    public String getBriefInfo() {
        return briefInfo;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column t_group.brief_info
     *
     * @param briefInfo the value for t_group.brief_info
     *
     * @mbg.generated Sat Aug 21 23:34:51 CST 2021
     */
    public void setBriefInfo(String briefInfo) {
        this.briefInfo = briefInfo == null ? null : briefInfo.trim();
    }
}