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


/* --------------------------------------------------------------------------------------------------
-------------------------------------------------------------------------------------------------- */

// 1. Two Sum

class Solution {
    public int[] twoSum(int[] nums, int target) {
        Map<Integer,Integer> map = new HashMap<>();
        int n = nums.length;

        for(int i=0;i<n;i++){
            map.put(nums[i],i);
        }

        for(int i=0;i<n;i++){
            int compliment = target - nums[i];
            if(map.containsKey(compliment) && map.get(compliment)!=i){
                return new int[]{i,map.get(compliment)};
            }
        }
        return new int[]{};
    }
}

/* --------------------------------------------------------------------------------------------------
-------------------------------------------------------------------------------------------------- */

//14. Longest Common Prefix

class Solution {
    public String longestCommonPrefix(String[] strs) {
        String res = null;
        // String str = strs[0];
        for(int i=0 ; i<strs[0].length() ; i++){
            for(String s : strs){
                if(i==s.length() || s.charAt(i)!=strs[0].charAt(i)){
                    return s.substring(0,i);
                }
                
            }

        }
        return strs[0];
    }
}


/* --------------------------------------------------------------------------------------------------
-------------------------------------------------------------------------------------------------- */

//49. Group Anagrams

class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        HashMap <String,List<String>> res = new HashMap<>();

        for(String s : strs){
            int[] count = new int[26];
            for(char c : s.toCharArray()){
                count[c-'a']++;
            }
            String key =Arrays.toString(count);
            res.putIfAbsent(key, new ArrayList<>());
            res.get(key).add(s);

        }
        return new ArrayList<>(res.values());
    }
}
