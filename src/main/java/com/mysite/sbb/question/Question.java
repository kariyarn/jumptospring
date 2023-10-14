package com.mysite.sbb.question;

import java.time.LocalDateTime;
import java.util.List;
import java.util.Set;

import com.mysite.sbb.answer.Answer;
import com.mysite.sbb.user.SiteUser;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToMany;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.OneToMany;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Entity
public class Question {
	@Id//id속성을 기본키로 저장
	/*
	 * 데이터 저장시 1씩 자동으로 증가(시퀀스)
	 * GenerationType.IDENTITY는 해당 칼럼의 독립 시퀀스를 생성
	 * */
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer id;
	//컬럼의 세부 설정 위해 사용
	@Column(length = 200)
	private String subject;
	
	@Column(columnDefinition = "TEXT")
	private String content;
	
	private LocalDateTime createDate;
	
	private LocalDateTime modifyDate;
	
	/*
	 * 질문과 답변은 1:N의 관계이다.
	 * mappedBy는 참조 엔티티의 속성명 의미(Answer 엔티티에서 Question엔티티 참조한 속성명 Question)
	 * CascadeType.REMOVE -> 질문이 삭제되면 다른 질문도 모두 삭제ㅇ 
	 */
	@OneToMany(mappedBy = "question", cascade = CascadeType.REMOVE)
	private List<Answer> answerList;
	
	@ManyToOne
	private SiteUser author;
	
	@ManyToMany
	Set<SiteUser> voter;
}
