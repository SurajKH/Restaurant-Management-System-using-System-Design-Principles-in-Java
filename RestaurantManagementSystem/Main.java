package RestaurantManagementSystem;

import RestaurantFoodFactory.FoodFactory;
import RestaurantFoodFactory.Food;
import RestaurantFoodFactory.StartersCategory;
import RestaurantFoodFactory.MainCourseCategory;

import java.util.Scanner;

import RestaurantFoodFactory.DessertCategory;

public class Main {

	public static void main(String args[])
	{
		//creation of the restaurant instance.
		Restaurant restaurant=Restaurant.getSingleInstance();
		
		//Restaurant restaurant1=new Restaurant();
		
		String mealID="";
		String mealName="";
		String OrderTimeStamp="";
		String mealCategory="";
		String mealType="";
		
		System.out.println("Restaurant Management System Using System Design Principles in Java");
		
		System.out.println();
		System.out.println("Enter the category selected by the user: ");
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the mealID: ");
		mealID=sc.next();
		
		System.out.println("Enter the mealType: ");
		mealType=sc.next();
		
		System.out.println("Enter the mealName: ");
		mealName=sc.next();
		
		System.out.println("Enter the Time Stamp: ");
		OrderTimeStamp=sc.next();	
		
		System.out.println("Enter the meal Category: ");
		mealCategory=sc.next();
		
		Food food=FoodFactory.selectCategory(mealID,mealName,OrderTimeStamp,mealCategory,mealType);
	    //System.out.println(food.OrderDetails());
	    food.OrderDetails();
	    
	}
}
