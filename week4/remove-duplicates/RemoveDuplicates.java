public class RemoveDuplicates {
    public int[] removeDuplicates(int[] nums) {
        if (nums.length == 0) {
            return nums;
        }

        int j = 0;

        for (int i = 1; i < nums.length; i++) {
            if (nums[i] != nums[j]) {
                j++;
                nums[j] = nums[i];
            }
        }

        int[] result = new int[j + 1];
        for (int k = 0; k <= j; k++) {
            result[k] = nums[k];
        }
        return result;
    }

    public static void main(String[] args) {
        RemoveDuplicates sol = new RemoveDuplicates();

        int[] a = {1, 1, 2};
        int[] r1 = sol.removeDuplicates(a);
        for (int x : r1) System.out.print(x + " ");
        System.out.println();

        int[] b = {1, 1, 2, 3, 3};
        int[] r2 = sol.removeDuplicates(b);
        for (int x : r2) System.out.print(x + " ");
    }
}