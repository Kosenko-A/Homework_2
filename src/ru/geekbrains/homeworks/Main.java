package ru.geekbrains.homeworks;

public class Main {

    public static void main(String[] args) {
     //task1
        changeArray();
        System.out.println();

     //task2
        writeArray();
        System.out.println();

     //task3
        multiplyArray();
        System.out.println();

     //task4
        createMatrix();
        System.out.println();

     //task 5
        System.out.println(chooseMax());
        System.out.println(chooseMin());

     //task 6
        int[]array ={1, 1, 1, 2, 1};
        System.out.println(checkBalance(array));

     //task 7
        int[]mass = {1, 2, 3, 4, 5};
        int n = 2;
        moveElementsN(mass,n);


    }
    public static void changeArray() {
        int[] array1 = {1, 1, 0, 0, 1, 0, 1, 1, 0, 0};
        for (int i = 0; i < array1.length; i++) {
            if (array1[i] == 1) {
                array1[i] = 0;
            } else if (array1[i] == 0) {
                array1[i] = 1;
            }
            System.out.print(array1[i]);
            System.out.print(" ");
        }
    }
    public static void writeArray(){
        int[]arr = new int[8];
        for (int i = 0, k = 0; i<arr.length; i++,k+=2){
                arr[i] = i+k;
                System.out.print(arr[i]);
                System.out.print(" ");

        }
    }
    public static void multiplyArray(){
        int[] arr = {1, 5, 3, 2, 11, 4, 5, 2, 4, 8, 9, 1};
        for (int i = 0; i<arr.length; i++){
            if (arr[i]<6) {
                arr[i] *=2;
            }
            System.out.print(arr[i]);
            System.out.print(" ");
        }
    }
    public static void createMatrix(){
        int[][]arr = new int[3][3];
        for (int i = 0; i<arr.length;i++) {
            for (int j = 0; j < arr.length; j++){
                if (i == j){
                    arr[i][j] = 1;
                }
                System.out.print(arr[i][j]);
                System.out.print(" ");
            }
            System.out.println();
        }
    }
    public static int chooseMax(){
        int[] arr = {20, 3, 9, 17, 6, 23, 10, 1};
        int max = arr[0];
        for (int i = 1; i<arr.length; i++){
            if (max<arr[i]){
                max = arr[i];
            }
        }
        return (max);
    }
    public static int chooseMin(){
        int[] arr = {20, 3, 9, 17, 6, 23, 10, 1};
        int min = arr[0];
        for (int i = 1; i<arr.length; i++){
            if (min>arr[i]){
                min = arr[i];
            }
        }
        return (min);
    }
    public static boolean checkBalance (int[]arr){
        int left = 0;
        int right = 0;
        boolean result = false;
        for (int r = 1; r<arr.length; r++){
            right = right + arr[r];
        }

        for (int i = 0; i<arr.length; i++){
            left = left + arr[i];
            if (left == right){
                result = true;
                break;
            }
            right = right - arr[i+1];
        }
        return result;
    }
    public static void moveElementsN (int[]arr, int n){

        if (n < 0) {
            int copy = 0;
            n*=-1;
            for (int m = 0; m < n; m++) {
                copy = arr[0];
                for (int i = 0; i < arr.length - 1; i++) {
                    arr[i] = arr[i + 1];
                }
                arr[arr.length - 1] = copy;
            }
            for (int i = 0; i < arr.length; i++) {
                System.out.print(arr[i]);
                System.out.print(" ");
            }
        } else if (n > 0){
            int copy = 0;
            for (int m = 0; m < n; m++) {
                copy = arr[arr.length-1];
                for (int i = arr.length-1; i >0; i--) {
                    arr[i] = arr[i-1];
                }
                arr[0] = copy;
            }
            for (int i = 0; i < arr.length; i++) {
                System.out.print(arr[i]);
                System.out.print(" ");
            }
        }

    }

}

