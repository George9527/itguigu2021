package A07_自定义异常;

public class ScoreException extends Exception{

    public ScoreException() {
    }

    public ScoreException(String message) {
        super(message);
    }
}
