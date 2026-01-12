// 1929. Concatenation of Array

class Solution {
    public int[] getConcatenation(int[] nums) {
        int l = nums.length;
        int n = l*2;
        int[] ans = new int[n];
        // int k=0;
        for(int i=0;i<nums.length;i++){
            ans[i]=nums[i];
            ans[l+i]=nums[i];
            // k++;

        }
        
        return ans;
    }
}


/* --------------------------------------------------------------------------------------------------
-------------------------------------------------------------------------------------------------- */

// 217. Contains Duplicate

class Solution {
    public boolean containsDuplicate(int[] nums) {
        boolean res = false;
        HashMap<Integer,Integer> hmap = new HashMap<>();
        for(int i : nums){
           
            if(hmap.containsKey(i)){
                hmap.put(i,(hmap.get(i))+1);
                return true;
                
            }else{
                hmap.put(i,1);
            }
        }
        
        return false;
    }
}
