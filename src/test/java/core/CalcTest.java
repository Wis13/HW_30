package core;
import static org.junit.Assert.*;
import org.junit.*;
	public class CalcTest {
		static double divide(double a, double b) {return a / b;}
		static double divide(double a, double b, double c) {return a / b / c;}
		static double divide(double a, double b, double c, double d) {return a / b / c / d;}
		
		static double add(double a, double b) {return a + b;}
		static double add(double a, double b, double c) {return a + b + c;}
		static double add(double a, double b, double c, double d) {return a + b + c + d;}
 
		static double subtract(double a, double b) {return a - b;}
		static double subtract(double a, double b, double c) {return a - b - c;}
		static double subtract(double a, double b, double c, double d) {return a - b - c - d;}
		
		static double multiply(double a, double b) {return a * b;}
		static double multiply(double a, double b, double c) {return a * b * c;}
		static double multiply(double a, double b, double c, double d) {return a * b * c * d;}

@Test // @Ignore
public void test_01() {assertEquals("Not correct", divide(74.0, 4.0), 18.5, 0.09);}

@Test // @Ignore
public void test_02() {assertEquals("Not correct", add(50.0, 6.0, 7.0), 63.0, 0.09);}

@Test // @Ignore
public void test_03() {assertEquals("Not correct", subtract(112.0, 42.0, 57.5), 12.5, 0.09);}

@Test // @Ignore
public void test_04() {assertEquals("Not correct", multiply(13.0, 2.0, 3.0), 78.0, 0.09);}

@Test // @Ignore	divide(90.0, 7.0), 12.9, 0.09)
public void test_05() {assertEquals("Not correct", divide(90.0, 2.0, 3.0, 6.0), 2.5, 0.09);}

@Test // @Ignore
public void test_06() {assertEquals("Not correct", add(60.0, 5.0, 7.0), 72.0, 0.09);}

@Test // @Ignore
public void test_07() {assertEquals("Not correct", subtract(88.0, 31.0, 27.5), 29.5, 0.09);}

@Test // @Ignore
public void test_08() {assertEquals("Not correct", multiply(6.0, 6.0, 2.0), 72.0, 0.09);}

}