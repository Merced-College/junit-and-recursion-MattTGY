import static org.junit.Assert.*;
import org.junit.Test;
import org.junit.Test;

/**
 * Name: [Your Name]
 * Date: April 13, 2026
 * Explanation: JUnit test class containing 10 test cases for each of the 
 * five recursive methods in RecursionProblems.java.
 */

public class RecursionTests {

    // --- Tests for count8 ---
    @Test 
    public void testCount8_1() { 
        assertEquals(1, RecursionProblems.count8(8)); 
    }
    @Test 
    public void testCount8_2() { 
        assertEquals(2, RecursionProblems.count8(818)); 
    }
    @Test 
    public void testCount8_3() { 
        assertEquals(4, RecursionProblems.count8(8818)); 
    }
    @Test 
    public void testCount8_4() { 
        assertEquals(0, RecursionProblems.count8(123)); 
    }
    @Test 
    public void testCount8_5() { 
        assertEquals(3, RecursionProblems.count8(88)); 
    }
    @Test 
    public void testCount8_6() { 
        assertEquals(5, RecursionProblems.count8(888)); 
    }
    @Test 
    public void testCount8_7() { 
        assertEquals(0, RecursionProblems.count8(0)); 
    }
    @Test 
    public void testCount8_8() { 
        assertEquals(2, RecursionProblems.count8(808)); 
    }
    @Test 
    public void testCount8_9() { 
        assertEquals(1, RecursionProblems.count8(181)); 
    }
    @Test 
    public void testCount8_10() { 
        assertEquals(9, RecursionProblems.count8(88888)); 
    }

    // --- Tests for countHi ---
    @Test 
    public void testCountHi_1() { 
        assertEquals(1, RecursionProblems.countHi("xxhixx")); 
    }
    @Test 
    public void testCountHi_2() { 
        assertEquals(2, RecursionProblems.countHi("xhixhix")); 
    }
    @Test 
    public void testCountHi_3() { 
        assertEquals(1, RecursionProblems.countHi("hi")); 
    }
    @Test 
    public void testCountHi_4() { 
        assertEquals(0, RecursionProblems.countHi("h")); 
    }
    @Test 
    public void testCountHi_5() { 
        assertEquals(0, RecursionProblems.countHi("hello")); 
    }
    @Test 
    public void testCountHi_6() { 
        assertEquals(3, RecursionProblems.countHi("hihihi")); 
    }
    @Test 
    public void testCountHi_7() { 
        assertEquals(0, RecursionProblems.countHi("")); 
    }
    @Test 
    public void testCountHi_8() { 
        assertEquals(1, RecursionProblems.countHi("ihi")); 
    }
    @Test 
    public void testCountHi_9() { 
        assertEquals(2, RecursionProblems.countHi("hi x hi")); 
    }
    @Test 
    public void testCountHi_10() { 
        assertEquals(1, RecursionProblems.countHi("ba h i hi")); 
    }

    // --- Tests for countHi2 ---
    @Test 
    public void testCountHi2_1() { 
        assertEquals(1, RecursionProblems.countHi2("ahixhi")); 
    }
    @Test 
    public void testCountHi2_2() { 
        assertEquals(2, RecursionProblems.countHi2("ahibhi")); 
    }
    @Test 
    public void testCountHi2_3() { 
        assertEquals(0, RecursionProblems.countHi2("xhixhi")); 
    }
    @Test 
    public void testCountHi2_4() { 
        assertEquals(1, RecursionProblems.countHi2("hi")); 
    }
    @Test 
    public void testCountHi2_5() { 
        assertEquals(0, RecursionProblems.countHi2("xhi")); 
    }
    @Test 
    public void testCountHi2_6() { 
        assertEquals(1, RecursionProblems.countHi2("hixhi")); 
    }
    @Test 
    public void testCountHi2_7() { 
        assertEquals(2, RecursionProblems.countHi2("hihi")); 
    }
    @Test 
    public void testCountHi2_8() { 
        assertEquals(0, RecursionProblems.countHi2("xxxxhi")); 
    }
    @Test 
    public void testCountHi2_9() { 
        assertEquals(1, RecursionProblems.countHi2("hixh")); 
    }
    @Test 
    public void testCountHi2_10() { 
        assertEquals(3, RecursionProblems.countHi2("hihihi")); 
    }

    // --- Tests for strCount ---
    @Test 
    public void testStrCount_1() { 
        assertEquals(2, RecursionProblems.strCount("catcowcat", "cat")); 
    }
    @Test 
    public void testStrCount_2() { 
        assertEquals(1, RecursionProblems.strCount("catcowcat", "cow")); 
    }
    @Test 
    public void testStrCount_3() { 
        assertEquals(0, RecursionProblems.strCount("catcowcat", "dog")); 
    }
    @Test 
    public void testStrCount_4() { 
        assertEquals(2, RecursionProblems.strCount("aaabab", "ab")); 
    }
    @Test 
    public void testStrCount_5() { 
        assertEquals(1, RecursionProblems.strCount("ab", "ab")); 
    }
    @Test 
    public void testStrCount_6() { 
        assertEquals(0, RecursionProblems.strCount("a", "ab")); 
    }
    @Test 
    public void testStrCount_7() { 
        assertEquals(2, RecursionProblems.strCount("iiiij", "ii")); 
    }
    @Test 
    public void testStrCount_8() { 
        assertEquals(0, RecursionProblems.strCount("", "cat")); 
    }
    @Test 
    public void testStrCount_9() { 
        assertEquals(1, RecursionProblems.strCount("apple", "apple")); 
    }
    @Test 
    public void testStrCount_10() { 
        assertEquals(4, RecursionProblems.strCount("aaaa", "a")); 
    }

    // --- Tests for stringClean ---
    @Test 
    public void testStringClean_1() { 
        assertEquals("yza", RecursionProblems.stringClean("yyzzza")); 
    }
    @Test 
    public void testStringClean_2() { 
        assertEquals("abcd", RecursionProblems.stringClean("abbbcdd")); 
    }
    @Test 
    public void testStringClean_3() { 
        assertEquals("Helo", RecursionProblems.stringClean("Hello")); 
    }
    @Test 
    public void testStringClean_4() { 
        assertEquals("X", RecursionProblems.stringClean("XXXXX")); 
    }
    @Test 
    public void testStringClean_5() { 
        assertEquals("", RecursionProblems.stringClean("")); 
    }
    @Test 
    public void testStringClean_6() { 
        assertEquals("abc", RecursionProblems.stringClean("abc")); 
    }
    @Test 
    public void testStringClean_7() { 
        assertEquals("a", RecursionProblems.stringClean("a")); 
    }
    @Test 
    public void testStringClean_8() { 
        assertEquals("aba", RecursionProblems.stringClean("abba")); 
    }
    @Test 
    public void testStringClean_9() { 
        assertEquals("123", RecursionProblems.stringClean("112233")); 
    }
    @Test 
    public void testStringClean_10() { 
        assertEquals("helo world", RecursionProblems.stringClean("helloo worlddd")); 
    }
}