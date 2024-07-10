package member.repositories;

import org.springframework.data.repository.CrudRepository;

import java.lang.reflect.Member;

public interface MemberRepository extends CrudRepository<Member, Long> {
}
