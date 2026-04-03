package main.java.com.epam.learn.xmlintegration.api.jdom.read;

import main.java.com.epam.learn.xmlintegration.dataprovider.DataProvider;
import main.java.com.epam.learn.xmlintegration.model.Customer;
import org.jdom2.DataConversionException;

import java.text.ParseException;
import java.util.List;

public class ReadXMLWithJDOM {

	public static void main(String[] args) throws DataConversionException, ParseException {

		JDOMReader reader = new JDOMReader();
		List<Customer> data = reader.getDataFromXML(DataProvider.DATADIR + "customers.xml",
				"//customer[age >= 65]");
		
		System.out.println("Number of customers: " + data.size());
		
		for (Customer customer : data) {
			System.out.println(customer);
		}
		
	}

}
