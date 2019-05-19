package com.java1.bblsort;

import java.util.Random;

public class BblSort {
    public static void main(String[] args) {
        int[] initialArray = new int[10];
            System.arraycopy(arrayGen(),0,initialArray,0,arrayGen().length);
        int[] resultArray = new int[10];
            System.arraycopy(arraySort(initialArray),0,resultArray,0,arraySort(initialArray).length);
        arrayDisplay(initialArray, "Initial");
        arrayDisplay(resultArray, "Sorted");

    }

    public static int[] arrayGen() {
        int[] arrayOfInt = new int[10];
        Random random = new Random();
        for (int i = 0; i < arrayOfInt.length; i++) {
            arrayOfInt[i] = random.nextInt(100);
        }
        return arrayOfInt;
    }

    public static int[] arraySort(int[] incomingArray) {
        int[] arrayForSort = new int[10];
            System.arraycopy(incomingArray,0,arrayForSort,0,incomingArray.length);
        int repeatCount = arrayForSort.length;
        boolean wasSorted;
        do {
              wasSorted = false;
            for (int j = 0; j < repeatCount - 1; j++) {
                if (arrayForSort[j] > arrayForSort[j+1]) {
                    int temp = arrayForSort[j+1];
                    arrayForSort[j+1] = arrayForSort[j];
                    arrayForSort[j] = temp;
                    wasSorted = true;
                }
            }
            repeatCount = repeatCount - 1;

        } while (wasSorted != false);
        return arrayForSort;
    }

    public static void arrayDisplay(int[] arrForDis, String arrayStatus){
        System.out.println(arrayStatus + " " + "array:");
        for (int i = 0; i < arrForDis.length; i++) {
            System.out.print(arrForDis[i] + " ");
        }
        System.out.println();
    }

}
