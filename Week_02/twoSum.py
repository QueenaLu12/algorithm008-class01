def twosum(nums, target):
    dic = {}
    for i in range(len(nums)):
        
        the_complement = target - nums[i]
        if the_complement in dic and the_complement != nums[i]:
            return [dic[the_complement],i]
        dic[nums[i]] = i

