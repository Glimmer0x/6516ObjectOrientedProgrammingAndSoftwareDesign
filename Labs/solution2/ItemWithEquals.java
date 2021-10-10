/** ItemWithEquals.java
*
* Part of COM6516 practical class
* Updated by Mark Stevenson
* Based on code written by Steve Maddock and Richard Clayton
* Last modified 14 August 2014
*
*/

public class ItemWithEquals {

    public ItemWithEquals(String n, double p) {
	name = n;
	price = p;
    }

    public String getName() {
	return name;
    }
    public double getPrice() {
	return price;
    }

    // using ukp to denote pounds sterling as unicode pound symbol
    // does not display properly in MS Command Window
    public String toString() {
	return ("object type = " + getClass() + "; " + name + " = ukp" + price);
    }

    // equals method based on Core Java chapter 4
    public boolean equals(Object obj) {
	// check if identical objects
	if (this == obj) {
	    return true;
	}
	// must be false if parameter is null
	if (obj == null) {
	    return false;
	}
	// must be false if objects have different classes
	if (this.getClass() != obj.getClass()) {
	    return false;
	}
	// now we can cast and do something specific for Item
	ItemWithEquals otherItem = (ItemWithEquals) obj;
	return (name.equals(otherItem.getName()) && price == otherItem.getPrice());
    }

    // instance fields
    private final double price;
    private final String name;
    
    public static void main (String[] args) {
	String TESTNAME = "testObject";
	double TESTPRICE = 10.0;
	Item testObject = new Item(TESTNAME,TESTPRICE);
	System.out.println("Name:");
	System.out.println("Actual field " + testObject.getName());
	System.out.println("Expected " + TESTNAME);
	System.out.println("Price:");
	System.out.println("Actual field " + testObject.getPrice());
	System.out.println("Expected " + TESTPRICE);
    }
}
