//import sheffield package to use EasyReader class
import sheffield.*;

public class TestFoodStore2 {
    private static EasyReader keyboard;

    public static void main(String[] args) {
	keyboard = new EasyReader();

	int refusedTransactions = 0;
	boolean exit = false;

	// initialise a FoodStore object
	FoodStore myFoodStore = new FoodStore(0);

	// read the current amount of stored food
	int currentAmount = myFoodStore.getAmountStored();

	//print the current amount of stored food
	System.out.println("You have got " + currentAmount + " stored food");
	System.out.println("--------------------------");    

	// do while loop is useful to process a series of transactions.
	do {
	    System.out.print("Type 0 to exit: ");   

	    // read the user input
	    int amount = keyboard.readInt();    

	    /* if the user input is positive and the sum of both the user
	     * input and the current amount of food is greater or equal to
	     * zero, then deposit the new amount
	     */
	    if (amount > 0 && (amount + myFoodStore.getAmountStored()) >= 0) {
		myFoodStore.depositFood(amount);
		System.out.println("The new amount of stored food is: " + myFoodStore.getAmountStored() + "\n");

	    /* else if the user input is negative and the sum of both the user
	     * input and the current amount of food is greater than or equal
	     * to zero, then withdraw food
	     */
	    }
	    else if (amount < 0 && (amount + myFoodStore.getAmountStored()) >= 0) {
		// negative sign is used to reverse the amount
		// value so it can be subtracted from the current amount
		myFoodStore.withdrawFood(-amount);
		System.out.println("The new stored food amount is: " + myFoodStore.getAmountStored() + "\n");
	    }

	    // end the program
	    else if (amount == 0) {
		System.out.println("\nYou made " + myFoodStore.getNumDeposits() + " desposits");
		System.out.println("You made " + myFoodStore.getNumWithdrawals() + " withdrawls");
		System.out.println(refusedTransactions + " transactions were refused");
		System.out.println("You deposited " + myFoodStore.getAmountDeposited() + " items");
		System.out.println("You withdrew " + myFoodStore.getAmountWithdrawn() + " items");
		System.out.println("Bye...");
		exit = true;
	    }

	    // transaction refused
	    else{
		refusedTransactions++;
		System.out.println("The amount of the stored food cannot be less than zero...\n");    
	    }
	} while (!exit);
    }
}
