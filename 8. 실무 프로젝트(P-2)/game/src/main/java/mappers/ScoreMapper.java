package mappers;

import game.Score;
import member.Member;

import java.util.List;

public interface ScoreMapper {
    List<Score> allScore();
    List<Score> myScore(Score score);
}
