package configs;

import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;

import java.io.IOException;
import java.io.Reader;

public class DBConn {
    private static SqlSessionFactory factory;

    static{
        try {
            Reader reader = Resources.getResourceAsReader("configs/mybatis-config.xml"); //SqlSessionFactory 설정 XML파일경로
            factory = new SqlSessionFactoryBuilder().build(reader);
        }catch(IOException e){
            e.printStackTrace();
        }
    }

    public static SqlSession getSession(boolean autoCommit){ //커밋을 제어할수있는 메서드
        return factory.openSession(autoCommit); //기본값은 false이기 때문에 커밋하지않는다.
    }

    public static SqlSession getSession(){ //바로 커밋이 되는 메서드
        return factory.openSession(true);
    }

}
