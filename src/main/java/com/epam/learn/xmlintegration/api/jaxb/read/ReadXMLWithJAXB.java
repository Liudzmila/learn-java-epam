package main.java.com.epam.learn.xmlintegration.api.jaxb.read;

import main.java.com.epam.learn.xmlintegration.api.jaxb.model.Customer;
import main.java.com.epam.learn.xmlintegration.api.jaxb.model.Customers;
import jakarta.xml.bind.JAXBContext;
import jakarta.xml.bind.JAXBException;
import jakarta.xml.bind.Unmarshaller;

import java.io.File;
import java.util.List;

public class ReadXMLWithJAXB {
	
	public static void main(String[] args) throws JAXBException {

		JAXBContext context = JAXBContext.newInstance(Customers.class);
		Unmarshaller unmarshaller = context.createUnmarshaller();

		File f = new File("./data/customers.xml");

		Customers customers = (Customers) unmarshaller.unmarshal(f);
		List<Customer> data = customers.getCustomers();
		data.forEach(System.out::println);
	}

}
