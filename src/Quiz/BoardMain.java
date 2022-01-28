package Quiz;

import review.Board;

import java.util.List;

public class BoardMain {

    public static void main(String[] args) {

      /*  List<BoardDao> board = new ArrayList<>();

        System.out.print(new BoardDao().getBoardList() + "\n");

        System.out.println();
        System.out.println();*/

        // 5번
       /* List<BoardDao> board1 = new ArrayList<>();
        for (BoardDao board2 : board1) {
            board1.add(new BoardDao());
            System.out.println(board2);
        }*/

        // 6번
        /*HashMap<String, Integer> students = new HashMap<>();
        for (int i = 0; i < students.size(); i++) {
            System.out.println(students.get(i));
        }*/

        //7번
        BoardDao dao = new BoardDao();

        // 목적 : BoardDao의 getBoardList에서 반환받은 값을 sout로 출력
        // 1. 반환받을 타입의 변수 생성
        //      - 반환 받을 타입: List<Board>
        //      - 변수명: list
        // 2. 변수에 getBoardList에서 반환 받은 값 대입
        // 3. sout로 변수에 들어있는 값 출력
        List<Board> list = dao.getBoardList();

        for (int i = 0; i < list.size(); i++) {
            Board board = list.get(i);
            System.out.println(board);
        }

        for (Board board : list) {
            System.out.println("board = " + board);
        }

        int[] container = {100, 101, 102, 103, 11114, 523};

        for (int value : container) {
            System.out.println("i = " + value);
        }

        // static 은 객체 생성 없이 접근 가능 하다.
        // 왜? 메모리에 첫빠따로 올라가 있기 때문에, 또 메모리에 올리고 실행할 필요 없다.
        // 그럼 어떻게 쓰느냐. 클래스명에서 바로 접근 가능
        // List<Board> staticList = BoardDao.getBoardList();
    }
}