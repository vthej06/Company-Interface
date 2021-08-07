import java.util.Scanner;
public class HomecookedInterface {
    public static void main(String[] args){ //main method
        Scanner input = new Scanner(System.in);
        int HomeMenuOptions;
        String Inventory_Add = "";
        int Add_Price;
        boolean Loop = true;
        String NewInventory = "";

        while (Loop){ //loops until the user wats to exit the program
            System.out.println("Welcome to Homecooked\u2122. "); //asks if user wants inventory actions of sales actions
            System.out.println("Would you like to ");
            System.out.println("1. View Inventory Actions");
            System.out.println("2. View Sales Actions");
            System.out.println("3. Exit");
            System.out.println("Please enter 1, 2, or 3.");
            HomeMenuOptions = input.nextInt();
            if (HomeMenuOptions == 1){
                NewInventory = Inventory_Actions(); //reroutes to Inventory Actions method
            }

            else if (HomeMenuOptions == 2){
                Sales_Actions(NewInventory); //reroutes to sales actions method
            }
            else if (HomeMenuOptions == 3){
                System.out.println("Thank you for visiting Homecooked\u2122!");
                Logo();
                System.exit(0);
            }
        }


    }

    public static void Inventory(String NewInventory){ //The method for the Inventory


        System.out.println("\n\n1. Home Cook $25 ");

        System.out.println("\n2. Home Cook Delivery $28 ");

        System.out.println("\n3. Live Cook 1 $37 ");

        System.out.println("\n4. Live Cook 2 $45");

        System.out.println("\n5. Interactive $55");

        System.out.println("\n " + NewInventory);
        System.out.println();
    }

    public static void Purchase(String NewInventory){ //The method for purchasing options in the Sales Actions menu
        Scanner input = new Scanner(System.in);
        int Num;
        boolean Loop = true;
        long CardNumber;
        System.out.println("Menu:");
        Inventory(NewInventory);
        System.out.println("Please select the number of your menu item.");
        Num = input.nextInt();
        while (Loop){ //loops until a valid input is entered
            if (Num >= 1 && Num <= 6){
                Loop = false;

            }
            else{
                System.out.println("Please enter a valid input.");
                Num = input.nextInt();
            }
        }
        Loop = true;
        System.out.println("Please enter your 16-digit credit card number.");
        CardNumber = input.nextLong();
        while (Loop){ //loops util valid input is entered
            if (CardNumber >= 1000000000000000L && CardNumber <= 9999999999999999L ){
                Loop = false;

            }
            else{
                System.out.println("Please enter a valid input.");
                CardNumber = input.nextLong();
            }
        }
        System.out.println("Your credit card number is " + CardNumber + ".");

    }

    public static void Logo(){ //method for logo
        System.out.println("");
        System.out.println();
        System.out.println();
        System.out.println("                 ~ ~ ~ ~ ~ ~ ~ ~ ~ ~ ~ ~ ~ ~ ~ ~ ~ ~ ~ ~ ~ ~ ~");
        System.out.println("                ~ ~ ~ ~ ~ ~ ~ ~ ~ ~ ~ ~ ~ ~ ~ ~ ~ ~ ~ ~ ~ ~ ~ ~");
        System.out.println("[[[[[[[[[[[[[[[   ||           ||                  *********     ]]]]]]]]]]]]]]]] ");
        System.out.println("[[[[[[[[[[[[[[    ||           ||                **               ]]]]]]]]]]]]]]]");
        System.out.println("[[[[[[[[[[[[[     ||           ||               *                  ]]]]]]]]]]]]]]");
        System.out.println("[[[[[[[[[[[[      ||           ||             **                    ]]]]]]]]]]]]]");
        System.out.println("[[[[[[[[[[[       ||           ||            *                       ]]]]]]]]]]]]");
        System.out.println("[[[[[[[[[[        ||           ||            *                        ]]]]]]]]]]]");
        System.out.println("[[[[[[[[[[        ||***********||            *                         ]]]]]]]]]]");
        System.out.println("[[[[[[[[[[[       ||           ||            *                        ]]]]]]]]]]]");
        System.out.println("[[[[[[[[[[[[      ||           ||             **                     ]]]]]]]]]]]]");
        System.out.println("[[[[[[[[[[[[[     ||           ||               *                   ]]]]]]]]]]]]]");
        System.out.println("[[[[[[[[[[[[[[    ||           ||                **                ]]]]]]]]]]]]]]");
        System.out.println("[[[[[[[[[[[[[[[   ||           ||                  **********     ]]]]]]]]]]]]]]]");
        System.out.println("                 ~ ~ ~ ~ ~ ~ ~ ~ ~ ~ ~ ~ ~ ~ ~ ~ ~ ~ ~ ~ ~ ~ ~ ~ ");
        System.out.println("                  ~ ~ ~ ~ ~ ~ ~ ~ ~ ~ ~ ~ ~ ~ ~ ~ ~ ~ ~ ~ ~ ~ ~");
    }

    public static String Inventory_Actions(){ //method for inventory actions
        Scanner input = new Scanner(System.in);
        int MenuInput = 1;
        String Inventory_Add = "";
        String Add_Price = "";
        String NewInventory = "";
        while (MenuInput != 3){ //loops until user wants t return to main menu
            System.out.println("Would you like to ");
            System.out.println("1. Add 1 Inventory Item");
            System.out.println("2. View Inventory");
            System.out.println("3. Go Back to the Home Page");
            System.out.println("Please enter 1, 2, or 3.");
            MenuInput = input.nextInt();
            if (MenuInput == 1){
                System.out.println("What is the name of the new inventory item?");
                Inventory_Add = input.nextLine();
                Inventory_Add = input.nextLine();
                System.out.println("What is the price?");
                Add_Price = input.nextLine();
                NewInventory = "6. " + Inventory_Add + " $" + Add_Price;
            }
            else if (MenuInput == 2){
                Inventory(NewInventory);
            }

        }

        return NewInventory;
    }

    public static void Sales_Actions(String NewInventory){ //method for sales actions
        Scanner input = new Scanner(System.in);
        int EntryInput = 0;
        while (EntryInput != 3){ //loops until user returns to menu
            System.out.println("Would you like to ");
            System.out.println("1. View Menu");
            System.out.println("2. Purchase Products");
            System.out.println("3. Go Back to the Home Page");
            System.out.println("Please enter 1, 2, or 3.");
            EntryInput = input.nextInt();
            if (EntryInput == 1){
                Inventory(NewInventory);
            }
            else if (EntryInput == 2){
                Purchase(NewInventory);
            }
        }

    }

}
