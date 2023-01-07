//Food Counter

import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int choice, burgerOrder, hotdogOrder, drinkOrder;
        double firstTotal = 0, secondTotal = 0, spiceTotal, cupSize;

        do {

            //First Menu
            System.out.println("Product List: ");
            System.out.println("[1] Burger");
            System.out.println("[2] Hotdog");
            System.out.println("[3] Beverages");
            System.out.println("[4] Check out");
            System.out.println("[5] Check total");
            System.out.println("[6] Exit");

            //Burger
            choice = sc.nextInt();
            if (choice > 6 || choice < 1)
                System.out.println("Invalid Choice");
            if (choice == 1){
                System.out.println("Patty: ");
                System.out.println("[1] Single Patty      26.0");
                System.out.println("[2] Double Patty      34.0");
                System.out.println("[3] Chicken Patty     28.0");

                //Patty
                burgerOrder = sc.nextInt();
                if (burgerOrder == 1){
                    System.out.println("Single Patty");
                    firstTotal += 26.0;
                    System.out.println("Spicy");
                    System.out.println("Not Spicy");

                    spiceTotal = sc.nextInt();

                    if (spiceTotal == 1){
                        System.out.println("Single Patty, Spicy");

                        double multiOrder;
                        firstTotal += 4;
                        System.out.println("How Many?");

                        multiOrder = sc.nextDouble();

                        secondTotal = firstTotal * multiOrder;
                        System.out.println(multiOrder + " Single Patty, Spicy");
                    }else if (spiceTotal == 2){
                        System.out.println("Single Patty, Not Spicy");
                        firstTotal += 4;
                        System.out.println("How Many?");

                        double multiOrder;
                        firstTotal += 4;
                        multiOrder = sc.nextDouble();
                        secondTotal = firstTotal * multiOrder;
                        System.out.println(multiOrder + " Single Patty, Not Spicy");
                    }

                }else if (burgerOrder == 2){
                    System.out.println("Double Patty");
                    firstTotal += 26.0;
                    System.out.println("Spicy");
                    System.out.println("Not Spicy");

                    spiceTotal = sc.nextInt();

                    if (spiceTotal == 1){
                        System.out.println("Double Patty, Spicy");

                        double multiOrder;
                        firstTotal += 4;
                        System.out.println("How Many?");

                        multiOrder = sc.nextDouble();

                        secondTotal = firstTotal * multiOrder;
                        System.out.println(multiOrder + " Double Patty, Spicy");
                    }else if (spiceTotal == 2){
                        System.out.println("Double Patty, Not Spicy");
                        firstTotal += 4;
                        System.out.println("How Many?");

                        double multiOrder;
                        firstTotal += 4;
                        multiOrder = sc.nextDouble();
                        secondTotal = firstTotal * multiOrder;
                        System.out.println(multiOrder + " Double Patty, Not Spicy");
                    }
                }else if (burgerOrder == 3){
                    System.out.println("Chicken Patty");
                    firstTotal += 28.0;
                    System.out.println("Spicy");
                    System.out.println("Not Spicy");

                    spiceTotal = sc.nextInt();

                    if (spiceTotal == 1){
                        System.out.println("Chicken Patty, Spicy");

                        double multiOrder;
                        firstTotal += 4;
                        System.out.println("How Many?");

                        multiOrder = sc.nextDouble();

                        secondTotal = firstTotal * multiOrder;
                        System.out.println(multiOrder + " Chicken Patty, Spicy");
                    }else if (spiceTotal == 2){
                        System.out.println("Chicken Patty, Not Spicy");
                        firstTotal += 4;
                        System.out.println("How Many?");

                        double multiOrder;
                        firstTotal += 4;
                        multiOrder = sc.nextDouble();
                        secondTotal = firstTotal * multiOrder;
                        System.out.println(multiOrder + " Chicken Patty, Not Spicy");
                    }
                }

                }if (choice == 2){
                System.out.println("Hotdog");
                System.out.println("[1] Original    28.0");
                System.out.println("[2] Chicken    32.0");
                System.out.println("[3] Footlong    36.0");

                hotdogOrder = sc.nextInt();

                if(hotdogOrder == 1){
                    System.out.println("Original Hotdog Sandwich");
                    firstTotal += 28.0;

                    System.out.println("Spicy");
                    System.out.println("Not Spicy");

                    spiceTotal = sc.nextInt();
                    if (spiceTotal == 1){
                        System.out.println("Original Hotdog Sandwich, Spicy");

                        double multiOrder;
                        firstTotal += 4;
                        System.out.println("How Many?");

                        multiOrder = sc.nextDouble();

                        secondTotal = firstTotal * multiOrder;
                        System.out.println(multiOrder + " Original Hotdog Sandwich, Spicy");
                    }else if (spiceTotal == 2){
                        System.out.println("Original Hotdog Sandwich, Not Spicy");
                        firstTotal += 4;
                        System.out.println("How Many?");

                        double multiOrder;
                        firstTotal += 4;
                        multiOrder = sc.nextDouble();
                        secondTotal = firstTotal * multiOrder;
                        System.out.println(multiOrder + " Original Hotdog Sandwich, Not Spicy");
                    }

                }if(hotdogOrder == 2) {
                    System.out.println("Chicken Hotdog Sandwich");
                    firstTotal += 28.0;

                    System.out.println("Spicy");
                    System.out.println("Not Spicy");

                    spiceTotal = sc.nextInt();
                    if (spiceTotal == 1) {
                        System.out.println("Chicken Hotdog Sandwich, Spicy");

                        double multiOrder;
                        firstTotal += 4;
                        System.out.println("How Many?");

                        multiOrder = sc.nextDouble();

                        secondTotal = firstTotal * multiOrder;
                        System.out.println(multiOrder + " Chicken Hotdog Sandwich, Spicy");
                    } else if (spiceTotal == 2) {
                        System.out.println("Chicken Hotdog Sandwich, Not Spicy");
                        firstTotal += 4;
                        System.out.println("How Many?");

                        double multiOrder;
                        firstTotal += 4;
                        multiOrder = sc.nextDouble();
                        secondTotal = firstTotal * multiOrder;
                        System.out.println(multiOrder + " Chicken Hotdog Sandwich, Not Spicy");
                    }
                }if(hotdogOrder == 3) {
                    System.out.println("Footlong");
                    firstTotal += 28.0;

                    System.out.println("Spicy");
                    System.out.println("Not Spicy");

                    spiceTotal = sc.nextInt();
                    if (spiceTotal == 1) {
                        System.out.println("Footlong, Spicy");

                        double multiOrder;
                        firstTotal += 4;
                        System.out.println("How Many?");

                        multiOrder = sc.nextDouble();

                        secondTotal = firstTotal * multiOrder;
                        System.out.println(multiOrder + " Footlong, Spicy");
                    } else if (spiceTotal == 2) {
                        System.out.println("Footlong, Not Spicy");
                        firstTotal += 4;
                        System.out.println("How Many?");

                        double multiOrder;
                        firstTotal += 4;
                        multiOrder = sc.nextDouble();
                        secondTotal = firstTotal * multiOrder;
                        System.out.println(multiOrder + " Footlong, Not Spicy");
                    }
                }

                }if (choice == 3){
                System.out.println("Drinks");
                System.out.println("[1] Coke            25.0");
                System.out.println("[2] Sprite          25.0");
                System.out.println("[3] Iced Tea        20.0");
                System.out.println("[4] Orange Juice    20.0");

                drinkOrder = sc.nextInt();
                if (drinkOrder == 1){
                    firstTotal += 25.0;
                    System.out.println("[1] Small");
                    System.out.println("[2] Medium");
                    System.out.println("[3] Large");

                    cupSize = sc.nextDouble();
                    if (cupSize == 1){
                        double multiOrder;
                        firstTotal += 0;
                        System.out.println("How Many");
                        multiOrder = sc.nextDouble();
                        System.out.println(multiOrder + " Coke Small");
                        secondTotal = firstTotal * multiOrder;
                    }else if (cupSize == 2){
                        double multiOrder;
                        firstTotal += 6;
                        System.out.println("How Many");
                        multiOrder = sc.nextDouble();
                        System.out.println(multiOrder + " Coke Medium");
                        secondTotal = firstTotal * multiOrder;
                    }else if (cupSize == 3){
                        double multiOrder;
                        firstTotal += 12;
                        System.out.println("How Many");
                        multiOrder = sc.nextDouble();
                        System.out.println(multiOrder + " Coke Large");
                        secondTotal = firstTotal * multiOrder;
                    }
                }if (drinkOrder == 2){
                    firstTotal += 25.0;
                    System.out.println("[1] Small");
                    System.out.println("[2] Medium");
                    System.out.println("[3] Large");

                    cupSize = sc.nextDouble();
                    if (cupSize == 1){
                        double multiOrder;
                        firstTotal += 0;
                        System.out.println("How Many");
                        multiOrder = sc.nextDouble();
                        System.out.println(multiOrder + " Sprite Small");
                        secondTotal = firstTotal * multiOrder;
                    }else if (cupSize == 2){
                        double multiOrder;
                        firstTotal += 6;
                        System.out.println("How Many");
                        multiOrder = sc.nextDouble();
                        System.out.println(multiOrder + " Sprite Medium");
                        secondTotal = firstTotal * multiOrder;
                    }else if (cupSize == 3){
                        double multiOrder;
                        firstTotal += 12;
                        System.out.println("How Many");
                        multiOrder = sc.nextDouble();
                        System.out.println(multiOrder + " Sprite Large");
                        secondTotal = firstTotal * multiOrder;
                    }
                }if (drinkOrder == 3){
                    firstTotal += 20.0;
                    System.out.println("[1] Small");
                    System.out.println("[2] Medium");
                    System.out.println("[3] Large");

                    cupSize = sc.nextDouble();
                    if (cupSize == 1){
                        double multiOrder;
                        firstTotal += 0;
                        System.out.println("How Many");
                        multiOrder = sc.nextDouble();
                        System.out.println(multiOrder + " Iced Tea Small");
                        secondTotal = firstTotal * multiOrder;
                    }else if (cupSize == 2){
                        double multiOrder;
                        firstTotal += 6;
                        System.out.println("How Many");
                        multiOrder = sc.nextDouble();
                        System.out.println(multiOrder + " Iced Tea Medium");
                        secondTotal = firstTotal * multiOrder;
                    }else if (cupSize == 3){
                        double multiOrder;
                        firstTotal += 12;
                        System.out.println("How Many");
                        multiOrder = sc.nextDouble();
                        System.out.println(multiOrder + " Iced Tea Large");
                        secondTotal = firstTotal * multiOrder;
                    }
                }if (drinkOrder == 4){
                    firstTotal += 20.0;
                    System.out.println("[1] Small");
                    System.out.println("[2] Medium");
                    System.out.println("[3] Large");

                    cupSize = sc.nextDouble();
                    if (cupSize == 1){
                        double multiOrder;
                        firstTotal += 0;
                        System.out.println("How Many");
                        multiOrder = sc.nextDouble();
                        System.out.println(multiOrder + " Orange Juice Small");
                        secondTotal = firstTotal * multiOrder;
                    }else if (cupSize == 2){
                        double multiOrder;
                        firstTotal += 6;
                        System.out.println("How Many");
                        multiOrder = sc.nextDouble();
                        System.out.println(multiOrder + " Orange Juice Medium");
                        secondTotal = firstTotal * multiOrder;
                    }else if (cupSize == 3){
                        double multiOrder;
                        firstTotal += 12;
                        System.out.println("How Many");
                        multiOrder = sc.nextDouble();
                        System.out.println(multiOrder + " Orange Juice Large");
                        secondTotal = firstTotal * multiOrder;
                    }
                }


            } else if (choice == 4) {
                System.out.print("Total: " + secondTotal);
                System.out.println();
                
            } else if (choice == 5) {
                double payment, change;
                System.out.print("Total: " + secondTotal);
                System.out.println();

                System.out.print("Payment: ");
                payment = sc.nextDouble();
                change = payment - secondTotal;
                System.out.println(change);

            }
        }while (choice !=6);
    }
}