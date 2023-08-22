package com.interswitch.ajax;

import jakarta.xml.bind.JAXBContext;
import jakarta.xml.bind.JAXBException;
import jakarta.xml.bind.Marshaller;
import jakarta.xml.bind.Unmarshaller;

import java.io.File;
import java.io.StringWriter;

public class PersonTest {
    public static void main(String[] args) throws JAXBException {

            Person person = new Person();
            person.setName("Adekunle John");
            person.setUsername("johnsky");

            JAXBContext context = JAXBContext.newInstance(Person.class);
            Marshaller marshaller = context.createMarshaller();

            StringWriter writer = new StringWriter();
            marshaller.marshal(person, writer);
            System.out.println(writer.toString());

            //Unmarshal
            Unmarshaller unmarshaller = context.createUnmarshaller();
            File file = new File("person.xml");
            Person per = (Person)unmarshaller.unmarshal(file);
            System.out.println(per.toString());
        }
}

