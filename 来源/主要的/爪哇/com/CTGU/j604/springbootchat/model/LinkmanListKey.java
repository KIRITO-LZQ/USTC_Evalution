package com.ctgu.j604.springbootchat.model;

import java.io.Serializable;

public class LinkmanListKey implements Serializable {
    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column linkman_list.user_id
     *
     * @mbg.generated Sun Aug 22 16:06:14 CST 2021
     */
    private Integer userId;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column linkman_list.friend_id
     *
     * @mbg.generated Sun Aug 22 16:06:14 CST 2021
     */
    private Integer friendId;

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column linkman_list.user_id
     *
     * @return the value of linkman_list.user_id
     *
     * @mbg.generated Sun Aug 22 16:06:14 CST 2021
     */
    public Integer getUserId() {
        return userId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column linkman_list.user_id
     *
     * @param userId the value for linkman_list.user_id
     *
     * @mbg.generated Sun Aug 22 16:06:14 CST 2021
     */
    public void setUserId(Integer userId) {
        this.userId = userId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column linkman_list.friend_id
     *
     * @return the value of linkman_list.friend_id
     *
     * @mbg.generated Sun Aug 22 16:06:14 CST 2021
     */
    public Integer getFriendId() {
        return friendId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column linkman_list.friend_id
     *
     * @param friendId the value for linkman_list.friend_id
     *
     * @mbg.generated Sun Aug 22 16:06:14 CST 2021
     */
    public void setFriendId(Integer friendId) {
        this.friendId = friendId;
    }
}