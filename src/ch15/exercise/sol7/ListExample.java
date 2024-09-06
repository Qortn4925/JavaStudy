package ch15.exercise.sol7;

import java.util.List;

public class ListExample {
    public static void main(String[] args) {
        BoardDao dao = new BoardDao();
        List<Board> list = dao.getBoardList();

        // list로 보드다오 출력
        list.forEach((e) -> {
            System.out.println(e.getContent() + e.getTitle());
        });


        //이건  list에 들어간 <> 타입 파라미터를  받는거라서 
        // T t : list  같은 느낌임 아래에   ㅇㅇ 우리는 그 아래요소인 . 보드의 필드요소인   > board,title에 접근하길 원하는데
        // 각각의 요소들은 private 라서 , get메소드를 통해서 값을 전달 받은거

        list.forEach((e) -> {
            System.out.println(e.getContent() + e.getTitle());
        });

        for (Board board : list) {
            System.out.println(board.getContent() + board.getTitle());
        }
    }
}
