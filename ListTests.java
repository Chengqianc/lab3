import static org.junit.Assert.*;
import org.junit.*;
import java.util.ArrayList;
import java.util.List;

public class ListTests {
	@Test 
	public void testMerge() {
    List<String> listA = new ArrayList<String>();
    List<String> listB = new ArrayList<String>();
    listA.add("a");
    listA.add("a");
    listA.add("b");
    listA.add("c");
    listB.add("a");
    listB.add("x");
    listB.add("y");
    listB.add("z");

    List<String> input1 = new ArrayList<String>();
    input1 = ListExamples.merge(listA,listB);
    
    assertArrayEquals(new String[]{"a","a","a","b","c","x","y","z"}, input1.toArray());
	}
}