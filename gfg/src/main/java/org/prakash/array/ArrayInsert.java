package org.prakash.array;

public class ArrayInsert {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5, -1};
        int index = 8, element = 90, sizeOfArray = 6;

        insertAtIndex(arr, arr.length, index, element);
        System.out.println(arr);
        for(int i = 0; i < sizeOfArray; i++){
            System.out.println("arr["+ i+ "]" + arr[i]);
        }

    }

    public static void insertAtIndex(int arr[],int sizeOfArray,int index,int element)
    {
        if(index != sizeOfArray-1){

            for(int i = sizeOfArray - 1 ; i >= index; i--){
                arr[i] = arr[i-1];
            }
        }

        arr[index] = element;

    }
}
