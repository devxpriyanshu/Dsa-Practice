package searching.linear;

public class LinearSearch {
    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5,6,7,8,9,10};
        int target = 9;

        System.out.println("Target index of the given element: "+linearSearchFunc(arr,target));
        System.out.println("Target element of the given index: "+targetSearchFunc(arr,target));
    }
    static int linearSearchFunc(int[] arr, int target){

        for (int i = 1; i < 7; i++) {                   //search in range
            if(arr[i]==target){
                return i;
            }
        }
        return -1;
    }
    static int targetSearchFunc(int[] arr, int target){

        for (int i = 0; i < arr.length; i++) {
            if(i==target){
                return arr[i];
            }
        }
        return Integer.MAX_VALUE;
    }
}
