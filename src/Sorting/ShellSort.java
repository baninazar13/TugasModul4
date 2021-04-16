
package Sorting;

public class ShellSort {
    
    public static void shellsort(int[] arr) {
        int n = arr.length;
        int C,M;
        int jarak, i, j, kondisi;
        boolean Sudah = true;
        int temp;
        C = 0;
        M = 0;
        jarak = n;
        
        while (jarak >= 1) {
            jarak = jarak / 2;
            Sudah = true;
            while (Sudah) {
                Sudah = false;
                for (j = 0; j < n - jarak; ++j) {
                    i = j + jarak;
                    C++;
                    if (arr[j] > arr[i]) {
                        temp = arr[j];
                        arr[j] = arr[i];
                        arr[i] = temp;
                        Sudah = true;
                    }
                }
            }
        }
    }
    
    
    public static void tampil(int data[]) {
        for (int i = 0; i < data.length; ++i)
            System.out.print(data[i] + " ");
        System.out.println();
    }
    
    
    public static void main(String[] args) {
        int A[] = {25, 7, 9, 13, 3};
        ShellSort.tampil(A);
        ShellSort.shellsort(A);
        ShellSort.tampil(A);
        
            System.out.println("Muhamad Bani Nazar");
            System.out.println("NIM   : 20090113" );
            System.out.println("Kelas : 2D");            
    }
}

