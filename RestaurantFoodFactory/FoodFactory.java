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
	public static Food selectCategory(String mealID,String mealName,String OrderTimeStamp,String mealCategory,String mealType)
	{
		//lets make a decision of selecting a particular category.
		switch(mealCategory)
		{
		case "STARTERS":return new StartersCategory(mealID,mealName,OrderTimeStamp,mealCategory,mealType);
			            
			            
		case "MAINCOURSE":return new MainCourseCategory(mealID,mealName,OrderTimeStamp,mealCategory,mealType);
                       
            
		case "DESSERT":return new DessertCategory(mealID,mealName,OrderTimeStamp,mealCategory,mealType);
                        
		}
		return null;
	}
}
