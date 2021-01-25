/*Faculty Training Institute (FTI)
* Module 3,UNIT 3
*Formative Assessment 2 Activity 2.1  Implementing Inheritance in Java */

package application;
public class NewOfficePark {
	
		 public static void main (String[] args) {
		 officePark NewOfficePark = new officePark (); 
		 NewOfficePark.size = 100; 
		 NewOfficePark.multiStorey = false;
		 NewOfficePark.nrWindows = 500;
		 NewOfficePark.nrDoors = 200;
		 NewOfficePark.roofType = "steel";
		 NewOfficePark.underGroundparking = false;
		 NewOfficePark.parkingBays = 100;
		 NewOfficePark.restRooms = 10;
		 NewOfficePark.boardRooms = 3;
		 
		 System.out.println ("NewOfficePark Specifications: ");
		 System.out.println ("Size: "+ NewOfficePark.size + " square meters");
		 System.out.println ("Has Multistorey: "+  NewOfficePark.multiStorey);
		 System.out.println ("Nr of Windows: "+ NewOfficePark.nrWindows);
		 System.out.println ("Type of doors: "+ NewOfficePark.nrDoors);
		 System.out.println ("type of roof:  "+ NewOfficePark.roofType);
		 System.out.println ("Has underground parking: "+  NewOfficePark.underGroundparking);
		 System.out.println ("Nr. of parking bays  : "+ NewOfficePark.parkingBays );
		 System.out.println ("Nr. of rest rooms: "+  NewOfficePark.restRooms);
		 System.out.println ("Nr. of boardrooms  "+  NewOfficePark.boardRooms );
		 
		 NewOfficePark.waterConsumption();
		 NewOfficePark.electrictyUse();
		 NewOfficePark.officeSpaceDesign();
	}
	}