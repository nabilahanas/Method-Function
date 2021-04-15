package com.example.FunctionandMethod;

public class Modul4_Kel34 {
    // non-return type dengan parameter
    static void cetak(String kelompok) {
        System.out.println(kelompok);
    }

    // non-return type tanpa parameter
    static void cetak1() {
        System.out.println("Hello Praktikan DKP 2021 ^^ ");
    }

    // return type dengan parameter
    static String cetak2(String text) {
        return text;
    }

    // return type tanpa parameter
    static String cetak3() {
        return "Kali ini kita akan belajar mengenai Function";
    }

    public static void main(String[] args) {
        //
        Pendefinisi objek = new Pendefinisi();
        objek.greeting();
        objek.kelompok("Kelompok 34");
        String print = objek.kenalan("Hana", "Rebahan");
        System.out.println(print);
    }
}
