package RestaurantFoodFactory;

public abstract class Food {
	
	public String mealID;
	public String mealName;
	public String mealCategory;
	public String mealType;
	public int  orderTotal;
	//we are considering the below method as an abstract method.
	public abstract void OrderDetails();

}
