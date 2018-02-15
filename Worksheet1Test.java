import static org.junit.Assert.*;

import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.ExpectedException;

/** @author 
 *  Ellen Sutton
 * This class contains the test cases for Worksheet1 solutions.
 *  
 */

public class Worksheet1Test {
	
	@Rule 
	public final ExpectedException exception = ExpectedException.none();
	

	//Tests for Ex1
	
	@Test //tests zero case
	public void test1() {
		int expected = 1;
		int actual = Worksheet1.power(5, 0);
		
		assertEquals(expected, actual);	
	}
	
	
	@Test 
	public void test2() {
		int expected = 65536;
		int actual = Worksheet1.power(4, 8);
		
		assertEquals(expected, actual);	
	}
	
	
	@Test
	public void test3() {
		int expected = 262144;
		int actual = Worksheet1.power(4, 9);
		
		assertEquals(expected, actual);	
	}
	
	
	@Test //tests zero case
	public void test4() {
		int expected = 1;
		int actual = Worksheet1.fastPower(7, 0);
		
		assertEquals(expected, actual);	
	}
	
	
	@Test //tests even case
	public void test5() { 
		int expected = 65536;
		int actual = Worksheet1.fastPower(4, 8);
		
		assertEquals(expected, actual);
	}
	
	
	@Test //tests odd case
	public void test6() { 
		int expected = 262144;
		int actual = Worksheet1.power(4, 9);
		
		assertEquals(expected, actual);	
	}
	
	
	
	
	//Tests for Ex2
	
	@Test //tests an empty list
	public void test7() {
		List<Integer> L = new List<Integer>();
		List<Integer> expected = new List<Integer>();
		List<Integer> actual = Worksheet1.negateAll(L);
		
		assertEquals(expected, actual);
	}
	
	
	@Test //tests negation of the list [0, 1,2,-3]
	public void test8() {
		List<Integer> L = new List<Integer>(0, new List<Integer>(1, new List<Integer>(2, 
				new List<Integer>(-3, new List<Integer>()))));
		
		List<Integer> expected = new List<Integer>(0, new List<Integer>(-1, 
				new List<Integer>(-2, new List<Integer>(3, new List<Integer>()))));
		
		List<Integer> actual = Worksheet1.negateAll(L);
		
		assertEquals(expected, actual);
	}
	
	
	@Test //tests negation of the list [-1,-2,3]
	public void test9() {
		List<Integer> L = new List<Integer>(-1, new List<Integer>(-2, 
				new List<Integer>(3, new List<Integer>())));
		
		List<Integer> expected = new List<Integer>(1, new List<Integer>(2, 
				new List<Integer>(-3, new List<Integer>())));
		
		List<Integer> actual = Worksheet1.negateAll(L);
		
		assertEquals(expected, actual);	
	}
	
	
	
	
	//Tests for Ex3
	
	@Test //x = 3, a = [-3,1,7]
	public void test10() {
		int x = 3;
		
		List<Integer> a = new List<Integer>(-3, new List<Integer>(1, 
				new List<Integer>(7, new List<Integer>())));
		
		exception.expect(IllegalArgumentException.class);
		Worksheet1.find(x, a);
	}
	
	
	@Test //x = 3, a = [-3,3,9] 
	public void test11() {
		int x = 3;
		
		List<Integer> a = new List<Integer>(-3, new List<Integer>(3, 
				new List<Integer>(9, new List<Integer>())));
		
		int expected = 1;
		int actual = Worksheet1.find(x, a);	
		
		assertEquals(expected, actual);
	}
	
	
	@Test //x = 3, a = [33,1,3]
	public void test12() {
		int x = 3;
		
		List<Integer> a = new List<Integer>(33, new List<Integer>(1, 
				new List<Integer>(3, new List<Integer>())));
		
		int expected = 2;
		int actual = Worksheet1.find(x, a);
		
		assertEquals(expected, actual);
	}
	
	
	
	
	//Tests for Ex4
	
	@Test //a = []
	public void test13() {
		List<Integer> a = new List<Integer>();
		
		boolean expected = true;
		boolean actual = Worksheet1.allPositive(a);
		
		assertEquals(expected, actual);
	}
	
	
	@Test //a = [1,2,3]
	public void test14() {
		
		List<Integer> a = new List<Integer>(1, new List<Integer>(2, 
				new List<Integer>(3, new List<Integer>())));
		
		boolean expected = true;
		boolean actual = Worksheet1.allPositive(a);
		
		assertEquals(expected, actual);
	}
	
	
	@Test //a=[1,2,-3]
	public void test15() {
		
		List<Integer> a = new List<Integer>(1, new List<Integer>(2, 
				new List<Integer>(-3, new List<Integer>())));
		
		boolean expected = false;
		boolean actual = Worksheet1.allPositive(a);
		
		assertEquals(expected, actual);
	}
	
	
	
	
	//Tests for Ex5

	@Test //a = []
	public void test16() {
		List<Integer> a = new List<Integer>();
		List<Integer> expected = new List<Integer>();
		List<Integer> actual = Worksheet1.positives(a);
		
		assertEquals(expected, actual);	
	}
	
	
	@Test //a = [-1,-2,-3]
	public void test17() {
		List<Integer> a = new List<Integer>(-1, new List<Integer>(-2, 
				new List<Integer>(-3, new List<Integer>())));
		
		List<Integer> expected = new List<Integer>();
		List<Integer> actual = Worksheet1.positives(a);
		
		assertEquals(expected, actual);	
	}
	
	
	@Test //a = [1, -2, 3]
	public void test18() {
		
		List<Integer> a = new List<Integer>(1, new List<Integer>(-2, 
				new List<Integer>(3, new List<Integer>())));
		
		List<Integer> expected = new List<Integer>(1, new List<Integer>(3, 
				new List<Integer>()));
		
		List<Integer> actual = Worksheet1.positives(a);
		
		assertEquals(expected, actual);
	}
	
	
	
	
	//Tests for Ex6
	
	@Test //a = []
	public void test19() {
		
		List<Integer> a = new List<Integer>();
		
		boolean expected = true;
		boolean actual = Worksheet1.sorted(a);
		
		assertEquals(expected, actual);	
	}
	
	
	@Test //a = [1,2,3]
	public void test20() {
		
		List<Integer> a = new List<Integer>(1, new List<Integer>(2,
				new List<Integer>(3, new List<Integer>())));
		
		boolean expected = true;
		boolean actual = Worksheet1.sorted(a);
		
		assertEquals(expected, actual);
	}
	
	
	@Test //a = [1,2,2,3]
	public void test21() {
		
		List<Integer> a = new List<Integer>(1, new List<Integer>(2,
				new List<Integer>(2, new List<Integer>(3, new List<Integer>()))));
		
		boolean expected = true;
		boolean actual = Worksheet1.sorted(a);
		
		assertEquals(expected, actual);	
	}
	
	
	@Test //a = [1,3,2]
	public void test22() {
		
		List<Integer> a = new List<Integer>(1, new List<Integer>(3,
				new List<Integer>(2, new List<Integer>())));
		
		boolean expected = false;
		boolean actual = Worksheet1.sorted(a);
		
		assertEquals(expected, actual);
	}
	
	
	
	//Tests for Ex7
	
	@Test //a = [1,2,3], b = []
	public void test23() {
		
		List<Integer> a = new List<Integer>(1, new List<Integer>(2,
				new List<Integer>(3, new List<Integer>())));
		
		List<Integer> b = new List<Integer>();
		
		List<Integer> expected = new List<Integer>(1, new List<Integer>(2,
				new List<Integer>(3, new List<Integer>())));
		
		List<Integer> actual = Worksheet1.merge(a, b);
		
		assertEquals(expected, actual);
	}
	
	
	@Test //a = [1,4], b = [2,3]
	public void test24() {
		
		List<Integer> a = new List<Integer>(1, new List<Integer>(4,
				new List<Integer>()));
		
		List<Integer> b = new List<Integer>(2, new List<Integer>(3,
				new List<Integer>()));
		
		List<Integer> expected = new List<Integer>(1, new List<Integer>(2,
				new List<Integer>(3, new List<Integer>(4, new List<Integer>()))));
		
		List<Integer> actual = Worksheet1.merge(a, b);
		
		assertEquals(expected, actual);
	}
	
	
	@Test //a = [1,2], b = [1,2]
	public void test25() {
		
		List<Integer> a = new List<Integer>(1, new List<Integer>(2,
				new List<Integer>()));
		
		List<Integer> b = new List<Integer>(1, new List<Integer>(2,
				new List<Integer>()));
		
		List<Integer> expected = new List<Integer>(1, new List<Integer>(1,
				new List<Integer>(2, new List<Integer>(2, new List<Integer>()))));
		
		List<Integer> actual = Worksheet1.merge(a, b);
		
		assertEquals(expected, actual);
	}
	
	
	@Test //a = [2,3,4], b = [1,2,3]
	public void test26() {
		
		List<Integer> a = new List<Integer>(2, new List<Integer>(3,
				new List<Integer>(4, new List<Integer>())));
		
		List<Integer> b = new List<Integer>(1, new List<Integer>(2,
				new List<Integer>(3, new List<Integer>())));
		
		List<Integer> expected = new List<Integer>(1, new List<Integer>(2,
				new List<Integer>(2, new List<Integer>(3, new List<Integer>(3,
						new List<Integer>(4, new List<Integer>()))))));
		
		List<Integer> actual = Worksheet1.merge(a, b);
		
		assertEquals(expected, actual);
	}
	
	
	
	
	//Tests for Ex8
	
	@Test //a = []
	public void test27() {
		
		List<Integer> a = new List<Integer>();
		List<Integer> expected = new List<Integer>();
		List<Integer> actual = Worksheet1.removeDuplicates(a);
		
		assertEquals(expected, actual);	
	}
	
	
	@Test //a = [1,2,2,2,2,3]
	public void test28() {
		
		List<Integer> a = new List<Integer>(1, new List<Integer>(2,
				new List<Integer>(2, new List<Integer>(2, new List<Integer>(2,
						new List<Integer>(3, new List<Integer>()))))));
		
		List<Integer> expected = new List<Integer>(1, new List<Integer>(2,
				new List<Integer>(3, new List<Integer>())));
		
		List<Integer> actual = Worksheet1.removeDuplicates(a);
		
		assertEquals(expected, actual);	
	}
	
	
	@Test //a = [1,1,2,2,3,3]
	public void test29() {
		
		List<Integer> a = new List<Integer>(1, new List<Integer>(1,
				new List<Integer>(2, new List<Integer>(2, new List<Integer>(3,
						new List<Integer>(3, new List<Integer>()))))));
		
		List<Integer> expected = new List<Integer>(1, new List<Integer>(2,
				new List<Integer>(3, new List<Integer>())));
		
		List<Integer> actual = Worksheet1.removeDuplicates(a);
		
		assertEquals(expected, actual);
	}
}