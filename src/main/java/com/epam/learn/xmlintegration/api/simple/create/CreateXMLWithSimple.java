package main.java.com.epam.learn.xmlintegration.api.simple.create;

import main.java.com.epam.learn.xmlintegration.api.simple.dataprovider.DataProvider;
import main.java.com.epam.learn.xmlintegration.api.simple.model.Customer;
import main.java.com.epam.learn.xmlintegration.api.simple.model.Customers;
import org.simpleframework.xml.Serializer;
import org.simpleframework.xml.core.Persister;

import java.io.IOException;
import java.io.StringWriter;
import java.util.List;

public class CreateXMLWithSimple {
	public static void main(String[] args) throws IOException {

		List<Customer> data = DataProvider.getData(DataProvider.SMALL);

		Customers customers = new Customers();
		customers.setCustomers(data);

		Serializer serializer = new Persister();
		StringWriter sw = new StringWriter();

        try {
            serializer.write(customers, sw);
            System.out.println(sw.toString());
        } catch (Exception e) {
            e.printStackTrace();
        }

    }
}
