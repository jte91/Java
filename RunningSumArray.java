public class RunningSumArray 
{
    public static void main(String []args)
    {
        runningSum(1,2,3,4);
    }
    public int[] runningSum(int[] nums)
    {
        int[] result = new int [nums.length];
        result[0] = nums[0];
        for(int i = 1; i < nums.length; i++)
        {
            result[i] = result[i] + result[i -1];
        }
        return result;
    }
}

