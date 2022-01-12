/*
 * SortingAlgorithms.java
 *
 * Copyright 2022 Manan Vij <vijman22@US-CompLabiMac-16.local>
 *
 * This program is free software; you can redistribute it and/or modify
 * it under the terms of the GNU General Public License as published by
 * the Free Software Foundation; either version 2 of the License, or
 * (at your option) any later version.
 *
 * This program is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 * GNU General Public License for more details.
 *
 * You should have received a copy of the GNU General Public License
 * along with this program; if not, write to the Free Software
 * Foundation, Inc., 51 Franklin Street, Fifth Floor, Boston,
 * MA 02110-1301, USA.
 *
 *
 */


public class SortingAlgorithms {
  private int[] arr = new int[100]; // MODIFY HERE

  public void bubbleSort(){
    int temp;
    int numSwaps = 0;
    int counter = -1; // start at anything that is not 0 to enter loop
    while (counter != 0){
      counter = 0; // counter to check if any swaps occured --> if no swaps, then the array is sorted
      for (int j = 0; j < arr.length - 1; j++){
      if (arr[j] > arr[j+1]){ // if next element is smaller, swap it with the one before
        temp = arr[j];
        arr[j] = arr[j+1];
        arr[j+1] = temp;
        counter++; // add to counter if swap occured
        numSwaps++; // add to swaps
        }
      }
    }

    // handles printing
    /*System.out.print("Sorted Array using Bubble Sort: [");
    for (int val : arr){
      System.out.print(val + " ");
    }
    System.out.print("]");*/

    System.out.println();
    System.out.println("Number of swaps using Bubble Sort: " + numSwaps);
    System.out.println();
  }



  public void insertionSort(){
    int temp;
    int numSwaps = 0;
    int j = 0;
    for (int i = 1; i < arr.length; i++){ // start at 1 because we assume first element is sorted
      j = i;
      while (j > 0 && arr[j-1] > arr[j]){ // check where to place new element using while loop
        temp = arr[j-1];
        arr[j-1] = arr[j];
        arr[j] = temp;
        j--;
        numSwaps++; // add to swap counter becuase only swap when an element is out of place in the sorted list
      }
    }

    System.out.println();

    // handles printing

    /*
    System.out.print("Sorted Array using Insertion Sort: [");
    for (int val : arr){
      System.out.print(val + " ");
    }
    System.out.print("]");
    */
    System.out.println();
    System.out.println("Number of swaps using Insertion Sort: " + numSwaps);
    System.out.println();
  }

  public void selectionSort(){
    int temp;
    int min;
    int numSwaps = 0;
    for (int i = 0; i < arr.length - 1; i++){ // go through each element, but not last because 2nd loop checks from current element to end element
      min = i;
      for (int j = i + 1; j < arr.length; j++){ // check minimum from current index since everything before is aprt of sorted portion
        if (arr[j] < arr[min]){
        min = j;
        numSwaps++;
        }
      }
      // swapping in each loop
      temp = arr[min];
      arr[min] = arr[i];
      arr[i] = temp;

    }

    // handles printing
    /*
    System.out.print("Sorted Array using Selection Sort: [");
    for (int val : arr){
      System.out.print(val + " ");
    }
    System.out.print("]");
    */
    System.out.println();
    System.out.println("Number of swaps using Selection Sort: " + numSwaps);
  }

}
