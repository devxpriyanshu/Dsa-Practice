package searching.binary;

public class CeilingOfNumber {
    public static void main(String[] args) {
        int[] arr = {2,3,4,7,9,12,134,435,657,765,888};

        int ans =ceilingOfNumber(arr,700);
        System.out.println(ans+"-> "+arr[ans]);
    }
    static int ceilingOfNumber(int[] nums, int target){

            int start = 0;
            int end = nums.length -1;
            while(start <= end)
            {
                int mid = start + (end - start )/2; // int mid = (start+end)/2;
                if(nums[mid] == target )
                    return mid;
                else if(nums[mid] < target)
                    start = mid+1;
                else
                    end = end-1;
            }
            return start ;
    }
}
