package bitmanipulation;

import org.junit.Assert;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class BitManipulationTest {
    @Test
    void insertBitSequenceTest() throws Exception {
        String actual = BitManipulation.insertBitSequence(0b1000_0111_100, 0b10011, 2, 6);
        String desired = "10001001100";
        Assert.assertEquals(desired, actual);
    }@Test
    void insertBitSequenceInvalidTest() throws Exception {
        String actual = BitManipulation.insertBitSequence(0b1000_0111_100, 0b10011, 2, 4);
        String desired = "";
        Assert.assertEquals(desired, actual);
    }
}