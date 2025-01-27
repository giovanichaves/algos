package com.algos

import kotlin.math.abs

class Demo {

    fun solution(A: IntArray): Int {
        val uniquePosSorted = A.toSet().filter{it>0}.sorted()
        if (uniquePosSorted.isEmpty()) return 1

        if (uniquePosSorted.last() != uniquePosSorted.size) {
            uniquePosSorted.forEachIndexed{ i, n ->
                if (n != i+1) return i+1
            }
        }

        return uniquePosSorted.size+1
    }

//############

    fun findGap(numbers: List<Int>, checkIndex: Int, prevIndex: Int): Int {
        val nextCheck: Int

        if (numbers[checkIndex] == checkIndex+1) {
            if (prevIndex-checkIndex == 1) return checkIndex

            val quadrant = abs(prevIndex - checkIndex)
            val quadrantAdjOdd = quadrant + (quadrant % 2)
            nextCheck = quadrantAdjOdd / 2 + checkIndex

        } else {
            if (checkIndex-prevIndex == 1) return prevIndex

            nextCheck = ((prevIndex-checkIndex) + (numbers.size %2)) / 2
        }

        return findGap(numbers, nextCheck, checkIndex)
    }

    fun solution2(A: IntArray): Int {
        val uniquePosSorted = A.toSet().filter{it>0}.sorted()
        if (uniquePosSorted.firstOrNull() != 1) return 1

        if (uniquePosSorted.last() == uniquePosSorted.size) return uniquePosSorted.size+1

        val gapAt = findGap(uniquePosSorted, (uniquePosSorted.size-1)/2, uniquePosSorted.size-1)
        return uniquePosSorted[gapAt]+1
    }
}