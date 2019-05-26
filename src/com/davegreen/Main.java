package com.davegreen;

public class Main
{

    public static void main(String[] args)
    {
        boolean gameOver = true;
        int score = 800;
        int levelCompleted = 5;
        int bonus = 100;

        //maths1();

        //maths2();

        int highScorePosition = calculateHighScorePosition(1500);
        displayHighScorePosition("David", highScorePosition);

        highScorePosition = calculateHighScorePosition(900);
        displayHighScorePosition("Scott", highScorePosition);

        highScorePosition = calculateHighScorePosition(400);
        displayHighScorePosition("James", highScorePosition);

        highScorePosition = calculateHighScorePosition(50);
        displayHighScorePosition("Ally", highScorePosition);

        // Example of a logic hole, where if the data entered is exactly one of the amounts defined in the
        // calculateHighScorePosition method if statement then it inaccurately and falsely returns 4
        // to fix this i simply added a >= sign in place of just the > sign alone within the if statement parameters.

        highScorePosition = calculateHighScorePosition(1000);
        displayHighScorePosition("Peter", highScorePosition);



        int highScore = calculateScore(true, 800, 5, 100); // Can use hard coded numbers (variable values)
        System.out.println("Your final score was " + highScore);                                // or the variable names (see below) to set the method arguments
                                                                                                // so long as they match the parameters.

        score = 10000;
        levelCompleted = 8;
        bonus = 200;

        highScore = calculateScore(gameOver, score, levelCompleted, bonus);
        System.out.println("Your final score was " + highScore);


        // This method uses more memory as we are redefining new variables.

//        if (gameOver)
//        {
//            int newScore = score + 9200;
//            int newLevelCompleted = levelCompleted + 3;
//            int newBonus = bonus * 2;
//            int newFinalScore = newScore + (newLevelCompleted * newBonus);
//            System.out.println("Your new final score was " + newFinalScore);
//        }

        // This method does not use as much memory as we are reusing the original variables
        // however we are still redefining them to new values.

//        if (gameOver)
//        {
//            score = score + 10000;
//            levelCompleted = levelCompleted + 5;
//            bonus = bonus * 4;
//            int finalScore = score + (levelCompleted * bonus);
//            System.out.println("Your newest final score was " + finalScore);
//        }

        // This reuses the original variables outside the code block, however also redefines them as per the lesson.
//        score = 10000;
//        levelCompleted = 8;
//        bonus = 200;
//
//        if (gameOver == true) // Can also be written as, if (gameOver), will still check if true, see if statement below.
//        {
//            int finalScore = score + (levelCompleted * bonus);
//            System.out.println("Your final score was " + finalScore);
//        }
    }
    // Returns nothing due to the void statement.

//    public static void calculateScore(boolean gameOver, int score, int levelCompleted, int bonus) // Method parameters, these must tie in and directly relate to the method arguments
//    {                                                                                             // that are defined when calling the method.
//        if (gameOver == true) // Can also be written as, if (gameOver), will still check if true, see if statement above.
//        {
//            int finalScore = score + (levelCompleted * bonus);
//            finalScore += 2000;
//            System.out.println("Your final score was " + finalScore);
//        }
//    }

    // Returns an int value.

    public static int calculateScore(boolean gameOver, int score, int levelCompleted, int bonus) // Method parameters, these must tie in and directly relate to the method arguments
    {                                                                                            // that are defined when calling the method.

        if (gameOver) // Can also be written as, if (gameOver), will still check if true, see if statement above.
        {
            int finalScore = score + (levelCompleted * bonus);
            finalScore += 2000;
            return finalScore;
        }
        else
        {
            return -1;
        }
    }

//    //Return statement practice!!
//
//    public static void maths1()
//    {
//        int firstNum = 5;
//        int secondNum = 10;
//        int thirdNum = maths2();
//
//        System.out.println(firstNum + secondNum + thirdNum);
//    }
//
//    public static int maths2()
//    {
//        int firstNum = 2;
//        int secondNum = 10;
//
//        return firstNum * secondNum;
//    }

    // Challenge

    public static void displayHighScorePosition(String playersName, int highScorePosition)
    {
        System.out.println(playersName + " you managed to get into position number " + highScorePosition + " on the high score table ");
    }

    public static int calculateHighScorePosition(int playerScore)
    {
        if (playerScore >= 1000)
        {
            return 1;
        }
        else if (playerScore >= 500 && playerScore < 1000)
        {
            return 2;
        }
        else if (playerScore >= 100 && playerScore < 500)
        {
            return 3;
        }
        else
        {
            return 4;
        }
    }

}