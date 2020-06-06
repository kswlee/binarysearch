package leetcode;

public class N278FirstBadVersion {
    public int firstBadVersion(int n) {
        int left = 1;
        int right = n;

        while (left < right) {
            int mid = left + (right - left) / 2;

            if (isBadVersion(mid)) {
                right = mid;
            } else {
                left = mid + 1;
            }
        }

        return left;
    }

    private boolean isBadVersion(int version) {
        return version >= 4;
    }

    public static void main(String[] args) {
        N278FirstBadVersion o = new N278FirstBadVersion();
        int ret = o.firstBadVersion(5);
        System.out.println("ret = " + ret);
    }
}
