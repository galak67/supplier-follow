package fr.cnrs.ibmp.supplierfollow;

import static org.junit.Assert.assertNotNull;

import fr.cnrs.ibmp.supplierfollow.Service;

import org.junit.Test;
import org.junit.experimental.categories.Category;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

@Category(UnitTest.class)
@ContextConfiguration(locations={ "classpath*:/META-INF/test/spring/master.xml" })
@RunWith(SpringJUnit4ClassRunner.class)
public class ExampleConfigurationTests {
	
	@Autowired
	private Service service;

	@Test
	public void testSimpleProperties() throws Exception {
		assertNotNull(service);
	}
	
}
