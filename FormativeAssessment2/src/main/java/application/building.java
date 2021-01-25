/*Faculty Training Institute (FTI)
* Module 3,UNIT 3
*Formative Assessment 2 Activity 2.1  Implementing Inheritance in Java */

package application;


//STEP1:  IMPLEMENT THE base class or parent class (building.java)
public class building {
		int size; 
		boolean multiStorey;
		int nrWindows;
		int nrDoors;
		String roofType;
					
		//Building class has two methods
		public void waterConsumption  () {
			System.out.println ("EVERY BUILDING HAS  WATER CONSUMPTION");
		}
		
		public void electrictyUse () {
			System.out.println ("EVERY BUILDING HAS  ELECTRICITY CONSUMPTION");
		}
	 }
			
		//STEP2: implement the derived or subclass
	class house extends  building {

			//the House class has 5 additional attributes 
		
				int nrGarage; 
				boolean pool;
				int nrBedroom;
				int nrBathroom;
				boolean maidsRooms;	
				
		
			//Method for the House subclass only  
				public void gardenSize  () {
				System.out.println ("ONLY HOUSES REQUIRE A GARDEN SIZE");
				}
}

	class officePark  extends  building {

		//the House class has 5 additional attributes 
	
			boolean underGroundparking;
			int parkingBays;
			int restRooms;
			int boardRooms;	
			
	
		//Method for the officePark subclass only  
			public void officeSpaceDesign  () {
			System.out.println ("only offices require office space design");
		}
 }
	
	
	class shoppingMall  extends  building {

		//the House class has 5 additional attributes 
	
			boolean underGroundparking;
			int parkingBays;
			int restRooms;
			int nbrShops;	
			
	
		//Method for the officePark subclass only  
			public void electricityUsePerShop () {
			System.out.println ("shopping malls require electricity use per shop”");
		}
 }
