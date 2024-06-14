package board.entities;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDateTime;

@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class BoardData {
    private long seq; //게시글번호
    private String subject; //제목
    private String content; //내용
    private String poster;
    private LocalDateTime regDt;
}
