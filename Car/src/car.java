//*****************************************************************************************************************************************
//   
//	car.java			Author: Mark Mestres
//
//  Design a Java program that has a class called Car that contains instance data that represents the make, model, and year of the car.
//
//*****************************************************************************************************************************************



public class car {
    private String make;
    private String model;
    private int year;

	//Define the car constructor to initialize these values.
    public car(String make, String model, int year) {
        this.make = make;
        this.model = model;
        this.year = year;
    }

	//Include getter and setter methods for all instance data, 
    public String getMake() {
        return make;
    }

    public void setMake(String make) {
        this.make = make;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    // and a toString method that returns a one-line description of the car.
    @Override
    public String toString() {
        return "Car [Make=" + make + ", Model=" + model + ", Year=" + year + "]";
    }

	//Add a method called isAntique that takes current year as a parameter and returns a Boolean indicating if the car is antique (if it is more than 45 years old). 
    public boolean isAntique(int currentYear) {
        return (currentYear - this.year) > 45;
    }
}

