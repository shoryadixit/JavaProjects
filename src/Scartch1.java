//This is Execution class

public class Scartch1 {
    public static void main(String[] args) {

        Car tataNano = new Car();
        tataNano.ApplyDiscount();

        // In this below line 'audi' is the object of class Car
        //whose help to give the values.
        //same think we do with tataNano onject.

        Car audi = new Car();

        //Now enter the values of the car object

        audi.CarName = "Audi X1";
        audi.carRegistrationNumber = "UP 14 DF 2850";
        audi.carMileage = 30.5;
        audi.carColour = "Red";
        //This line is used to print something
        System.out.println(audi.ApplyDiscount());
    }
}

//Rule 1 : Name of the class should always start with a capital letter
//Rule 2 : A class should define only one thing or (Object)
//This is definition class

class Car{
    //These are fields
    private float  carPrice = 10_00_000.0f;
    String CarName;
    String carRegistrationNumber;
    double carMileage;
    String carColour;


    //This is called methods

    float ApplyDiscount(){
        carPrice = carPrice * (20 / 100.0f);
        return carPrice;
    }

}

/*

* C Programming Language = ANSI / ISO - camelcase for variables
* Python Programming Language = PEP8 - snake_case for variables
* Java Programming Language = JEP - camel_Case for variables
*
*Create a variable for the roll number of student.
* 1. camelCase for variables and methods JAVA
*       rollnNumberOfStudent / carName / bookName / employeeSalaryAmount
*      ( used for naming variables and methods )
* snake_case
*       roll_number_Of_student
*
* 2. pascalcase for name of classes JAVA
*       RollNumberOfStudent / Employee / Car / Mobile
*      ( used for naming classes )
*
* 3. SCREAM_CASE for name of constants JAVA
*       ROLL_NUMBER_OF_STUDENT / CAR_MILEAGE / EMPLOYEE_ID
*      ( used for naming contants )
 */
class mobile{
    //this private is help to you cannot write this value
    private double mobilePrice;
    //By encapsulation Data Hiding can be done

    //this type of function is used to acces the value of private
    //or you can get the mobile price or not to change the price
    public double getMobilePrice() {
        return mobilePrice;
    }
    //by this method you can write the private values
    public void setMobilePrice(double mobilePrice) {
        this.mobilePrice = mobilePrice;
    }
}