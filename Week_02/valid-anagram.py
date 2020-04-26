 def isAnagram(self, s, t):
        """
        :type s: str
        :type t: str
        :rtype: bool
        """
        dic1 = {}
        dic2 = {}
        for m in s:
            dic1[m] = dic1.get(m,0) + 1
        for n in t:
            dic2[n] = dic2.get(n,0) + 1
        if dic1 == dic2:
            return True
        return False
            
