package RestaurantFoodFactory;

public class DessertCategory extends Food {

//	String mealID;
//	String mealName;
//	String OrderTimeStamp;
//	String mealCategory;
//	String mealType;
//	
	//lets consider the constructor holding on to the relevant information..
		public DessertCategory(String mealID,String mealName,String OrderTimeStamp,String mealCategory,String mealType)
		{
			this.mealID=mealID;
			this.mealName=mealName;
			this.mealCategory=mealCategory;
			this.OrderTimeStamp=OrderTimeStamp;
			this.mealType=mealType;
		}
		
		@Override
		public void OrderDetails() {
			
			System.out.println("Order Summary: ");
			System.out.println("DESSERTS: ");
			System.out.println("MEAL ID: "+this.mealID);
			System.out.println("MEAL NAME: "+this.mealName);
			System.out.println("MEAL CATEGORY: "+this.mealCategory);
			System.out.println("MEAL ORDERTIMESTAMP: "+this.OrderTimeStamp);
			System.out.println("MEAL TYPE: "+this.mealType);
			
		}

}
