package javaprograms;


class Book{
	String title;
	String author;
	double price;
	int quantity;
	double totalvalue;
	
	Book(String title,String author,double price,int quality){
		this.title=title;
		this.author=author;
		this.price=price;
		this.quantity=quality;
	}
	
	public void displayDeatils() {
		System.out.println("Books title: " +title);
		System.out.println("Author: "+author);
		System.out.println("Price"+price);
		System.out.println("Quantity: " +quantity);
		totalvalue=(price*quantity);
		System.out.println("Total Value: "+totalvalue);
		
	}
}
public class Bookstore {
	public static void main(String args[]) {
		Book book1=new Book("hjg","jheg",2300,1);
		book1.displayDeatils();
		Book book2=new Book("migrane","ayina",4500,2);
		book2.displayDeatils();
		
	}

}
