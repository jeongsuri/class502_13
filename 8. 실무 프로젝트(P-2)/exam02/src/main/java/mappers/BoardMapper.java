package mappers;

import board.Board;

import java.util.List;

public interface BoardMapper {
    int writeBoard(Board board);
    List<Board> getList(Board board);
    List<Board> getList2(Board board);
    List<Board> getList3(Board board);
}
