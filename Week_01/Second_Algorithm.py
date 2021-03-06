class Solution:
    def rotate(self, nums: List[int], k: int) -> None:
        """
        Do not return anything, modify nums in-place instead.
        """
        n = len(nums)
        if k % n == 0:
            return
        pre = nums[n-1]
        for j in range(k):
            for i in range(n-1):
                tem = nums[i]
                nums[i] = pre
                pre = tem
        return nums
        
