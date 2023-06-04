package RestaurantFoodFactory;

import java.text.SimpleDateFormat;
import java.util.Date;

public class StartersCategory extends Food{

//	String mealID;
//	String mealName;
//	String OrderTimeStamp;
//	String mealCategory;
//	String mealType;
	
	public StartersCategory(String mealID,String mealName,String OrderTimeStamp,String mealCategory,String mealType)
	{
		this.mealID=mealID;
		this.mealName=mealName;
		this.mealCategory=mealCategory;
		this.OrderTimeStamp=OrderTimeStamp;
		this.mealType=mealType;
	}
	
	@Override
	public void OrderDetails() {
	    
		SimpleDateFormat formatter = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");  
	    Date date = new Date();  
	    
		System.out.println("Order Summary: ");
		System.out.println();
        System.out.println("Current TimeStamp:\n"+formatter.format(date));

		System.out.println("STARTERS: ");
		System.out.println("MEAL ID: "+this.mealID);
		System.out.println("MEAL NAME: "+this.mealName);
		System.out.println("MEAL CATEGORY: "+this.mealCategory);
		System.out.println("MEAL ORDERTIMESTAMP: "+this.OrderTimeStamp);
		System.out.println("MEAL TYPE: "+this.mealType);
		
	}

}
