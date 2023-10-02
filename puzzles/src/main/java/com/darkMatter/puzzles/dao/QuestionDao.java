package com.darkMatter.puzzles.dao;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.darkMatter.puzzles.model.Question;
import com.darkMatter.puzzles.repo.QuestionRepo;

@Repository
public class QuestionDao {
	
	@Autowired
	private QuestionRepo questionRepo;

	public List<Question> getAllQuestions() {
		List<Question> question = questionRepo.findAll();
		return question;
	}

	public List<Question> findQuestionsByCategory(String category) {
		
		return questionRepo.findByCategory(category);
	}

	public List<Question> saveQuestions(List<Question> question) {
		
		return questionRepo.saveAll(question);
	}

	public Optional<Question> findQuestionById(int id) {
	
		return questionRepo.findById(id);
	}

	public void deleteQuestion(Question question) {
		questionRepo.delete(question);
		
	}

	public List<Question> findRandomQuestionsByCategory(String category, int numQ) {
		
		return questionRepo.findRandomQuestionsByCategory(category, numQ);
	}

}
