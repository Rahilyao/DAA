public class FirstBadVersion {

    static int badVersion = 4; //тут можно любую цифру, просто для примера
    public static boolean isBadVersion(int version) {
        if (version >= badVersion) {
            return true;
        } else {
            return false;
        }
    }

    public int firstBadVersion(int n) {
        int left = 1;
        int right = n;
        int answer = n;

        while (left <= right) {
            int middle = (left + right) / 2;

            if (isBadVersion(middle)) {
                answer = middle;
                right = middle - 1;
            } else {
                left = middle + 1;
            }
        }
        return answer;
    }

    public static void main(String[] args) {
        FirstBadVersion solution = new FirstBadVersion();

        int n = 5;
        badVersion = 4;
        System.out.println(solution.firstBadVersion(n));
    }
}