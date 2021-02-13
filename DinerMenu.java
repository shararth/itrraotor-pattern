import java.util.Iterator;

public class DinerMenu implements Menu {
	static final int MAX_ITEMS = 6;
	int numberOfItems = 0;
	MenuItem[] menuItems;
  
	public DinerMenu() {
		menuItems = new MenuItem[MAX_ITEMS];
 
		addItem("Vegetarian Curry",
			"Potatoes,garlic, red peppers, green peppers, tomatoes, onions, lettuce & tomato ", true, 12.99);
		addItem("Bindi(Okra) Masala",
			"Okra with onion, tomato, garlic & ginger", false, 10.99);
		addItem("Curry of the day",
			"Curry of the day, Chicken Curry with a side of Chicken Pakora", false, 13.99);
		addItem("Samosa Chat",
			"A Samosa Chat, with Chutney, onions, yogurt",
			false, 7.99);
		addItem("Steamed Veggies and Brown Rice",
			"Steamed vegetables over brown rice", true, 5.99);
		addItem("Chicken 65",
			"Chicken with Vinegar, and a Garlic Naan(Bread)",
			true, 15.99);
	}
  
	public void addItem(String name, String description, 
	                     boolean vegetarian, double price) 
	{
		MenuItem menuItem = new MenuItem(name, description, vegetarian, price);
		if (numberOfItems >= MAX_ITEMS) {
			System.err.println("Sorry, menu is full!  Can't add item to menu");
		} else {
			menuItems[numberOfItems] = menuItem;
			numberOfItems = numberOfItems + 1;
		}
	}
 
	public MenuItem[] getMenuItems() {
		return menuItems;
	}
  
	public Iterator<MenuItem> createIterator() {
		return new DinerMenuIterator(menuItems);
		//return new AlternatingDinerMenuIterator(menuItems);
	}
 
	// other menu methods here
}