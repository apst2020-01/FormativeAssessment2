/*Faculty Training Institute (FTI)
* Module 3,UNIT 3
*Formative Assessment 2 Activity 2.1  Implementing Inheritance in Java */

package application;

public class bigHouse {
	public static void main (String[] args) {
		 house bigHouse = new house (); 
		 bigHouse.size = 200; 
		 bigHouse.multiStorey = true;
		 bigHouse.nrWindows = 50;
		 bigHouse.nrDoors = 20;
		 bigHouse.roofType = "tiles";
		 bigHouse.nrGarage = 3; 
		 bigHouse.pool =true;
		 bigHouse.nrBedroom = 4;
		 bigHouse.nrBathroom = 5;
		 bigHouse.maidsRooms = true; 
		 System.out.println ("BigHouse Specifications: ");
		 System.out.println ("Size: "+ bigHouse.size + " square meters");
		 System.out.println ("Has Multistorey: "+ bigHouse.multiStorey); 
		 System.out.println ("Nr of Windows: "+ bigHouse.nrWindows);
		 System.out.println ("Type of doors: "+ bigHouse.nrDoors);
		 System.out.println ("type of roof:  "+ bigHouse.roofType);
		 System.out.println ("Has pool: "+ bigHouse.pool);
		 System.out.println ("Nr. of Bedrooms: "+ bigHouse.nrBedroom);
		 System.out.println ("Nr. of bathrooms: "+ bigHouse.nrBathroom);
		 System.out.println ("Has maids quarters: "+ bigHouse.maidsRooms);
		 bigHouse.waterConsumption();
		 bigHouse.electrictyUse();
		 bigHouse.gardenSize();
		 }
		}
