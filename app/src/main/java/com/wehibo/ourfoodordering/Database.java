package com.wehibo.ourfoodordering;

import java.util.ArrayList;
import java.util.Arrays;

public class Database {
    
    static ArrayList<Category> categories = new ArrayList<Category>(Arrays.asList(

            new Category("Pasta", R.drawable.pasta_injera),
            new Category("Injera be Wot", R.drawable.grilled_chicken),
            new Category("Vegetable-Firafire", R.drawable.club),
            new Category("Meat-Siga", R.drawable.caesar)


    ));
    static ArrayList<Item> items = new ArrayList<>(Arrays.asList(
//            new Item("Hamburger", "Chicken Burger", "Delicious grilled chicken with lettuce and tomato.", 13.99, R.drawable.grilled_chicken, 0),
//            new Item("Hamburger", "BLT", "Bacon, lettuce and tomato classic.", 12.99, R.drawable.blt, 1),
//            new Item("Hamburger", "Pork", "Grass fed grilled ground pork with bbq sauce and onions.", 16.99, R.drawable.bean, 2),
//            new Item("Hamburger", "Cheese", "Three cheese burger melted on grill with mushrooms and beef patty.", 15.87, R.drawable.cheese, 3),
//            new Item("Pasta", "Fettuccine", "Traditional fettuccine with alfredo sauce, parmesan and cracked pepper.", 12.65, R.drawable.fettuccine, 4),
//            new Item("Pasta", "Lasagna", "All dressed lasagna with mushrooms, peppers, marinara sauce and cheese.", 17.35, R.drawable.cheese, 5),
//            new Item("Pasta", "Primavera", "Classic italian dish with all the toppings.", 15.34, R.drawable.club, 6),
//            new Item("Pasta", "Carrettiera", "Sicilian Alla Carrettiera spaghetti with tomatoes and parmesan.", 14.32, R.drawable.alla_carrettiera, 7),
//            new Item("Salad", "Greek", "Feta, greek olives, basil and romaine lettuce.", 12.30, R.drawable.greek, 8),
//            new Item("Salad", "Caesar", "Whole wheat croutons, classic caesar sauce, parmesan and romaine.", 14.21, R.drawable.caesar, 9),
//            new Item("Salad", "Broccoli", "Fresh broccoli with creamy sauce, bacon bits and parmesan.", 14.99, R.drawable.broccoli, 10),
//            new Item("Salad", "Bean", "Three bean salad with vinaigrette dressing and feta cheese.", 10.99, R.drawable.bean, 11),
//            new Item("Sandwich", "Grilled Cheese", "Classic grilled cheese with optional bacon.", 8.99, R.drawable.grilled_cheese, 12),
//            new Item("Sandwich", "Sub", "All-dressed sub with ranch sauce.", 10.99, R.drawable.cheese, 13),
//            new Item("Sandwich", "Smoked Meat", "House smoked meat with rye bread, dijon mustard and homemade pickles.", 10.99, R.drawable.cheese, 14),
//            new Item("Sandwich", "Club", "Fresh bread with bacon, turkey, lettuce and mayo.", 8.99, R.drawable.club, 15)
            new Item("Injera", "Beyaynet", "Delicious grilled chicken with lettuce and tomato.", 13.99, R.drawable.injera_beyaynet, 0),
            new Item("Injera", "Shiro Wot", "Bacon, lettuce and tomato classic.", 12.99, R.drawable.injera_shirowot, 1),
            new Item("Injera", "Kik Wot", "Grass fed grilled ground pork with bbq sauce and onions.", 16.99, R.drawable.injera_kikwot, 2),
            new Item("Injera", "Misir Wot", "Three cheese burger melted on grill with mushrooms and beef patty.", 15.87, R.drawable.injera_misirwot, 3),

            new Item("Pasta", "Pasta be Atikilti", "Traditional fettuccine with alfredo sauce, parmesan and cracked pepper.", 12.65, R.drawable.pasta_atkilt, 4),
            new Item("Pasta", "Pasta be Dabbo", "All dressed lasagna with mushrooms, peppers, marinara sauce and cheese.", 17.35, R.drawable.pasta_dabbo, 5),
            new Item("Pasta", "Pasta be Injera", "Classic italian dish with all the toppings.", 15.34, R.drawable.pasta_injera, 6),
            new Item("Pasta", "Pasta be Siga", "Sicilian Alla Carrettiera spaghetti with tomatoes and parmesan.", 14.32, R.drawable.pasta_siga, 7),

            new Item("Vegetable", "Banana-Muz", "Feta, greek olives, basil and romaine lettuce.", 12.30, R.drawable.vegetable_banana, 8),
            new Item("Vegetable", "Mango", "Whole wheat croutons, classic caesar sauce, parmesan and romaine.", 14.21, R.drawable.vegetable_mango, 9),
            new Item("Vegetable", "Orange-Burtikuan", "Fresh broccoli with creamy sauce, bacon bits and parmesan.", 14.99, R.drawable.vegetable_orange, 10),
            new Item("Vegetable", "Papaya", "Three bean salad with vinaigrette dressing and feta cheese.", 10.99, R.drawable.vegetable_papaya, 11),

            new Item("Meat", "Kikil", "Classic grilled cheese with optional bacon.", 8.99, R.drawable.meat_kikil, 12),
            new Item("Meat", "Kitfo", "All-dressed sub with ranch sauce.", 10.99, R.drawable.meat_kitfo, 13),
            new Item("Meat", "Siga Wot", "House smoked meat with rye bread, dijon mustard and homemade pickles.", 10.99, R.drawable.meat_sigawot, 14),
            new Item("Meat", "Tire Siga", "Fresh bread with bacon, turkey, lettuce and mayo.", 8.99, R.drawable.meat_tiresiga, 15)
    ));
    
    public ArrayList<Item> getItems() {
        
        return items;
    }
    
    public void setItems(ArrayList<Item> items) {
        
        this.items = items;
    }
    
}

