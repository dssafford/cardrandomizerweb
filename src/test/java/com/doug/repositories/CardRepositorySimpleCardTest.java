package com.doug.repositories;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import static org.junit.Assert.assertEquals;

/**
 * Created by Doug on 2/18/17.
 */
@SpringBootTest
@RunWith(SpringJUnit4ClassRunner.class)
public class CardRepositorySimpleCardTest {

	@Autowired
	SimpleCardQuizRepository simpleCardTestRepository;

	@Test
	public void initialTest(){
		assertEquals("hey", "hey");
	}


//	@Test
//	public void getCardNameLike() {
//		List<CardInfo> myCardList = cardRepository.findByCardNameLike("%diam%");
//		Assert.assertEquals(13, myCardList.size());
//	}

//	@Test
//	public void getCardsAll_test() {
//		List<SimpleCardTest> myCardList = simpleCardTestRepository.findAll();
//		Assert.assertEquals(52, myCardList.size());
//	}
}
