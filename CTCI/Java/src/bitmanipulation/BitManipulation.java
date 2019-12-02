package bitmanipulation;

public class BitManipulation {
    /**
     *
     * @param N Binary number to insert into
     * @param M Binary number to be inserted
     * @param i M's LSB will start at this index in N
     * @param j M's MSB will end at this index in M
     * @return Result as binary string
     */
    // assumes j-i > |M| and j > i
    static public String insertBitSequence(int N, int M, int i, int j) {
        if (i > j || j-i < Integer.toBinaryString(M).length()) {
            return "";
        }
        // create mask 1*{0*}1* where {} is i to j
        // first create all 1s of length j-i+1 e.g. 6,2 gives 5 1s (11111)
        // subtract 1 and shift by i, (11111)
        // n
        int allOnes = 1 << (j - i + 1);
        int mask = ~(allOnes -1 << i);
        return Integer.toBinaryString(N & mask | (M << (i)));
    }
}
