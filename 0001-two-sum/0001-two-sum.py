class Solution:
    def twoSum(self, nums: List[int], target: int) -> List[int]:
        # for i in range(len(nums)):
        #     find = target - nums[i]
        #     for j in range(len(nums)):
        #         if(nums[j]==find and (i!=j)):
        #             return [i,j]

        # return []       

        dic = {}
        for i,num in enumerate(nums):

            find = target - num

            if find in dic:
                return [dic[find],i]

            dic[num] = i    
        return []         
