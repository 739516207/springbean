package com.beanstudy;

import org.springframework.stereotype.Component;

/**
 * @author admin
 */
@Component
public class B {

    private A a;

    public A getA() {
        return a;
    }

    public void setA(A a) {
        this.a = a;
    }
}
