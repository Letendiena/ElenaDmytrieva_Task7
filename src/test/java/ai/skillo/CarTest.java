package ai.skillo;

import static ai.skillo.Car.method1;

import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class CarTest {

  Car car;

  public CarTest() {
  }

  @BeforeClass(
      description = "Set car configurations"
  )
  public void setUp() {
    System.out.println("Initializing the Car");
    this.car = new Car("Jo", 1, true, 50);
  }

  @Test(enabled = false, description = "Test for checking name")
  public void verifyThatNameIsMatching() {
    String text = "Jo";
    String writtenText = this.car.write(text);
    Assert.assertEquals(writtenText, text, "Name adding function is not equal to expected");
  }

  @Test(description = "Test for verify SetName Method", priority = 2)
  public void verifySetNameMethod() {
    String newName = "Jo";
    String passengerName = this.car.setName(newName);
    Assert.assertEquals(newName, passengerName, "Set name function is not working as expected");
  }

  @Test(
      description = "Test for verify GetName Method",
      dependsOnMethods = {"verifySetNameMethod"}
  )
  public void verifyGetNameMethod() {
    String newName1 = "Jo";
    String passengerName1 = this.car.getName(newName1);
    Assert.assertEquals(newName1, passengerName1, "Get name function is not working as expected");
  }

  @Test(
      description = "Test for verify Set number of passengers Method", alwaysRun = true
  )
  public void verifySetNumberOfPassengers() {
    int passengersNumber = 2;
    int numberPassengers = this.car.setNumberOfPassengers(passengersNumber);
    Assert.assertEquals(passengersNumber, numberPassengers,
        "Set NumberOfPassengers function is not working as expected");
  }

  @Test(
      description = "Test for verify Get number of passengers Method"
  )
  public void verifyGetNumberOfPassengers() {
    int passengersNumber1 = 2;
    int numberPassengers1 = this.car.getNumberOfPassengers(passengersNumber1);
    Assert.assertEquals(passengersNumber1, numberPassengers1,
        "Get NumberOfPassengers function is not working as expected");
  }

  @Test(description = "Test that verify that car is running")
  public void verifyCarIsRunning() {
    Assert.assertTrue(this.car.getIsRunning(), "Current car is not running");
  }

  @Test(description = "Test for verify SetMileage Method")
  public void verifySetMileage() {
    int mileageInfo = 20;
    int mileageCar = this.car.setMileage(mileageInfo);
    Assert.assertEquals(mileageInfo, mileageCar, "SetMileage function is not working as expected");
  }

  @Test(description = "Test for verify GetMileage Method")
  public void verifyGetMileage() {
    int mileageInfo1 = 20;
    int mileageCar1 = this.car.getMileage(mileageInfo1);
    Assert
        .assertEquals(mileageInfo1, mileageCar1, "GetMileage  function is not working as expected");
  }

  @Test(expectedExceptions = {Exception.class})
  public void ecxeptionTest() throws Exception {
    method1();
  }

  @Test(description = "Adding numberOfPassenger")
  public void addingNumberOfPassenger() {
    int numberOfPassengers = 1;
    numberOfPassengers++;
    Assert.assertEquals(numberOfPassengers, 2,
        "Adding number of passengers function is not working as expected");
  }

  @Test(description = "Discending numberOfPassenger")
  public void discendingNumberOfPassenger() {
    int numberOfPassengers = 2;
    numberOfPassengers--;
    Assert.assertEquals(numberOfPassengers, 1,
        "Discending number of passengers function is not working as expected");
  }

  @AfterClass(description = "Destroying the car")
  public void tearDown() {
    System.out.println("Destroying our Car");
    this.car = null;
  }
}