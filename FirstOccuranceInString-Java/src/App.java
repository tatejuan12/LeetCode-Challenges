import java.util.Arrays;
import java.util.List;
import java.util.ArrayList;

public class App {
    public static void main(String[] args) throws Exception {
        Solution solution = new Solution();
        SolutionOptimised solutionOptimised = new SolutionOptimised();
        // System.out.println(solution.strStr("sadbutsad", "sad"));
        // System.out.println(solution.strStr("leetcode", "leeto"));
        // System.out.println(solution.strStr("leetcode", "coder"));
        // System.out.println(solution.strStr("mississippi", "issi"));
        System.out.println(solutionOptimised.strStr("sadbutsad", "sad"));
        System.out.println(solutionOptimised.strStr("leetcode", "leeto"));
        System.out.println(solutionOptimised.strStr("leetcode", "coder"));
        System.out.println(solutionOptimised.strStr("mississippi", "issi"));

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

    public static class SolutionOptimised {
        public int strStr(String haystack, String needle) {
            int index = haystack.indexOf(needle);
            return index != -1 ? index : -1;
        }
    }
}
