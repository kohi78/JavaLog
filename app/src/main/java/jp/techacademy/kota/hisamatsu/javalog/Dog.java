package jp.techacademy.kota.hisamatsu.javalog;

import android.util.Log;

class Dog extends Animal implements Movable {

    // class var
    static String to_jp = "犬";

    // member var
    String name;
    int age;

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
    public void say(){
        Log.d("javatest", this.name + "(" + this.age + "歳)" + "「ワンワン」");
    }

    @Override
    public void move() {
        Log.d("javatest", this.name + "(" + this.age + "歳)" + "は全力で走った。");
    }
}
