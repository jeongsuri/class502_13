package game;

import lombok.Builder;
import lombok.Data;

@Builder
@Data
public class Score {
    private int score;
    private String userId;

    @Override
    public String toString() {
        return "닉네임 : " +userId +"    점수" + score +'\'';
    }
}
