package game;

import configs.DBConn;
import mappers.MemberMapper;
import member.Member;
import org.apache.ibatis.session.SqlSession;

import java.util.List;

public class Register {
    private String userId;
    private SqlSession session = DBConn.getSession();
    public Register(String userId){
        this.userId = userId;
    }
    public void register(){
        MemberMapper mapper = session.getMapper(MemberMapper.class);
        Member member = Member.builder()
                .userId(userId)
                .build();
        List<Member> members = mapper.getList2(member);
        if(members.isEmpty() == true){
            mapper.register(member);
            System.out.println("가입완료");

        }else{
            System.out.println("존재합니다.");
        }
    }
}
