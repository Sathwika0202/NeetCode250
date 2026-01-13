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

/* --------------------------------------------------------------------------------------------------
-------------------------------------------------------------------------------------------------- */

// 242. Valid Anagram

class Solution {
    public boolean isAnagram(String s, String t) {
        
        // char[] cs = s.toCharArray();
        // char[] ct = t.toCharArray();
        if(s.length() != t.length()){
            return false;
        }

        // Arrays.sort(cs);
        // Arrays.sort(ct);

         
        // for(int i=0 ; i < cs.length ; i++){
        //     if(cs[i]!=ct[i]){
        //         return false;
        //     }

        // } 

        int[] temp = new int[26];

        for(int i=0 ; i < s.length() ; i++){
            temp[s.charAt(i)-'a']++;
            temp[t.charAt(i)-'a']--;

        }
        for(int i : temp){

            if(i!=0){
                return false;
            }
        }




        return true; 
    }
}
