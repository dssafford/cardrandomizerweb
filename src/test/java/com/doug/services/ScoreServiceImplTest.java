package com.doug.services;

import com.doug.domain.SingleCardScore;
import org.junit.Before;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.ArrayList;


/**
 * Created by doug on 3/21/17.
 */

@SpringBootTest
public class ScoreServiceImplTest {

	//	@Mock
	ArrayList<SingleCardScore> myScore;

//	@InjectMocks

	@Autowired
	ScoreService scoreService;


	@Before
	public void setUp() {
//		initMocks(this);
	}

//	@Test
//	public void getCumulativeScore() throws Exception {
//		ArrayList<SingleCardScore> myscore = new ArrayList<SingleCardScore>();
//		SingleCardScore singleCardScore = new SingleCardScore();
//		singleCardScore.setActionName("run");
//		singleCardScore.setCardName("king");
//		singleCardScore.setObjectName("bat");
//		singleCardScore.setPersonName("John Doe");
//		singleCardScore.setActionNameCorrect(true);
//		singleCardScore.setObjectNameCorrect(true);
//		singleCardScore.setPersonNameCorrect(true);
//		myscore.add(singleCardScore);
//		myscore.add(singleCardScore);
//
//		//public BigDecimal GetCumulativeScore(ArrayList< SingleCardScore > singleCardScoreArrayList)
////		when(scoreService.GetCumulativeScore(myScore)).thenReturn(new BigDecimal(80.0));
//
//		assertNotNull(scoreService.GetCumulativeScore(myscore));
//
//
//	}
//
//	@Test
//	public void getLocationTestAnswers() throws Exception {
//
//		assertNotNull(scoreService.GetLocationTestAnswers(1));
//	}
//
//
//	@Test
//	public void getCardInfoFromCardName() throws Exception {
//
//	}
//
//	@Test
//	public void scoreSingleCardTrue() throws Exception {
//		ArrayList<SingleCardScore> myscore = new ArrayList<SingleCardScore>();
//		SingleCardScore singleCardScore = new SingleCardScore();
//		singleCardScore.setActionName("run");
//		singleCardScore.setCardName("king");
//		singleCardScore.setObjectName("bat");
//		singleCardScore.setPersonName("John Doe");
//		singleCardScore.setActionNameCorrect(true);
//		singleCardScore.setObjectNameCorrect(true);
//		singleCardScore.setPersonNameCorrect(true);
//		myscore.add(singleCardScore);
//		myscore.add(singleCardScore);
//
//		assertNotNull(myscore);
//		assertEquals("run", singleCardScore.getActionName());
//		assert (singleCardScore.getActionNameCorrect() == true);
//		assert (singleCardScore.getObjectNameCorrect() == true);
//		assert (singleCardScore.getPersonNameCorrect() == true);
//
//		singleCardScore.setActionNameCorrect(false);
//		singleCardScore.setObjectNameCorrect(false);
//		singleCardScore.setPersonNameCorrect(false);
//
//		assert (singleCardScore.getActionNameCorrect() == false);
//		assert (singleCardScore.getObjectNameCorrect() == false);
//		assert (singleCardScore.getPersonNameCorrect() == false);
//	}
//
//	@Test
//	public void scoreSingleCardFalse() throws Exception {
//
//		ArrayList<SingleCardScore> myscore = new ArrayList<SingleCardScore>();
//		SingleCardScore singleCardScore = new SingleCardScore();
//		singleCardScore.setActionName("run");
//		singleCardScore.setCardName("king");
//		singleCardScore.setObjectName("bat");
//		singleCardScore.setPersonName("John Doe");
//		singleCardScore.setActionNameCorrect(false);
//		singleCardScore.setObjectNameCorrect(false);
//		singleCardScore.setPersonNameCorrect(false);
//		myscore.add(singleCardScore);
//		myscore.add(singleCardScore);
//
//		assertNotNull(myscore);
//
//
//		assert (singleCardScore.getActionNameCorrect() == false);
//		assert (singleCardScore.getObjectNameCorrect() == false);
//		assert (singleCardScore.getPersonNameCorrect() == false);
//
//	}
}