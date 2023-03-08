package com.spring1.spring1.repository;

import com.spring1.spring1.domain.Member;

import java.util.*;

public class MemoryMemberRepository implements MemberRepository{
    private static Map<Long, Member> store = new HashMap<>();
    private static long sequence = 0L;

    public void clearStore(){
        store.clear();
    }

    @Override
    public Member save(Member m) {
        m.set_id(++sequence);
        store.put(m.get_id(), m);
        return m;
    }

    @Override
    public Optional<Member> find_id(Long id) {
        return Optional.ofNullable(store.get(id));
    }

    @Override
    public Optional<Member> find_name(String s) {
        return store.values().stream()
                .filter(member -> member.get_name().equals(s))
                .findAny();
    }

    @Override
    public List<Member> find_all() {
        return new ArrayList<>(store.values());
    }
}
