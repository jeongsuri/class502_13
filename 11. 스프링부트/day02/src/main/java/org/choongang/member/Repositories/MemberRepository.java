package org.choongang.member.Repositories;

import org.choongang.member.entities.Member;
import org.springframework.data.jpa.repository.JpaRepository;

public interface MemberRepository extends JpaRepository<Member, Long> {
    //Member findMemberByEmail(String email);
    //Optional<Member> findByEmail(String eamil); //null값 처리를 위해 Optional사용 가능
    Member findByEmail(String eamil);
}
