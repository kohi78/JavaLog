package jp.techacademy.kota.hisamatsu.javalog;

import android.util.Log;

class Human extends Animal implements Thinkable{

    String name;
    int age;
    String hobby;

    public Human(String name, int age, String hobby) {
        this.name = name;
        this.age = age;
        this.hobby = hobby;
    }

    public void say() {
        Log.d("javatest", "私の名前は " + name + " です。年は " + age + " 歳です。");
    }

    @Override
    public void think() {
        Log.d("javatest", "私は " + hobby + " について考える。");
    }
}
