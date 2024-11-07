package ms_ums.marshalling_unmarshalling;


import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBException;
import javax.xml.bind.Marshaller;

import ms_ums.model.Person;

import java.io.StringWriter;


public class Marshalling {
		    public static void main(String[] args) {
	        try {
	            // Create an object
	            Person person = new Person();
	            person.setName("John Doe");
	            person.setAge(30);

	            // Create JAXB context and marshaller
	            JAXBContext context = JAXBContext.newInstance(Person.class);
	            Marshaller marshaller = context.createMarshaller();

	            // Set marshaller property for formatted output
	            marshaller.setProperty(Marshaller.JAXB_FORMATTED_OUTPUT, true);

	            // Marshal the object to a String
	            StringWriter writer = new StringWriter();
	            marshaller.marshal(person, writer);
	            System.out.println("Marshalled XML:");
	            System.out.println(writer.toString());

	        } catch (JAXBException e) {
	            e.printStackTrace();
	        }
	    }
	}






//Code with user input and XML save in location //

/*
 
import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBException;
import javax.xml.bind.Marshaller;

import ms_ums.model.Person;

import java.io.File;
import java.util.Scanner;

public class Marshalling {
    public static void main(String[] args) {
        try {
            // Get user input
            Scanner scanner = new Scanner(System.in);
            System.out.print("Enter name: ");
            String name = scanner.nextLine();
            System.out.print("Enter age: ");
            int age = scanner.nextInt();

            // Create a Person object
            Person person = new Person(name, age);

            // Specify the directory where the XML will be stored
            String directoryPath = "C:\\Users\\91856\\eclipse-workspace\\marshalling-unmarshalling\\target\\resources\\xmlfiles";  // You can change this path
            File dir = new File(directoryPath);
            if (!dir.exists()) {
                dir.mkdir(); // Create the directory if it doesn't exist
            }

            // Specify the XML file name and path
            File xmlFile = new File(directoryPath + "/person.xml");

            // Create JAXB context and marshaller
            JAXBContext context = JAXBContext.newInstance(Person.class);
            Marshaller marshaller = context.createMarshaller();
            marshaller.setProperty(Marshaller.JAXB_FORMATTED_OUTPUT, true);

            // Marshal the Person object to XML file
            marshaller.marshal(person, xmlFile);

            System.out.println("XML file has been generated at: " + xmlFile.getAbsolutePath());
        } catch (JAXBException e) {
            e.printStackTrace();
        }
    }
}


*/