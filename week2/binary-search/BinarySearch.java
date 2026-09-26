class BinarySearch {
    public int search(int[] nums, int target) {
        int left = 0;
        int right = nums.length - 1;

        while (left <= right) {
            int mid = left + (right - left)/2;

            if(nums[mid] == target) {
                return mid;
            }
            else if(nums[mid] < target) {
                left = mid+1;
            }
            else {
                right = mid-1;
            }

        }
        return -1;
    }

    public static void main(String[] args) {
        BinarySearch solution = new BinarySearch();
        int[] nums1 = {-1, 0, 3, 5, 9, 12};
        int target1=9;
        System.out.println(solution.search(nums1, target1));

        int[] nums2 = {-1, 0, 3, 5, 9, 12};
        int target2=2;
        System.out.println(solution.search(nums2, target2));
    }
}