package com.mysite.sbb.question;
import java.util.List;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;

public interface QuestionRepository extends JpaRepository<Question, Integer>{
	//기본적으로 Subject 검색은 없어서 만들어줘야한다.
	Question findBySubject(String subject);
	Question findBySubjectAndContent(String subject, String content);
	List<Question> findBySubjectLike(String subject);
	
	//페이징 처리
	Page<Question> findAll(Pageable pageable);

}
