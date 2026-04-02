package main.java.com.epam.learn.xmlintegration.api.sax;

import main.java.com.epam.learn.xmlintegration.dataprovider.DataProvider;

import java.util.List;

public class ReadXMLWithSAX {

	public static void main(String[] args) throws Exception {

		String filename = DataProvider.DATADIR + "customersError.xml";
		
		SAXCustomerHandler saxHandler = new SAXCustomerHandler();
		List<Customer> data = saxHandler.readDataFromXML(filename);
		System.out.println("Number of customers: " + data.size());
		
		for (Customer customer : data) {
			System.out.println(customer);
		}
	}

}
