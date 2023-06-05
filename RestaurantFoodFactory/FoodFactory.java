package RestaurantFoodFactory;
import RestaurantFoodFactory.Food;
import RestaurantFoodFactory.StartersCategory;
import RestaurantFoodFactory.MainCourseCategory;
import RestaurantFoodFactory.DessertCategory;

public class FoodFactory {

	//zero paramterized constructor.
	public FoodFactory()
	{
		
	}
	
	//we are making a selection of the new Category.
	public static Food selectCategory(String mealID,String mealName,String mealCategory,String mealType,int orderTotal)
	{
		//lets make a decision of selecting a particular category.
		switch(mealCategory)
		{
		case "STARTERS":return new StartersCategory(mealID,mealName,mealCategory,mealType,orderTotal);
			            
			            
		case "MAINCOURSE":return new MainCourseCategory(mealID,mealName,mealCategory,mealType,orderTotal);               
            
		case "DESSERT":return new DessertCategory(mealID,mealName,mealCategory,mealType,orderTotal);
                        
		}
		return null;
	}
}
