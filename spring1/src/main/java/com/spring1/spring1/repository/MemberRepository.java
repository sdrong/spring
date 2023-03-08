package com.spring1.spring1.repository;

import com.spring1.spring1.domain.Member;

import java.util.List;
import java.util.Optional;

public interface MemberRepository {
    Member save(Member m);
    Optional<Member> find_id(Long id);
    Optional<Member> find_name(String s);
    List<Member> find_all();
}
