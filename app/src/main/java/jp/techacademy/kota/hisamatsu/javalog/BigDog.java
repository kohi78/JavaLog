package jp.techacademy.kota.hisamatsu.javalog;

import android.util.Log;

public class BigDog extends Dog {

    private static String TO_JP = "大型犬";

    public BigDog(String name, int age) {
        super(name, age);
    }

    // class method
    public static void introduce() {
        Log.d("javatest", "これは大型犬クラス");
    }
}
