
package bubblesort1;

public class Ausgabe {
    public static void main(String[] args) {
        // Testarray
        int[] array = {1, 7, 3, 4, 5, 10, 29, 1, 3, 4};
        
        BubbleSort bs = new BubbleSort();
        bs.bubblesort1(array);
        bs.bubblesort2(array);
        bs.bubbleSort3(array);

    }  
    
}
