import java.util.*;
public class LongestPalindromicSubstring {
    public String longPalindrome(String s)
    {
        String result = null;
        int max = 0;
        for(int i = 0; i < s.length(); i++){
            int head = i, end = i;
            
            //expand from single char to check if the substring is palindrome. eg: aabaa when i = 2,
            // it will be like first time b == b, then a == a, then a == a, all pass and result = aabaa....
            while (head >= 0 && end < s.length()){
                if( s.charAt(head) == s.charAt(end)){
                    if(max < (end - head + 1)){
                        max = end - head + 1;
                        result = s.substring(head, end + 1);
                        //System.out.println("0 " + i + " "+ head + " " +end + " "+ result);
                    }
                }
                else break;
                head -= 1;
                end += 1;
            }
            head = i;
            end = i + 1;
            //expand from double char to check if the substring is palindrome. eg: aabbaa when i = 2
            // first time: b == b, a == a, a == a. all pass, then result = aabbaa;
            while (head >= 0 && end < s.length()){
                if( s.charAt(head) == s.charAt(end)){
                    if(max < (end - head + 1)){
                        max = end - head + 1;
                        result = s.substring(head, end + 1);
                        //System.out.println("1 " + i + " " + head + " " +end + " "+ result);
                    }
                }
                else break;
                head -= 1;
                end += 1;
            }
        }
        return result;
    }
    }

}
