/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package collectionexample;

import java.io.FileReader;
import java.util.HashMap;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Scanner;
import java.util.Set;
import java.util.TreeMap;
import java.util.TreeSet;

/**
 *
 * @author Oytun
 */
public class CollectionExample {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        six();

    }

    public static void one() {
        Set<String> uniqueWordSet = new HashSet<String>();
        try (FileReader fr = new FileReader("C:\\Users\\Oytun\\Desktop\\Obss staj\\words.txt"); Scanner sc = new Scanner(fr)) {
            while (sc.hasNext()) {
                uniqueWordSet.add(sc.next());
            }
            System.out.println(uniqueWordSet.size());
        } catch (Exception e) {
        }
    }

    public static void two() {
        Set<String> treeSet = new TreeSet<String>();
        try (FileReader fr = new FileReader("C:\\Users\\Oytun\\Desktop\\Obss staj\\words.txt"); Scanner sc = new Scanner(fr)) {
            while (sc.hasNext()) {
                treeSet.add(sc.next());
            }
            for (String words : treeSet) {
                System.out.println(words);
            }
        } catch (Exception e) {
        }
    }

    public static void three() { //linkedhashset ya da linked hashmap
        Set<String> uniqueWordSet = new LinkedHashSet<String>();
        try (FileReader fr = new FileReader("C:\\Users\\Oytun\\Desktop\\Obss staj\\words.txt"); Scanner sc = new Scanner(fr)) {
            while (sc.hasNext()) {
                uniqueWordSet.add(sc.next());
            }
            for (String words : uniqueWordSet) {
                System.out.println(words);
            }
        } catch (Exception e) {
        }
    }

    public static void four() {
        HashMap hm = new HashMap<String, Integer>();
        int freq;
        String key;
        try (FileReader fr = new FileReader("C:\\Users\\Oytun\\Desktop\\Obss staj\\words.txt"); Scanner sc = new Scanner(fr)) {
            while (sc.hasNext()) {
                key = sc.next();
                freq = (Integer) hm.getOrDefault(key, 0);
                hm.put(key, ++freq);
            }

            hm.forEach((keys, values) -> System.out.println(keys + " = " + values));

            //for (Entry<String, Integer> result : (Entry<String, Integer>) hm.entrySet()) {
            //    System.out.println(result.getKey() + " " + result.getValue());
            // }
        } catch (Exception e) {
        }
    }

    public static void five() {
        TreeMap sm = new TreeMap<String, Integer>();
        int freq;
        String key;
        try (FileReader fr = new FileReader("C:\\Users\\Oytun\\Desktop\\Obss staj\\words.txt"); Scanner sc = new Scanner(fr)) {
            while (sc.hasNext()) {
                key = sc.next();
                freq = (Integer) sm.getOrDefault(key, 0);
                sm.put(key, ++freq);
            }

            sm.forEach((keys, values) -> System.out.println(keys + " = " + values));
        } catch (Exception e) {
        }
    }

    public static void six() {
        TreeMap tm = new TreeMap<Word, Integer>();
        HashMap hm = new HashMap<Word, Integer>();
        String key;
        int freq;
        Word word;
        HashMap hashMap = returnUnique();
        hashMap.forEach((keys, values) -> hm.put(new Word((String) keys), values));
        hashMap.forEach((keys, values) -> tm.put(new Word((String) keys), values));
        System.out.println("----------");
        hm.forEach((keys, values) -> System.out.println(keys + " = " + values));

        System.out.println("----------");
        tm.forEach((keys, values) -> System.out.println(keys + " = " + values));

    }

    public static HashMap returnUnique() {
        HashMap hm = new HashMap<String, Integer>();
        int freq;
        String key;
        try (FileReader fr = new FileReader("C:\\Users\\Oytun\\Desktop\\Obss staj\\words.txt"); Scanner sc = new Scanner(fr)) {
            while (sc.hasNext()) {
                key = sc.next();
                freq = (Integer) hm.getOrDefault(key, 0);
                hm.put(key, ++freq);
            }

            hm.forEach((keys, values) -> System.out.println(keys + " = " + values));

            //for (Entry<String, Integer> result : (Entry<String, Integer>) hm.entrySet()) {
            //    System.out.println(result.getKey() + " " + result.getValue());
            // }
        } catch (Exception e) {
        }
        return hm;
    }

}
