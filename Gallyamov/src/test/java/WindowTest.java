
import static org.junit.Assert.*;

import org.junit.Test;

public class WindowTest {

	@Test
	public void test() {
		Raschet r = new Raschet();
		
		double osago = r.formula(1,1,1,1,1,1,1);
		if(osago==1) {
			assertTrue(true);
		}else {
			assertTrue(false);
		}
		
	}

}