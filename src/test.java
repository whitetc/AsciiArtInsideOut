import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;


class test {

	@Test
	void test() {
		Human x = new Human();
		Human.Men m = x.new Men();	
		String[] output = {" o ","-|- ","/ \\"};
		String[] example= {" o ","-|- ","/ \\"};
		assertEquals(example,output);
			
	}

}
