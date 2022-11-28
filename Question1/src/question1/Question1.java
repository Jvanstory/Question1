/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package question1;

/**
 *
 * @author joeva
 */
public class Question1 {

    /**
     * @param args the command line arguments
     */
    static void reverse(int a[], int b)
    {
        int c, d;
        for (c = 0; c < b / 2; c++) {
            d = a[c];
            a[c] = a[b - c - 1];
            a[b - c - 1] = d;
        } 
    }
    public static void main(String[] args) {
        int[] a = new int[1000];
        for( int i = 0; i < a.length; i++){
            a[i] = (int) ((Math.random()*10)+ 1);
        }
        int r = 0, c = 0, d = 0, e = 0, f = 0, g = 0, h = 0, j = 0, k = 0, l = 0;
        for (int i = 0; i < a.length; i++){
               if (a[i] == 1){
                   r = r+1;
               } else if (a[i] == 2){
                c = c + 1;
               } else if (a[i] == 3){
                   d = d + 1;
               } else if (a[i] == 4){
                   e = e + 1;
               } else if (a[i] == 5){
                   f = f + 1;
               } else if (a[i] == 6){
                   g = g + 1;
               } else if (a[i] == 7){
                   h = h + 1;
               } else if (a[i] == 8){
                   j = j + 1;
               } else if (a[i] == 9){
                   k = k + 1;
               } else {
                   l = l + 1;
               }
        }
        System.out.println("freq of 1 = " + r);
        System.out.println("freq of 2 = " + c);
        System.out.println("freq of 3 = " + d); 
        System.out.println("freq of 4 = " + e);
        System.out.println("freq of 5 = " + f);
        System.out.println("freq of 6 = " + g);
        System.out.println("freq of 7 = " + h);
        System.out.println("freq of 8 = " + j);
        System.out.println("freq of 9 = " + k);
        System.out.println("freq of 10 = " + l);
        
        reverse(a, a.length);
        int[] b = a;
    }
    
}
