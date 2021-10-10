public class TestBasket {
    public static void main( String[] arg ){

	// initialise an array of Items
	Item[] shopping = {
	    new Item("baked beans", 0.3),
	    new Item("tomato soup", 0.4)
	};

	// print each item in the array using for loop and
	// print the item using toString method
	for (int i = 0; i < shopping.length; i++) {
	    System.out.println(shopping[i].toString());
	}

	// initialise a Basket class using the Item object 'shopping'
	// as a parameter
	Basket myBasket = new Basket(shopping);
	System.out.println("The total cost is ukp" + myBasket.total());

    }
}
