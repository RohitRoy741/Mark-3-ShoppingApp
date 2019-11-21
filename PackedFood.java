import java.util.Scanner;
class PackedFood extends Item
{
	double calories;
	String expiry_date;
	PackedFood()
	{
		item_id=-1;
	}
	PackedFood(int item_id,String name, double price,int quantity,double calories, String expiry_date)
	{
        super( item_id,name,  price, quantity);
        this.calories=calories;
        this.expiry_date=expiry_date;
	}
	void get_details()
	{
		Scanner sc = new Scanner(System.in);
        System.out.print("Enter item id :");
        item_id = sc.nextInt();
        System.out.print("Enter item name :");
        name = sc.nextLine();
        name=sc.nextLine();
        System.out.print("Enter price :");;
        price=sc.nextDouble();
        
        System.out.print("Enter expiry date :");
        expiry_date= sc.next();
        expiry_date= sc.nextLine();
        System.out.print("Enter calories :");
        calories = sc.nextDouble();
        System.out.println("Enter Quantity :");
        quantity = sc.nextInt();
	}
	void display()
	{
		System.out.println("Details of Food Item:");
		System.out.println("Item Id: "+item_id);
		System.out.println("Name: "+name);
		System.out.println("Expiry Date: "+expiry_date);
		System.out.println("Calories: "+calories);
		System.out.println("Price: "+price);
		System.out.println("'Quantity: "+quantity);
	}

}