public class Missing_Value {
        public static  void main(String[]args){
            int [] arr = { 1,4,6,8,10,12,13};
            for(int i = 0; i <arr.length - 1; i++){
                int current =arr[i];
                int next = arr[i+1];
                if(next-current>1){
                    for(int j = current+1;j<next;j++){
                        System.out.println("missing numnber"+j);
                    }
                }
            }
        }
    
    
}
