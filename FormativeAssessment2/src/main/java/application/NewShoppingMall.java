/*Faculty Training Institute (FTI)
* Module 3,UNIT 3
*Formative Assessment 2 Activity 2.1  Implementing Inheritance in Java */

package application;

public class NewShoppingMall {
	 public static void main (String[] args) {
		 shoppingMall NewShoppingMall = new shoppingMall (); 
		 NewShoppingMall.size = 10000; 
		 NewShoppingMall.multiStorey = true;
		 NewShoppingMall.nrWindows = 5000;
		 NewShoppingMall.nrDoors = 2000;
		 NewShoppingMall.roofType = "fibre glass";
		 NewShoppingMall.underGroundparking = true;
		 NewShoppingMall.parkingBays = 1000;
		 NewShoppingMall.restRooms = 50;
		 NewShoppingMall.nbrShops = 500;
		 
		 System.out.println ("NewShoppingMall Specifications: ");
		 System.out.println ("Size: "+  NewShoppingMall.size + " square meters");
		 System.out.println ("Has Multistorey: "+   NewShoppingMall.multiStorey);
		 System.out.println ("Nr of Windows: "+ NewShoppingMall.nrWindows);
		 System.out.println ("Type of doors: "+ NewShoppingMall.nrDoors);
		 System.out.println ("type of roof:  "+ NewShoppingMall.roofType);
		 System.out.println ("Has underground parking: "+   NewShoppingMall.underGroundparking);
		 System.out.println ("Nr. of parking bays  : "+ NewShoppingMall.parkingBays);
		 System.out.println ("Nr. of rest rooms: "+  NewShoppingMall.restRooms);
		 System.out.println ("Nr. of boardrooms  "+  NewShoppingMall.nbrShops);
		 
		 NewShoppingMall.waterConsumption();
		 NewShoppingMall.electrictyUse();
		 NewShoppingMall.electricityUsePerShop();
	}
	}