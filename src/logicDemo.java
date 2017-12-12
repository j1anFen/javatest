import java.util.Scanner;

public class logicDemo {
    public static void main(String[] args){
        System.out.println("请输入一个整数");
        Scanner sc = new Scanner(System.in); //http://bbs.itheima.com/thread-90856-1-1.html scanner介绍
        int n = sc.nextInt();
        if(!(n%3==0)){
            System.out.println(n+"不能被三整除");
        }else{
            System.out.println(n+"能被三整除");
        }
    }
}
