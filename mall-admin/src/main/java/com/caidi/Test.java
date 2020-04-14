package com.caidi;

/**
 * @author: 蔡迪
 * @date: 23:59 2020/4/14
 * @description: 测试
 */
public class Test {
    public static void main(String[] args) {
        Integer a = 2;
        Integer b = 8;
        int result = Test.sum(a, b);
        System.out.println(result);
        System.out.println("over");
    }


    public static int sum(Integer a, Integer b) {
        System.out.println("计算a +b");
        int result =  a + b;
        print(result);
        return result;
    }


    public static void print(Integer result) {
        System.out.println("计算a +b = " + result);
    }
}