package mappers;


import member.Member;

import java.util.List;

public interface MemberMapper {
    List<Member> getList();
    List<Member> getList2(Member member);
    int register(Member member);
}
