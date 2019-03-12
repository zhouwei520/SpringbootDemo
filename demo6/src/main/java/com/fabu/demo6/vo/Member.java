package com.fabu.demo6.vo;

import org.hibernate.validator.constraints.Length;

import javax.validation.constraints.Digits;
import javax.validation.constraints.Email;
import javax.validation.constraints.NotNull;
import java.io.Serializable;
import java.sql.Timestamp;
import java.util.Date;

public class Member implements Serializable {


    //{}
    @NotNull(message = "{member.id.notnull.error}")
    @Email(message = "{member.id.email.error}")
    @Length(min = 5,message ="{member.id.length.error}" )
    private String  id;
    @NotNull(message = "{member.age.notnull.error}")
    @Digits(integer=3,fraction = 0,message = "{member.age.digits.error}")
    private Integer  age;
    @NotNull(message = "{member.salary.notnull.error}")
    @Digits(integer=20,fraction = 2,message = "{member.salary.digits.error}")
    private Double   salary;
    @NotNull(message = "{member.birathday.notnull.error}")
    private Date birathday;

    public Date getBirathday() {
        return birathday;
    }

    public void setBirathday(Date birathday) {
        this.birathday = birathday;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    public Double getSalary() {
        return salary;
    }

    public void setSalary(Double salary) {
        this.salary = salary;
    }

    @Override
    public String toString() {
        return "Member{" +
                "id='" + id + '\'' +
                ", age=" + age +
                ", salary=" + salary +
                ", birathday=" + birathday +
                '}';
    }
}
