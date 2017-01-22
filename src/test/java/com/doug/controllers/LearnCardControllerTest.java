package com.doug.controllers;

import com.doug.domain.Card;
import com.doug.services.CardService;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.setup.MockMvcBuilders;

import static org.hamcrest.Matchers.instanceOf;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.verifyZeroInteractions;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.model;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.view;

/**
 * Created by doug on 1/21/17.
 */

@RunWith(SpringJUnit4ClassRunner.class)
@SpringBootTest
public class LearnCardControllerTest {

    @Mock //Mockito Mock object
    private CardService cardService;

    @InjectMocks //setups up controller, and injects mock objects into it.
    private LearnCardController learnCardController;

    private MockMvc mockMvc;

    @Before
    public void setup(){
        MockitoAnnotations.initMocks(this); //initilizes controller and mocks
        mockMvc = MockMvcBuilders.standaloneSetup(learnCardController).build();
    }

// View Tests
    @Test
    public void testNewMasterCardLearningMasterList() throws Exception {
        Integer id = 1;

        //should not call service
        verifyZeroInteractions(cardService);

        mockMvc.perform(get("/masterCardLearningMasterList"))
                .andExpect(status().isOk())
                .andExpect(view().name("learning/masterCardLearningMasterList"));
                //.andExpect(model().attribute("journal", instanceOf(Journal.class)));
    }

    @Test
    public void testNewMasterCardLearningRandomList() throws Exception {
        Integer id = 1;

        //should not call service
        verifyZeroInteractions(cardService);

        mockMvc.perform(get("/masterCardLearningRandomList"))
                .andExpect(status().isOk())
                .andExpect(view().name("learning/masterCardLearningRandomList"));
        //.andExpect(model().attribute("journal", instanceOf(Journal.class)));
    }

    @Test
    public void testNextOneLearnMasterCards() throws Exception {
        Integer id = 1;

        //should not call service
        verifyZeroInteractions(cardService);

        mockMvc.perform(get("/nextOneLearnMasterCards?cardVisible=true"))
                .andExpect(status().isOk())
                .andExpect(view().name("learning/nextOneLearnMasterCards"));
        //.andExpect(model().attribute("journal", instanceOf(Journal.class)));
    }

//    @Test
//    public void testNextOneLearnRandomCards() throws Exception {
//        Integer id = 1;
//
//        //should not call service
//        verifyZeroInteractions(cardService);
//
//        mockMvc.perform(get("/nextOneLearnRandomCards"))
//                .andExpect(status().isOk())
//                .andExpect(view().name("learning/nextOneLearnRandomCards"));
//        //.andExpect(model().attribute("journal", instanceOf(Journal.class)));
//    }

}
