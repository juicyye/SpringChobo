package com.example.corse2Core.member;

public interface MemberRepository {
    void save(Member member);

    Member findById(Long memberId);
}
