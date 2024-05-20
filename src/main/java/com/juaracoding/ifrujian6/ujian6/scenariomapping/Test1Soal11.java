/*
IntelliJ IDEA 2023.3.6 (Community Edition)
Build #IC-233.15026.9, built on March 21, 2024
@Author imam-f a.k.a. Imam FR
Java Developer
Created on 18/05/2024 17:23
@Last Modified 18/05/2024 17:23
Version 1.0
*/

package com.juaracoding.ifrujian6.ujian6.scenariomapping;

public enum LoginTesting {

    T1("Test001 Login Dengan Username Dan Password Yang Valid");
    private String testName;
    private LoginTesting(String value) {
        testName = value;
    }
    public String getTestName() {
        return testName;
    }
}

