import java.io.*;
import java.text.SimpleDateFormat;
import java.util.Date;
class Customer
{
	String name;
	String username;
	String password;
	Item z ;
	File file;
	double bill=0;
	Cart c = new Cart();
	Customer(String name,String username, String password)
	{
		this.name = name;
		this.username=username;
		this.password=password;
		try
		{
			int x=0;
			file = new File(username+".txt");
			if(file.length()==0)
			{
				x=1;
			}
			FileWriter fw = new FileWriter(file,true);
			if(x==1)
			{
				fw.write("Name:"+name+"\n"+"Username:"+username+"\n"+"Password:"+password+"\n"+"History Of Purchases"+"\n");
				fw.close();	
			}		
			
		}
		catch(IOException e)
		{
			System.out.println("Error in creating file for user\n"+e);
		}	
		
	}
	void purchase(String name,int a)
	{
		switch(a)
		{
			case 1: z = c.di.search_book(name);
					if(z.quantity==0)
					{
						System.out.println("Sorry the requested item is out of order");
						break;
					}	
					z.quantity--;
					Book b = c.di.search_book(name);
					System.out.println("Item Purchased");
					SimpleDateFormat formatter = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");
					Date date = new Date();
					try
					{
						FileWriter fw = new FileWriter(file,true);
						fw.write("Purchase made on:  "+formatter.format(date)+"\nPurchase Details:\n"+"Purchase ID:"+z.item_id+"\nName:"+z.name+"\nAuthor:"+b.author+"\nEdition:"+b.edition+"\nPrice:"+z.price+"\n");
						fw.close();
					}
					catch(IOException e)
					{
						System.out.println("Error in printing purchase details\n"+e);
					}
					bill=bill+z.price;
					System.out.println("Your Bill : "+bill);
					break;
			case 2: z = c.di.search_tech(name);
					if(z.quantity==0)
					{
						System.out.println("Sorry the requested item is out of order");
						break;
					}
					Tech t = c.di.search_tech(name);	
					z.quantity--;
					System.out.println("Item Purchased");
					formatter = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");
					date = new Date();
					try
					{
						FileWriter fw = new FileWriter(file,true);
						fw.write("Purchase made on:  "+formatter.format(date)+"\nPurchase Details:\n"+"Purchase ID:"+z.item_id+"\nName:"+z.name+"\nCompany:"+t.company+"\nModel:"+t.model+"\nPrice:"+z.price+"\n");
						fw.close();
					}
					catch(IOException e)
					{
						System.out.println("Error in printing purchase details\n"+e);
					}
					bill=bill+z.price;
					System.out.println("Your Bill : "+bill);	
					break;

			case 3: z = c.di.search_footwear(name);
					if(z.quantity==0)
					{
						System.out.println("Sorry the requested item is out of order");
						break;
					}
					Footwear f = c.di.search_footwear(name);	
					z.quantity--;
					System.out.println("Item Purchased");
					formatter = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");
					date = new Date();
					try
					{
						FileWriter fw = new FileWriter(file,true);
						fw.write("Purchase made on:  "+formatter.format(date)+"\nPurchase Details:\n"+"Purchase ID:"+z.item_id+"\nName:"+z.name+"\nCompany"+f.company+"\nSize:"+f.size+"\nPrice:"+z.price+"\n");
						fw.close();
					}
					catch(IOException e)
					{
						System.out.println("Error in printing purchase details\n"+e);
					}
					bill=bill+z.price;
					System.out.println("Your Bill : "+bill);
					break;
			case 4: z = c.di.search_food(name);
					if(z.quantity==0)
					{
						System.out.println("Sorry the requested item is out of order");
						break;
					}	
					PackedFood p = c.di.search_food(name);
					z.quantity--;
					System.out.println("Item Purchased");
					formatter = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");
					date = new Date();
					try
					{
						FileWriter fw = new FileWriter(file,true);
						fw.write("Purchase made on:  "+formatter.format(date)+"\nPurchase Details:\n"+"Purchase ID:"+z.item_id+"\nName:"+z.name+"\nExpiry Date:"+p.expiry_date+"\nPrice:"+z.price+"\n");
						fw.close();
					}
					catch(IOException e)
					{
						System.out.println("Error in printing purchase details\n"+e);
					}
					bill=bill+z.price;
					System.out.println("Your Bill : "+bill);
					break;
			default: System.out.println("Wrong Choice!");		
		} 
	}
	
	void purchase(int id,int a)
	{
		switch(a)
		{
			case 1: z = c.di.search_book(id);
					if(z.quantity==0)
					{
						System.out.println("Sorry the requested item is out of order");
						break;
					}	
					z.quantity--;
					Book b = c.di.search_book(id);
					System.out.println("Item Purchased");
					SimpleDateFormat formatter = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");
					Date date = new Date();
					try
					{
						FileWriter fw = new FileWriter(file,true);
						fw.write("Purchase made on:  "+formatter.format(date)+"\nPurchase Details:\n"+"Purchase ID:"+z.item_id+"\nName:"+z.name+"\nAuthor:"+b.author+"\nEdition:"+b.edition+"\nPrice:"+z.price+"\n");
						fw.close();
					}
					catch(IOException e)
					{
						System.out.println("Error in printing purchase details\n"+e);
					}
					bill=bill+z.price;
					System.out.println("Your Bill : "+bill);
					break;
			case 2: z = c.di.search_tech(id);
					if(z.quantity==0)
					{
						System.out.println("Sorry the requested item is out of order");
						break;
					}	
					z.quantity--;
					Tech t = c.di.search_tech(id);
					System.out.println("Item Purchased");
					formatter = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");
					date = new Date();
					try
					{
						FileWriter fw = new FileWriter(file,true);
						fw.write("Purchase made on:  "+formatter.format(date)+"\nPurchase Details:\n"+"Purchase ID:"+z.item_id+"\nName:"+z.name+"\nCompany:"+t.company+"\nModel:"+t.model+"\nPrice:"+z.price+"\n");
						fw.close();
					}
					catch(IOException e)
					{
						System.out.println("Error in printing purchase details\n"+e);
					}
					bill=bill+z.price;
					System.out.println("Your Bill : "+bill);	
					break;

			case 3: z = c.di.search_footwear(id);
					if(z.quantity==0)
					{
						System.out.println("Sorry the requested item is out of order");
						break;
					}	
					z.quantity--;
					Footwear f = c.di.search_footwear(id);
					System.out.println("Item Purchased");
					formatter = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");
					date = new Date();
					try
					{
						FileWriter fw = new FileWriter(file,true);
						fw.write("Purchase made on:  "+formatter.format(date)+"\nPurchase Details:\n"+"Purchase ID:"+z.item_id+"\nName:"+z.name+"\nCompany"+f.company+"\nSize:"+f.size+"\nPrice:"+z.price+"\n");
						fw.close();
					}
					catch(IOException e)
					{
						System.out.println("Error in printing purchase details\n"+e);
					}
					bill=bill+z.price;
					System.out.println("Your Bill : "+bill);
					break;
			case 4: z = c.di.search_food(id);
					if(z.quantity==0)
					{
						System.out.println("Sorry the requested item is out of order");
						break;
					}	
					z.quantity--;
					PackedFood p = c.di.search_food(id);
					System.out.println("Item Purchased");
					formatter = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");
					date = new Date();
					try
					{
						FileWriter fw = new FileWriter(file,true);
						fw.write("Purchase made on:  "+formatter.format(date)+"\nPurchase Details:\n"+"Purchase ID:"+z.item_id+"\nName:"+z.name+"\nExpiry Date:"+p.expiry_date+"\nPrice:"+z.price+"\n");
						fw.close();
					}
					catch(IOException e)
					{
						System.out.println("Error in printing purchase details\n"+e);
					}
					bill=bill+z.price;
					System.out.println("Your Bill : "+bill);
					break;
			default: System.out.println("Wrong Choice!");		
		} 
	}
	void purchase(int id,int a, int rohitx)
	{
		switch(a)
		{
			case 1: z = c.di.search_book(id);
					/*if(z.quantity==0)
					{
						System.out.println("Sorry the requested item is out of order");
						break;
					}	
					z.quantity--;*/
					Book b = c.di.search_book(id);
					System.out.println("Item Purchased");
					SimpleDateFormat formatter = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");
					Date date = new Date();
					try
					{
						FileWriter fw = new FileWriter(file,true);
						fw.write("Purchase made on:  "+formatter.format(date)+"\nPurchase Details:\n"+"Purchase ID:"+z.item_id+"\nName:"+z.name+"\nAuthor:"+b.author+"\nEdition:"+b.edition+"\nPrice:"+z.price+"\n");
						fw.close();
					}
					catch(IOException e)
					{
						System.out.println("Error in printing purchase details\n"+e);
					}
					bill=bill+z.price;
					System.out.println("Your Bill : "+bill);
					break;
			case 2: z = c.di.search_tech(id);
					/*if(z.quantity==0)
					{
						System.out.println("Sorry the requested item is out of order");
						break;
					}	
					z.quantity--;*/
					Tech t = c.di.search_tech(id);
					System.out.println("Item Purchased");
					formatter = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");
					date = new Date();
					try
					{
						FileWriter fw = new FileWriter(file,true);
						fw.write("Purchase made on:  "+formatter.format(date)+"\nPurchase Details:\n"+"Purchase ID:"+z.item_id+"\nName:"+z.name+"\nCompany:"+t.company+"\nModel:"+t.model+"\nPrice:"+z.price+"\n");
						fw.close();
					}
					catch(IOException e)
					{
						System.out.println("Error in printing purchase details\n"+e);
					}
					bill=bill+z.price;
					System.out.println("Your Bill : "+bill);	
					break;

			case 3: z = c.di.search_footwear(id);
					/*if(z.quantity==0)
					{
						System.out.println("Sorry the requested item is out of order");
						break;
					}	
					z.quantity--;*/
					Footwear f = c.di.search_footwear(id);
					System.out.println("Item Purchased");
					formatter = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");
					date = new Date();
					try
					{
						FileWriter fw = new FileWriter(file,true);
						fw.write("Purchase made on:  "+formatter.format(date)+"\nPurchase Details:\n"+"Purchase ID:"+z.item_id+"\nName:"+z.name+"\nCompany"+f.company+"\nSize:"+f.size+"\nPrice:"+z.price+"\n");
						fw.close();
					}
					catch(IOException e)
					{
						System.out.println("Error in printing purchase details\n"+e);
					}
					bill=bill+z.price;
					System.out.println("Your Bill : "+bill);
					break;
			case 4: z = c.di.search_food(id);
					/*if(z.quantity==0)
					{
						System.out.println("Sorry the requested item is out of order");
						break;
					}	
					z.quantity--;*/
					PackedFood p = c.di.search_food(id);
					System.out.println("Item Purchased");
					formatter = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");
					date = new Date();
					try
					{
						FileWriter fw = new FileWriter(file,true);
						fw.write("Purchase made on:  "+formatter.format(date)+"\nPurchase Details:\n"+"Purchase ID:"+z.item_id+"\nName:"+z.name+"\nExpiry Date:"+p.expiry_date+"\nPrice:"+z.price+"\n");
						fw.close();
					}
					catch(IOException e)
					{
						System.out.println("Error in printing purchase details\n"+e);
					}
					bill=bill+z.price;
					System.out.println("Your Bill : "+bill);
					break;
			default: System.out.println("Wrong Choice!");		
		} 
	}

}