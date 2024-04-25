import java.util.*;
class TextBasedAdventureGame
{
    public static void main(String []args)
    {
        Scanner sc = new Scanner(System.in);
        boolean gameover = false;
        System.out.println("===>> Welcome to the ''Text-Based-Adventure-Game!'' <<===");
        System.out.println("Enter 'Start' to start the Game");
        String start = sc.next();
        if(start.equalsIgnoreCase("Start"))
        {
            System.out.println("You find yourself standing in front of a mysterious cave.");
            while(!gameover)
            {
                boolean gamenotover = true;
                System.out.println("What would you like to do?");
                System.out.println("1. Enter the cave");
                System.out.println("2. Leave");
                System.out.print("Enter your Choice : ");
                int choice = sc.nextInt();
                if(choice == 1)
                {
                    System.out.println("You cautiously enter the cave...");
                    while(gamenotover)
                    {
                        System.out.println("You find two paths inside the cave.");
                        System.out.println("1. Go left");
                        System.out.println("2. Go right");
                        System.out.print("Enter your direction : ");
                        int dir01 = sc.nextInt();
                        if(dir01 == 1)
                        {
                            System.out.println("You choose to go left. The path is closed and you have strucked inside the cave.");
                                System.out.println("You are dead.....Game Over!");
                            break;
                        }
                        else if(dir01 == 2)
                        {
                            System.out.println("You choose to go right. You encounter a dragon!");
                            while(gamenotover)
                            {
                                System.out.println("You have two options :");
                                System.out.println("1. Silently cross the sleeping dragon");
                                System.out.println("2. Fight the dragon");
                                System.out.print("Enter your option : ");
                                int option = sc.nextInt();
                                if(option == 1)
                                {
                                    System.out.println("Dragon noticed you and finished you instantly.");
                                    System.out.println("You are dead.....Game Over!");
                                    gamenotover = false;
                                    break;
                                }
                                else if(option == 2)
                                {
                                    System.out.println("Dragon was defeated.");
                                    System.out.println("Congratulations!.....you won the treasure chest.");
                                    System.out.println("GameOver!");
                                    System.out.println();
                                    System.out.println("If you want to exit, enter 'exit' otherwise enter 'play' or any word or letter to continue to play game again.");
                                    String exit = sc.next();
                                    if(exit.equalsIgnoreCase("Exit"))
                                    {
                                        gameover = true;
                                        gamenotover = false;
                                    }
                                    else
                                    {
                                        gamenotover = false;
                                    }
                                    break;
                                }
                                else
                                {
                                    System.out.println("Invalid choice. Please enter 1 or 2.");
                                }
                            }
                        }
                        else
                        {
                            System.out.println("Invalid choice. Please enter 1 or 2.");
                        }
                    }
                }
                else if(choice == 2)
                {
                    System.out.println("You decide to leave. Goodbye!");
                    System.out.println();
                    System.out.println("If you want to exit, enter 'exit' otherwise enter 'play' or any word or letter to continue to play game again.");
                    String exit = sc.next();
                    if(exit.equalsIgnoreCase("Exit"))
                    {
                        gameover = true;
                    }
                    else
                    {
                        gameover = false;
                    }
                }
                else
                {
                    System.out.println("Invalid choice. Please enter 1 or 2.");
                }
            }
        }
    }
}
