public class Heightcounter {
        public static void main(String[] args) {
            int[] arr = {2, 3, 5, 7, 9, 6, 7, 4}; 
            int initialHeight = 5;  
            int count = 0; 
            int i = 0;  
    
            while (i < arr.length) {
                if (arr[i] > initialHeight) {
                    count++; 
                    initialHeight = arr[i];  
                }
                i++; 
            }
    
            System.out.println("The count of elements greater than the initial height is: " + count);
        }
    }

