package com.kurfusy.interview.service.impl;

import com.kurfusy.interview.common.StringUtils;
import com.kurfusy.interview.mapper.PersonMapper;
import com.kurfusy.interview.pojo.Person;
import com.kurfusy.interview.service.PersonService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @author Administrator
 */
@Service
public class PersonServiceImpl implements PersonService {
    private PersonMapper personMapper;

    @Autowired(required = false)
    public void setUserService(PersonMapper personMapper) {
        this.personMapper = personMapper;
    }


    @Override
    public boolean addPerson(Person person) {
        boolean flag = false;
        try {
            person.setPersonId(StringUtils.geChar32UniqueKey());
            personMapper.addPerson(person);
            flag = true;
        } catch (Exception e) {
            e.printStackTrace();
        }
        return flag;
    }

    @Override
    public boolean updatePerson(Person person) {
        boolean flag = false;
        try {
            personMapper.updatePerson(person);
            flag = true;
        } catch (Exception e) {
            e.printStackTrace();
        }
        return flag;
    }

    @Override
    public boolean deletePerson(String personId) {
        boolean flag = false;
        try {
            personMapper.deletePerson(personId);
            flag = true;
        } catch (Exception e) {
            e.printStackTrace();
        }
        return flag;
    }

    @Override
    public Person findPersonByName(String personName) {
        return personMapper.findByName(personName);
    }

    @Override
    public List<Person> findAll() {
        return personMapper.findAll();
    }

}
