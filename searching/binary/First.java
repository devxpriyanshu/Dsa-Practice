package searching.binary;

public class First {
    public static void main(String[] args) {

        int[] nums = {1,2,3,4,5,6,7,8,9,10,11}; // ascending ordered
        int[] arr = {11,10,9,8,7,6,5,4,3,2,1}; // descending ordered

        System.out.println(binarySearch(nums,10 ));
    }

    static int binarySearch(int[] nums, int target){

        int mid = nums.length/2;
        int start = 0;
        int end = nums.length;

        while(start<end){
            if(target == nums[mid]){
                return mid;
            }else {
                if(target>nums[mid]){
                    start = mid+1;
                }else {
                    end = mid;
                }
                mid = (start+end)/2;
            }
        }
        return -1;
    }
}
