package com.dom;

import java.io.File;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.transform.Transformer;
import javax.xml.transform.TransformerFactory;
import javax.xml.transform.dom.DOMSource;
import javax.xml.transform.stream.StreamResult;

import org.w3c.dom.Attr;
import org.w3c.dom.Document;
import org.w3c.dom.Element;


public class DOMCreateXMLExample {
	public static void main(String[] args) {
		try {
			DocumentBuilderFactory dbFactory = DocumentBuilderFactory.newInstance();
			DocumentBuilder dBuilder = dbFactory.newDocumentBuilder();
			Document doc = dBuilder.newDocument();
			
			Element rootElement = doc.createElement("class");
			
			doc.appendChild(rootElement);
			
			Attr totalStudentAttr = doc.createAttribute("totalStudents");
			
			totalStudentAttr.setValue("2");
			rootElement.setAttributeNode(totalStudentAttr);
			
			// Create a new student 1:
			Element student1 = doc.createElement("student");
			rootElement.appendChild(student1);
			
			Attr attr1 = doc.createAttribute("rollno");
			attr1.setValue("1");
			student1.setAttributeNode(attr1);
			
			Element firstname = doc.createElement("firstname");
			firstname.appendChild(doc.createTextNode("Manh"));
			student1.appendChild(firstname);
			
			Element lastname = doc.createElement("lastname");
			lastname.appendChild(doc.createTextNode("KM"));
			student1.appendChild(lastname);
			
			// Create a new student 2:
			Element student2 = doc.createElement("student");
			rootElement.appendChild(student2);
			
			Attr attr2 = doc.createAttribute("rollno");
			attr2.setValue("2");
			student1.setAttributeNode(attr2);
			
			Element firstname2 = doc.createElement("firstname");
			firstname2.appendChild(doc.createTextNode("Thang"));
			student2.appendChild(firstname2);
			
			Element lastname2 = doc.createElement("lastname");
			lastname2.appendChild(doc.createTextNode("LV"));
			student2.appendChild(lastname2);
			
			// write content to file XML:
			TransformerFactory transformerFacotory = TransformerFactory.newInstance();
			Transformer transformer = transformerFacotory.newTransformer();
			DOMSource source = new DOMSource(doc);
			StreamResult result = new StreamResult(new File("students.xml"));
			transformer.transform(source, result);
			
			StreamResult consoleResult = new StreamResult(System.out);
			transformer.transform(source, consoleResult);
			
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
