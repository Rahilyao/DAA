class BinarySearch {
    public static int search(int[] nums, int target, int left, int right) {


        int comparisons=0;



            int mid = left + (right - left)/2;
            comparisons++;
            if (nums[mid] == target) {
                return mid;
            }
            else if (nums[mid] < target) {
                left = mid + 1;
                search(nums, target, left, mid - 1);
            }
            else {
                right = mid - 1;
                search(nums, target, left, right);
            }

        return -1;
    }


}