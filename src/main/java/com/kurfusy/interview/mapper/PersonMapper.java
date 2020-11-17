package com.kurfusy.interview.mapper;

import com.kurfusy.interview.pojo.Person;
import lombok.NonNull;
import org.apache.ibatis.annotations.*;

import java.util.List;

/**
 * @author Administrator
 */

@Mapper
public interface PersonMapper {
    /**
     * 用户数据新增
     *
     * @param person person
     */
    @Insert("insert into person(personId,personName,age,gender,birthday,address,occupation) " +
            "values (#{personId},#{personName},#{age},#{gender},#{birthday},#{address},#{occupation})")
    void addPerson(Person person);

    /**
     * 用户数据修改
     *
     * @param person person
     */
    @Update("update person set personName = #{personName}," +
            "age = #{age}," +
            "gender = #{gender}," +
            "birthday = #{birthday}," +
            "address = #{address}," +
            "occupation = #{occupation} " +
            "where personId = #{personId}")
    void updatePerson(Person person);

    /**
     * 用户数据删除
     *
     * @param personId personId
     */
    @Delete("delete from person where personId = #{personId}")
    void deletePerson(@NonNull String personId);

    /**
     * 根据用户名称查询用户信息
     *
     * @param personName personName
     * @return result
     */
    @Select("SELECT personId,personName,age,gender,birthday,address,occupation FROM person where personName = #{personName}")
    Person findByName(@Param("personName") String personName);

    /**
     * 查询所有
     *
     * @return result
     */
    @Select("SELECT personId,personName,age,gender,birthday,address,occupation FROM person")
    List<Person> findAll();
}

