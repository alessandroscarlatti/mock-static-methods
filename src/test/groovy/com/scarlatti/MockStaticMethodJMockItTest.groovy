package com.scarlatti

import mockit.Expectations
import mockit.Invocations
import mockit.Mock
import mockit.MockUp
import org.junit.Test
import org.mockito.internal.invocation.InvocationsFinder

/**
 * ~     _____                                    __
 * ~    (, /  |  /)                /)         (__/  )      /)        ,
 * ~      /---| // _ _  _  _ __  _(/ __ ___     / _ _  __ // _ _/_/_
 * ~   ) /    |(/_(//_)/_)(_(/ ((_(_/ ((_)   ) / (_(_(/ ((/_(_((_(__(_
 * ~  (_/                                   (_/
 * ~  Monday, 11/6/2017
 */
class MockStaticMethodJMockItTest {



    @Test
    void canMockStaticMethodWorks() {
        new MockUp<Penguin>() {

            @Mock
            public String getContinent() {
                return "Antarctica3"
            }
        };

        assert "Antarctica3" == Penguin.getContinent()
    }

}
