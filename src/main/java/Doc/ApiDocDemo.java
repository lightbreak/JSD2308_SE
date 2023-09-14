/**
 *功能(文档注释是功能级注释,由于说明一个类,方法,常量等功能描述
 * 可以被javadoc命令生成为文档手册使用
 *
 * @Author Jan
 * @version 版本
 * @see 参考文件
 *sicne JDk版本
 * @返回一个字符串,包含问候语
 */
package Doc;

public class ApiDocDemo {

    public static final String INFO="Hallo Welt!";
    public static void main(String[] args) {
        System.out.println(INFO);
        String name="name";
        name=sayHallo(name);
        System.out.println(name);
    }
    public static String sayHallo(String name){
        name=name+", Hallo";
        return name;
    }
}
