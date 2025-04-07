class Solution {
    public void nextPermutation(int[] nums) {
        int a= nums.length;
        int i= a-2;

        while(i>=0 && nums[i]>=nums[i+1]){
            i--;
        }
        if(i>=0){

            int m= a-1;
            while(nums[m]<=nums[i]){
                m--;
            }
            swap(nums,i,m);
        }
        reverse(nums,i+1,a-1);
    }
    private static void swap(int[]nums, int i,int m){
        int temp= nums[i];
        nums[i]=nums[m];
        nums[m]=temp;
    }
    private static void reverse(int[]nums, int start, int end){
        while(start<end){
            swap(nums, start, end);
            start++;
            end--;
        }
    }
    
}
