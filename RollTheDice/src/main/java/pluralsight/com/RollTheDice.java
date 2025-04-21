package pluralsight.com;

//You will program the application will roll a pair of dice 20 times. Display the
//value of the two dice each time they are rolled. Count how many times the
//numbers 2, 4, 6 and 7 are rolled and display the result

public class RollTheDice {
    public static void main(String[] args) {
//        Create an instance of Dice named dice.
        Dice dice = new Dice();
       int roll1;
       int roll2;
       int sum;
       int roll3 = 6;
       int roll4 = 7;

//         Also create integer variables for
//        roll1, roll2, and four different counters for the number of times 2, 4, 6
//        and 7 are rolle
        int twoTimes = 0;
        int fourTimes = 0;
        int sixTimes = 0;
        int sevenTimes = 0;

//        2. Create a loop that executes 100 times.
//        3. Within the loop, call your dice's roll() method two times:
//        roll1 = dice.roll();
//        roll2 = dice.roll();

                for(int i = 1; i <=100; i++){
                    roll1 = dice.roll();
                    roll2 = dice.roll();
                    sum = roll1 + roll2;

//                    Print the value of each roll of the dice formatted like this:
//                    Roll 1: 4 - 6 Sum: 10
                    System.out.println("Roll" + i + " : " + roll1 +  "-" + roll2 +  "Sum:"  + sum );

//
//                    5. Determine if the sum of roll1 and roll2 is 2, and if so increment the twoCounter.
//                    6. Determine if the sum of roll1 and roll2 is 4, and if so increment the fourCounter.
//                    7. Determine if the sum of roll1 and roll2 is 6, and if so increment the sixCounter.
//                    8. Determine if the sum of roll1 and roll2 is 7, and if so increment the sevenCounter
                    if (sum == 2) {
                        twoTimes = twoTimes + 1;
                    }
                    else if(sum == 4) {
                        fourTimes = fourTimes + 1;

                    } else if (sum == 6) {
                        sixTimes = sixTimes + 1;

                    }
                    else if(sum == 7) {
                        sevenTimes = sevenTimes + 1;
                    }

                }
//        When the loop terminates, display your counters

        System.out.println("Number of times 2 was rolled: " + twoTimes);
        System.out.println("Number of times 4 was rolled: " + fourTimes);
        System.out.println("Number of times 6 was rolled: " + sixTimes);
        System.out.println("Number of times 7 was rolled: " + sevenTimes);
    }
}


