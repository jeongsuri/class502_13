package org.choongang.jpa_study;

import jakarta.persistence.EntityManager;
import jakarta.persistence.EntityManagerFactory;
import jakarta.persistence.EntityTransaction;
import jakarta.persistence.PersistenceContext;
import jakarta.transaction.Transactional;
import org.choongang.member.entities.Member;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.TestPropertySource;

import java.time.LocalDateTime;

@SpringBootTest
@Transactional
@TestPropertySource(properties = "spring.profiles.active=test")
public class Ex01 {

    //@Autowired
    //private EntityManagerFactory emf;

    //@Autowired
    @PersistenceContext //영속객체 의존성주입
    private EntityManager em;

    @Test
    void test1(){
        //EntityTransaction tx = em.getTransaction();

        Member member = new Member();
        member.setSeq(1L);
        member.setEmail("user01@test.org");
        member.setPassword("12345678");
        member.setUserName("사용자01");
        member.setCreatedAt(LocalDateTime.now());

        em.persist(member); //영속 상태 - 변화감지 메모리에 있다. 변화감지..
        em.flush(); //INSERT 쿼리
        em.detach(member); //영속상태분리 - 변화감지 X

        member.setUserName("(수정)사용자01");
        member.setCreatedAt(LocalDateTime.now());
        em.flush(); //UPDATE 쿼리
        em.merge(member);//분리된 영속 상태 -> 영상 상태(변화감지상태)
        em.flush();

        //em.remove(member); //제거 상태, 제거 X, 상태만..
        //em.flush(); //DELETE 쿼리

    }
}
