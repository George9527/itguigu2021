package A14_逻辑运算符;

public class LogicExer3 {
    public static void main(String[] args){
        int x = 1,y = 1;

        //x==1,x++  左边为true，x=2
        //因为是逻辑与,右边继续
        //++y, y==1  y=2 右边为false
        //条件true | false，最终为true
        if(x++==1 | ++y==1){
            x =7;
        }
        System.out.println("x="+x+",y="+y);//x=7,y=2
    }
}
