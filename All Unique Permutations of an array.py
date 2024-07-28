from itertools import permutations
class Solution:
    def uniquePerms(self, arr, n):
        # code here 
        answer=list(sorted(set(permutations(arr))))
        return answer
