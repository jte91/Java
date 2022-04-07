//Write a function to find the longest common prefix
//string amongst an array of strings of none return ""
class solution
{
    public String longestCommonPrefix(String[] strs) 
    {
        if(strs.length==0)
        {
            return "";
        }
        String prefix=strs[0];

        for(int i=1;i<strs.length;i++)
        {
            while(strs[i].indexOf(prefix)!=0)
            {
                prefix=prefix.substring(0,prefix.length()-1);
            }
        }
        return prefix;
        //or
        String s = "";
        Arrays.sort(strs);
        for(int i=0;i<strs[0].length();i++)
        {
            if(strs[0].charAt(i)==strs[strs.length-1].charAt(i))
            {
                s = s +strs[0].charAt(i);
            }
            else
            break;
        }
        return s;
        //or
        if (strs == null || strs.length == 0) return "";
        for (int i = 0; i < strs[0].length() ; i++){
            char c = strs[0].charAt(i);
            for (int j = 1; j < strs.length; j ++) {
                if (i == strs[j].length() || strs[j].charAt(i) != c)
                    return strs[0].substring(0, i);             
            }
        }
        return strs[0];
    }
    public static void main(String[] args)
    {
        System.out.println(longestCommonPrefix(["flower", "flow", "flight"]));
    }
}
