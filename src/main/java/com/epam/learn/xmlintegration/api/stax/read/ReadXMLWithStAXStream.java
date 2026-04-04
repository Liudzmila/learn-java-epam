package main.java.com.epam.learn.xmlintegration.api.stax.read;

import main.java.com.epam.learn.xmlintegration.dataprovider.DataProvider;
import main.java.com.epam.learn.xmlintegration.model.Customer;

import javax.xml.stream.XMLStreamException;
import java.io.FileNotFoundException;
import java.util.List;

public class ReadXMLWithStAXStream {

	public static void main(String[] args) throws FileNotFoundException, XMLStreamException {

		StAXStreamReader reader = new StAXStreamReader();
		List<Customer> data = reader.getDataFromXML(DataProvider.DATADIR + "customers.xml");
		for (Customer customer : data) {
			System.out.println(customer);
		}
		System.out.println("Data returned: " + data.size() + " customers");
	}

}
