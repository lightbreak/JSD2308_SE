package String;

public class StringDemo {
    public static void main(String[] args) {
        String s1="123abc";
        String s2="123abc";
        System.out.println("s1="+s1);
        System.out.println("s2="+s2);
        System.out.println("s1==s2--"+(s1.equals(s2)));//
        System.out.println(s1==s2);//ture 地址相同,虽然写了两个字符串但其实是同一个字符串;
        String s4=new String("123abc");//new 会强转创建一个新对象,将不再是一个地址;
        System.out.println(s1==s4);//false
        s1=s1+"!!!";
        System.out.println(s1);//123abc!!!
        System.out.println(s1==s2);//false s1现在是一个新的字符串


        //下面代码实现了
        String s5="123"+"abc";
        System.out.println("s5:"+s5);
        System.out.println(s2==s5);//ture

        String s="123";
        String s6="abc"+s;
        System.out.println(s2==s6);//false


    }
}
