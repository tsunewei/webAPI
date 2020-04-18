package com.webResult.DAO;

import org.springframework.data.jpa.repository.JpaRepository;

import com.webResult.Model.MemberAccount;

public interface MemberApiRepository extends JpaRepository<MemberAccount, Long>{
	MemberAccount findByIdStartsWith(String id);
}
