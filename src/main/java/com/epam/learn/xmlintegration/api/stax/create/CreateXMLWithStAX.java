package main.java.com.epam.learn.xmlintegration.api.stax.create;

import main.java.com.epam.learn.xmlintegration.dataprovider.DataProvider;
import main.java.com.epam.learn.xmlintegration.model.Customer;
import main.java.com.epam.learn.xmlintegration.utilities.Stopwatch;

import javax.xml.stream.XMLStreamException;
import java.io.IOException;
import java.util.List;

public class CreateXMLWithStAX {

	public static void main(String[] args) throws XMLStreamException, IOException {

		List<Customer> data = DataProvider.getData(DataProvider.SMALL);

		Stopwatch watch = new Stopwatch().start("Create XML with StAX");
		StAXStreamCreator creator = new StAXStreamCreator();
		creator.createDocument(data, "./out/customers.xml");
		watch.stop();
	}
}
