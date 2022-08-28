package com.cydeo.java13;

public class TextBlockDemo {
    public static void main(String[] args) {
        var address = "7925 Jones Branch Drive \n "+
                "McLean, VA 22102";

        System.out.println(address);

        var address2 = """
                7925 Jones Branch Drive
                McLean, VA 22102
                My Name is
                Qadir Ibrahimov
                I enjoy Java
                """;
        System.out.println(address2);
    }
}
