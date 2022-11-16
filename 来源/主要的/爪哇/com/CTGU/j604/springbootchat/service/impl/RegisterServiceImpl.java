package com.ctgu.j604.springbootchat.service.impl;

import com.ctgu.j604.springbootchat.mapper.TUserMapper;
import com.ctgu.j604.springbootchat.model.TUser;
import com.ctgu.j604.springbootchat.model.TUserExample;
import com.ctgu.j604.springbootchat.service.RegisterService;
import org.springframework.stereotype.Component;


import javax.annotation.Resource;
import java.sql.Timestamp;
import java.util.Random;
import java.util.Date;

@Component
public class RegisterServiceImpl implements RegisterService {

    @Resource
    private TUserMapper tUserMapper;

    @Override
    public TUser addTUser(TUser registertuser) {
        //设置完全随机的主键编号值
        String userId="";
        Random random = new Random();
        //这里循环5次表示加上5个完全随机出来的int
        for(int i=0;i<5;i++ ){
            if(i==0){
                String temp=String.valueOf(random.nextInt(10));
                while(temp.equals("0")){
                    temp=String.valueOf(random.nextInt(10));
                }
                userId+=temp;
            }
            else
            userId+=String.valueOf(random.nextInt(10));
            }


//        registertuser.setUserNum(userId);
        registertuser.setUserId(Integer.valueOf(userId));
        registertuser.setFlag(0);
        //设置时间戳
        Date date=new Date();
        Timestamp time = new Timestamp(date.getTime());
        registertuser.setCreatedTime(time);

        //判断是否重复
        //1.生成Example
        TUserExample UserExample = new TUserExample();
        //2.用example生成criteria
        TUserExample.Criteria criteria=UserExample.or();
//        TUserExample.Criteria criteria2=UserExample.or();
//        TUserExample.Criteria criteria3=UserExample.or();
        //3.用criteria进行查询，三个criteria实际上是对同一个UserExample进行查询限制
//        criteria.andNickNameEqualTo(registertuser.getName());
//        criteria2.andEmailEqualTo(registertuser.getEmail());
        criteria.andUserNumEqualTo(registertuser.getUserNum());
        if(tUserMapper.selectByExample(UserExample).size()>0){
            System.out.println(tUserMapper.selectByExample(UserExample));
            return  null;
        }
        else{
            //其他几个字段的值都是在前端已经全部获取到了，就只有创建时间需要自己进行填写，然后直接调用Insert插入
            tUserMapper.insert(registertuser);
            return registertuser;
        }
//         return tUserMapper.insertSelective(registertuser)>0?registertuser:null;
    }

}
