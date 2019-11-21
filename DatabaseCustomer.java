import java.util.Scanner;
import java.io.*;
class DatabaseCustomer
{
	Customer c1[] = new Customer[4];
	int next = 3; 
	boolean b =false;
	DatabaseCustomer()
	{
		c1[0] = new Customer("Rohit","Salamander","Alohmora");
		c1[1] = new Customer("Lay","Leroy","Hey there");
		c1[2] = new Customer("Harshikha","harshikha29","Abra");
		 
	}
	void login(String username, String password)
	{
		for(int i=0;i<next;i++)
		{
			String us,ps;
			us = c1[i].username;
			ps = c1[i].password; 
			if(us.equals(username)&&ps.equals(password))
			{
				System.out.println("Welcome "+c1[i].name);
				b = true;
				System.out.println("You are logged In Successfully");
				System.out.println("\n\n\nFollowing Operations Can be performed:\n1.Access Item Database\n2.Purchase Item\n3.Add to Cart\n4.Display Cart's Items\n5.Remove from cart\n6.Purchase Item From Cart\n7.Log Out");
				int choice;
				System.out.print("Enter your choice(7 to log out): ");
				Scanner sc = new Scanner(System.in);
				choice = sc.nextInt();
				while(choice!=7)
				{
					switch(choice)
					{
						case 1: System.out.println("\nFollowing types of items are present:\n1.Book\n2.Footwear\n3.Tech\n4.Packed Food");
						System.out.println("Books:"); 
						c1[i].c.di.display_book();
						System.out.println("Footwear Items:");
						c1[i].c.di.display_footwear();
						System.out.println("Tech Items:");
						c1[i].c.di.display_tech();
						System.out.println("Packge Food:");
						c1[i].c.di.display_food();
						break;
						case 2: System.out.println("\nFollowing types of items can be purchased:\n1.Book\n2.Tech\n3.Footwear\n4.Packed Food");
						int x;
						System.out.print("Enter your choice:");
						x = sc.nextInt();
						switch(x)
						{
							case 1: c1[i].c.di.display_book();
							String r;
							System.out.print("\nEnter the name of item to purchase it:");
							r=sc.nextLine();
							r=sc.nextLine();
							c1[i].purchase(r,x);
							break;
							case 2:c1[i].c.di.display_tech();
						
							System.out.print("\nEnter the item id to purchase it:");
							int identity;
							identity = sc.nextInt();
							c1[i].purchase(identity,x);
							break;
							case 3:c1[i].c.di.display_footwear();
						
							System.out.print("\nEnter the item id to purchase it:");
							
							identity = sc.nextInt();
							c1[i].purchase(identity,x);
							break;
							case 4:c1[i].c.di.display_food();
						
							System.out.print("\nEnter the item id to purchase it:");
						    
							identity = sc.nextInt();
							c1[i].purchase(identity,x);
							break;
						}
						break;
						case 3:	 System.out.println("\nFollowing types of items can be added:\n1.Book\n2.Tech\n3.Footwear\n4.Packed Food");
						int y;
						System.out.print("\nEnter your choice:");
						y = sc.nextInt();
						switch(y)
						{
							case 1: c1[i].c.di.display_book();
							String r;
							System.out.print("\nEnter the name of item to add it:");
							r=sc.nextLine();
							r=sc.nextLine();
							c1[i].c.add_to_cart(r,y);
							break;
							case 2:c1[i].c.di.display_tech();
						
							System.out.print("\nEnter the item id to add it:");
							int iden;
							iden = sc.nextInt();
							c1[i].c.add_to_cart(iden,y);
							break;
							case 3:c1[i].c.di.display_footwear();
						
							System.out.print("\nEnter the item id to add it:");
							
							iden = sc.nextInt();
							c1[i].c.add_to_cart(iden,y);
							break;
							case 4:c1[i].c.di.display_food();
						
							System.out.print("\nEnter the item id to add it:");
							
							iden = sc.nextInt();
							c1[i].c.add_to_cart(iden,y);
							break;
							
						}
						break;
						case 4: c1[i].c.show_cart();
						break;
						case 5: c1[i].c.show_cart();
								System.out.print("Enter Item ID to remove it from cart:");
								int fubar;
								fubar = sc.nextInt();
								c1[i].c.remove_from_cart(fubar);
								break;
						case 6: c1[i].c.show_cart();
								System.out.print("Enter Item ID to purchase it from the cart:");
								fubar = sc.nextInt();
								int ret = c1[i].c.purchase(fubar);
								if(ret==0)
								{
									System.out.println("Item Not Found in Cart");
									break;
								}
								c1[i].purchase(fubar,ret,0);
								break;

						case 7: System.out.println("Logging out!");
								break;
						default: System.out.println("Wrong Choice!");  
					}
					System.out.println("\n\n\nFollowing Operations Can be performed:\n1.Access Item Database\n2.Purchase Item\n3.Add to Cart\n4.Display Cart's Items\n5.Remove Item from Cart\n6.Purchase an Item From Cart\n7.Log Out");
					System.out.print("Enter your choice(7 to log out): ");
					choice = sc.nextInt();
					if(choice==7)
						System.out.println("Logging Out");

				}

			}
		}
		if(b==false)
		{
			System.out.println("You are not premimum customer");
			loginx(username,password);
		}	
		

	}
	void loginx(String username, String password)
	{
		
			File file = new File(username+".txt");
			
			if(file.length()!=0)
			{
				int i = 3;
				c1[i] = new Customer("user",username,password);
				System.out.println("Welcome ");
				b = true;
				System.out.println("You are logged In Successfully");
				System.out.println("\n\n\nFollowing Operations Can be performed:\n1.Access Item Database\n2.Purchase Item\n3.Add to Cart\n4.Display Cart's Items\n5.Remove from cart\n6.Purchase Item From Cart\n7.Log Out");
				int choice;
				System.out.print("Enter your choice(7 to log out): ");
				Scanner sc = new Scanner(System.in);
				choice = sc.nextInt();
				while(choice!=7)
				{
					switch(choice)
					{
						case 1: System.out.println("\nFollowing types of items are present:\n1.Book\n2.Footwear\n3.Tech\n4.Packed Food");
						System.out.println("Books:"); 
						c1[i].c.di.display_book();
						System.out.println("Footwear Items:");
						c1[i].c.di.display_footwear();
						System.out.println("Tech Items:");
						c1[i].c.di.display_tech();
						System.out.println("Packge Food:");
						c1[i].c.di.display_food();
						break;
						case 2: System.out.println("\nFollowing types of items can be purchased:\n1.Book\n2.Tech\n3.Footwear\n4.Packed Food");
						int x;
						System.out.print("Enter your choice:");
						x = sc.nextInt();
						switch(x)
						{
							case 1: c1[i].c.di.display_book();
							String r;
							System.out.print("\nEnter the name of item to purchase it:");
							r=sc.nextLine();
							r=sc.nextLine();
							c1[i].purchase(r,x);
							break;
							case 2:c1[i].c.di.display_tech();
						
							System.out.print("\nEnter the item id to purchase it:");
							int identity;
							identity = sc.nextInt();
							c1[i].purchase(identity,x);
							break;
							case 3:c1[i].c.di.display_footwear();
						
							System.out.print("\nEnter the item id to purchase it:");
							
							identity = sc.nextInt();
							c1[i].purchase(identity,x);
							break;
							case 4:c1[i].c.di.display_food();
						
							System.out.print("\nEnter the item id to purchase it:");
						    
							identity = sc.nextInt();
							c1[i].purchase(identity,x);
							break;
						}
						break;
						case 3:	 System.out.println("\nFollowing types of items can be added:\n1.Book\n2.Tech\n3.Footwear\n4.Packed Food");
						int y;
						System.out.print("\nEnter your choice:");
						y = sc.nextInt();
						switch(y)
						{
							case 1: c1[i].c.di.display_book();
							String r;
							System.out.print("\nEnter the name of item to add it:");
							r=sc.nextLine();
							r=sc.nextLine();
							c1[i].c.add_to_cart(r,y);
							break;
							case 2:c1[i].c.di.display_tech();
						
							System.out.print("\nEnter the item id to add it:");
							int iden;
							iden = sc.nextInt();
							c1[i].c.add_to_cart(iden,y);
							break;
							case 3:c1[i].c.di.display_footwear();
						
							System.out.print("\nEnter the item id to add it:");
							
							iden = sc.nextInt();
							c1[i].c.add_to_cart(iden,y);
							break;
							case 4:c1[i].c.di.display_food();
						
							System.out.print("\nEnter the item id to add it:");
							
							iden = sc.nextInt();
							c1[i].c.add_to_cart(iden,y);
							break;
							
						}
						break;
						case 4: c1[i].c.show_cart();
						break;
						case 5: c1[i].c.show_cart();
								System.out.print("Enter Item ID to remove it from cart:");
								int fubar;
								fubar = sc.nextInt();
								c1[i].c.remove_from_cart(fubar);
								break;
						case 6: c1[i].c.show_cart();
								System.out.print("Enter Item ID to purchase it from the cart:");
								fubar = sc.nextInt();
								int ret = c1[i].c.purchase(fubar);
								if(ret==0)
								{
									System.out.println("Item Not Found in Cart");
									break;
								}
								c1[i].purchase(fubar,ret,0);
								break;

						case 7: System.out.println("Logging out!");
								break;
						default: System.out.println("Wrong Choice!");  
					}
					System.out.println("\n\n\nFollowing Operations Can be performed:\n1.Access Item Database\n2.Purchase Item\n3.Add to Cart\n4.Display Cart's Items\n5.Remove Item from Cart\n6.Purchase an Item From Cart\n7.Log Out");
					System.out.print("Enter your choice(7 to log out): ");
					choice = sc.nextInt();
					if(choice==7)
						System.out.println("Logging Out");

				

			}
		}
		if(b ==false)
			System.out.println("Invalid Username Or Password");

	}
	void Signup(String name, String username , String password)
	{
		Scanner sc = new Scanner(System.in);
		next++;
		c1[3] = new Customer(name,username,password);
		System.out.println("Your account is set up");
		System.out.println("Login again to continue");
		System.out.print("Enter your username:");
		username =  sc.nextLine();
		System.out.print("Enter password:");
		password = sc.nextLine();
		login(username,password);
	}
}