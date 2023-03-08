package com.spring1.spring1.repository;

import com.spring1.spring1.domain.Member;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.Test;

import java.util.List;
import java.util.Optional;

import static org.assertj.core.api.AssertionsForClassTypes.assertThat;

public class MemoryMemberRepositoryTest{
    MemoryMemberRepository repository = new MemoryMemberRepository();
    @AfterEach
    public void afterEach(){
        repository.clearStore();
    }

    @Test
    public void save() {
        Member m = new Member();
        m.set_name("hirong");
        repository.save(m);
        Member result = repository.find_id(m.get_id()).get();
        assertThat(result).isEqualTo(m);
    }
    @Test
    public void find_id() {

    }

    @Test
    public void find_name() {
        Member m1 = new Member();
        m1.set_name("data1");
        repository.save(m1);

        Member m2 = new Member();
        m2.set_name("data2");
        repository.save(m2);

        Member r = repository.find_name("data1").get();

        assertThat(r).isEqualTo(m1);
    }

    @Test
    public void find_all() {
        Member m1 = new Member();
        m1.set_name("data1");
        repository.save(m1);

        Member m2 = new Member();
        m2.set_name("data2");
        repository.save(m2);

        List<Member> r = repository.find_all();

        assertThat(r.size()).isEqualTo(2);
    }
}
