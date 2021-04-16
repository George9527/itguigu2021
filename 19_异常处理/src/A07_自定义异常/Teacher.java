package A07_自定义异常;

public class Teacher {
    public void checkScore(int score) throws ScoreException{
        if (score < 0 || score > 100) {
            System.out.println("你给出的分数有误，分数应该在0~100之间");
            throw new ScoreException("你给出的分数有误，分数应该在0~100之间");
        } else {
            System.out.println("分数正常");
        }
    }
}
