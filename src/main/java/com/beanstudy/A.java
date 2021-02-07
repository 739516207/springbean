package com.beanstudy;

import org.springframework.stereotype.Component;

/**
 * @author admin
 */
@Component
public class A {

    private B b;

    public B getB() {
        return b;
    }

    public void setB(B b) {
        this.b = b;
    }
}
