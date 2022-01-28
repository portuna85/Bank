package Quiz;

import review.Board;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

public class BoardDao {

    
    // static 키워드: method 영역, JVM 실행 할 때 올라감
    public List<Board> getBoardList() {

        List<Board> result = new ArrayList<>();

        for (int i = 0; i <= 5; i++) {
            result.add(i, new Board((i), "Hi", "Hello", LocalDateTime.now()));
        }

        return result;
    }
}
