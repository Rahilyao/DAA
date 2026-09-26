1) Problem
We have versions from 1 to n, and once one version is bad, all the versions after it are bad too. We're given a function isBadVersion(version) that tells us true or false for a version. We need to find the very first bad version, and we should try not to call isBadVersion too many times, so checking versions one by one from the start isn't the best way.
2) Approach
I use middle here too, if it's bad, I save it in answer and then move right to middle - 1, to keep checking if there's an even earlier bad version, if it's not bad, that means the first bad version has to be somewhere after middle, so I move left to middle + 1
3) Time complexity
It's like previous task, also cutting array in half, so also O(log n).
4) Space complexity
There are also simple variables, so still O(1)
5) also have no ideas