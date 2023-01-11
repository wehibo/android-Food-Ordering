package com.wehibo.ourfoodordering;

import java.util.ArrayList;
import java.util.Arrays;

public class Database {
    
    static ArrayList<Category> categories = new ArrayList<Category>(Arrays.asList(

            new Category("Pasta", R.drawable.pasta_injera),
            new Category("Injera", R.drawable.injera_beyaynet),
            new Category("Meat", R.drawable.meat_tiresiga),
            new Category("Vegetable", R.drawable.vegetable_papaya)



    ));
    static ArrayList<Item> items = new ArrayList<>(Arrays.asList(


            new Item("Injera", "Beyaynet", "Delicious grilled chicken with lettuce and tomato.", 40, R.drawable.injera_beyaynet, 0),
            new Item("Injera", "Shiro Wot", "Bacon, lettuce and tomato classic.", 45, R.drawable.injera_shirowot, 1),
            new Item("Injera", "Kik Wot", "Grass fed grilled ground pork with bbq sauce and onions.", 35, R.drawable.injera_kikwot, 2),
            new Item("Injera", "Misir Wot", "Three cheese burger melted on grill with mushrooms and beef patty.", 50, R.drawable.injera_misirwot, 3),

            new Item("Pasta", "Pasta be Atikilti", "Traditional fettuccine with alfredo sauce, parmesan and cracked pepper.", 60, R.drawable.pasta_atkilt, 4),
            new Item("Pasta", "Pasta be Dabbo", "All dressed lasagna with mushrooms, peppers, marinara sauce and cheese.", 40, R.drawable.pasta_dabbo, 5),
            new Item("Pasta", "Pasta be Injera", "Classic italian dish with all the toppings.", 45, R.drawable.pasta_injera, 6),
            new Item("Pasta", "Pasta be Siga", "Sicilian Alla Carrettiera spaghetti with tomatoes and parmesan.", 65, R.drawable.pasta_siga, 7),

            new Item("Vegetable", "Banana-Muz", "Feta, greek olives, basil and romaine lettuce.", 30, R.drawable.vegetable_banana, 8),
            new Item("Vegetable", "Mango", "Whole wheat croutons, classic caesar sauce, parmesan and romaine.", 35, R.drawable.vegetable_mango, 9),
            new Item("Vegetable", "Orange-Burtikuan", "Fresh broccoli with creamy sauce, bacon bits and parmesan.", 50, R.drawable.vegetable_orange, 10),
            new Item("Vegetable", "Papaya", "Three bean salad with vinaigrette dressing and feta cheese.", 70, R.drawable.vegetable_papaya, 11),

            new Item("Meat", "Kikil", "Classic grilled cheese with optional bacon.", 90, R.drawable.meat_kikil, 12),
            new Item("Meat", "Kitfo", "All-dressed sub with ranch sauce.", 200, R.drawable.meat_kitfo, 13),
            new Item("Meat", "Siga Wot", "House smoked meat with rye bread, dijon mustard and homemade pickles.", 120, R.drawable.meat_sigawot, 14),
            new Item("Meat", "Tire Siga", "Fresh bread with bacon, turkey, lettuce and mayo.", 150, R.drawable.meat_tiresiga, 15)
    ));
    
    public ArrayList<Item> getItems() {
        
        return items;
    }
    
    public void setItems(ArrayList<Item> items) {
        
        this.items = items;
    }
    
}

