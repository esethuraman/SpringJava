package com.learning.currency;

import com.learning.currency.controllers.MyController;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.ui.Model;
import org.springframework.validation.support.BindingAwareModelMap;

@RunWith(SpringRunner.class)
@SpringBootTest
public class CurrencyApplicationTests {

	@Test
	public void contextLoads() {
	}

	@Test
	public void testSayHello(){
		MyController controller = new MyController();
		Model model = new BindingAwareModelMap();

		String result = controller.sayHello("Ezhilarasan", model);

		Assert.assertEquals("Ezhilarasan", model.asMap().get("user"));

	}

}
