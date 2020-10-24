package ai.skillo;

public class Car {

  private String name;
  private int numberOfPassengers;
  private Boolean isRunning;
  private int mileage;

  public Car(String name, int numberOfPassengers, Boolean isRunning, int mileage) {
    this.name = name;
    this.numberOfPassengers = numberOfPassengers;
    this.isRunning = isRunning;
    this.mileage = mileage;
  }

  final String DEFOULT_NAME = "John";
  final int DEFOULT_NUMBER_OF_PASSENGERS = 1;
  final int DEFOULT_MILEAGE = 0;

  Car() {
    name = DEFOULT_NAME;
    numberOfPassengers = DEFOULT_NUMBER_OF_PASSENGERS;
    isRunning = true;
    mileage = DEFOULT_MILEAGE;
    numberOfPassengers++;
    numberOfPassengers--;
    mileage = 10;
  }

  public Car(int value) {
    numberOfPassengers = value;
  }
  public void addPassenger(){
    numberOfPassengers++;
  }

  public String write(String text) {
    System.out.println(text);
    return text;
  }

  public String getName(String name) {
    System.out.println(name);
    return name;
  }

  public String setName(String name) {
    this.name = name;
    System.out.println(name);
    return name;
  }

  public int getNumberOfPassengers(int numberOfPassengers) {
    System.out.println(numberOfPassengers);
    return numberOfPassengers;
  }

  public int setNumberOfPassengers(int numberOfPassengers) {
    this.numberOfPassengers = numberOfPassengers;
    System.out.println(numberOfPassengers);
    return numberOfPassengers;
  }

  public Boolean getIsRunning() {
    return isRunning;
  }

  public int getMileage(int mileage) {
    return mileage;
  }

  public int setMileage(int mileage) {
    this.mileage = mileage;
    return mileage;
  }

  public static void method1() throws Exception {
    throw new Exception();
  }

  public int getNumberOfPassengers() {
    return numberOfPassengers;
  }
}

