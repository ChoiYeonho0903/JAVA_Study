package com.effectivejava.chapter01.item01;

public class HelloServiceFactory {

    public static void main(String[] args) {
        HelloService ko = HelloService.getInstance("ko");
    }
}
