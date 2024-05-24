package mappers;

import member.Member;
import org.apache.ibatis.annotations.Delete;
import org.apache.ibatis.annotations.Select;

import java.util.List;

public interface MemberMapper {
    List<Member> getList();

    @Select("SELECT USER_NO userNo, USER_ID userId FROM MEMBER")
    List<Member> getList2();

    int register(Member member);

    int modify(Member member);

    int delete(String userId);

    @Delete("DELETE FROM MEMBER WHERE USER_ID = #{userID}")
        //간단한 쿼리는 mappers.membermappe에 정의하기보다는 두곳에 정의하기보다는 여기서 정의하여 바로 사용
    int delete2(String userId);

}
