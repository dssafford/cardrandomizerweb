package com.doug.controllers;

import com.doug.domain.AnswerListSmall;
import com.doug.domain.Location;
import com.doug.domain.LocationTest;
import com.doug.domain.ScoreList;
import com.doug.repositories.LocationRepository;
import com.doug.services.LocationService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import javax.servlet.http.HttpSession;
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 * Created by Doug on 1/22/17.
 */

@Controller
public class LocationController {

	@Autowired
	AnswerListSmall answerListSmall;

	@Autowired
	LocationService locationService;

	@Autowired
	LocationRepository locationRepository;

	private Integer locationIndex;

	private ArrayList<Location> cachedRandomLocationList;

	private Integer testLimit;

	BigDecimal cumulativeScore = null;

	ArrayList<LocationTest> singleLocationScoreArrayList;

	private static final int RANDOM_SESSION_LIMIT = 10;

	@RequestMapping("/doug")
	public String getDoug() {
		return "index";
	}


	@RequestMapping(value = "/singleLocationTestStart", method = RequestMethod.GET)
	public String startSingleCardScoring(HttpSession session) {

		session.setAttribute("randomLocationList", null);
		session.setAttribute("scoreSoFar", null);
		session.setAttribute("cumulativeScore", null);

		return "redirect:/singleLocationTest";

	}


	@RequestMapping(value = "/singleLocationTest", method = RequestMethod.GET)
	public String getSingleCardTest(HttpSession session, Model model) {
		//Create master random list and put in session

		if (session.getAttribute("randomLocationList") == null) {
			cachedRandomLocationList = CreateRandomLocationList(RANDOM_SESSION_LIMIT);

			testLimit = cachedRandomLocationList.size();
			session.setAttribute("randomLocationList", cachedRandomLocationList);
			locationIndex = 0;
			session.setAttribute("locationIndex", locationIndex);
			cumulativeScore = new BigDecimal(0);
			session.setAttribute("cumulativeScore", new BigDecimal(0));
		} else {

			cumulativeScore = (BigDecimal) session.getAttribute("cumulativeScore");
			locationIndex = (Integer) session.getAttribute("locationIndex") + 1;
			session.setAttribute("locationIndex", locationIndex);
		}

		if (locationIndex < RANDOM_SESSION_LIMIT) {

			Location location = new Location();
			location.setLocationNumber(cachedRandomLocationList.get(locationIndex).getLocationNumber());
			location.setLocationName("");

			model.addAttribute("locationIndex", locationIndex);
			model.addAttribute("locationInfo", location);
			model.addAttribute("score", cumulativeScore + "%");
			return "answer/enterLocationAnswerSingle";
		}
		return "index";
	}

	@RequestMapping(value = "/dude", method = RequestMethod.POST)
	public void TryThisWithParameters(Integer one, Integer two, String three) {

		Integer four = one + two;

	}


	@RequestMapping(value = "/singleLocationTest", method = RequestMethod.POST)
	public String scoreSingleCardTest(HttpSession session, Location location, Model model) {


		locationIndex = (Integer) session.getAttribute("locationIndex");

		if (locationIndex < RANDOM_SESSION_LIMIT-1) {
			Location tempLocation = ((Location) locationRepository.findOne(cachedRandomLocationList.get(locationIndex).getLocationNumber()));

			LocationTest locationTest = new LocationTest();
			locationTest.setLocationNumber(location.getLocationNumber());
			locationTest.setLocationName(tempLocation.getLocationName());
			locationTest.setAnswerPlaceName(location.getLocationName());

			if (locationIndex == 0) {

				singleLocationScoreArrayList = new ArrayList<LocationTest>();
			}


			//compare entered with master location list

			if (locationTest.getLocationName().equals(location.getLocationName())) {
				locationTest.setAnswerIsCorrect(true);

			} else {
				locationTest.setAnswerIsCorrect(false);

			}


			//Add to score
			singleLocationScoreArrayList =
					  (ArrayList<LocationTest>) session.getAttribute("locationTestList");

			if (singleLocationScoreArrayList == null) {
				singleLocationScoreArrayList = new ArrayList<LocationTest>();
			}
			singleLocationScoreArrayList.add(locationTest);

			session.setAttribute("locationTestList", singleLocationScoreArrayList);


			BigDecimal cumulativeScore = GetCumulativeLocationScore(singleLocationScoreArrayList);

			//Set back to Session
			session.setAttribute("scoreSoFar", cumulativeScore);

			session.setAttribute("cumulativeScore", cumulativeScore);

			//Then go to next card, get from masterRandomList
			cachedRandomLocationList = (ArrayList<Location>) session.getAttribute("randomLocationList");
			session.getAttribute("randomLocationListIndex");

			location.setLocationNumber(cachedRandomLocationList.get(locationIndex + 1).getLocationNumber());

			model.addAttribute("locationInfo", location);

			model.addAttribute("score", cumulativeScore + "%");

			// Ready to Score

			model.addAttribute("score", cumulativeScore + "%");
			model.addAttribute("cardNumber", "end of deck");

			//Create SimpleCardTest Score
			ScoreList scoreList = new ScoreList()             ;

			scoreList.setFinalScore(cumulativeScore);

			return "redirect:/singleLocationTest";

		}
		return "index";
	}



	@RequestMapping(value = "/singleLocationTestPOST", method = RequestMethod.POST)
	public String scoreSingleCardTestPOST(HttpSession session, Location location, Model model) {

		String mysessionId = session.getId();

		String locationName = location.getLocationName();

		locationIndex = (Integer)session.getAttribute("locationIndex");


		if (locationIndex < RANDOM_SESSION_LIMIT-1) {
			Location tempLocation = ((Location) locationRepository.findOne(cachedRandomLocationList.get(locationIndex).getLocationNumber()));

			LocationTest locationTest = new LocationTest();
			locationTest.setLocationNumber(location.getLocationNumber());
			locationTest.setLocationName(tempLocation.getLocationName());
			locationTest.setAnswerPlaceName(location.getLocationName());

			if (locationIndex == 0) {

				singleLocationScoreArrayList = new ArrayList<LocationTest>();
			}


			//compare entered with master location list

			if (locationTest.getLocationName().equals(location.getLocationName())) {
				locationTest.setAnswerIsCorrect(true);

			} else {
				locationTest.setAnswerIsCorrect(false);

			}


			//Add to score
			singleLocationScoreArrayList =
					  (ArrayList<LocationTest>) session.getAttribute("locationTestList");

			if (singleLocationScoreArrayList == null) {
				singleLocationScoreArrayList = new ArrayList<LocationTest>();
			}
			singleLocationScoreArrayList.add(locationTest);

			session.setAttribute("locationTestList", singleLocationScoreArrayList);


			BigDecimal cumulativeScore = GetCumulativeLocationScore(singleLocationScoreArrayList);

			//Set back to Session
			session.setAttribute("scoreSoFar", cumulativeScore);

			session.setAttribute("cumulativeScore", cumulativeScore);

			//Then go to next card, get from masterRandomList
			cachedRandomLocationList = (ArrayList<Location>) session.getAttribute("randomLocationList");
			session.getAttribute("randomLocationListIndex");

			location.setLocationNumber(cachedRandomLocationList.get(locationIndex + 1).getLocationNumber());

			model.addAttribute("locationInfo", location);

			model.addAttribute("score", cumulativeScore + "%");

			// Ready to Score

			model.addAttribute("score", cumulativeScore + "%");
			model.addAttribute("cardNumber", "end of deck");

			//Create SimpleCardTest Score
			ScoreList scoreList = new ScoreList()             ;

			scoreList.setFinalScore(cumulativeScore);

			return "redirect:/singleLocationTest";

		}
		return "index";
	}



	@RequestMapping(value = "/locationList", method = RequestMethod.GET)
	public String list(Model model) {


		List<Location> myLocations = locationRepository.findAll();

		model.addAttribute("locations", myLocations);

		return "learning/locationList";
	}

	private ArrayList<Location> CreateRandomLocationList(Integer limit) {

		ArrayList<Location> partialLocationList = new ArrayList<Location>();

		ArrayList<Location> locationList = (ArrayList<Location>) locationRepository.findAll();

		for (int i = 0; i < limit; i++) {
			partialLocationList.add(locationList.get(i));
		}
		Collections.shuffle(partialLocationList);

		for (int i = 0; i < partialLocationList.size(); i++) {
			System.out.println("Hey, here is your list - " + partialLocationList.get(i).getLocationNumber() + " - " + partialLocationList.get(i).getLocationName());
		}

		return partialLocationList;
	}

	protected BigDecimal GetCumulativeLocationScore(ArrayList<LocationTest> locationTests) {
		Integer denominator = locationTests.size();
		Double numberCorrect = 0.00;

		for (int i = 0; i < denominator; i++) {
			if (locationTests.get(i).getAnswerIsCorrect() == true) {
				numberCorrect = numberCorrect + 1;
			}
		}

		BigDecimal b = new BigDecimal((numberCorrect / (denominator) * 100));
		b = b.setScale(2, BigDecimal.ROUND_HALF_EVEN);

		return b;

	}

}
