package com.doug.services;

import com.doug.domain.Answer;

import java.util.List;

/**
 * Created by Doug on 2/18/17.
 */
public interface AnswerService extends CRUDService<Answer> {

	List<Answer> findAll();

	List<Answer> findById(Integer id);

	Answer getById(Integer id);

}
