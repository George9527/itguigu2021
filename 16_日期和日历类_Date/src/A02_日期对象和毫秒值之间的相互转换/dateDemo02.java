package A02_日期对象和毫秒值之间的相互转换;

import java.util.Date;

/*
### 3.2 Date类最重要内容

- 日期对象和毫秒值之间的相互转换
- 日期对象,转成毫秒值
  - new Date().getTime()
  - System.currentTimeMillis()
- 毫秒值转成日期对象
  - new Date(毫秒值)
  - new Date().setTime(毫秒值)

> 日期是特殊的数据,不能数学计算,但是毫秒值能!!
>
> `24*60*60*1000` 一天的毫秒值

 */
public class dateDemo02 {
    public static void main(String[] args) {

        // Thu Jan 01 08:00:00 CST 1970 到 现在的毫秒数
        Date date = new Date();
        System.out.println(date.getTime());

        // 1618471233005 转换为日期 Thu Apr 15 15:20:33 CST 2021
        Date date2 = new Date();
        date2.setTime(1618471233005L);
        System.out.println(date2);
    }
}
