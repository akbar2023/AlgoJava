package algorithms;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class SayAaTest {

    @Test
    public void testSayAa() {
      assertEquals("aabaa", SayAa.sayAaa("aba"));
      assertEquals("aa", SayAa.sayAaa(""));
      assertEquals("aabaabaa", SayAa.sayAaa("abba"));
      assertEquals("aabaa", SayAa.sayAaa("b"));
    }
}
