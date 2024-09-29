package sept.ex_25092024_For_Loop;

public class Lab012_Sum_Of_Elements_Array {
    public static void main(String[] args) {
        int[] arr={2,4,6,8,};
        int sum=0;
        for(int i=0;i<arr.length;i++)
        {
            sum=sum+arr[i];
        }
        System.out.println(sum);
    }
}
