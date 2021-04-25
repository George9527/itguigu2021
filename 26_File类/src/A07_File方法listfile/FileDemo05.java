package A07_File方法listfile;

// 返回值是File[] 数组 , 存储了多个File对象, 方法的作用是遍历当前的文件夹

import java.io.File;

public class FileDemo05 {
    public static void main(String[] args) {
        //fileMethod();

        foreachDir(new File("C:\\Java\\jdk1.8.0_221"));
    }


    /**
     * 目录的递归遍历 : 传递参数,遍历哪个路径,传递过来
     */

    public static void foreachDir(File dir){
        System.out.println(dir);
        //listFiles()遍历目录  C:\Java\jdk1.8.0_221
        File[] files = dir.listFiles();
        //遍历数组,取出数组中的File对象
        //是遍历到的所有文件的全路径 (绝对路径)
        for(File f : files){

            //判断遍历到的路径是不是文件夹
            if(f.isDirectory()) //C:\Java\jdk1.8.0_221\jre  ,进入继续遍历
                //递归调用自己,传递路径
                foreachDir(f);

            else
                System.out.println(f);
        }
    }


    /**
     * 遍历目录
     */
    public static void fileMethod(){
        File file = new File("C:\\Java\\jdk1.8.0_221");
        File[] files = file.listFiles();
        for(File f : files){
            System.out.println(f);
        }
    }
}
