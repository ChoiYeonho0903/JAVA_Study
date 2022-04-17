package com.effectivejava.chapter01.item01;

public interface HelloService {
    String hello();
    static HelloService getInstance (String lang) {
        if (lang.equals("ko")) {
            return new KoreanHelloService();
        } else {
            return new EnglishHelloService();
        }
    }
}
