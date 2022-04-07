import java.util.*;
public class countUtilDuplicate
{
    public static int lengthOfLongestSubstring(String s)
    {
        //arrylist provides constant time for search operation, so it is better to use arraylist if searching is more freq operation than
        //add and remove operation in other words if you have a O(1) time complexity
        ArrayList<String> unique = new ArrayList();
        //A Set is a collection that cannot contain duplicate elements (models the math set abstraction)
        //contains methods inherited from collection and adds the restriction that duplicate elements are prohibited
        //set also addds a stronger contract on the behavior of the = and hashcode operations, allowing set instance to be compared meaningfully
        //even if their implementaion types differ
        Set<Character> set = new HashSet<>();
        int i = 0;
        int j = 0;
        int distance = 0;
        while(i < s.length() && j < s.length())
        {
            if(!set.contains(s.charAt(j)))
            {
                set.add(s.charAt(j));
                distance = Math.max(distance, j - i + 1);
                j++;
            }
            else
            {
                set.remove(s.charAt(i));
                i++;
            }
        }
        return distance;
    }
    public static void main(String[] args)
    {
        System.out.println(lengthOfLongestSubstring("cccc"));
    }
}