package com.algos

class RotLeft {

    fun solution(a: Array<Int>, d: Int): Array<Int> {
        val leftRotated = mutableListOf<Int>()

        for (i: Int in a.indices) {
            val shiftedIndex = (d + i) % a.size
            leftRotated.add(a[shiftedIndex])
        }

        return leftRotated.toTypedArray()
    }
}