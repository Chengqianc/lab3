import static org.junit.Assert.*;
import org.junit.*;

public class ArrayTests {
	@Test 
	public void testReverseInPlace() {
    int[] input1 = { 3 };
    ArrayExamples.reverseInPlace(input1);
    assertArrayEquals(new int[]{ 3 }, input1);
	}

  @Test
  public void testReverseInPlace2() {
    int[] input1 = { 3, 4, 5, 6, 7, 8, 9};
    ArrayExamples.reverseInPlace(input1);
    assertArrayEquals(new int[]{ 9, 8, 7, 6, 5, 4, 3}, input1);
  }  


  @Test
  public void testReversed() {
    int[] input1 = { };
    assertArrayEquals(new int[]{ }, ArrayExamples.reversed(input1));
  }

  @Test
    public void testReversed2() {
    int[] input1 = {1,2,3,4,5,6,7,8,9};
    assertArrayEquals(new int[]{9,8,7,6,5,4,3,2,1}, ArrayExamples.reversed(input1));
  }

  @Test
    public void testAverageWithoutLowest1() {
      double[] input1 ={1,10,20,30,40,50,60,70,80,90};
      assertEquals(50,ArrayExamples.averageWithoutLowest(input1),0.001);
  }

  @Test
    public void testAverageWithoutLowest2() {
      double[] input1 ={1};
      assertEquals(0,ArrayExamples.averageWithoutLowest(input1),0.001);
  }

  @Test
    public void testAverageWithoutLowest3() {
      double[] input1 ={};
      assertEquals(0,ArrayExamples.averageWithoutLowest(input1),0.001);
  }

  @Test
    public void testAverageWithoutLowest4() {
      double[] input1 ={1,1,1,1,1,1,9,9,9,9,9};
      assertEquals(5,ArrayExamples.averageWithoutLowest(input1),0.001);
    }
}
