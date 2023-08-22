package com.mysite.sbb;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.ObjectProvider;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.time.LocalDateTime;
import java.util.List;
import java.util.Optional;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

@SpringBootTest
class SbbApplicationTests {

	@Autowired
	private QuestionRepository questionRepository;

	@Autowired
	private AnswerRepository answerRepository;

	// Question
	/*@Test
	void testJpa() {
		// 저장
		*//*Question q1 = new Question();
		q1.setSubject("sbb가 무엇인가요?");
		q1.setContent("sbb에 대해서 알고 싶습니다.");
		q1.setCreateDate(LocalDateTime.now());
		this.questionRepository.save(q1);  // 첫번째 질문 저장

		Question q2 = new Question();
		q2.setSubject("스프링부트 모델 질문입니다.");
		q2.setContent("id는 자동으로 생성되나요?");
		q2.setCreateDate(LocalDateTime.now());
		this.questionRepository.save(q2);  // 두번째 질문 저장*//*

		*//*List<Question> all = this.questionRepository.findAll();
		assertEquals(2, all.size());

		Question q = all.get(0);
		assertEquals("sbb가 무엇인가요?", q.getSubject());*//*

		*//*Optional<Question> oq = this.questionRepository.findById(5);
		if(oq.isPresent()){
			Question q = oq.get();
			assertEquals("sbb가 무엇인가요?", q.getSubject());
		}*//*

		*//*Question q = this.questionRepository.findBySubject("sbb가 무엇인가요?");
		assertEquals(5, q.getId());*//*

		*//*Question q = this.questionRepository.findBySubjectAndContent("sbb가 무엇인가요?", "sbb에 대해서 알고 싶습니다.");
		assertEquals(5, q.getId());*//*

		*//*List<Question> qList = this.questionRepository.findBySubjectLike("sbb%");
		System.out.println("qList >>>"  + qList);
		Question q = qList.get(0);
		System.out.println("q >>>"  + q);
		assertEquals("sbb가 무엇인가요?", q.getSubject());*//*

		// 수정
		*//*Optional<Question> oq = this.questionRepository.findById(5);
		assertTrue(oq.isPresent());
		Question q = oq.get();
		q.setSubject("수정된 제목");
		this.questionRepository.save(q);*//*

		//삭제
		*//*assertEquals(2, this.questionRepository.count());
		Optional<Question> oq = this.questionRepository.findById(5);
		assertTrue(oq.isPresent());
		Question q = oq.get();
		this.questionRepository.delete(q);
		assertEquals(1, this.questionRepository.count());*//*
	}*/

	// Answer
	@Test
	void testJpa() {
		Optional<Question> oq = this.questionRepository.findById(6);
		assertTrue(oq.isPresent());
		Question q = oq.get();

		Answer a = new Answer();
		a.setContent("네 자동으로 생성됩니다.");
		a.setQuestion(q);
		a.setCreateDate(LocalDateTime.now());
		this.answerRepository.save(a);
	}
}
