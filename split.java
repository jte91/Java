import java.util.*;

public class split {
    public static void main(String [] args)
    {
        minimumSum(2932);
        
    }
    public static int minimumSum(int num) 
    {
       //Get digits
    int num1 = num % 10;
    int num2 = num % 100 / 10;
    int num3 = num % 1000 / 100;
    int num4 = num % 10000 / 1000;
	
    //Store digits in arraylist
    ArrayList<Integer> list = new ArrayList<Integer>();
    list.add(num1);
    list.add(num2);
    list.add(num3);
    list.add(num4);
    
    //Sort digits in ascending order
    Collections.sort(list);
    
    //Create smallest sum
    int new1 = list.get(0) * 10 + list.get(2);
    int new2 = list.get(1) * 10 + list.get(3);
    int sum = new1 + new2;
    return sum;
    }
}
