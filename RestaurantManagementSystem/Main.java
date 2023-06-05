package RestaurantManagementSystem;

import RestaurantFoodFactory.FoodFactory;


import RestaurantFoodFactory.Food;
import RestaurantFoodFactory.StartersCategory;
import RestaurantFoodFactory.MainCourseCategory;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

import ChainOfServers.FirstServer;
import ChainOfServers.SecondServer;
import ChainOfServers.Server;
import ChainOfServers.ThirdServer;
import PaymentsResponbility.CardPaymentMode;
import PaymentsResponbility.CashPaymentMode;
import PaymentsResponbility.HybridPaymentMode;
import PaymentsResponbility.PaymentInitiator;
import RestaurantFoodFactory.DessertCategory;


class FoodOrderTemplate
{
	public String mealID;
	public String mealName;
	public String mealCategory;
	public String mealType;
	public int  orderTotal;
	
    public FoodOrderTemplate()
    {
    	
    }

	public FoodOrderTemplate(String mealID, String mealName, String mealCategory, String mealType,
			int orderTotal) {
		this.mealID=mealID;
		this.mealName=mealName;
		this.mealCategory=mealCategory;
		this.mealType=mealType;
		this.orderTotal=orderTotal;
	}
}
public class Main {
	
	

	public static void main(String args[])
	{
		//creation of the restaurant instance.
		Restaurant restaurant=Restaurant.getSingleInstance();
		System.out.println("------------------------------------Restaurant Management System Using System Design Principles in Java-------------------------------------------");
		System.out.println();
		
		Scanner sc=new Scanner(System.in);
		//Restaurant restaurant1=new Restaurant();
		
		ArrayList<FoodOrderTemplate> foodOrders=new ArrayList<>();
		
		System.out.println("Determination of Suitable Server for our Application:");
		int load=sc.nextInt();
		
		Server firstServer=new FirstServer();
		Server secondServer=new SecondServer();
		Server thirdServer=new ThirdServer();
		
		
		System.out.println();
		firstServer.nextServer(secondServer);
		secondServer.nextServer(thirdServer);
		
		firstServer.serverDetails(load);
		String mealID="";
		String mealName="";
		String mealCategory="";
		String mealType="";
		int orderTotal=0;
		
        System.out.println("\n");
		System.out.println("Enter the Number of Orders Placed in a single Day: ");
		int totalOrderCount=sc.nextInt();
		
		for(int i=0;i<totalOrderCount;i++)
		{
			System.out.println("Enter the category selected by the user: ");
			System.out.println();
			System.out.println("Enter the mealID: ");
			mealID=sc.next();
			
			System.out.println("Enter the mealType: ");
			mealType=sc.next();
			
			System.out.println("Enter the mealName: ");
			mealName=sc.next();	
			
			System.out.println("Enter the meal Category: ");
			mealCategory=sc.next();
			
			System.out.println("Enter the order Total: ");
			orderTotal=sc.nextInt();
			
			FoodOrderTemplate foodEntry=new FoodOrderTemplate(mealID,mealName,mealCategory,mealType,orderTotal);
			
			foodOrders.add(foodEntry);	
			
		}
		
		System.out.println("Total Number of Orders: "+foodOrders.size());
		
		ArrayList<Integer> starters=new ArrayList<Integer>();
		ArrayList<Integer> maincourse=new ArrayList<Integer>();
		ArrayList<Integer> dessert=new ArrayList<Integer>();

		int total_starters=0,total_main_course=0,total_dessert=0;
		for(int i=0;i<foodOrders.size();i++)
		{
			String Category=foodOrders.get(i).mealCategory;
//			String mealsName=foodOrders.get(i).mealName;
//			String mealsCategory=foodOrders.get(i).mealCategory;
//			String mealsType=foodOrders.get(i).mealType;
			int  ordersTotal=foodOrders.get(i).orderTotal;
			
			//System.out.println(mealsID+" : "+ordersTotal);
			if(Category.equalsIgnoreCase("STARTERS"))
			{
				total_starters=total_starters+ordersTotal;
			   System.out.println(total_starters);
			}
			else if(Category.equalsIgnoreCase("MAINCOURSE"))
			{
				total_main_course=total_main_course+ordersTotal;	
			}
			else
			{
				total_dessert+=ordersTotal;
			}
						
		}
		System.out.println("All Orders Placed in a Day: ");
		
		
		for(int i=0;i<foodOrders.size();i++)
		{
			String mealsID=foodOrders.get(i).mealID;
			String mealsName=foodOrders.get(i).mealName;
     		String mealsCategory=foodOrders.get(i).mealCategory;
			String mealsType=foodOrders.get(i).mealType;
			int  ordersTotal=foodOrders.get(i).orderTotal;
			
			Food food=FoodFactory.selectCategory(mealsID,mealsName,mealsCategory,mealsType,ordersTotal);
		   // System.out.println(food.OrderDetails());
		    food.OrderDetails();
			
		}
		
		
		
		System.out.println("\nTotal Sales Analysis:   \n");
		
		System.out.println("Starters Sale in a Single Day: "+total_starters);
		System.out.println("MainCourse Sale in a Single Day: "+total_main_course);
		System.out.println("Dessert Sale in a Single Day: "+total_dessert);

		System.out.println("\nPayment Startegy For Each of the User: ");
	
		for(int i=0;i<foodOrders.size();i++)
		{
			PaymentInitiator cardPayment=new CardPaymentMode();
			PaymentInitiator cashPayment=new CashPaymentMode();
			PaymentInitiator HybridPayment=new HybridPaymentMode();
			
			cardPayment.nextPaymentMode(cashPayment);
			cashPayment.nextPaymentMode(HybridPayment);
			
			long total=foodOrders.get(i).orderTotal;
			cardPayment.paymentDetails(total);
			
		}
	    
	}
}
