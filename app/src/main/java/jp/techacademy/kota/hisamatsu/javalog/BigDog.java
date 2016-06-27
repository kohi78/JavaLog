package jp.techacademy.kota.hisamatsu.javalog;

import android.util.Log;

class BigDog extends Dog {

    static String to_jp = "大型犬";

    public BigDog(String name, int age) {
        super(name, age);
    }

    // class method
    public static void introduce() {
        Log.d("javatest", "これは大型犬クラス");
    }
}
