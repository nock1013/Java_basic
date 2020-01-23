package di.constructor03;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.GenericXmlApplicationContext;

public class Test {

	public static void main(String[] args) {
		ArticleDTO  dto = new ArticleDTO();
		ApplicationContext factory =
				new GenericXmlApplicationContext("config/setter.xml");
		 IWriteArticleMgr iwg= factory.getBean("mgr", IWriteArticleMgr.class);
		 iwg.write(dto);
	}
}
