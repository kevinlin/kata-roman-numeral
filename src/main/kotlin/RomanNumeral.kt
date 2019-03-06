package com.zuhlke.kata.roman_numeral

fun main() {
    for (i in 1..4000) {
        println(i.toString() + " = " + RomanNumeral.revert(i))
    }
}

class RomanNumeral(val roman: String) {

    fun convert(): Int {
        var result = 0
        var prevNum = 0

        for (char in roman.reversed().asSequence()) {
            val currNum = when (char) {
                'I' -> 1
                'V' -> 5
                'X' -> 10
                'L' -> 50
                'C' -> 100
                'D' -> 500
                'M' -> 1000
                else -> 0
            }

            if (currNum >= prevNum) {
                result += currNum
            } else {
                result -= currNum
            }
            prevNum = currNum
        }

        return result
    }

    companion object {
        val numList: List<Int> = listOf(1000, 900, 500, 400, 100, 90, 50, 40)

        fun revert(num: Int): String {
            var remainNum = num
            var result = ""

            while (remainNum > 0) {
                when {
                    remainNum >= 1000 -> {
                        result += "M"
                        remainNum -= 1000
                    }
                    remainNum >= 900 -> {
                        result += "CM"
                        remainNum -= 900
                    }
                    remainNum >= 500 -> {
                        result += "D"
                        remainNum -= 500
                    }
                    remainNum >= 400 -> {
                        result += "CD"
                        remainNum -= 400
                    }
                    remainNum >= 100 -> {
                        result += "C"
                        remainNum -= 100
                    }
                    remainNum >= 90 -> {
                        result += "XC"
                        remainNum -= 90
                    }
                    remainNum >= 50 -> {
                        result += "L"
                        remainNum -= 50
                    }
                    remainNum >= 40 -> {
                        result += "XL"
                        remainNum -= 40
                    }
                    remainNum >= 10 -> {
                        result += "X"
                        remainNum -= 10
                    }
                    remainNum >= 9 -> {
                        result += "IX"
                        remainNum -= 9
                    }
                    remainNum >= 5 -> {
                        result += "V"
                        remainNum -= 5
                    }
                    remainNum >= 4 -> {
                        result += "IV"
                        remainNum -= 4
                    }
                    else -> {
                        result += "I"
                        remainNum -= 1
                    }
                }
            }

            return result
        }
    }

}