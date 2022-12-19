package searching.linear;

public class Min {
    public static void main(String[] args) {
        int[] arr = {1,2,3,4,-1,4,5,6,10};

        int min = arr[0];
        for (int i = 0; i < arr.length; i++) {
            if(arr[i]<min){
                min=arr[i];
            }
        }
        System.out.println("Minimum is :"+min);
    }
}
