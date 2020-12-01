public class BinarySearch {
    public int upper_bound_ (int n, int v, int[] a) {
        // write code here
        if (v>a[n-1]){
            return n+1;
        }
        int i= 0;
        int j = n-1;
        int mid = i +(j-i)/2;
        while (i<j){
            if (a[mid] >=v){
                j = mid;
            }else {
                i = mid+1;
            }
            mid = i+(j-i)/2;
        }
        return mid+1;

    }
}
