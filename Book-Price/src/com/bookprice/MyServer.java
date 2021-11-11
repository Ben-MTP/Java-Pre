package com.bookprice;

import java.io.BufferedReader;
import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.File;
import java.io.InputStreamReader;
import java.net.ServerSocket;
import java.net.Socket;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;

import org.w3c.dom.Document;
import org.w3c.dom.Element;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;

public class MyServer {
	public static void main(String[] args) throws Exception {
		ServerSocket ss = new ServerSocket(3334);
		for(int i = 0; i < 2; i++) {
			Socket s = ss.accept();
			DataInputStream din = new DataInputStream(s.getInputStream());
			DataOutputStream dout = new DataOutputStream(s.getOutputStream());
			
			BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
			
			String str = "", str2 = "";
			while (!str.equals("stop")) {
				str = din.readUTF();
				System.out.println("client says: " + str);
				
				str2 = getBook(str);
				
				str2 = br.readLine();
				dout.writeUTF(str2);
				dout.flush();
			}
			din.close();
			s.close();
			ss.close();
		}
	}
	
	/**
	 * input: isbn
	 * output: a book.
	 * @return
	 */
	public static String getBook(String id) {
		Book book = null;
		try {
			File inputFile = new File("data.xml");
			DocumentBuilderFactory dbFactory = DocumentBuilderFactory.newInstance();
			DocumentBuilder dBuilder;
			
			dBuilder = dbFactory.newDocumentBuilder();
			Document doc = dBuilder.parse(inputFile);
			doc.getDocumentElement().normalize();
			
			NodeList nodeListBook = doc.getElementsByTagName("book");
			for(int i = 0; i < nodeListBook.getLength(); i++) {
				book = new Book();
				Node nNode = nodeListBook.item(i);
				if(nNode.getNodeType() == Node.ELEMENT_NODE) {
					Element eElement = (Element) nNode;
//					System.out.println(eElement.getAttribute("id"));
					if((eElement.getAttribute("id")).equals(id)) {
						
						book.setId(id);
						book.setIsbn(eElement.getElementsByTagName("isbn").item(0).getTextContent());
						book.setName(eElement.getElementsByTagName("name").item(0).getTextContent());
						book.setPrice(eElement.getElementsByTagName("price").item(0).getTextContent());
						book.setCategory(eElement.getElementsByTagName("category").item(0).getTextContent());
						book.setPublish(eElement.getElementsByTagName("publish").item(0).getTextContent());
						book.setTotalpages(eElement.getElementsByTagName("totalpages").item(0).getTextContent());
						book.setAuthor(eElement.getElementsByTagName("author").item(0).getTextContent());
						break;
					}
				}
			}
			
			System.out.println(book);
			
		} catch (Exception e) {
			e.printStackTrace();
		}
		return book.toString();
	}
}
