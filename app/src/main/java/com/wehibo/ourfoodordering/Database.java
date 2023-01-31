package com.wehibo.ourfoodordering;

import java.util.ArrayList;
import java.util.Arrays;

public class Database {
    
    static ArrayList<Category> categories = new ArrayList<Category>(Arrays.asList(

            new Category("Injera", R.drawable.injera_beyaynet),
            new Category("Pasta", R.drawable.pasta_siga),
            new Category("Meat", R.drawable.meat_kitfo),
            new Category("Vegetable", R.drawable.vegetable_orange)



    ));
    static ArrayList<Item> items = new ArrayList<>(Arrays.asList(


            new Item("Injera", "Beyaynet", "Beyaynet is a collection of shiro,gomen,misir,denech and others in one place .", 40, R.drawable.injera_beyaynet, 0),
            new Item("Injera", "Shiro Wot", "Shiro also called Dokke it is most popular food in ethiopha ", 45, R.drawable.injera_shirowot, 1),
            new Item("Injera", "Kik Wot", "Kik is a food that is prepared from kik.", 35, R.drawable.injera_kikwot, 2),
            new Item("Injera", "Misir Wot", "Misir is a a delicious food and it is better than shiro .", 50, R.drawable.injera_misirwot, 3),

            new Item("Pasta", "Pasta be Atikilti", "Pasta be Atikilti it is combination of pasta and atakilte.", 60, R.drawable.pasta_atkilt, 4),
            new Item("Pasta", "Pasta be Dabbo", "Pasta be Dabbo is pasta with bread.", 40, R.drawable.pasta_dabbo, 5),
            new Item("Pasta", "Pasta be Injera", "Pasta be Injera it is combination of pasta in injera", 45, R.drawable.pasta_injera, 6),
            new Item("Pasta", "Pasta be Siga", "Pasta be Siga It is a delicious food that is prepared from pasta and meat.", 65, R.drawable.pasta_siga, 7),

            new Item("Vegetable", "Banana-Muz", "Banana is a fruit that have many benifits .", 30, R.drawable.vegetable_banana, 8),
            new Item("Vegetable", "Mango", "Mango is is a fruit that have many benifits .", 35, R.drawable.vegetable_mango, 9),
            new Item("Vegetable", "Orange-Burtikuan", "orange is  fruit that provides with Vitamin c .", 50, R.drawable.vegetable_orange, 10),
            new Item("Vegetable", "Papaya", "Papaya is one of my favorite food .", 70, R.drawable.vegetable_papaya, 11),

            new Item("Meat", "Kikil", "Kikil is afood that is prepared from meat and it is full of Water .", 90, R.drawable.meat_kikil, 12),
            new Item("Meat", "Kitfo", "Kitfo is a Gurages cultureal food  .", 200, R.drawable.meat_kitfo, 13),
            new Item("Meat", "Siga Wot", " Siga Wot is Wot prepared from meat.", 120, R.drawable.meat_sigawot, 14),
            new Item("Meat", "Tire Siga", "Tire Siga is raw meat eaten with Awaze.", 150, R.drawable.meat_tiresiga, 15)
    ));
    
    public ArrayList<Item> getItems() {
        
        return items;
    }
    
    public void setItems(ArrayList<Item> items) {
        
        this.items = items;
    }
    
}

