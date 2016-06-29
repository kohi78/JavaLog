package jp.techacademy.kota.hisamatsu.javalog;

import android.util.Log;

public class Dog extends Animal implements Movable {

    // class var
    private static String TO_JP = "犬";

    // member var
    private String name;
    private int age;

    // constructor
    public Dog(String name, int age) {
        this.name = name;
        this.age = age;
    }

    // class method
    public static void introduce() {
        Log.d("javatest", "これは犬クラス");
    }

    // member method
    @Override
    public void say(){
        Log.d("javatest", this.name + "(" + this.age + "歳)" + "「ワンワン」");
    }

    @Override
    public void move() {
        Log.d("javatest", this.name + "(" + this.age + "歳)" + "は全力で走った。");
    }
}
