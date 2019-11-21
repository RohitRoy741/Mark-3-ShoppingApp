import java.util.Scanner;
class Tech extends Item
{
	String company;
	String model;
	Tech()
	{
		item_id=-1;
	}
	Tech(int item_id,String name, double price,int quantity,String company,String model )
	{
		super(item_id, name,  price,quantity);
		this.company=company;
		this.model=model;
	}
	void get_details()
	{
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Tech Item id :");
        item_id = sc.nextInt();
        System.out.print("Enter Tech name :");
        name = sc.nextLine();
        name=sc.nextLine();
        System.out.print("Enter price :");;
        price=sc.nextDouble();
        
        System.out.print("Enter Company :");
        company= sc.nextLine();
        company= sc.nextLine();
        System.out.print("Enter Model :");
        model = sc.nextLine();
        System.out.println("Enter Quantity :");
        quantity = sc.nextInt();
	}
	void display()
	{
		System.out.println("Details of Tech Item");
		System.out.println("Id: "+item_id);
		System.out.println("Name: "+name);
		System.out.println("Company: "+company);
		System.out.println("Model: "+model);
		System.out.println("Price: "+price);
		System.out.println("'Quantity: "+quantity);
	}
}