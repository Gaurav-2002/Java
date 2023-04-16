import java.util.Scanner;

import java.util.Scanner;
class revArr{
    public static void main(String[] args){
        System.out.println("enter order of array");
        Scanner sc=new Scanner(System.in);
        int x=0;
        int c=sc.nextInt();
        System.out.println("Enter array");
        int[] arr=new int[c];
        for (int  i = 0; i < arr.length; i++) {
            arr[i]=sc.nextInt();

        }
        int r=0;
        int e=arr.length;
        for (int j = e-1; j>=0; j--) {
            x=arr[j];
            for (int k = arr.length-2; k>=0; k--) {
                arr[k]=arr[k+1];
            }
            arr[r]=x;
            e--;
            r++;
        }
        for (int t = 0; t< arr.length; t++) {
            
        System.out.print(arr[t]+" ");
        }
    }
}