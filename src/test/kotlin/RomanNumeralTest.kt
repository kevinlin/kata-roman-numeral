package com.zuhlke.kata.roman_numeral

import org.junit.Assert
import org.junit.Test

class RomanNumeralTest {

    @Test
    fun convert_I_1() {
        Assert.assertEquals(1, RomanNumeral("I").convert())
    }

    @Test
    fun convert_II_2() {
        Assert.assertEquals(2, RomanNumeral("II").convert())
    }

    @Test
    fun convert_V_5() {
        Assert.assertEquals(5, RomanNumeral("V").convert())
    }

    @Test
    fun convert_IV_4() {
        Assert.assertEquals(4, RomanNumeral("IV").convert())
    }

    @Test
    fun convert_VIII_8() {
        Assert.assertEquals(8, RomanNumeral("VIII").convert())
    }

    @Test
    fun convert_IX_9() {
        Assert.assertEquals(9, RomanNumeral("IX").convert())
    }

    @Test
    fun convert_XIV_14() {
        Assert.assertEquals(14, RomanNumeral("XIV").convert())
    }

    @Test
    fun convert_XLVIII_44() {
        Assert.assertEquals(44, RomanNumeral("XLIV").convert())
    }

    @Test
    fun convert_XLVIII_48() {
        Assert.assertEquals(48, RomanNumeral("XLVIII").convert())
    }

    @Test
    fun convert_MDCCLXXVI_1776() {
        Assert.assertEquals(1776, RomanNumeral("MDCCLXXVI").convert())
    }

    @Test
    fun revert_1_I() {
        Assert.assertEquals("I", RomanNumeral.revert(1))
    }

    @Test
    fun revert_5_V() {
        Assert.assertEquals("V", RomanNumeral.revert(5))
    }

    @Test
    fun revert_4_IV() {
        Assert.assertEquals("IV", RomanNumeral.revert(4))
    }

    @Test
    fun revert_7_VII() {
        Assert.assertEquals("VII", RomanNumeral.revert(7))
    }

    @Test
    fun revert_10_X() {
        Assert.assertEquals("X", RomanNumeral.revert(10))
    }

    @Test
    fun revert_9_IX() {
        Assert.assertEquals("IX", RomanNumeral.revert(9))
    }

    @Test
    fun revert_40_LX() {
        Assert.assertEquals("XL", RomanNumeral.revert(40))
    }

    @Test
    fun revert_98_XCVIII() {
        Assert.assertEquals("XCVIII", RomanNumeral.revert(98))
    }

    @Test
    fun revert_246_CCXLVI() {
        Assert.assertEquals("CCXLVI", RomanNumeral.revert(246))
    }

    @Test
    fun revert_421_CDXXI() {
        Assert.assertEquals("CDXXI", RomanNumeral.revert(421))
    }

    @Test
    fun revert_1776_MDCCLXXVI() {
        Assert.assertEquals("MDCCLXXVI", RomanNumeral.revert(1776))
    }

}