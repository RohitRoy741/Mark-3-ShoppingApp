abstract class Item
{
	int item_id;
	String name;
	double price;
	int quantity;
	Item()
	{
		item_id=-1;
	}
	Item(int item_id, String name, double price, int quantity)
	{
		this.item_id=item_id;
		this.name=name;
		this.price=price;
		this.quantity=quantity;
	}
    abstract void get_details();
	abstract void display();
}