package com.ctgu.j604.springbootchat.service;

import com.ctgu.j604.springbootchat.model.FriendListInfo;
import com.ctgu.j604.springbootchat.model.TUser;

import java.util.List;

public interface TUserService {
    TUser login(TUser loginUser);
    List<FriendListInfo> getAllFriend(Integer userId);
    List<TUser> getTUserByUserNumAndAgeAndSex(TUser tUser, Integer ageBegin, Integer ageEnd);
    List<TUser> getTUserByNickNameAndAgeAndSex(TUser tUser, Integer ageBegin, Integer ageEnd);
    void agreeAddGroup(TUser tUser, String toUserNum);
    void refuseAddGroup(TUser tUser, String toUserNum);
    Integer queryUserType(Integer userId);
}
