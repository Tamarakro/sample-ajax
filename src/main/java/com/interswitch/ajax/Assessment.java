package com.interswitch.ajax;

import jakarta.xml.bind.JAXBContext;
import jakarta.xml.bind.JAXBException;
import jakarta.xml.bind.Marshaller;
import jakarta.xml.bind.Unmarshaller;

import java.io.File;

public class Assessment {
    public static void main(String[] args) throws JAXBException {
        JAXBContext context = JAXBContext.newInstance(Course.class);
        Unmarshaller unmarshaller = context.createUnmarshaller();
        File file = new File("course.xml");
        Course course = (Course) unmarshaller.unmarshal(file);
//        System.out.println(course);

        JAXBContext studentContext = JAXBContext.newInstance(Student.class);
        Unmarshaller studentUnmarshaller = studentContext.createUnmarshaller();
        File studentFile = new File("student.xml");
        Student student = (Student) studentUnmarshaller.unmarshal(studentFile);

        student.getCourses().add(course);

        System.out.println(student.toString());
    }
}








