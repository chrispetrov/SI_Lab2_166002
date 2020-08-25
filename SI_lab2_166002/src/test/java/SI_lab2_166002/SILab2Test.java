package SI_lab2_166002;
import org.junit.jupiter.api.Test;

import static org.junit.Assert.assertFalse;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;
import static org.junit.jupiter.api.Assertions.assertTrue;


public class SILab2Test {
 private final SILab2 test=new SILab2();
 
 @Test
 void branchAssertions() {
	 RuntimeException ex;
	 ex=assertThrows(RuntimeException.class,()->test.checkPrime(-1));
	 assertTrue(ex.getMessage().contains("not be negative"));
	 boolean pr1=test.checkPrime(1);
	 assertFalse(pr1);
	 pr1=test.checkPrime(6);
	 assertTrue(pr1);
	 pr1=test.checkPrime(3);
	 assertFalse(pr1);
 };
 
 @Test
 void pathAssertions(){
	 RuntimeException ex;
	 ex=assertThrows(RuntimeException.class,()->test.checkPrime(-1));
	 assertTrue(ex.getMessage().contains("not be negative"));
	 boolean pr1=test.checkPrime(1);
	 assertFalse(pr1);
	 pr1=test.checkPrime(4);
	 assertTrue(pr1);
	 pr1=test.checkPrime(2);
	 assertFalse(pr1);
	 pr1=test.checkPrime(5);
	 assertFalse(pr1);
	 pr1=test.checkPrime(9);
	 assertTrue(pr1);
 };
}
