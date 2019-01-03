package com.codecool.servlet.webshop;

import java.util.ArrayList;
import java.util.List;

public class Itemstore {
    public static List<Item> lisOfItems = new ArrayList<Item>();

    public static void addItem(Item itemToAdd) {
        lisOfItems.add(itemToAdd);
    }

    public static void removeItem(Item itemToRemove) {
        lisOfItems.remove(itemToRemove);
    }
}
