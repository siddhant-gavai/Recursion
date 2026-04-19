import java.util.*;

public class CombinationSum {
    /**
     * Problem: Given an array of distinct integers candidates and a target integer target, 
     * return a list of all unique combinations where the chosen numbers sum to target.
     * You may return the combinations in any order. The same number may be chosen from 
     * candidates an unlimited number of times.
     * 
     * Approach: Backtracking
     * T.C: O(N^(T/M + 1)) where N is number of candidates, T is target, M is minimal value in candidates.
     * S.C: O(T/M) for recursion stack
     */
    public List<List<Integer>> combinationSum(int[] candidates, int target) {
        List<List<Integer>> result = new ArrayList<>();
        backtrack(result, new ArrayList<>(), candidates, target, 0);
        return result;
    }

    private void backtrack(List<List<Integer>> result, List<Integer> tempList, int[] candidates, int remain, int start) {
        if (remain < 0) {
            return; // Base case: exceeded target
        } else if (remain == 0) {
            result.add(new ArrayList<>(tempList)); // Base case: found a valid combination
        } else {
            for (int i = start; i < candidates.length; i++) {
                tempList.add(candidates[i]);
                // Not i + 1 because we can reuse the same element
                backtrack(result, tempList, candidates, remain - candidates[i], i);
                // Backtrack
                tempList.remove(tempList.size() - 1);
            }
        }
    }

    public static void main(String[] args) {
        CombinationSum sol = new CombinationSum();
        int[] candidates = {2, 3, 6, 7};
        int target = 7;
        List<List<Integer>> result = sol.combinationSum(candidates, target);
        
        System.out.println("Combination Sum for target " + target + " with candidates " + Arrays.toString(candidates) + ":");
        for (List<Integer> c : result) {
            System.out.println(c);
        }
    }
}
