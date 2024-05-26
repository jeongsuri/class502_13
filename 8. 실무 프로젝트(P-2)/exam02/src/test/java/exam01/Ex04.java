package exam01;

import board.Board;
import configs.DBConn;
import mappers.BoardMapper;
import mappers.MemberMapper;
import member.Member;
import org.apache.ibatis.session.SqlSession;
import org.junit.jupiter.api.Test;

import java.util.List;

public class Ex04 {
    private SqlSession session = DBConn.getSession();

    @Test
    void test1(){
        BoardMapper mapper = session.getMapper(BoardMapper.class);
        Board board = Board.builder()
                .poster("Test2")
                .subject("제목2")
                .content("내용2")
                .build();
        int cnt = mapper.writeBoard(board);
    }

    @Test
    void test2(){
        BoardMapper mapper = session.getMapper(BoardMapper.class);
        Board board = Board.builder()
                .subject("제목2")
                .content("내용2")
                .build();
        List<Board> boards = mapper.getList(board);
        boards.forEach(System.out::println);

    }
    @Test
    void test3(){
        BoardMapper mapper = session.getMapper(BoardMapper.class);
        Board board = Board.builder()
                .subject("제목")
                .content("내용")
                .build();
        List<Board> boards = mapper.getList2(board);
        boards.forEach(System.out::println);

    }

    @Test
    void test4(){
        BoardMapper mapper = session.getMapper(BoardMapper.class);
        Board board = Board.builder()
                .seq(1)
                .build();
        List<Board> boards = mapper.getList3(board);
        boards.forEach(System.out::println);
    }
}
