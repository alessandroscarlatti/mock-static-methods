package com.scarlatti

import org.junit.Test
import org.junit.runner.RunWith
import org.mockito.BDDMockito
import org.powermock.api.mockito.PowerMockito
import org.powermock.core.classloader.annotations.PrepareForTest
import org.powermock.modules.junit4.PowerMockRunner
import spock.lang.Specification

/**
 * ~     _____                                    __
 * ~    (, /  |  /)                /)         (__/  )      /)        ,
 * ~      /---| // _ _  _  _ __  _(/ __ ___     / _ _  __ // _ _/_/_
 * ~   ) /    |(/_(//_)/_)(_(/ ((_(_/ ((_)   ) / (_(_(/ ((/_(_((_(__(_
 * ~  (_/                                   (_/
 * ~  Monday, 11/6/2017
 */
@RunWith(PowerMockRunner.class)
@PrepareForTest(Penguin.class)
class MockStaticMethodPowerMockTest {

    @Test
    void canMockStaticMethodWorks() {
        // given
        PowerMockito.mockStatic(Penguin.class)
        BDDMockito.given(Penguin.getContinent()).willReturn("Antarctica2")

        // when
        String continent = Penguin.getContinent()

        PowerMockito.verifyStatic(Penguin.class)

        println continent
    }

}
