
import com.algos.RotLeft
import io.kotest.matchers.shouldBe
import org.junit.jupiter.params.ParameterizedTest
import org.junit.jupiter.params.provider.Arguments
import org.junit.jupiter.params.provider.MethodSource

class RotLeftTest {
    private val target = RotLeft()

    companion object {
        @JvmStatic
        fun testCases() = listOf(
            Arguments.of(arrayOf(1,2,3,4,5), 4, arrayOf(5,1,2,3,4)),
            Arguments.of(arrayOf(33,47,70,37,8,53,13,93,71,72,51,100,60,87,97), 13, arrayOf(87,97,33,47,70,37,8,53,13,93,71,72,51,100,60)),
            Arguments.of(arrayOf(41,73,89,7,10,1,59,58,84,77,77,97,58,1,86,58,26,10,86,51), 10, arrayOf(77,97,58,1,86,58,26,10,86,51,41,73,89,7,10,1,59,58,84,77)),
        )
    }

    @ParameterizedTest
    @MethodSource("testCases")
    fun `run tests`(a: Array<Int>, d: Int,  expected: Array<Int>) {
        target.solution(a, d) shouldBe expected
    }

}