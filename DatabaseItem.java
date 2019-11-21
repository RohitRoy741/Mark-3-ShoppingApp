class DatabaseItem
{
	Book b[] = new Book[20];
	Tech t[] = new Tech[10];
	Footwear f[] = new Footwear[5];
	PackedFood p[] = new PackedFood[5]; 
	DatabaseItem()
	{
		b[0] = new Book(101,"Harry Potter And The Philosopher's Stone",520,30,"JK Rowling", 1);
		b[1] = new Book(102,"Harry Potter And The Chamber Of Secrets",400,30,"JK Rowling", 2);
		b[2] = new Book(103,"Harry Potter And The Prisoner Of Azkaban",320,30,"JK Rowling", 3);
		b[3] = new Book(104,"Harry Potter And The Goblet Of Fire",710,30,"JK Rowling", 4);
		b[4] = new Book(105,"Harry Potter And The Order Of Phoenix",600,30,"JK Rowling", 5);
		b[5] = new Book(106,"Harry Potter And The Half Blood Prince",800,30,"JK Rowling", 6);
		b[6] = new Book(107,"Harry Potter And The Deathly Hallows",960,30,"JK Rowling", 7);
		b[7] = new Book(108,"Lord Of The Rings : The Fellowship Of The Ring",260,20,"J.R.R Tolkien",1);
		b[8] = new Book(109,"Lord Of The Rings : The Two Towers",210,20,"J.R.R Tolkien",2);
		b[9] = new Book(110,"Lord Of The Rings : The Return Of The King",360,20,"J.R.R Tolkien",3);
		b[10] = new Book(111,"Lord Of The Rings : A Hobbit's Tale",160,20,"J.R.R Tolkien",4);
		b[11] = new Book(112,"Lord Of The Rings : Demolition of Smaug",430,20,"J.R.R Tolkien",5);
		b[12] = new Book(113,"Lord Of The Rings : Battle of Five Armies",500,20,"J.R.R Tolkien",6);
		b[13] = new Book(114,"Discrete Mathematics",760,15,"Kenneth Rosen",7);
		b[14] = new Book(115,"A Complete Reference To Java", 960, 15,"Herbert Schlidt",9);
		b[15] = new Book(116,"COA",500,15,"Carl Hamacher",5);
		b[16] = new Book(117,"Data Structures In C",450,15,"A Foruzan",3);
		b[17] = new Book(118,"Java Programming",100,1,"Rohit Roy",1);
		b[18] = new Book(119,"A Guide to Hate Your Life",200,1,"Bhavya Jain",1);
		b[19] = new Book(120,"Life: Realaxed",300,1,"Lay Patel",1);
		t[0] = new Tech(201,"Mobile Phone",10000,40,"Realme","1");
		t[1] = new Tech(202,"Mobile Phone",67000,10,"Apple","IPhone 8s");
		t[2] = new Tech(203,"Mobile Phone",40000,15,"One Plus","One Plus 7");
		t[3] = new Tech(204,"Mobile Phone",19000,20,"Realme","Realme X");
		t[4] = new Tech(205,"Mobile Phone",17000,20,"Samsung","Galaxy M317");
		t[5] = new Tech(206,"Laptop",25000,20,"Dell","Inspiron");
		t[6] = new Tech(207,"Laptop",20000,25,"Lenovo","IdeaPad");
		t[7] = new Tech(208,"Laptop",50000,15,"HP","Pavilion");
		t[8] = new Tech(209,"Laptop",85000,10,"MSI","GameX");
		t[9] = new Tech(210,"Laptop",150000,7,"Microsoft","SurfacePro");
		f[0] = new Footwear(301,"Shoes",5000,7,"Nike",8);
		f[1] = new Footwear(302,"Shoes",3000,10,"Puma",9);
		f[2] = new Footwear(303,"Shoes",4500,6,"Sparx",8);
		f[3] = new Footwear(304,"Shoes",2000,15,"Bata",10);
		f[4] = new Footwear(305,"Flip Flops", 300, 25, "Action", 8);
		p[0] = new PackedFood(401,"Lays Chips",25,50,542.6,"17/3/2020");
		p[1] = new PackedFood(402,"Haldiram Chips",20,40,430.78,"17/3/2020");
		p[2] = new PackedFood(403,"Balaji Chips",30,70,560.77,"17/3/2020");
		p[3] = new PackedFood(404,"Oreo",30,15,450.76,"17/3/2020");
		p[4] = new PackedFood(405,"Hide n Seek",20,25,400.98,"17/3/2020");

	}
	void display_book()
	{
		for(int i=0;i<20;i++)
			b[i].display();
	}
	void display_tech()
	{
		for(int i=0;i<10;i++)
			t[i].display();
	}
	void display_footwear()
	{
		for(int i=0;i<5;i++)
			f[i].display();
	}
	void display_food()
	{
		for(int i=0;i<5;i++)
			p[i].display();
	}
	
	Book search_book(String name)
	{
		Book x = new Book();
		for(int i=0;i<20;i++)
		{
			String ex = b[i].name;
			if(ex.equals(name))
			{
				x = b[i];
				return x; 
			}
		}
		return x;
	}
	Book search_book(int id)
	{
		Book x = new Book();
		for(int i=0;i<20;i++)
		{
			
			if(b[i].item_id==id)
			{
				x = b[i];
				return x; 
			}
		}
		return x;
	}
	Tech search_tech(String name)
	{
		Tech x = new Tech();
		for(int i=0;i<10;i++)
		{
			String ex = t[i].name;
			if(ex.equals(name))
			{
				x = t[i];
				return x; 
			}
		}
		return x;
	}
	Tech search_tech(int id)
	{
		Tech x = new Tech();
		for(int i=0;i<10;i++)
		{
			
			if(t[i].item_id==id)
			{
				x = t[i];
				return x; 
			}
		}
		return x;
	}
	Footwear search_footwear(String name)
	{
		Footwear x = new Footwear();
		for(int i=0;i<5;i++)
		{
			String ex = f[i].name;
			if(ex.equals(name))
			{
				x = f[i];
				return x; 
			}
		}
		return x;
	}
	Footwear search_footwear(int id)
	{
		Footwear x = new Footwear();
		for(int i=0;i<5;i++)
		{
			
			if(f[i].item_id==id)
			{
				x = f[i];
				return x; 
			}
		}
		return x;
	}
	PackedFood search_food(String name)
	{
		PackedFood x = new PackedFood();
		for(int i=0;i<5;i++)
		{
			String ex = p[i].name;
			if(ex.equals(name))
			{
				x = p[i];
				return x; 
			}
		}
		return x;
	}
	PackedFood search_food(int id)
	{
		PackedFood x = new PackedFood();
		for(int i=0;i<5;i++)
		{
			
			if(p[i].item_id==id)
			{
				x = p[i];
				return x; 
			}
		}
		return x;
	}
}