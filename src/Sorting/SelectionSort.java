
package Sorting;

public class SelectionSort {
    
    public static void main(String[] args){
        int[] data = {25, 7, 9, 13, 3};
        for (int i = 0; i < data.length; ++i){
            System.out.print(data[i] + " ");
        }
        
        for (int i = 0; i < data.length-1; ++i){
            int Smallindex = i;
            for (int j = i+1; j < data.length; ++j){
                if (data[j] < data[Smallindex]){
                   Smallindex = j;
                }
            }
            int temp = data[i];
            data[i] = data[Smallindex];
            data[Smallindex] = temp;
        }
        System.out.println("\nSelection sort is : ");
        for (int i = 0; i < data.length; ++i){
            System.out.print(data[i] + " ");
        }
        System.out.println("\nMuhamad Bani Nazar");
    }
}
    

