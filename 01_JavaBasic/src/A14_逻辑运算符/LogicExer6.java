package A14_逻辑运算符;

public class LogicExer6 {
    public static void main (String []  args)  {
        boolean x = true;
        boolean y = false;
        short z = 42;

        //如果if(y=true)条件成立，接着判断if((z++==42)&&(y==true))	z++;
        //如果不成立，if((z++==42)&&(y==true))	z++;	不看的
		/*
		if(y = true)

		if((z++==42)&&(y==true))	z++;

		if((x=false) || (++z==45))  z++;
		*/

        //标准
        //y=true赋值，y就被修改为true,if(true)成立
        if(y=true){
            //左边：z==42,z++  成立,z变成43
            //&&短路与，不满足短路的情况，右边继续
            //y==true 成立
            //true && true，结果为true
            if((z++==42)&&(y==true)){
                //z++变成44
                z++;
            }
        }
        //左边：x=false不成立
        //中间虽然是短路或，但是没满足短路的情况，右边继续
        //++z,z==45  ++z变成45，z==45成立
        if((x=false) || (++z==45)){
            //z++，变成46
            z++;
        }
        System. out.println("z="+z);//46
    }
}
