package com.tankbing.packagingdemo.controller;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

/**
 * @author chenbing
 * @since 2018-08-08 11:53
 */
public class Main {
    public static void main(String[] args) {
        Set<String> existSet = new HashSet<>();
        List<String> list = new ArrayList<>();
        list.add("a");
        list.add("b");
        list.add("c");
        list.add("a");
        list.add("b");
        int index = 1;
        for (String name : list) {

            String sheetName = name;
            if (!existSet.add(sheetName)) {
                sheetName = sheetName + "（" + (index++) + "）";
            }
            System.out.println(sheetName);
        }
    }
}
