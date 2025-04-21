package pluralsight.com;


//To make this work, you need to create a class named Dice and add a method
// named roll() that generates a random number between 1 and 6. You can
//generate a random number within a range using the following algorithm:
//int randomNumber = (int)(Math.random() * maxValue) + minValue

public class Dice {
  public int roll() {
      int randomNumber = (int)(Math.random() * 6) + 1;
      return randomNumber;

    }
}