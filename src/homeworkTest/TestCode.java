package homeworkTest;

import java.util.HashMap;

/**
 * Created by dhgof_000 on 2016-12-29.
 */
public class TestCode {
    public static void main(String[] args) {
        HashMap<Integer, String> map = new HashMap<>();
        map.put(1, "1번 인덱스에 넣어봄");
        map.put(100, "100번 인덱스에 넣어봄");
        System.out.println(map.size());
        System.out.println(map.get(100));
        System.out.println(map.get(2));
    }
}
