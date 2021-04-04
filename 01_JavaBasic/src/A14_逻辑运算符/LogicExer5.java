package A14_逻辑运算符;

public class LogicExer5 {
    public static void main (String []  args)  {
        boolean x = true;
        boolean y = false;
        short z = 42;

        //如果if((z++==42)&&(y==true))条件成立，执行z++，不成立，就不执行z++
        //左边的条件：z==42,z++  z==42成立,z++变成43
        //中间虽然是短路与，因为左边现在是true,右边还要看
        //右边 y==true   不成立
        //true && false 结果为false
        if((z++==42)&&(y==true))	z++;

        //左边为x=false,赋值  结果就为false
        //中间虽然为短路或，因为左边是false,右边继续看
        //++z,z==45  ++z变成44，z==45是否成立，不成立
        //false || false  结果为false
        if((x=false) || (++z==45))  z++;

        System. out.println("z="+z);//44
    }
}
