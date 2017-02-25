package com.doug.services;

import com.doug.domain.Answer;
import com.doug.repositories.AnswerRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Doug on 2/18/17.
 */
@Service
public class AnswerServiceImpl implements AnswerService {

	private AnswerRepository answerRepository;
	@Autowired
	public void setAnswerRepository(AnswerRepository answerRepository) { this.answerRepository= answerRepository;}


	@Override
	public List<?> listAll() {
		List<Answer> answers = new ArrayList<>();
		answerRepository.findAll().forEach(answers::add); //fun with Java 8
		return answers;
	}

	@Override
	public List findById(Integer id){
		return answerRepository.findById(id);
	}
	@Override
	public Answer getById(Integer id) {
		return answerRepository.findOne(id);
	}

	@Override
	public Answer saveOrUpdate(Answer domainObject) {
		return answerRepository.save(domainObject);
	}

	@Override
	public void delete(Integer id) {
		answerRepository.delete(id);
	}

	@Override
	public List<Answer> findAll() {
		return null;
	}
}
