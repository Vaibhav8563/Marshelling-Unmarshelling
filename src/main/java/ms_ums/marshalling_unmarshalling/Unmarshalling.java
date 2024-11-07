package ms_ums.marshalling_unmarshalling;


import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBException;
import javax.xml.bind.Unmarshaller;

import ms_ums.model.Person;

import java.io.StringReader;

public class Unmarshalling {
    public static void main(String[] args) {
        String xml = "<?xml version=\"1.0\" encoding=\"UTF-8\" standalone=\"yes\"?><person><name>John Doe</name><age>30</age></person>";

        try {
            // Create JAXB context and unmarshaller
            JAXBContext context = JAXBContext.newInstance(Person.class);
            Unmarshaller unmarshaller = context.createUnmarshaller();

            // Unmarshal the XML string back into a Person object
            StringReader reader = new StringReader(xml);
            Person person = (Person) unmarshaller.unmarshal(reader);

            System.out.println("Unmarshalled Object:");
            System.out.println("Name: " + person.getName());
            System.out.println("Age: " + person.getAge());

        } catch (JAXBException e) {
            e.printStackTrace();
        }
    }
}

//Code which take XML from  saved location //
/*
 
import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBException;
import javax.xml.bind.Unmarshaller;

import ms_ums.model.Person;

import java.io.File;

public class Unmarshalling {
    public static void main(String[] args) {
        try {
            // Specify the path of the XML file to unmarshal
            String filePath = "C:\\Users\\91856\\eclipse-workspace\\marshalling-unmarshalling\\target\\resources\\xmlfiles\\person.xml";  // Ensure this path is correct

            // Create JAXB context and unmarshaller
            JAXBContext context = JAXBContext.newInstance(Person.class);
            Unmarshaller unmarshaller = context.createUnmarshaller();

            // Unmarshal XML file into a Person object
            File xmlFile = new File(filePath);
            Person person = (Person) unmarshaller.unmarshal(xmlFile);

            // Print the unmarshalled object
            System.out.println("Name: " + person.getName());
            System.out.println("Age: " + person.getAge());
        } catch (JAXBException e) {
            e.printStackTrace();
        }
    }
}

*/