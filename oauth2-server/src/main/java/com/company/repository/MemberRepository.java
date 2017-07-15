/**
 * 
 */
package com.company.repository;

import com.company.domain.Member;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Component;

@Component("memberRepository")
public interface MemberRepository extends JpaRepository<Member, Long> {
	Member findOneByUsername(String username);
}
