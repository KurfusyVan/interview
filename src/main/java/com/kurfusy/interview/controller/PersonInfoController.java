package com.kurfusy.interview.controller;


import com.kurfusy.interview.pojo.Person;
import com.kurfusy.interview.service.PersonService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * @author Administrator
 */
@RestController
public class PersonInfoController {
    private PersonService personService;

    @Autowired
    public void setUserService(PersonService personService) {
        this.personService = personService;
    }

    @RequestMapping(value = "/person", method = RequestMethod.POST)
    public boolean addPerson(Person person) {
        System.out.println("开始新增...");
        return personService.addPerson(person);
    }

    @RequestMapping(value = "/person", method = RequestMethod.PUT)
    public boolean updatePerson(Person person) {
        System.out.println("开始更新...");
        return personService.updatePerson(person);
    }

    @RequestMapping(value = "/person", method = RequestMethod.DELETE)
    public boolean delete(@RequestParam(value = "personId") String personId) {
        System.out.println("开始删除...");
        return personService.deletePerson(personId);
    }


    @RequestMapping(value = "/person", method = RequestMethod.GET)
    public Person findByPersonName(@RequestParam(value = "personName") String personName) {
        System.out.println("开始查询...");
        return personService.findPersonByName(personName);
    }


    @RequestMapping(value = "/personAll", method = RequestMethod.GET)
    public List<Person> findByPersonAge() {
        System.out.println("开始查询所有数据...");
        return personService.findAll();
    }
}
