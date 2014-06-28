package com.puppycrawl.tools.checkstyle.naming;

import java.io.Serializable;

public class InputTypeParameterName <t>
{
    public <TT> void foo() { }
    
    <e_e> void foo(int i) {
    }
}

class Other <foo extends Serializable & Cloneable> {
    
    foo getOne() {
	return null;
    }
    
    <Tfo$o2T extends foo> Tfo$o2T getTwo(Tfo$o2T a) {
	return null;
    }
    
    <foo extends Runnable> foo getShadow() {
	return null;
    }
    
    static class Junk <foo> {
        <_fo extends foo> void getMoreFoo() {
	}
    }
}

class MoreOther <T extends Cloneable> {
    
    <E extends T> void getMore() {
        new Other() {
            <T> void getMoreFoo() {
	    }
	};
	
//        Other o = new Other() {
//            <EE> void getMoreFoo() {
//            }
//        };
    }
}
