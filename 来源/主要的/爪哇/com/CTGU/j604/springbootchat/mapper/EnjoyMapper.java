package com.ctgu.j604.springbootchat.mapper;



import com.ctgu.j604.springbootchat.model.Enjoy;
import org.springframework.data.repository.query.Param;

import java.util.Date;


public interface EnjoyMapper {

//    在xml中实现数据的插入
    int insert(Enjoy enjoy);

//    在xml中查询是否有这条数据
    Enjoy queryExist(@Param("stuId")Integer stuId, @Param("groupNum") String groupNum);

//    在数据库中更新这条数据
//    void update(Enjoy enjoy);

    void update(@Param("id")Integer id, @Param("value") Integer value, @Param("sendTime")Date sendTime);

    void deleteById(@Param("id")Integer id);
}