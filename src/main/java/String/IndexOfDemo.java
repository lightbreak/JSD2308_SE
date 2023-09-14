package String;

/**
 * 检索当前字符串中给定的内容的第一次出现的位置,如果当前的字符串中不含有给定内容  返回值-1
 */
public class IndexOfDemo {
    public static void main(String[] args) {
        ///012345679012345
        String str="thinking in java";
        int index= str.indexOf("in");//检索str中in第一次出现的位置
        int index1=str.indexOf("IN");//找不到,返回-1
        System.out.println("index="+index);
        System.out.println(index1);

        int index3=str.indexOf("in",3);//检索str中in从3开始第一次出现的位置
        System.out.println(index3);//5


        int index2=str.lastIndexOf("in");//检索str中in最后一次出现的位置
        System.out.println(index2);//9


    }
}
