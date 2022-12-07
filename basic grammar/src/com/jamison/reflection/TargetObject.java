package com.jamison.reflection;

/**
 * @author jamison
 */
public class TargetObject {
    private String value;

    private TargetObject() {
        value = "JavaGuide";
    }

    public void publicMethod(String s) {
        System.out.println("I love" + s);
    }

    private void privateMethod() {
        System.out.println("value is" + value);
    }
}
