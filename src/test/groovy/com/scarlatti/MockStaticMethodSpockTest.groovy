package com.scarlatti

import org.junit.Test
import spock.lang.Specification

/**
 * ~     _____                                    __
 * ~    (, /  |  /)                /)         (__/  )      /)        ,
 * ~      /---| // _ _  _  _ __  _(/ __ ___     / _ _  __ // _ _/_/_
 * ~   ) /    |(/_(//_)/_)(_(/ ((_(_/ ((_)   ) / (_(_(/ ((/_(_((_(__(_
 * ~  (_/                                   (_/
 * ~  Monday, 11/6/2017
 */
class MockStaticMethodSpockTest extends Specification {

    @Test
    "can mock static method"() {
        when:
            println "mocking static method..."
            println "continent: ${Penguin.getContinent()}"
        then:
            println "mocked static method"
    }

}
