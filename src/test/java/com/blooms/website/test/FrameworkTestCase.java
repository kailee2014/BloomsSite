package com.blooms.website.test;

import junit.framework.TestCase;

import com.blooms.website.framework.FrameworkTest;

public class FrameworkTestCase extends TestCase {
    public FrameworkTestCase(String testMethod) {
        super(testMethod);
    }

    public void testGcd() {
        assertEquals(5, FrameworkTest.test("5"));
    }

    public static void main(String[] args) {
        junit.textui.TestRunner.run(FrameworkTestCase.class);
    }

}
