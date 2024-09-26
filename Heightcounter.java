public class Heightcounter {
        public static void main(String[] args) {
            int[] arr = {2, 3, 5, 7, 9, 6, 7, 4};  // given array
            int initialHeight = 5;  // initial height
            int count = 0;  // to count how many elements are greater than the current height
            int i = 0;  // starting index
    
            while (i < arr.length) {
                if (arr[i] > initialHeight) {
                    count++;  // increment the count
                    initialHeight = arr[i];  // update the height
                }
                i++;  // move to the next element
            }
    
            System.out.println("The count of elements greater than the initial height is: " + count);
        }
    }

