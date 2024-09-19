public class QuickShort {
        public static void sorting(int arr[], int s, int e) {
            if (s < e) {
                int pi = partition(arr, s, e);
                sorting(arr, s, pi - 1);
                sorting(arr, pi + 1, e);
            }
        }
    
        public static int partition(int arr[], int s, int e) {
            int pivot = arr[e];
            int i = s - 1;
            for (int j = s; j < e; j++) {
                if (arr[j] < pivot) {
                    i++;
                    int temp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = temp;
                }
            }
            i++;
            int temp = arr[i];
            arr[i] = arr[e];
            arr[e] = temp;
            return i;
        }
    
        public static void main(String[] args) {
            int arr[] = { 6, 3, 9, 5, 2, 8 };
            int n = arr.length;
            sorting(arr, 0, n - 1);
            for (int i = 0; i < arr.length; i++) {
                System.out.print(arr[i] + " ");
            }
        }
    
    
}
