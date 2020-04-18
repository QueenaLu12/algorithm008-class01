class Solution:
    def removeDuplicates(self, nums: List[int]) -> int:
        if not nums:
            return 
        slow = fast = 0
        while fast <= len(nums) - 1:
            if nums[fast] != nums[slow]:
                nums[slow+1] = nums[fast]
                slow += 1
            else:
                fast += 1
        return slow + 1

