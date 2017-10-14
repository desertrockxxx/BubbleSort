package bubblesort1;      

public class BubbleSort {
 
    public void bubblesort1(int[] arr){

        // Wenn getauscht wird, verkürze n-Länge um 1
        for (int n = arr.length; n > 1; n--) {
            // Wiederhole bis Ende des Arrays erreicht ist
            for (int i = 0; i < n-1; i++) {
                // Arraywerte miteinander vertauschen
                if (arr[i] > arr[i + 1]) {
                    int temp = arr[i+1];
                    arr[i+1] = arr[i];
                    arr[i] = temp;
                }
            }
        }
        // Ausgabe des Arrays
        for(int one : arr) System.out.println(one);
     }
    
    
    public void bubblesort2(int[] arr){
        
        boolean swapped;

        int n = arr.length;
        
        do{
            swapped = false;
            for (int i = 0; i < n-1 ; ++i){
            if (arr[i] > arr[i+1]){
                // Arraywerte miteinander vertauschen
                int temp = arr[i+1];
                arr[i+1] = arr[i];
                arr[i] = temp;
                
                swapped = true;
            } // ende if
          } // ende for
          n = n-1;
        } while(swapped);

        for(int one : arr) System.out.println(one);
    }
    
    public void bubbleSort3(int[] arr) {

        int n = arr.length;

        do {
            int newn = 1;
            for (int i = 0; i < n - 1; ++i) {
                if (arr[i] > arr[i + 1]) {
                    // Arraywerte miteinander vertauschen
                    int temp = arr[i+1];
                    arr[i+1] = arr[i];
                    arr[i] = temp;
                    
                    newn = i + 1;
                }
            }
            n = newn;
        } while (n > 1);
        
        for(int one : arr) System.out.println(one);
    }
    
}
