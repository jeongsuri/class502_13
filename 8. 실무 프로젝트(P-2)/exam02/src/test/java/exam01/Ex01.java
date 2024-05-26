package exam01;

import configs.DBConn;
import mappers.MemberMapper;
import org.apache.ibatis.session.SqlSession;
import org.junit.jupiter.api.Test;
import member.Member;

import java.util.List;

public class Ex01 {
    private SqlSession session = DBConn.getSession();
    @Test
    void test1(){
        List<Member> members = session.selectList("mappers.MemberMapper.getList");
        members.forEach(System.out::println);
    }

    @Test
    void test2(){
        MemberMapper mapper = session.getMapper(MemberMapper.class);
        //MemberMapper과 동일한 이름인 인터페이스를 구성하여 getList을 통해 가져올수도있다.
        List<Member> members = mapper.getList();
        members.forEach(System.out::println);
    }

    @Test
    void test3(){
        SqlSession session = DBConn.getSession();
        MemberMapper mapper = session.getMapper(MemberMapper.class);
        List<Member> members = mapper.getList2();
        members.forEach(System.out::println);
    }


}
