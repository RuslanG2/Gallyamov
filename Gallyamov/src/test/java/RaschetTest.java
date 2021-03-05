
import static org.junit.Assert.*;

import org.junit.Test;

public class RaschetTest {

	@Test
	public void test() {
		Raschet r = new Raschet();
		String variant="Мотоциклы";
		double otvet = r.answer(variant);
		if(otvet==625) {
			assertTrue(true);
		}else {
			assertTrue(false);
		}
		
	}

}