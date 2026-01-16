class Solution {
    public int majorityElement(int[] nums) {
        int res = 0;
        int max = Integer.MIN_VALUE;
        HashMap<Integer,Integer> map = new HashMap<>();
        for(int n : nums){
            if(map.containsKey(n)){
                map.put(n, map.get(n)+1);
            }
            else{
                map.put(n,1);
            }
            if(map.get(n)>max){
                max = map.get(n);
                res = n;
            }
            // int res = map.getKey(Math.max(max,map.get(n)));
        }
        return res;

    }
}