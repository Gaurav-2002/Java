// Calculate the sum of all the elements in the given array.


public class ArraySum 
{
    void  sumOfArray()
    {
        int arr[]={1,4,5,6,1};
        int sum =0;
        for(int i =0; i < arr.length; i++)
        {
            sum = sum+arr[i];
        }
        System.out.println("Sum Of Array = "+sum);
    }
    public static void main(String[] args) 
    {
     ArraySum obj = new ArraySum();
     obj.sumOfArray();   
    }
}
