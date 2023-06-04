package RestaurantFoodFactory;

public abstract class Food {
	
	public String mealID;
	public String mealName;
	public String OrderTimeStamp;
	public String mealCategory;
	public String mealType;
	
	//we are considering the below method as an abstract method.
	public abstract void OrderDetails();

}
