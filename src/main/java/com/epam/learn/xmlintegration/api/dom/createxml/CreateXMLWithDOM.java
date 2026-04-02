package main.java.com.epam.learn.xmlintegration.api.dom.createxml;

import main.java.com.epam.learn.xmlintegration.dataprovider.DataProvider;
import main.java.com.epam.learn.xmlintegration.model.Customer;
import org.w3c.dom.Document;

import javax.xml.parsers.ParserConfigurationException;
import javax.xml.transform.*;
import javax.xml.transform.dom.DOMSource;
import javax.xml.transform.stream.StreamResult;
import java.io.File;
import java.io.StringWriter;
import java.util.List;

public class CreateXMLWithDOM {

	public static void main(String[] args) 
			throws ParserConfigurationException, TransformerException {

		List<Customer> data = DataProvider.getData(DataProvider.SMALL);
		
		DOMCreator creator = new DOMCreator();
		Document doc = creator.createXMLDoc(data);

		outputToString(doc);
		outputAsFile(doc, "./out/customers.xml");

//		System.out.println(doc.toString());
//		
//		Node root = doc.getFirstChild();
//		System.out.println(root.getNodeName());
//		
//		NodeList nodes = root.getChildNodes();
//		for (int i = 0; i < nodes.getLength(); i++) {
//			Node child = nodes.item(i);
//			System.out.println(child.getNodeName());
//			System.out.println(child.getTextContent());
//		}
	}

	private static void outputToString(Document doc) throws TransformerException {
		DOMSource source = new DOMSource(doc);
		StringWriter writer = new StringWriter();
		StreamResult result = new StreamResult(writer);
		Transformer transformer = getTransformer();

		transformer.transform(source, result);
		String xmlString = writer.toString();

		System.out.println(xmlString);
	}

	private static void outputAsFile(Document doc, String fileName)
			throws TransformerConfigurationException,
			TransformerException,
			TransformerFactoryConfigurationError {
		DOMSource source = new DOMSource(doc);
		StreamResult result = new StreamResult(new File(fileName));
		getTransformer().transform(source, result);
	}

	private static Transformer getTransformer() throws TransformerConfigurationException {
		TransformerFactory factory = TransformerFactory.newInstance();
		Transformer transformer = factory.newTransformer();

		transformer.setOutputProperty(OutputKeys.INDENT, "yes");
		transformer.setOutputProperty("{http://xml.apache.org/xslt}indent-amount", "2");
		return transformer;
	}

}
