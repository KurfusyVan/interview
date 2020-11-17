package com.kurfusy.interview.service;


import com.kurfusy.interview.pojo.Person;

import java.util.List;

/**
 * @author Administrator
 */
public interface PersonService {
    /**
     * 新增用户
     *
     * @param person person
     * @return result
     */
    boolean addPerson(Person person);

    /**
     * 修改用户
     *
     * @param person person
     * @return result
     */
    boolean updatePerson(Person person);

    /**
     * 删除用户
     *
     * @param personId personId
     * @return result
     */
    boolean deletePerson(String personId);

    /**
     * 根据用户名字查询用户信息
     *
     * @param personName personName
     * @return result
     */
    Person findPersonByName(String personName);

    /**
     * 查询所有
     *
     * @return result
     */
    List<Person> findAll();
}
