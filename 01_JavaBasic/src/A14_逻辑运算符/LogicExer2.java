package A14_逻辑运算符;

public class LogicExer2 {
    public static void main(String[] args){
        int x = 1,y = 1;

        //x==2,x++  左边条件为false，x=2
        //因为短路与，右边不算
        //false && ? 结果是false
        if(x++==2 && ++y==2){
            x =7;
        }
        System.out.println("x="+x+",y="+y);//x=2,y=1
    }
}
