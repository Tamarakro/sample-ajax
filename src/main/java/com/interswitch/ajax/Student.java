package com.interswitch.ajax;

import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlRootElement;

import java.util.ArrayList;
import java.util.List;

@XmlRootElement
public class Student {
    private String firstName;
    private String lastName;
    private String sex;
    List<Course> courses = new ArrayList<>();
    @XmlElement
    public List<Course> getCourses() {
        return courses;
    }

    public void setCourses(List<Course> courses) {
        this.courses = courses;
    }

    @XmlElement
    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }
    @XmlElement

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }
    @XmlElement
    public String getSex() {
        return sex;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }

    @Override
    public String toString() {
        return"Student {"+
                " \n\t\tfirstName='" + firstName + '\'' +
                " \n\t\tlastName='" + lastName + '\'' +
                " \n\t\tsex='" + sex + '\'' +
                " \n\t\tcourses=" + courses +
                '}';
    }
}
