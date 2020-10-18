package com.cacatua;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class maintest {

    @Test
    public void maintestHelloWorld(){
        Main main = new Main();
        assertEquals( "Hello World", main.helloWorld() );
    }
}
