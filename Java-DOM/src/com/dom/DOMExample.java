package com.dom;

import java.io.File;
import java.util.ArrayList;
import java.util.List;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;

import org.w3c.dom.Document;
import org.w3c.dom.Element;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;

public class DOMExample {
	public static void main(String[] args) {
		List<Student> listStudents = DOMExample.readListStudents();
		
		for(Student student : listStudents) {
			System.out.println(student.toString());
		}
	}

	public static List<Student> readListStudents() {
		List<Student> listStudents = new ArrayList<>();
		Student student = null;
		try {
			// /Java-DOM/input.xml
			File inputFile = new File("input.xml");
			DocumentBuilderFactory dbFactory = DocumentBuilderFactory.newInstance();
			DocumentBuilder dBuilder;

			dBuilder = dbFactory.newDocumentBuilder();
			Document doc = dBuilder.parse(inputFile);
			doc.getDocumentElement().normalize();
			
			System.out.println("Phan tu goc: " + doc.getDocumentElement().getNodeName());
			
			NodeList nodeListStudent = doc.getElementsByTagName("student");
			
			for(int i = 0; i < nodeListStudent.getLength(); i++) {
				student = new Student();
				Node nNode = nodeListStudent.item(i);
				if(nNode.getNodeType() == Node.ELEMENT_NODE) {
					Element eElement = (Element) nNode;
					student.setId(eElement.getAttribute("id"));
					student.setFirstName(eElement.getElementsByTagName("firstname").item(0).getTextContent());
					student.setLastName(eElement.getElementsByTagName("lastname").item(0).getTextContent());
					student.setMarks(eElement.getElementsByTagName("marks").item(0).getTextContent());
				}
				
				listStudents.add(student);
			}
				
		} catch (Exception e) {
			e.printStackTrace();
		}
		return listStudents;
	}
}
