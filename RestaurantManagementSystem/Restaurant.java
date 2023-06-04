package RestaurantManagementSystem;

//lets consider it as a singleton class.
public class Restaurant 
{
	
	//lets consider a single Instance.
	private static Restaurant restaurantInstance=null;
	
	//we are avoiding creation of multiple instance over here.
	private Restaurant()
	{
		
	}
	
	public static Restaurant getSingleInstance()
	{
		if(restaurantInstance==null)
		{
			//we are creating the first instance over here.
			return new Restaurant();
		}
		return null;
	}
}


