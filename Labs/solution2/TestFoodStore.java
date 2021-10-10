public class TestFoodStore {
    public static void main(String[] args) {

	System.out.println("Creating new foodStore object with initial amount of 10");
	FoodStore MyFoodStore = new FoodStore(10);
	System.out.println("new object has " + MyFoodStore.getClass());
	System.out.println("Contains " + MyFoodStore.getAmountStored());
	System.out.println("number of deposits " + MyFoodStore.getNumDeposits());
	System.out.println("number of withdrawals " + MyFoodStore.getNumWithdrawals());

	System.out.println("Adding 15 using depositFood method");
	MyFoodStore.depositFood(15);
	System.out.println("Store now contains " + MyFoodStore.getAmountStored());
	System.out.println("number of deposits " + MyFoodStore.getNumDeposits());
	System.out.println("number of withdrawals " + MyFoodStore.getNumWithdrawals());

	System.out.println("Removing 5 using withdrawFood method");
	MyFoodStore.withdrawFood(5);    
	System.out.println("Store now contains " + MyFoodStore.getAmountStored());
	System.out.println("number of deposits " + MyFoodStore.getNumDeposits());
	System.out.println("number of withdrawals " + MyFoodStore.getNumWithdrawals());
    }
}
