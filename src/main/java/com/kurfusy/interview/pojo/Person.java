package com.kurfusy.interview.pojo;

import lombok.Data;
import org.springframework.format.annotation.DateTimeFormat;

import java.util.Date;

/**
 * @author Administrator
 */
@Data
public class Person {
    /**
     * 编号
     */
    private String personId;
    /**
     * 姓名
     */
    private String personName;
    /**
     * 年龄
     */
    private int age;
    /**
     * 性别
     */
    private String gender;
    /**
     * 生日
     */
    @DateTimeFormat(pattern = "yyyyMMdd")
    private Date birthday;
    /**
     * 住址
     */
    private String address;
    /**
     * 职业
     */
    private String occupation;
}
