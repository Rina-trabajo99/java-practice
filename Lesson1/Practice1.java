package Lesson1;
public class Practice1 {
    public static void main(String[] args) {
        //自己紹介プログラム
        String name = "リナ";
        int age = 27;
        double height = 158.5;
        boolean isStudent = false;
        String hobby = "プログラミング";

        System.out.println("名前：" + name);
        System.out.println("年齢：" + age);
        System.out.println("身長：" + height + "cm");
        System.out.println("学生：" + isStudent);
        System.out.println("趣味：" + hobby);      

        System.out.println("==========================");
        //計算プログラム
        int num1 = 2;
        int num2 = 5;

        System.out.println(" 2 + 5 : " + ( num1 + num2 ));
        System.out.println(" 2 - 5 : " + ( num1 - num2 ));
        System.out.println(" 2 × 5 : " + ( num1 * num2 ));
        System.out.println(" 2 ÷ 5 : " + ( num1 / num2 ));
        System.out.println(" 2 % 5 : " + ( num1 % num2 ));

        System.out.println("==========================");
        //型変換プログラム
        int int2Double = 1;
        double result1 = int2Double;
        System.out.println("int → double： " + (result1));

        double double2Int = 1.5;
        int result2 = (int) double2Int;
        System.out.println("double → int： " + (result2));

        int int2Str = 1;
        String result3 = String.valueOf(int2Str);
        System.out.println("int → String： " + (result3));

        String str2Int = "1";
        int result4 = Integer.parseInt(str2Int);
        System.out.println("String → int： " + (result4));





    }    
}
