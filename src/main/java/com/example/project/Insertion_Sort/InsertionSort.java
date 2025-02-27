package com.example.project.Insertion_Sort;
import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;

public class InsertionSort {

    // PART A. implementing insertion sort
    public static int[] insertionSort(int[] elements) {
        int count = 0;
        for (int j = 1; j < elements.length; j++) {
            int temp = elements[j];
            int possibleIndex = j;
            while (possibleIndex > 0 && temp < elements[possibleIndex - 1]) {
                count++;
                elements[possibleIndex] = elements[possibleIndex - 1];
                possibleIndex--;
            }
            elements[possibleIndex] = temp;
        }
        System.out.println("INSERTION SORT: Number of loop iterations: " + count);
        return elements;  // Return the sorted array
    }
    
    

   
    public static void selectionSort(int[] elements) {
        int count = 0;
        for (int i = 0; i < elements.length - 1; i++) {
            int minIndex = i;
            for (int j = i + 1; j < elements.length; j++) {
                count++;
                if (elements[j] < elements[minIndex]) {
                    minIndex = j;
                }
            }
            int temp = elements[i];
            elements[i] = elements[minIndex];
            elements[minIndex] = temp;
        }
        System.out.println("SELECTION SORT: Number of loop iterations: " + count);
    }
    

    // PART B. sorting a 1000-word list
    public static ArrayList<String> insertionSortWordList(ArrayList<String> words) {
        int count = 0;
        for (int j = 1; j < words.size(); j++) {
            String temp = words.get(j);
            int possibleIndex = j;
            while (possibleIndex > 0 && temp.compareTo(words.get(possibleIndex - 1)) < 0) {
                words.set(possibleIndex, words.get(possibleIndex - 1));
                possibleIndex--;
                count++;
            }
            words.set(possibleIndex, temp);
        }
        System.out.println("Insertion sort, number of iterations: " + count);
        return words;  // Return the sorted list
    }
    
    

    public static void selectionSortWordList(ArrayList<String> words) {
        int count = 0;
        for (int j = 0; j < words.size() - 1; j++) {
            int minIndex = j;
            for (int k = j + 1; k < words.size(); k++) {
                count++;
                if (words.get(k).compareTo(words.get(minIndex)) < 0) {
                    minIndex = k;
                }
            }
            String temp = words.get(j);
            words.set(j, words.get(minIndex));
            words.set(minIndex, temp);
        }
        System.out.println("Selection sort, number of iterations: " + count);
    }
    

    public static ArrayList<String> loadWordsInto(ArrayList<String> wordList) {
        try {
            Scanner input = new Scanner(new File("src/main/java/com/example/project/Selection_Sort/words.txt"));
            while (input.hasNext()) {
                String word = input.next();
                wordList.add(word);
            }
        } catch (IOException e) {
            System.out.println(e.getMessage());
        }
        return wordList;
    }


}