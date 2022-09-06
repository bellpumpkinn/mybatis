package config;

import java.io.Reader;

import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;

public class Configuration {
	private static SqlSessionFactory sqlSessionFactory;
	
	static {
		try {
			Reader reader = Resources.getResourceAsReader("config/sqlMapConfig.xml");
			sqlSessionFactory = new SqlSessionFactoryBuilder().build(reader);
			
			/* ch06할때 필요한 코드
			InputStream stream = Resources.getResourceAsStream("config/sqlMapConfig.xml");
			sqlSessionFactory = new SqlSessionFactoryBuilder().build(stream, "hr");
			*/
		} catch(Exception e) {}
	}
	
	public static <T> T getMapper(Class<T> arg) {
		return sqlSessionFactory.openSession(true).getMapper(arg);
	}
}

//세션에 true값을 주면 오토커밋을함.

