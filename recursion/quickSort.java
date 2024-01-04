public class quickSort {

    
    public static void main(String args[]){
       int[] arr =  {7,2,4,23,1,45,33};
       QS(arr,0,6);

    }

    public static void QS(int[] arr,int low, int high){

       /* if (low  == high) {
            for(int i=0;i<arr.length;i++){
                System.out.println(arr[i]);
            }
            return;
        }
        */ 
        if (low < high) {
            int partition = findLocation( arr, low, high);
            
            QS(arr, low, partition-1);
            QS(arr, partition+1, high);
            
        }
        for(int j=0;j<arr.length;j++){
            System.out.println(arr[j]);
        }
    }

    public static int findLocation(int[] arr, int low, int high){
        int pivot = arr[low];
        int i = low;
        int j = high;
        while (i < j) {
            while (arr[i] <= pivot && i < high) {
                i++;
            }
            while (arr[j] > pivot && j > low) {
                j--;
            }
            if (i < j) {
                int temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;
            }
            
        }
       
        int temp = arr[low];
            arr[low] = arr[j];
            arr[j] = temp;
        return j;
    }

    
    
   
}