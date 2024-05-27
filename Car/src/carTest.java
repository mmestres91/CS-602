//*****************************************************************************************************************************************
//   
//	carTest.java			Author: Mark Mestres
//
//  Design a Java program that has a class called Car that contains instance data that represents the make, model, and year of the car.
//
//*****************************************************************************************************************************************

public class carTest {
    public static void main(String[] args) {
    	//Create a driver class called CarTest, whose main method instantiates and updates four Car objects. Print the car descriptions for all the objects using the toString method. 
        car car1 = new car("Ford", "Mustang", 1965);
        car car2 = new car("Chevrolet", "Camaro", 1990);
        car car3 = new car("Toyota", "Corolla", 2005);
        car car4 = new car("Honda", "Civic", 2010);

        System.out.println("Car descriptions:");
        System.out.println(car1);
        System.out.println(car2);
        System.out.println(car3);
        System.out.println(car4);

        car1.setMake("Ford Updated");
        car2.setModel("Camaro Updated");
        car3.setYear(2015);
        car4.setYear(1980);

        System.out.println("\nUpdated car descriptions:");
        System.out.println(car1);
        System.out.println(car2);
        System.out.println(car3);
        System.out.println(car4);

		//Show use of getter and setter methods and print the objects again using toString method. For the current year (2024) check if the car objects created are antique or not and print a message in either case.    
        int currentYear = 2024;
        System.out.println("\nAntique status:");
        System.out.println(car1 + " is antique? " + car1.isAntique(currentYear));
        System.out.println(car2 + " is antique? " + car2.isAntique(currentYear));
        System.out.println(car3 + " is antique? " + car3.isAntique(currentYear));
        System.out.println(car4 + " is antique? " + car4.isAntique(currentYear));
    }
}
