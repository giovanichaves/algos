package com.algos

class Bribes {

    companion object {
        val chaoticMsg = "Too chaotic"
    }

    fun solution(q: Array<Int>) {
        var bribes = 0

        var lastN = 0
        q.forEachIndexed { i, n ->
            val posDiff = n - i - 1

            if (posDiff > 2) {
                println(chaoticMsg)
                return
            }

            if (posDiff > 0) {
                bribes += posDiff

//            } else{
//                if (q.getOrElse(i+1) { Int.MAX_VALUE } < n) {
//                    bribes++
//                }
//                if (q.getOrElse(i+2) { Int.MAX_VALUE } < n) {
//                    bribes++
//                }
//                if (q.getOrElse(i+3) { Int.MAX_VALUE } < n) {
//                    bribes++
//                }
//                if (q.getOrElse(i+4) { Int.MAX_VALUE } < n) {
//                    bribes++
//                }

            } else if (posDiff < -2) {
                bribes += posDiff / 2 * -1 - 1
            }
        }

        println(bribes)
    }


    fun solution2(q: Array<Int>) {
        var bribes = 0

        val iterator = q.iterator()
        var last = iterator.next()
        var position = 0
        while (iterator.hasNext()) {
            val current = iterator.next()

            if (last - position > 3) {
                println(chaoticMsg)
                return
            }

            if (last > current) {
                val diff = last - current
                bribes += diff
            }
            last = current
            position++
        }

        println(bribes)
    }



    fun solution3(q: Array<Int>) {
        var bribes = 0

        val iterator = q.iterator()
        var last = iterator.next()
        var position = 1
        while (iterator.hasNext()) {
            val current = iterator.next()

            val diff = last - position

            if (diff > 2) {
                println(chaoticMsg)
                return
            }

            if (diff > 0) {
                bribes += diff
            }
            val diff2 = current - last
            if (diff2 > 0)
                bribes++

            last = current
            position++
        }

        println(bribes)
    }
}