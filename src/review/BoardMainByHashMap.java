package review;

import java.time.LocalDateTime;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class BoardMainByHashMap {

    public static void main(String[] args) {

        Map<Integer, Board> boards = new HashMap<>();

        for (int i = 0; i < 5; i++) {
            boards.put((i + 1000), new Board(i, "안녕하세요",
                    "오늘가입했어요." + i, LocalDateTime.now()));
        }


        Set<Map.Entry<Integer, Board>> entries = boards.entrySet();

        for (int i = 0; i < entries.size(); i++) {
            Board board = boards.get((i + 1000));
            System.out.println("board = " + board);
        }

        for (Map.Entry<Integer, Board> entry : entries) {
            System.out.println(entry.getValue());
        }

        Set<Integer> keySet = boards.keySet();
        for (Integer key : keySet) {
            System.out.println("key = " + key);
        }

    }
}
