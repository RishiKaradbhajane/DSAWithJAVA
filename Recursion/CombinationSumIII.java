import java.util.ArrayList;
import java.util.List;

public class CombinationSumIII {
    public static void combination(int k, int n, ArrayList<Integer> ds, List<List<Integer>> result, int idx) {
        if (ds.size() == k) {
            if (n == 0)
                result.add(new ArrayList<>(ds));
            return;
        }
        for (int i = idx; i <= 9; i++) {
            ds.add(i);
            combination(k, n - i, ds, result, i + 1);
            ds.remove(ds.size() - 1);
        }
    }

    public static List<List<Integer>> combinationSum3(int k, int n) {
        List<List<Integer>> result = new ArrayList<>();
        combination(k, n, new ArrayList<>(), result, 1);
        return result;
    }

    public static void main(String[] args) {
        List<List<Integer>> result = combinationSum3(3, 7);
        for (List<Integer> l : result)
            System.out.println(l);

    }
}
