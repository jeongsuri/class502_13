package org.choongang.member.repositories;

import org.choongang.member.entities.Member;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.querydsl.QuerydslPredicateExecutor;
import org.springframework.data.repository.query.Param;

import java.util.List;

public interface MemberRepository extends JpaRepository<Member, Long>, QuerydslPredicateExecutor<Member> {
    //Member findMemberByEmail(String email);
    //Optional<Member> findByEmail(String eamil); //null값 처리를 위해 Optional사용 가능
    Member findByEmail(String eamil);
    List<Member> findByEmailContainingAndUserNameContainingOrderByCreatedAtDesc(String email, String username);

    @Query("SELECT m FROM Member m WHERE m.email LIKE :k1 AND m.userName LIKE :k2 ORDER BY m.createdAt DESC ")
    List<Member> getMembers(@Param("k1") String key1, @Param("k2") String key2);

    Page<Member> findByEmailContaining(String keyowrd, Pageable pageable);
}
