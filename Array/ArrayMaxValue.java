// Calculate the maz               
public class ArrayMaxValue
{
    void findArrayMax()
    {
        int arr[] = { 1,5,3};
        int max = arr[0];
        for(int i = 0; i<arr.length; i++)
        {
            if(arr[i]>max)
            max=arr[i];
        }
        System.out.println("Maximum  Value of Array = "+max);
    }
        public static void main(String[] args) 
        {
            ArrayMaxValue obj = new ArrayMaxValue();
            obj.findArrayMax();

        }
        
}
