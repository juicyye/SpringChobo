package com.example.corse2Core.member;

public interface MemberService {
    void join(Member member);

    Member findMember(Long memberId);
}
