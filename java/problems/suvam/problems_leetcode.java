package suvam;

import java.io.Console;
import java.io.InputStreamReader;
import java.util.*;

class names extends problems_leetcode {

}

public class problems_leetcode {
    private final int a = 10;
    protected int b = 1;
    public int c = 2;
    int d = 22;
    static void func(){
        System.out.println("in the sunc function");
        InputStreamReader input=new InputStreamReader(System.in);
       // String s= input.readLine();
       // System.out.println(s);
    }

    public static void main(String[] args) {
        Console input=System.console();
        // practice sc=new practice();
        // System.out.println(sc.a);
        // System.out.println(sc.b);
        // System.out.println(sc.c);
        // System.out.println(sc.d);
        Solution obj = new Solution();
        int[] sum = {1, 2, 3, 4, 5, 6};
        obj.twoSum(sum, 11); // you will give an array and a target which will the sum of array indexes
        Solution2 obj2 = new Solution2();
        //obj2.lengthOfLongestSubstring("abcabcbb");
        func();
    }
}

class Solution2 {
    public int lengthOfLongestSubstring(String s) {
        char[] mee = s.toCharArray();
        String cmpp;

        int sol = 0;
        for (int i = 0; i <= mee.length; i++) {
            for (int j = i + 1; j <= mee.length; j++) {
                cmpp = s.substring(i, j);
                int ans=0;
                char[] cmp=cmpp.toCharArray();
               for (int a = 0; a < cmp.length; a++) {
                   for (int b = a + 1; b < cmp.length; b++) {
                       if (cmp[a] == cmp[b]) {
                           if(ans==0){
                           System.out.println(cmp);
                               if (cmp.length > sol) {

                                   sol = cmp.length-1;
                               }
                               ans++;
                           }
                       }
                   }
               }
            }
        }
        System.out.println(sol);
        return sol;
    }

}

class Solution {
    public int[] twoSum(int[] nums, int target) {
        int ans = 0;
        int[] sol = {};
        for (int i = 0; i < nums.length; i++) {
            for (int j = i + 1; j < nums.length; j++) {
                if (ans == 0) {
                    if (nums[i] + nums[j] == target) {
                        sol = new int[]{i, j};
                        ans++;
                    }
                }
            }
        }
        System.out.println(Arrays.toString(sol));
        return sol;
    }
}
