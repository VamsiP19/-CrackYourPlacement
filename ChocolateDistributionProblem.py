class Solution:

    def findMinDiff(self, A,N,M):

        # code here
        if M > N:
            return -1  

        A.sort()

        min_diff = float('inf')
        for i in range(N - M + 1):
            diff = A[i + M - 1] - A[i]
            min_diff = min(min_diff, diff)

        return min_diff
