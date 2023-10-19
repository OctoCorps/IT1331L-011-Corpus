package com.it1311l.uap.registrationapi.repository;


import com.it1311l.uap.registrationapi.model.Attendee;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;

import java.util.List;

@Mapper
public interface RegistrationMybatisRepository {

    @Insert("INSERT INTO attendees(firstName, middleName, lastName, course, age) " +
            "VALUES (#{firstName}, #{middleName}, #{lastName}, #{course}, #{age})")
    int insert(Attendee attendee);
    
    
    @Select("SELECT * FROM attendees")
    List<Attendee> findAll();
}
