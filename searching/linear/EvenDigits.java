package searching.linear;

public class EvenDigits {
    public static void main(String[] args) {

        int[] arr = {-12,1312,2143,213,45,462,3212,43,0};

        System.out.println(findEvenNums(arr));
    }
    static int findEvenNums(int[] arr){

        int nums= 0;
        for (int i = 0; i < arr.length; i++) {
            int x = arr[i], count = 0;
            if(x==0){
                count=1;
            }
            while(x!=0){
                x/=10;
                count+=1;
            }
            if(count%2==0){
                nums++;
            }
        }
        return nums;
    }
}
