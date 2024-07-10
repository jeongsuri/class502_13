package exam01;

import config.AppCtx;
import member.repositories.MemberRepository;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit.jupiter.SpringExtension;

import java.lang.reflect.Member;
import java.util.List;

@ExtendWith(SpringExtension.class)
@ContextConfiguration(classes= AppCtx.class)
public class Ex02 {

    //@Autowired
    //private MemberRepository repository;

    @Test
    void test1(){
        //List<Member> members = (List<Member>) repository.findAll();
        //members.forEach(System.out::println);
    }

    @Test
    void test2(){
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(AppCtx.class);
        MemberRepository repository = context.getBean(MemberRepository.class);
        System.out.println(repository);
    }
}
