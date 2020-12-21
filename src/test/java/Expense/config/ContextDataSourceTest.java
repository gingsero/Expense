package Expense.config;

import java.sql.SQLException;

import javax.sql.DataSource;

import org.apache.ibatis.logging.Log;
import org.apache.ibatis.logging.LogFactory;
import org.junit.After;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(classes = {ControllerConfig.class})
public class ContextDataSourceTest {
	protected static final Log log = LogFactory.getLog(ContextDataSourceTest.class);
	
	@Autowired
	private DataSource dataSource;
	
	@After
	public void tearDow() throws Exception {
		System.out.println();
	}
	
	@Test
	public void testDataSource() throws SQLException {
		log.debug(Thread.currentThread().getStackTrace()[1].getMethodName() + "()");
		log.debug("DataSource" + dataSource);
		log.debug("LoginTimeout" + dataSource.getLoginTimeout());
		Assert.assertNotNull(dataSource);
	}

}
