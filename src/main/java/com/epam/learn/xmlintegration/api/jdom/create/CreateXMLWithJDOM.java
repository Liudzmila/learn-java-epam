package main.java.com.epam.learn.xmlintegration.api.jdom.create;

import main.java.com.epam.learn.xmlintegration.dataprovider.DataProvider;
import main.java.com.epam.learn.xmlintegration.model.Customer;
import org.jdom2.Document;
import org.jdom2.Element;
import org.jdom2.output.Format;
import org.jdom2.output.XMLOutputter;

import java.io.FileWriter;
import java.io.IOException;
import java.util.List;

public class CreateXMLWithJDOM {

	public static void main(String[] args) throws IOException {

		List<Customer> data = DataProvider.getData(DataProvider.SMALL);

		JDOMCreator creator = new JDOMCreator();
		Document doc = creator.createXMLDocument(data);
		List<Element> list = doc.getRootElement().getChildren();
		System.out.println("retrieved " + list.size());
		
		XMLOutputter outputter = new XMLOutputter(Format.getPrettyFormat());
		String xmlString = outputter.outputString(doc);
		System.out.println(xmlString);

		FileWriter writer = new FileWriter("./out/customers.xml");
		outputter.output(doc, writer);
		
	}

}
