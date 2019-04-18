package com.Mercieeeeee.many;

import java.sql.SQLOutput;
import java.util.*;

public class Tester {
    public static void main(String[] args) {
        HashMap<String, String> stocks = new HashMap<>();
        stocks.put("2330", "台積電");
        stocks.put("2317", "鴻海");
        System.out.println(stocks);
        stocks.put("2330", "TSMC");
        System.out.println(stocks);
        System.out.println(stocks.get("2330"));
        for (String key : stocks.keySet()) {
            System.out.println(stocks.get(key));
        }

//        set();
//        List();
//        arrayTest();
    }

    private static void set() {
        //set
        HashSet<Integer> set = new HashSet<>();
        set.add(6);
        set.add(7);
        set.add(1);
        set.add(8);
        set.add(7);
        System.out.println(set);
        for (int n : set) {
            System.out.println(n);
        }
    }

    private static void List() {
        ArrayList list1 = new ArrayList();
        list1.add(5);
        list1.add(3);
        list1.add("abc");
        list1.add(true);
        System.out.println(list1);
        int n1 = (int)list1.get(0);
        System.out.println(n1);
        String s1 = (String)list1.get(2);
        System.out.println(s1);
//        String s' = (String)list.get(1);
        ArrayList<Integer> list2 = new ArrayList();
        list2.add(5);
        list2.add(3);
        list2.add(1);
        list2.add(7);
        list2.add(1);
        System.out.println(list2);
        int n2 = (int)list2.get(0);
        System.out.println(n2);
        int s2 = list2.get(2);
        System.out.println(s2);
        System.out.println("目前有" + list2.size() + "個資料");
        list2.add(7);
        System.out.println("目前有" + list2.size() + "個資料");
        List<Integer> scores = Arrays.asList(68, 88, 77, 99, 50);
        for (int score: scores) {
            System.out.println(score);
        }
    }

    private static void arrayTest() {
        int[] numbers = new int[5];
        numbers[0] = 5;
        numbers[4] = 3;
//        numbers[5] = 7;
        int[] scores = {68, 88, 77, 99, 50};
        System.out.println(scores);
        for (int i=0; i<5; i++) {
            System.out.println(scores[i]);
        }
        for (int n : scores) {
            System.out.println(n);
        }
    }
}