package JewelsAndStones;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class SolutionTest {
    JewelsAndStones.Solution solution;

    @BeforeEach
    void setUp() {
        solution = new Solution();
    }

    @Test
    void OneStoneOneJewel() {
        String J = "a";
        String S = "a";
        int numJewels = solution.numJewelsInStones(J, S);

        assertEquals(1, numJewels);
    }

    @Test
    void TwoStonesBothJewels() {
        String J = "a";
        String S = "aa";
        int numJewels = solution.numJewelsInStones(J, S);

        assertEquals(2, numJewels);
    }

    @Test
    void TwoStonesOneJewel() {
        String J = "a";
        String S = "aA";
        int numJewels = solution.numJewelsInStones(J, S);

        assertEquals(1, numJewels);
    }
}