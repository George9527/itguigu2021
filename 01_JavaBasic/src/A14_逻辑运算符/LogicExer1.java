package A14_逻辑运算符;

public class LogicExer1 {
    public static void main(String[] args){
        int x = 1;
        int y = 1;

        //x==2 ,x++  false  x = 2 左边为false
        //右边继续
        //++y  y==2  y=2  y==2成立  右边为true
        //false & true 结果false
        if(x++==2 & ++y==2){
            x =7;
        }
        System.out.println("x="+x+",y="+y);//x=2,y=2
    }
}
