import java.util.Scanner;
class Book extends Item
{
	String author;
	int edition;
	Book()
	{
		item_id=-1;
	}
	Book(int item_id,String name, double price,int quantity,String author,int edition )
	{
		super(item_id, name,price,quantity);
		this.author=author;
		this.edition=edition;
	}
	void get_details()
	{
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Book id :");
        item_id = sc.nextInt();
        System.out.print("Enter Book name :");
        name = sc.nextLine();
        name=sc.nextLine();
        System.out.print("Enter price :");;
        price=sc.nextDouble();
        
        System.out.print("Enter author :");
        author= sc.next();
        author= sc.nextLine();
        System.out.print("Enter Edition :");
        edition = sc.nextInt();
        System.out.println("Enter Quantity :");
        quantity = sc.nextInt();
	}
	void display()
	{
		System.out.println("Details of Book");
		System.out.println("Book Id: "+item_id);
		System.out.println("Name: "+name);
		System.out.println("Author: "+author);
		System.out.println("Edition: "+edition);
		System.out.println("Price: "+price);
		System.out.println("'Quantity: "+quantity);
	}
}