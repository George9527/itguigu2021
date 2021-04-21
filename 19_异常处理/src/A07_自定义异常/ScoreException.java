package A07_自定义异常;

/**
 *  自定义的异常类
 *    成绩负数的异常
 *    继承哪个父类呢
 *
 *    自定义异常信息 :
 *    1.继承父类 RuntimeException
 *    2.带有String类型的构造方法 (String 异常信息)
 */

public class ScoreException extends RuntimeException {

    public ScoreException() {
    }

    public ScoreException(String message) {
        super(message);
    }
}
