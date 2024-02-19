package DataStructure.Arrays;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

/**
 * Created by RaedMassoud on 2/19/2024
 * Project: HackerRank-Solutions
 */
public class SparseArrays {

    public static List<Integer> matchingStrings(List<String> stringList, List<String> queries) {

        List<Integer> result = new ArrayList<>();
        HashMap<String, Integer> map = new HashMap<>();

        for(String s : stringList)
            map.put(s, map.getOrDefault(s, 0) + 1);

        for(int i = 0; i < queries.size(); i++) {
            result.add(i, map.getOrDefault(queries.get(i), 0));
        }

        return result;
    }
}
