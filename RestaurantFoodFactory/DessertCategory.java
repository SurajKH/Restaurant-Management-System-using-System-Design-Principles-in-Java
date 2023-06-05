package RestaurantFoodFactory;

import java.text.SimpleDateFormat;
import java.util.Date;

public class DessertCategory extends Food {

//	String mealID;
//	String mealName;
//	String OrderTimeStamp;
//	String mealCategory;
//	String mealType;
//	
	//lets consider the constructor holding on to the relevant information..
		public DessertCategory(String mealID,String mealName,String mealCategory,String mealType,int orderTotal)
		{
			this.mealID=mealID;
			this.mealName=mealName;
			this.mealCategory=mealCategory;
			this.mealType=mealType;
			this.orderTotal=orderTotal;
		}
		
		@Override
		public void OrderDetails() {
			
			SimpleDateFormat formatter = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");  
		    Date date = new Date();  
		    
			System.out.println("Order Summary: ");
			System.out.println();
	        System.out.println("Current TimeStamp:\n"+formatter.format(date));
			System.out.println();
			
			
			
			System.out.println("Order Summary: ");
			System.out.println("DESSERTS: ");
			System.out.println("MEAL ID: "+this.mealID);
			System.out.println("MEAL NAME: "+this.mealName);
			System.out.println("MEAL CATEGORY: "+this.mealCategory);
			System.out.println("MEAL TYPE: "+this.mealType);
			System.out.println("ORDER TOTAL: "+this.orderTotal);

			
		}

}
