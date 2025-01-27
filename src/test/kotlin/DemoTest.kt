import com.algos.Demo
import org.junit.jupiter.params.ParameterizedTest
import org.junit.jupiter.params.provider.Arguments
import org.junit.jupiter.params.provider.MethodSource
import kotlin.test.assertEquals

class DemoTest {

    private val target = Demo()

    companion object {
        @JvmStatic
        fun testCases() = listOf(
            Arguments.of(intArrayOf(1, 3, 4, 5, 6, 7), 2),
            Arguments.of(intArrayOf(1, 2, 3, 4, 5, 7), 6),
            Arguments.of(intArrayOf(1, 3, 4, 5, 6, 7, 8), 2),
            Arguments.of(intArrayOf(1, 2, 3, 4, 5, 6, 8), 7),
            Arguments.of(intArrayOf(0, -2), 1),
            Arguments.of(intArrayOf(1, 3, 2, 4, 1, 6), 5),
            Arguments.of(intArrayOf(1, 2, 3, 4, 5, 6, 7), 8),
            Arguments.of(intArrayOf(1, 2, 3, 4, 5, 6), 7),
            Arguments.of(intArrayOf(1, 1, 2, 1, 2, 1), 3),
            Arguments.of(intArrayOf(-1, -3, -2, 4, 5, 6), 1),
            Arguments.of(intArrayOf(1,2,3,4,5,6,7,9), 8),
        )
    }

    @ParameterizedTest
    @MethodSource("testCases")
    fun `run tests`(test: IntArray, expected: Int) {
        assertEquals(expected, target.solution(test))
    }

    @ParameterizedTest
    @MethodSource("testCases")
    fun `run tests2`(test: IntArray, expected: Int) {
        assertEquals(expected, target.solution2(test))
    }


}