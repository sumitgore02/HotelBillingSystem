import java.util.*;
class HotelBillSystem{
	
	static String name;
	static long mobileNo;
	static int bill=0;
	static ArrayList<String> cart = new ArrayList<>();
	
	
	public static void SkingHotel(Scanner sc){
		
		System.out.println("1. Order Some Food");
		System.out.println("2. Make a Bill");
		
		System.out.print("Enter a Option: ");
		byte opt=sc.nextByte();
		System.out.println();
		
		switch(opt){
			case 1:	menu(sc);
					break;
					
			case 2:	if(bill==0){
						System.out.println("Order Some Food!!!");
						SkingHotel(sc);
						break;
					}
			
					bill(sc);
					break;
			
			default :{
				System.out.println("Enter A Valid Option!!!");
			}
		}
	}
	
	public static void menu(Scanner sc){
		
		System.out.println("*****Menu*****\n");
		System.out.println("1. Veg Menu \n2. Non-veg menu\n3. Back To SkingHotel\n");
		System.out.print("Enter A Option: ");
		byte opt=sc.nextByte();
		System.out.println();
		
		switch(opt){
			case 1:	vegMenu(sc);
					break;
			
			case 2:	nonVegMenu(sc);
					break;
					
			case 3:	SkingHotel(sc);
					break;
					
			default :
				System.out.println("Enter Valid Option");
				menu(sc);
		}
		
	}
	
	public static void vegMenu(Scanner sc){
		
		System.out.println("\n*****Veg Menu*****\n");
		System.out.println("sr.no  	  Name			Price");
		System.out.println("1.	  Kaju Curry		240");
		System.out.println("2.	  Kaju Masala		260");
		System.out.println("3.	  Paneer Curry		230");
		System.out.println("4.	  Paneer Masala		210");
		System.out.println("5.	  Dal Tadka		140");
		System.out.println("6.	  Jeera Rice		90");
		System.out.println("7.	  Tandur Roti		15");
		System.out.println("8.	  Back To Menu		\n");
	
		System.out.print("Enter A Option: ");
		byte opt=sc.nextByte();
		System.out.println();
		
		switch(opt){
			case 1: cart.add("Kaju Curry : 240");
					bill += 240;
					System.out.println("Kaju Curry Added Into Cart!!!");
					vegMenu(sc);
					break;
					
			case 2: cart.add("Kaju Masala : 260");
					bill += 260;
					System.out.println("Kaju Masala Added Into Cart!!!");
					vegMenu(sc);
					break;
			
			case 3: cart.add("Paneer Curry : 230");
					bill += 230;
					System.out.println("Paneer Curry Added Into Cart!!!");
					vegMenu(sc);
					break;
			
			case 4: cart.add("Paneer Masala : 210");
					bill += 210;
					System.out.println("Paneer Masala Added Into Cart!!!");
					vegMenu(sc);
					break;
			
			case 5: cart.add("Dal Tadka : 140");
					bill += 140;
					System.out.println("Dal Tadka Added Into Cart!!!");
					vegMenu(sc);
					break;
			
			case 6: cart.add("Jeera Ric : 90");
					bill += 90;
					System.out.println("Jeera Rice Added Into Cart!!!");
					vegMenu(sc);
					break;
			
			case 7: cart.add("Tandur Roti : 15");
					bill += 15;
					System.out.println("Tandur Roti Added Into Cart!!!");
					vegMenu(sc);
					break;
			
			case 8: menu(sc);
					break;
			
			default :{
				System.out.println("Enter Valid Option!!!");
				vegMenu(sc);
			}
		}	
	}
	
	public static void nonVegMenu(Scanner sc){
		
		System.out.println("\n*****Non-Veg Menu*****\n");
		System.out.println("sr.no  	  Name			Price");
		System.out.println("1.	  Egg Curry		170");
		System.out.println("2.	  Chikan Curry		200");
		System.out.println("3.	  Chikan Masala		220");
		System.out.println("4.	  Mutton Curry		280");
		System.out.println("5.	  Mutton Masala		300");
		System.out.println("6.	  Fish Masala		250");
		System.out.println("7.	  Jeera Rice		90");
		System.out.println("8.	  Tandur Roti		15");
		System.out.println("9.	  Back To Menu\n");
		
		System.out.print("Enter a Valid Option: ");
		byte opt = sc.nextByte();
		System.out.println();
		
		switch(opt){
			case 1: cart.add("Egg Curry : 170");
					bill += 170;
					System.out.println("Egg Curry Added Into Cart!!!");
					nonVegMenu(sc);
					break;
					
			case 2: cart.add("Chikan Curry : 200");
					bill += 200;
					System.out.println("Chikan Curry Added Into Cart!!!");
					nonVegMenu(sc);
					break;
			
			case 3: cart.add("Chikan Masala : 220");
					bill += 220;
					System.out.println("Chikan Masala Added Into Cart!!!");
					nonVegMenu(sc);
					break;
			
			case 4: cart.add("Mutton Curry : 280");
					bill += 280;
					System.out.println("Mutton Curry Added Into Cart!!!");
					nonVegMenu(sc);
					break;
			
			case 5: cart.add("Mutton Masala : 300");
					bill += 300;
					System.out.println("Mutton Masala Added Into Cart!!!");
					nonVegMenu(sc);
					break;
			
			case 6: cart.add("Fish Masala : 250");
					bill += 250;
					System.out.println("Fish Masala Added Into Cart!!!");
					nonVegMenu(sc);
					break;
					
			case 7: cart.add("Jeera Ric : 90");
					bill += 90;
					System.out.println("Jeera Rice Added Into Cart!!!");
					nonVegMenu(sc);
					break;
			
			case 8: cart.add("Tandur Roti : 15");
					bill += 15;
					System.out.println("Tandur Roti Added Into Cart!!!");
					nonVegMenu(sc);
					break;
			
			case 9: menu(sc);
					break;
			
			default :{
				System.out.println("Enter Valid Option!!!");
				nonVegMenu(sc);
			}
		}
	}
	
	public static void bill(Scanner sc){
		
		System.out.println("\n*****Billing Process*****\n");
		System.out.println("Your Order: \n"+cart);
		System.out.println();
		System.out.println("Your Total Bill: \n"+bill);
		System.out.println();
	}
	
	
	public static void main(String[] args){
	Scanner sc = new Scanner(System.in);
	
		System.out.println("\n*******Welcome In Sking Hotel*******\n");
		System.out.println("Enter a Name: ");
		name = sc.next();
		System.out.println("Enter a Mobile No: ");
		mobileNo = sc.nextLong();
		System.out.println();
		
		SkingHotel(sc);
		
		System.out.println("*******Thanks For Coming Visit Agin*******");
	}
}