package com.bookprice;

public class Book {

	private String id;
	private String isbn;
	private String name;
	private String price;
	private String category;
	private String publish;
	private String totalpages;
	private String author;
	public String getPrice() {
		return price;
	}
	public void setPrice(String price) {
		this.price = price;
	}
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getIsbn() {
		return isbn;
	}
	public void setIsbn(String isbn) {
		this.isbn = isbn;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getCategory() {
		return category;
	}
	public void setCategory(String category) {
		this.category = category;
	}
	public String getTotalpages() {
		return totalpages;
	}
	public void setTotalpages(String totalpages) {
		this.totalpages = totalpages;
	}
	public String getAuthor() {
		return author;
	}
	public void setAuthor(String author) {
		this.author = author;
	}
	
	public String getPublish() {
		return publish;
	}
	public void setPublish(String publish) {
		this.publish = publish;
	}
	@Override
	public String toString() {
		return "Book [id=" + id + ", isbn=" + isbn + ", name=" + name + ", price=" + price + ", category=" + category
				+ ", publish=" + publish + ", totalpages=" + totalpages + ", author=" + author + "]";
	}
	
}
