package game;

import lombok.Builder;
import lombok.Data;

@Builder
@Data
public class Score {
    private int score;
    private String userId;
}
