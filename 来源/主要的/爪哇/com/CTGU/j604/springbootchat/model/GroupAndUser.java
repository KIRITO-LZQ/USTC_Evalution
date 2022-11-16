package com.ctgu.j604.springbootchat.model;

import java.io.Serializable;

public class GroupAndUser implements Serializable {


    private Integer id;



    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column group_and_user.group_id
     *
     * @mbg.generated Mon Aug 23 22:39:59 CST 2021
     */
    private Integer groupId;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column group_and_user.group_num
     *
     * @mbg.generated Mon Aug 23 22:39:59 CST 2021
     */
    private String groupNum;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column group_and_user.group_name
     *
     * @mbg.generated Mon Aug 23 22:39:59 CST 2021
     */
    private String groupName;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column group_and_user.group_icon
     *
     * @mbg.generated Mon Aug 23 22:39:59 CST 2021
     */
    private String groupIcon;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column group_and_user.user_id
     *
     * @mbg.generated Mon Aug 23 22:39:59 CST 2021
     */
    private Integer userId;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column group_and_user.user_num
     *
     * @mbg.generated Mon Aug 23 22:39:59 CST 2021
     */
    private String userNum;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column group_and_user.member_comment
     *
     * @mbg.generated Mon Aug 23 22:39:59 CST 2021
     */
    private String memberComment;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column group_and_user.group_id
     *
     * @return the value of group_and_user.group_id
     *
     * @mbg.generated Mon Aug 23 22:39:59 CST 2021
     */
    public Integer getGroupId() {
        return groupId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column group_and_user.group_id
     *
     * @param groupId the value for group_and_user.group_id
     *
     * @mbg.generated Mon Aug 23 22:39:59 CST 2021
     */
    public void setGroupId(Integer groupId) {
        this.groupId = groupId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column group_and_user.group_num
     *
     * @return the value of group_and_user.group_num
     *
     * @mbg.generated Mon Aug 23 22:39:59 CST 2021
     */
    public String getGroupNum() {
        return groupNum;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column group_and_user.group_num
     *
     * @param groupNum the value for group_and_user.group_num
     *
     * @mbg.generated Mon Aug 23 22:39:59 CST 2021
     */
    public void setGroupNum(String groupNum) {
        this.groupNum = groupNum == null ? null : groupNum.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column group_and_user.group_name
     *
     * @return the value of group_and_user.group_name
     *
     * @mbg.generated Mon Aug 23 22:39:59 CST 2021
     */
    public String getGroupName() {
        return groupName;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column group_and_user.group_name
     *
     * @param groupName the value for group_and_user.group_name
     *
     * @mbg.generated Mon Aug 23 22:39:59 CST 2021
     */
    public void setGroupName(String groupName) {
        this.groupName = groupName == null ? null : groupName.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column group_and_user.group_icon
     *
     * @return the value of group_and_user.group_icon
     *
     * @mbg.generated Mon Aug 23 22:39:59 CST 2021
     */
    public String getGroupIcon() {
        return groupIcon;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column group_and_user.group_icon
     *
     * @param groupIcon the value for group_and_user.group_icon
     *
     * @mbg.generated Mon Aug 23 22:39:59 CST 2021
     */
    public void setGroupIcon(String groupIcon) {
        this.groupIcon = groupIcon == null ? null : groupIcon.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column group_and_user.user_id
     *
     * @return the value of group_and_user.user_id
     *
     * @mbg.generated Mon Aug 23 22:39:59 CST 2021
     */
    public Integer getUserId() {
        return userId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column group_and_user.user_id
     *
     * @param userId the value for group_and_user.user_id
     *
     * @mbg.generated Mon Aug 23 22:39:59 CST 2021
     */
    public void setUserId(Integer userId) {
        this.userId = userId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column group_and_user.user_num
     *
     * @return the value of group_and_user.user_num
     *
     * @mbg.generated Mon Aug 23 22:39:59 CST 2021
     */
    public String getUserNum() {
        return userNum;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column group_and_user.user_num
     *
     * @param userNum the value for group_and_user.user_num
     *
     * @mbg.generated Mon Aug 23 22:39:59 CST 2021
     */
    public void setUserNum(String userNum) {
        this.userNum = userNum == null ? null : userNum.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column group_and_user.member_comment
     *
     * @return the value of group_and_user.member_comment
     *
     * @mbg.generated Mon Aug 23 22:39:59 CST 2021
     */
    public String getMemberComment() {
        return memberComment;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column group_and_user.member_comment
     *
     * @param memberComment the value for group_and_user.member_comment
     *
     * @mbg.generated Mon Aug 23 22:39:59 CST 2021
     */
    public void setMemberComment(String memberComment) {
        this.memberComment = memberComment == null ? null : memberComment.trim();
    }
}