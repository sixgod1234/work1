package com.myit.demo;

public class Customer {
    public static void main(String[] args) {
        System.out.println("ccc!");
////  模板：      变形soutp\soutm\soutv\sout\xxx.sout
//        System.out.println("args = " + Arrays.deepToString(args));
//        System.out.println("Customer.main");
//        int num1=10;
//        System.out.println("num1 = " + num1);
//
//        int num2=20;
//        System.out.println("num2 = " + num2);
//
//        System.out.println(num1);


//        模板 fori
        String[] arr=new String[]{"tom","hanmiemei","lilei"};
        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);
        }
//        变形iter 增强for循环
        for (String s : arr) {
            System.out.println(s);
        }

//        变形itar 普通for循环
        for (int i = 0; i < arr.length; i++) {
            String s = arr[i];
            System.out.println(s);
        }
//        ifn
        if (arr == null) {

        }
//        inn
        if (arr != null) {

        }
//        xxx.nn/xxx.null
        if (arr != null) {

        }

        if (arr == null) {

        }
    }
}
