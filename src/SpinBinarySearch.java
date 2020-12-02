public class SpinBinarySearch {
    public int search(int[] A, int target) {
        int i = 0;
        int j = A.length - 1;
        if (A.length == 0) {
            return -1;
        }
        int mid = i + (i + j) / 2;
        while (i < j) {
            if (A[mid] == target) {
                return mid;
            }
            //有序数组
            if (A[i] <= A[mid]) {
                if (A[i] <= target && target < A[mid]) {
                    j = mid - 1;
                } else {
                    i = mid + 1;
                }
            } else{
                if (A[mid] < target && target <= A[j]) {
                    i = mid + 1;
                } else {
                    j = mid - 1;
                }
            }
        }
        return -1;
    }
}
