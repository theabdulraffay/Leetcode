class Solution(object):
    def arraySign(self, nums):
        pro = 1
        for i in range(len(nums)):
            pro *=nums[i]
            
        if pro > 0:
            return 1
        elif pro < 0:
            return -1
        else:
            return 0
        