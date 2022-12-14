package com.ctgu.j604.springbootchat.mapper;

import com.ctgu.j604.springbootchat.model.GroupLinkUser;
import com.ctgu.j604.springbootchat.model.GroupLinkUserExample;
import com.ctgu.j604.springbootchat.model.GroupLinkUserKey;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface GroupLinkUserMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table group_link_user
     *
     * @mbg.generated Mon Aug 23 22:39:59 CST 2021
     */
    long countByExample(GroupLinkUserExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table group_link_user
     *
     * @mbg.generated Mon Aug 23 22:39:59 CST 2021
     */
    int deleteByExample(GroupLinkUserExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table group_link_user
     *
     * @mbg.generated Mon Aug 23 22:39:59 CST 2021
     */
    int deleteByPrimaryKey(GroupLinkUserKey key);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table group_link_user
     *
     * @mbg.generated Mon Aug 23 22:39:59 CST 2021
     */
    int insert(GroupLinkUser record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table group_link_user
     *
     * @mbg.generated Mon Aug 23 22:39:59 CST 2021
     */
    int insertSelective(GroupLinkUser record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table group_link_user
     *
     * @mbg.generated Mon Aug 23 22:39:59 CST 2021
     */
    List<GroupLinkUser> selectByExample(GroupLinkUserExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table group_link_user
     *
     * @mbg.generated Mon Aug 23 22:39:59 CST 2021
     */
    GroupLinkUser selectByPrimaryKey(GroupLinkUserKey key);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table group_link_user
     *
     * @mbg.generated Mon Aug 23 22:39:59 CST 2021
     */
    int updateByExampleSelective(@Param("record") GroupLinkUser record, @Param("example") GroupLinkUserExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table group_link_user
     *
     * @mbg.generated Mon Aug 23 22:39:59 CST 2021
     */
    int updateByExample(@Param("record") GroupLinkUser record, @Param("example") GroupLinkUserExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table group_link_user
     *
     * @mbg.generated Mon Aug 23 22:39:59 CST 2021
     */
    int updateByPrimaryKeySelective(GroupLinkUser record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table group_link_user
     *
     * @mbg.generated Mon Aug 23 22:39:59 CST 2021
     */
    int updateByPrimaryKey(GroupLinkUser record);
}