package hello.hellospring.repository;

import hello.hellospring.domain.Member;

import java.util.List;
import java.util.Optional;

public interface MemberRepository {
    Member save(Member member); //저장
    Optional<Member> findById(Long id); //id찾기
    Optional<Member> findByName(String name); //이름찾기
    List<Member> findAll();//모두 불러오기

    void deleteAll();
}
