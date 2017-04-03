package com.doug.controllers;

import com.doug.domain.*;
import com.doug.repositories.ExamRepository;
import com.doug.repositories.LocationScoreRepository;
import com.doug.repositories.LocationTestRepository;
import com.doug.services.Helpers;
import com.doug.services.LocationService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import javax.servlet.http.HttpSession;
import java.math.BigDecimal;
import java.util.ArrayList;

/**
 * Created by doug on 3/4/17.
 */
@Controller
public class LocationScoreController {

	@Autowired
	LocationTestRepository locationTestRepository;

	@Autowired
	ExamRepository examRepository;

	@Autowired
	LocationScoreRepository locationScoreRepository;

	@Autowired
	LocationService locationService;

	@RequestMapping(value = "/enterLocationAnswers", method = RequestMethod.GET)
	public String enterLocationAnswers(Model model) {

		model.addAttribute("locationAnswer", new LocationAnswer());


		return "answer/enterLocationAnswers";

	}
	@RequestMapping(value = "/enterLocationAnswers", method = RequestMethod.POST)
	public String getLocationAnswers(HttpSession session, LocationAnswer locationAnswer) {

		ArrayList<Location> enteredLocationAnswers = new ArrayList<Location>();

		enteredLocationAnswers.add(new Location(locationAnswer.getL1()));
		enteredLocationAnswers.add(new Location(locationAnswer.getL2()));
		enteredLocationAnswers.add(new Location(locationAnswer.getL3()));
		enteredLocationAnswers.add(new Location(locationAnswer.getL4()));
		enteredLocationAnswers.add(new Location(locationAnswer.getL5()));
		enteredLocationAnswers.add(new Location(locationAnswer.getL6()));
		enteredLocationAnswers.add(new Location(locationAnswer.getL7()));
		enteredLocationAnswers.add(new Location(locationAnswer.getL8()));
		enteredLocationAnswers.add(new Location(locationAnswer.getL9()));
		enteredLocationAnswers.add(new Location(locationAnswer.getL10()));
		enteredLocationAnswers.add(new Location(locationAnswer.getL11()));
		enteredLocationAnswers.add(new Location(locationAnswer.getL12()));
		enteredLocationAnswers.add(new Location(locationAnswer.getL13()));
		enteredLocationAnswers.add(new Location(locationAnswer.getL14()));
		enteredLocationAnswers.add(new Location(locationAnswer.getL15()));
		enteredLocationAnswers.add(new Location(locationAnswer.getL16()));
		enteredLocationAnswers.add(new Location(locationAnswer.getL17()));
		enteredLocationAnswers.add(new Location(locationAnswer.getL18()));
		enteredLocationAnswers.add(new Location(locationAnswer.getL19()));
		enteredLocationAnswers.add(new Location(locationAnswer.getL20()));
		enteredLocationAnswers.add(new Location(locationAnswer.getL21()));
		enteredLocationAnswers.add(new Location(locationAnswer.getL22()));
		enteredLocationAnswers.add(new Location(locationAnswer.getL23()));
		enteredLocationAnswers.add(new Location(locationAnswer.getL24()));
		enteredLocationAnswers.add(new Location(locationAnswer.getL25()));
		enteredLocationAnswers.add(new Location(locationAnswer.getL26()));
		enteredLocationAnswers.add(new Location(locationAnswer.getL27()));
		enteredLocationAnswers.add(new Location(locationAnswer.getL28()));
		enteredLocationAnswers.add(new Location(locationAnswer.getL29()));
		enteredLocationAnswers.add(new Location(locationAnswer.getL30()));
		enteredLocationAnswers.add(new Location(locationAnswer.getL31()));
		enteredLocationAnswers.add(new Location(locationAnswer.getL32()));
		enteredLocationAnswers.add(new Location(locationAnswer.getL33()));
		enteredLocationAnswers.add(new Location(locationAnswer.getL34()));
		enteredLocationAnswers.add(new Location(locationAnswer.getL35()));
		enteredLocationAnswers.add(new Location(locationAnswer.getL36()));
		enteredLocationAnswers.add(new Location(locationAnswer.getL37()));
		enteredLocationAnswers.add(new Location(locationAnswer.getL38()));
		enteredLocationAnswers.add(new Location(locationAnswer.getL39()));
		enteredLocationAnswers.add(new Location(locationAnswer.getL40()));
		enteredLocationAnswers.add(new Location(locationAnswer.getL41()));
		enteredLocationAnswers.add(new Location(locationAnswer.getL42()));
		enteredLocationAnswers.add(new Location(locationAnswer.getL43()));
		enteredLocationAnswers.add(new Location(locationAnswer.getL44()));
		enteredLocationAnswers.add(new Location(locationAnswer.getL45()));
		enteredLocationAnswers.add(new Location(locationAnswer.getL46()));
		enteredLocationAnswers.add(new Location(locationAnswer.getL47()));
		enteredLocationAnswers.add(new Location(locationAnswer.getL48()));
		enteredLocationAnswers.add(new Location(locationAnswer.getL49()));
		enteredLocationAnswers.add(new Location(locationAnswer.getL50()));
		enteredLocationAnswers.add(new Location(locationAnswer.getL51()));
		enteredLocationAnswers.add(new Location(locationAnswer.getL52()));

		//Add to Session
		session.setAttribute("enteredLocationAnswers", enteredLocationAnswers);

		return "redirect:scoreLocationAnswersTest";
	}


	@RequestMapping(value = "/scoreLocationAnswersTest", method = RequestMethod.GET)
	public String scoreLocationAnswersTest(HttpSession session, Model model) {

		Double finalScoreRight = 0.00;

		ArrayList<TestLocation> locationTestArray = new ArrayList<>();

		//get test answers
		ArrayList<Location> enteredLocationAnswers = (ArrayList<Location>)session.getAttribute("enteredLocationAnswers");

//		ArrayList<Location> answerLocations = ConvertLocationAnswersToLocation(enteredLocationAnswers);

		//Get master list of locations
		ArrayList<Location> masterLocationList = (ArrayList<Location>)session.getAttribute("locationMasterList");

		//create master list if it doesn't exist
		if(masterLocationList == null){
			masterLocationList = (ArrayList<Location>)locationService.listAllLocations();
			session.setAttribute("locationMasterList", masterLocationList);
		}

		for(int i=0;i<enteredLocationAnswers.size();i++){
			if(enteredLocationAnswers.get(i).getLocationName().equals(masterLocationList.get(i).getLocationName())){
				locationTestArray.add(new TestLocation(masterLocationList.get(i).getLocationName(),enteredLocationAnswers.get(i).getLocationName(),
						  true));
				finalScoreRight = finalScoreRight +1;
			} else {
				locationTestArray.add(new TestLocation(masterLocationList.get(i).getLocationName(),enteredLocationAnswers.get(i).getLocationName(),
						  false));
			}

		}

		BigDecimal b = new BigDecimal((finalScoreRight / 52) * 100);
		b = b.setScale(2, BigDecimal.ROUND_HALF_EVEN);

		session.setAttribute("locationTestArray", locationTestArray);

		model.addAttribute("finalScore", b + "%");
		model.addAttribute("scores", locationTestArray);

		return "answer/showLocationAnswerSingleTest";

	}

	@RequestMapping(value = "/saveLocationTestScore", method = RequestMethod.POST)
	public String saveLocationScore(){

		//test data
		Exam exam = new Exam(new BigDecimal(92.5), Helpers.getTimeStamp(), "location",  "my comments here", true);


//		LocationTest(Integer id, Integer locationNumber, String locationName, String answerPlaceName,
//				  Boolean answerIsCorrect, Integer testId)
		//save new entry in SimpleCardTest table
		Object myObj = examRepository.save(exam);

		ArrayList<LocationTest> locationTests = new ArrayList<>();
		LocationTest locationTest = new LocationTest();
		locationTests.add(new LocationTest(1,"mailbox", "driveway", false, ((Exam) myObj).getId()));
		locationTests.add(new LocationTest(1,"mailbox", "driveway", false, ((Exam) myObj).getId()));
		locationTests.add(new LocationTest(1,"mailbox", "driveway", false, ((Exam) myObj).getId()));
		locationTests.add(new LocationTest(1,"mailbox", "driveway", false, ((Exam) myObj).getId()));
		locationTests.add(new LocationTest(1,"mailbox", "driveway", false, ((Exam) myObj).getId()));

		//then save in LocationTest
		locationTestRepository.save(locationTests);

		return "index";
	}

	@RequestMapping("/showLocationScoreHistory")
	public String getLocationScores(Model model) {

		ArrayList<Exam> mylist = (ArrayList<Exam>)examRepository.findByTesttype("location");

		model.addAttribute("scores", mylist);


		return "score/showLocationScoresHistory";
	}

	@RequestMapping("locationScore/{id}")
	public String showSingleLocationTest(@PathVariable Integer id, Model model){

		ArrayList<LocationTest> myList = (ArrayList<LocationTest>)locationScoreRepository.findByTestId(id);

		model.addAttribute("finalScore", 80 + "%");
		model.addAttribute("scores", myList);
		model.addAttribute("tests", myList);
//		model.addAttribute("masterList", masterList);

		return "score/singleLocationTestScores";
	}
}
