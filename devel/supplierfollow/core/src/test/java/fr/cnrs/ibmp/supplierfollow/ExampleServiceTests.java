package fr.cnrs.ibmp.supplierfollow;

import org.junit.Test;
import org.junit.experimental.categories.Category;
import org.junit.runner.RunWith;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import fr.cnrs.ibmp.supplierfollow.ExampleService;
import junit.framework.TestCase;

@Category(UnitTest.class)
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations={ "classpath*:/META-INF/test/spring/master.xml" })
public class ExampleServiceTests extends TestCase {

	private ExampleService service = new ExampleService();
	
	@Test
	public void testReadOnce() throws Exception {
		assertEquals("Hello world!", service.getMessage());
	}

}
