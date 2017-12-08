public class FloatDemo {
    //f=1234.328
    //d=5623.464
    //d1=123.0
    public static void main(String[] args){
        //定义一个单精度浮点型(必须加f默认双精度为d)
        //把数据类型大的转换为小的会报错
        float f = 1234.328f;
        System.out.print("f="+f+"\n");
        //定义一个双精度浮点型变量,存放5623.465
        double d = 5623.464;
        System.out.print("d="+d+"\n");
        //隐式转换了 从int自动转换为double
        double d1 = 123;
        System.out.print("d1="+d1+"\n");
    }
}
