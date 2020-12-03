import java.util.ArrayList;

public class MinArraySearch {
    public ArrayList<Integer> GetLeastNumbers_Solution(int[] input, int k) {
        if (input == null) {
            return new ArrayList<>();
        }else if(input.length == 1){
            return new ArrayList<>(input[0]);
        }
        quickSort(input, 0, input.length - 1);
        ArrayList<Integer> res = new ArrayList<>();
        int i=0;
        int j = input.length;
        while(i<k && i<j){
            res.add(input[i++]);
        }
        if(k>j){
            res = new ArrayList<>();
        }
        return res;
    }

    public static void quickSort(int[] arr, int L, int R) {
        if (L < R) {
            int[] p = partition(arr, L, R);
            quickSort(arr, L, p[0] - 1);
            quickSort(arr, p[1] + 1, R);
        }
    }

    public static int[] partition(int[] arr, int L, int R) {
        int less = L - 1;
        int more = R;
        while (L < more) {
            if (arr[L] < arr[R]) {
                swap(arr, ++less, L++);
            } else if (arr[L] > arr[R]) {
                swap(arr, --more, L);
            } else {
                L++;
            }
        }
        swap(arr,more,R);
        return new int[]{less+1,more};
    }

    public static void swap(int[] arr, int i, int j) {
        int tmp = arr[i];
        arr[i] = arr[j];
        arr[j] = tmp;
    }
}
