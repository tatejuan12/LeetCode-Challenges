import java.util.Arrays;
import java.util.List;
import java.util.ArrayList;

public class App {
    public static void main(String[] args) throws Exception {
        Solution solution = new Solution();
        System.out.println(solution.strStr("sadbutsad", "sad"));
        System.out.println(solution.strStr("leetcode", "leeto"));
        System.out.println(solution.strStr("leetcode", "coder"));
        System.out.println(solution.strStr("mississippi", "issi"));

    }

    public static class Solution {
        public int strStr(String haystack, String needle) {
            List<String> haystackChar = new ArrayList<String>(Arrays.asList(haystack.split("")));
            List<String> needleChar = new ArrayList<String>(Arrays.asList(needle.split("")));
            if (needleChar.size() > haystackChar.size())
                return -1;

            for (int i = 0; i < haystackChar.size()
                    && i + needleChar.size() <= haystackChar.size(); i++) {
                if (haystackChar.subList(i, i + needleChar.size()).equals(needleChar))
                    return i;
            }
            return -1;

        }
    }
}
