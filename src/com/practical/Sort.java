package com.practical;

// all sorting is done in assending order
public class Sort {
    public void bubbleSort(int[] array){
        boolean sorted = false;
        while (!sorted){
            sorted = true;
            for(int i=0; i<array.length-1; i++){
                if(array[i]>array[i+1]){
                    sorted = false;
                    int temp = array[i];
                    array[i] = array[i+1];
                    array[i+1] = temp;
        return;


                    }
                }
            }
        }

    public void quickSort(int[] array) {
        System.out.println("will be impolemented later");
    }

}
