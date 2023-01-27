package com.hillel.lessons.lesson13;

interface Smartphones {

    void call();
    void sms();
    void internet();
}

interface LinuxOS {
    void openSource();
}

interface IOS {
    void icloud();
}

class Androids implements Smartphones, LinuxOS {
    public void call() {
        System.out.println("Calling from Android");

    }
    public void sms() {
        System.out.println("Sending SMS from Android");

    }
    public void internet() {
        System.out.println("Browsing internet from Android");

    }
    public void openSource() {
        System.out.println("Android is based on LinuxOS");

    }

}

class iPhones implements Smartphones, IOS {
    public void call() {
        System.out.println("Calling from iPhone");

    }
    public void sms() {
        System.out.println("Sending SMS from iPhone");

    }
    public void internet() {
        System.out.println("Browsing internet from iPhone");

    }
    public void icloud() {
        System.out.println("Using iCloud from iPhone");

    }

}

    class Main {

    public static void main(String[] args) {

        Androids android = new Androids();
        android.call();
        android.sms();
        android.internet();
        android.openSource();
        iPhones iPhone = new iPhones();
        iPhone.call();
        iPhone.sms();
        iPhone.internet();
        iPhone.icloud();

    }

}

