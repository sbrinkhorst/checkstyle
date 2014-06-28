package com.puppycrawl.tools.checkstyle.coding;

public class InputExplicitInit {
    private int x = 0;
    private Object bar = null;
    private int y = 1;
    private long y1 = 1 - 1;
    private long y3;
    private long y4 = 0L;
    private boolean b1 = false;
    private boolean b2 = true;
    private boolean b3;
    private String str = "";
    java.lang.String str1 = null, str3 = null;
    int ar1[] = null;
    int ar2[] = new int[1];
    int ar3[];
    float f1 = 0f;
    double d1 = 0.0;

    static char ch;
    static char ch1 = 0;
    static char ch2 = '\0';
    static char ch3 = '\1';

    void method() {
        int xx = 0;
        String s = null;
    }
}

interface interface1{
    int TOKEN_first = 0x00;
    int TOKEN_second = 0x01;
    int TOKEN_third = 0x02;
}

class InputExplicitInit2 {
    private Bar<String> bar = null;
    private Bar<String>[] barArray = null;
}

enum InputExplicitInit3 {
    A,
    B
    {
        private int x = 0;
        private Bar<String> bar = null;
        private Bar<String>[] barArray = null;
        private int y = 1;
    };
    private int x = 0;
    private Bar<String> bar = null;
    private Bar<String>[] barArray = null;
    private int y = 1;
}

@interface annotation1{
    int TOKEN_first = 0x00;
    int TOKEN_second = 0x01;
    int TOKEN_third = 0x02;
}

class ForEach {
    public ForEach(java.util.Collection<String> strings)
    {
        for(String s : strings) //this should not even be checked
        {

        }
    }
}

class Bar<T> {
}
