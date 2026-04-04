package main.java.com.epam.learn.xmlintegration.api.jaxb.create;

import main.java.com.epam.learn.xmlintegration.api.jaxb.dataprovider.DataProvider;
import main.java.com.epam.learn.xmlintegration.api.jaxb.model.Customer;
import main.java.com.epam.learn.xmlintegration.api.jaxb.model.Customers;
import jakarta.xml.bind.JAXBContext;
import jakarta.xml.bind.JAXBException;
import jakarta.xml.bind.Marshaller;

import java.io.File;
import java.io.IOException;
import java.io.StringWriter;
import java.util.List;

public class CreateXMLWithJAXB {

	public static void main(String[] args) throws IOException {

		List<Customer> data = DataProvider.getData(DataProvider.SMALL);

		Customers customers = new Customers();
		customers.setCustomers(data);

        try {
            JAXBContext context = JAXBContext.newInstance(Customers.class);
            Marshaller marshaller = context.createMarshaller();
            marshaller.setProperty(Marshaller.JAXB_FORMATTED_OUTPUT, true);

            StringWriter sw = new StringWriter();
            marshaller.marshal(customers, sw);

            File f = new File("./out/customers.xml");
            marshaller.marshal(customers, f);

            System.out.println(sw.toString());
        } catch (JAXBException e) {
            e.printStackTrace();
        }
    }

}
