class Cart
{
	Item i[] = new Item[25];
    int n =-1;
    int m =-1;
	DatabaseItem di = new DatabaseItem();
	int xenodrome[] = new int[25];
	Cart()
	{

	}
	void add_to_cart(String name, int a)
	{
		xenodrome[++m]=a;
		switch(a)
		{
			case 1: i[++n] = di.search_book(name);
					if(i[n].quantity==0)
					{
						System.out.println("Sorry the requested Item is out of stock");
						break;
					}
					i[n].quantity--;
					System.out.println("Item added to cart");
					break;
			case 2: i[++n] = di.search_tech(name);
					i[n].quantity--;
					if(i[n].quantity==0)
					{
						System.out.println("Sorry the requested Item is out of stock");
						break;
					}
					System.out.println("Item added to cart");	
					break;

			case 3: i[++n] = di.search_footwear(name);
					i[n].quantity--;
					if(i[n].quantity==0)
					{
						System.out.println("Sorry the requested Item is out of stock");
						break;
					}
					System.out.println("Item added to cart");
					break;
			case 4: i[++n] = di.search_food(name);
					i[n].quantity--;
					if(i[n].quantity==0)
					{
						System.out.println("Sorry the requested Item is out of stock");
						break;
					}
					System.out.println("Item added to cart");
					break;
			default: System.out.println("Wrong Choice!");		
		} 
	}
	void add_to_cart(int id, int a)
	{
		xenodrome[++m]=a;
		switch(a)
		{
			case 1: i[++n] = di.search_book(id);
					if(i[n].quantity==0)
					{
						System.out.println("Sorry the requested Item is out of stock");
						break;
					}
					i[n].quantity--;
					System.out.println("Item added to cart");
					break;
			case 2: i[++n] = di.search_tech(id);
					i[n].quantity--;
					if(i[n].quantity==0)
					{
						System.out.println("Sorry the requested Item is out of stock");
						break;
					}
					System.out.println("Item added to cart");	
					break;

			case 3: i[++n] = di.search_footwear(id);
					i[n].quantity--;
					if(i[n].quantity==0)
					{
						System.out.println("Sorry the requested Item is out of stock");
						break;
					}
					System.out.println("Item added to cart");
					break;
			case 4: i[++n] = di.search_food(id);
					i[n].quantity--;
					if(i[n].quantity==0)
					{
						System.out.println("Sorry the requested Item is out of stock");
						break;
					}
					System.out.println("Item added to cart");
					break;
			default: System.out.println("Wrong Choice!");		
		} 
	}
	void show_cart()
	{
		if(n==-1)
		{
			System.out.println("Your cart is empty!");
			return;
		}
		System.out.println("Items in your Cart are:");
		for(int j=0;j<=n;j++)
			i[j].display();
	}
	void remove_from_cart(int id)
	{
		for(int j=0;j<=n;j++)
		{
			if(id==i[j].item_id)
			{
				i[j].quantity++;
				for(int k=j;k<=n;k++)
					i[k]=i[k+1];
				for(int k=j;k<=n;k++)
					xenodrome[k]=xenodrome[k+1];
				n=n-1;
				System.out.println("Item Removed From Cart");
				break;
			}
		}
	}
	int purchase(int id)
	{
		for(int j=0;j<=n;j++)
		{
			if(id==i[j].item_id)
			{
				int ret = xenodrome[j];
				//System.out.println("Item Purchased From Cart");
				//System.out.println("Your Bill: "+i[j].price);
				for(int k=j;k<=n;k++)
					i[k]=i[k+1];
				for(int k=j;k<=n;k++)
					xenodrome[k]=xenodrome[k+1];
				n=n-1;
				System.out.println("Item Removed From Cart");
				return ret;
			}
		}
		return 0;
	}	
}