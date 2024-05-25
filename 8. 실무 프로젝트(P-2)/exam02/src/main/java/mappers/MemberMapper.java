package mappers;

import member.Member;
import org.apache.ibatis.annotations.Delete;
import org.apache.ibatis.annotations.Select;

import java.util.List;

public interface MemberMapper {
    List<Member> getList();

    @Select("SELECT USER_NO userNo, USER_ID userId FROM MEMBER")
    List<Member> getList2();
    List<Member> getList3(Member member);
    List<Member> getList4(List<String> userIds);
    List<Member> getList5(long userNo);

    int register(Member member);
    int register2(Member member); //시퀀스 값 넣는거

    int modify(Member member);
    int modify2(Member member);

    int delete(String userId);

    @Delete("DELETE FROM MEMBER WHERE USER_ID = #{userID}")
        //간단한 쿼리는 mappers.membermappe에 정의하기보다는 두곳에 정의하기보다는 여기서 정의하여 바로 사용
    int delete2(String userId);


}
