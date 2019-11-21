import java.util.Scanner;
class Footwear extends Item
{
	String company;
	int size;
	Footwear()
	{
		item_id=-1;
	}
	Footwear(int item_id,String name, double price,int quantity,String company,int size )
	{
		super(item_id, name,  price,quantity);
		this.company=company;
		this.size=size;
	}
	void get_details()
	{
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Footwear id :");
        item_id = sc.nextInt();
        System.out.print("Enter Footwear name :");
        name = sc.nextLine();
        name=sc.nextLine();
        System.out.print("Enter price :");;
        price=sc.nextDouble();
        
        System.out.print("Enter Company :");
        company= sc.next();
        company= sc.nextLine();
        System.out.print("Enter size :");
        size = sc.nextInt();
        System.out.println("Enter Quantity :");
        quantity = sc.nextInt();
	}
	void display()
	{
		System.out.println("Details of Footwear:");
		System.out.println("Footwear Id: "+item_id);
		System.out.println("Name: "+name);
		System.out.println("Company: "+company);
		System.out.println("Size: "+size);
		System.out.println("Price: "+price);
		System.out.println("'Quantity: "+quantity);
	}	
}