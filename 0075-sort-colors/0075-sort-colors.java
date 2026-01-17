class Solution {
    public void sortColors(int[] nums) {
        int[] arr = new int[3];
        for(int n : nums){
            arr[n]++;
        }int m=0;
        for(int i=0;i<3;i++){
            int j = arr[i];
            for(int k=0;k<j;k++){
                nums[m]=i;
                m++;
            }

        }
    }
}