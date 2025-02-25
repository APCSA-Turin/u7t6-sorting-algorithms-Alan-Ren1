package com.example.project.Selection_Sort;

import java.util.ArrayList;
import java.util.Scanner;
import java.io.IOException;
import java.io.File;

public class SelectionSort {

    // PART A: Implementing selection sort for an array of integers
    public static int[] selectionSort(int[] elements) {
        for (int i = 0; i < elements.length - 1; i++) { 
            int minIndex = i;
            for (int j = i + 1; j < elements.length; j++) { 
                if (elements[j] < elements[minIndex]) {
                    minIndex = j; 
                }
            }
            // Swap the found minimum element with the first element of the unsorted part
            int temp = elements[i];
            elements[i] = elements[minIndex];
            elements[minIndex] = temp;
        }
        return elements;
    }

    // PART B: Implementing selection sort for an ArrayList of words
    public static ArrayList<String> selectionSortWordList(ArrayList<String> words) {
        for (int i = 0; i < words.size() - 1; i++) { 
            int minIndex = i;
            for (int j = i + 1; j < words.size(); j++) { 
                if (words.get(j).compareTo(words.get(minIndex)) < 0) {
                    minIndex = j;
                }
            }
            // Swap words
            String temp = words.get(i);
            words.set(i, words.get(minIndex));
            words.set(minIndex, temp);
        }
        return words;
    }

    //call this method to load 1000 words into a list (for testing Part B)
    public static ArrayList<String> loadWordsInto(ArrayList<String> wordList) {
        try {
            Scanner input = new Scanner(new File("src/main/java/com/example/project/Selection_Sort/words.txt"));
            while (input.hasNext()) {
                String word = input.next();
                wordList.add(word);
            }
            input.close();
        } catch (IOException e) {
            System.out.println("Error reading file: " + e.getMessage());
        }
        return wordList;
    }

}
