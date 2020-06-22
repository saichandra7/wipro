package com.wipro.Encapsulation;

class Author
{
  String name;
  String email;
  char gender;
  public Author(String name,String email,char gender)
  {
	  this.name=name;
	  this.email=email;
	  this.gender=gender;
  }
  public String toString()
  { 
	  return name+"\tEmail: "+email+"\tGender: "+gender;  
  } 
}
class Book
{
	String name;
	Author author;
	double price;
	int qtyInStock;
	public Book(String name,Author author,double price,int qtyInStock)
	{
		this.name=name;
		this.author=author;
		this.price=price;
		this.qtyInStock=qtyInStock;
	}
	public String toString()
	  { 
		  return "Book: "+name+"\nAuthor: "+author.toString()+"\nPrice: "+price+"\nStock: "+qtyInStock;  
	  } 
}
public class AuthorMain {
public static void main(String[] args) {
	Book b = new Book(args[3],new Author(args[0],args[1],args[2].charAt(0)),Double.parseDouble(args[4]),Integer.parseInt(args[5]));
System.out.println(b.toString());
}
}
