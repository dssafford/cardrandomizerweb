package com.doug.controllers;

import com.doug.domain.Card;
import com.doug.domain.Exam;
import com.doug.repositories.ExamRepository;
import com.doug.repositories.SimpleCardTestRepository;
import com.doug.services.CardServiceImpl;
import com.doug.services.Helpers;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.mock.web.MockHttpSession;
import org.springframework.test.context.junit4.SpringRunner;

import javax.servlet.http.HttpSession;
import java.math.BigDecimal;
import java.util.ArrayList;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;

/**
 * Created by doug on 1/21/17.
 */

//@DataJpaTest(showSql = true)
@SpringBootTest
@RunWith(SpringRunner.class)
public class LearnCardControllerIntegrationSimpleCardTest {


    HttpSession session;

    @Autowired
    private CardServiceImpl cardServiceImpl;

    @Autowired
    SimpleCardTestRepository simpleCardTestRepository;

    @Autowired
    ExamRepository examRepository;

    @Before
    public void setUp() {
        session = new MockHttpSession();
    }

    @After
    public void tearDown() throws Exception {

    }
//    @Test
//    public void findByCardNameLikeTest() {
//        List<SimpleCardTest> cards = simpleCardTestRepository.findByCardNameLike("%diamonds%");
//
//        assertEquals(13, cards.size());
//    }

    @Test
    public void name() throws Exception {
    }

    @Test
    public void saveCardTest() throws Exception {

        //test data
        Exam exam = new Exam(new BigDecimal(92.5),Helpers.getTimeStamp(), "card",  "my comments here", true);

        Object myObj = examRepository.saveAndFlush(exam);
        assertNotNull(myObj);
        assert(((Exam)myObj).getId()>0);

    }


    @Test
    public void getNextMasterLearningCard() throws Exception {

    }

    @Test
    public void getPreviousMasterLearningCard() throws Exception {

    }


    @Test
    public void getNextRandomLearningCard1() throws Exception {

    }



    @Test
    public void getMasterLearningList() throws Exception {

        ArrayList<Card> cards = cardServiceImpl.createmasterCardList(session);

        assertEquals(52, 52);

    }


//    @Test
//    public void testCreateMasterCardList() {
//
//
//        ArrayList<Card> cards = cardServiceImpl.createmasterCardList(session);
//
//        assertEquals(52, 52);
//
//
//    }

    @Test
    public void testList() throws Exception {
// public CardInfo(String cardName, String mainCategoryName, String subCategoryName, String categorySuit,
//                String personName, String action, String object)

//        List<CardInfo> cards = new ArrayList<>();
//        cards.add(new CardInfo("ace_of_spades", "people", "subcategory", "diamonds","john doe", "running",
//                "testobject"));

        ArrayList<Card> cards = new ArrayList<>();
        cards.add(new Card(1,"ace_of_spades",1));
        cards.add(new Card(2,"queen_of_spades",2));

        Integer id = 1;

//        //should not call service
//        verifyZeroInteractions(cardService);
//
//        //specific Mockito interaction, tell stub to return list of products
//        when(cardService.listAllCards()).thenReturn((ArrayList<Card>) cards);

//        mockMvc.perform(get("/masterCardLearningMasterList"))
//            .andExpect(status().isOk())
//            .andExpect(view().name("learning/masterCardLearningMasterList"))
//            .andExpect(model().attribute("cards", hasSize(2)));
    }


    @Test
    public void testNewMasterCardLearningMasterList() throws Exception {
        Integer id = 1;
//
//        //should not call service
//        verifyZeroInteractions(cardService);

//        mockMvc.perform(get("/masterCardLearningMasterList"))
//                .andExpect(status().isOk())
//                .andExpect(view().name("learning/masterCardLearningMasterList"));
//                //.andExpect(model().attribute("journal", instanceOf(Journal.class)));
    }

    @Test
    public void testNewMasterCardLearningRandomList() throws Exception {
        Integer id = 1;

//        //should not call service
//        verifyZeroInteractions(cardService);

//        mockMvc.perform(get("/masterCardLearningRandomList"))
//                .andExpect(status().isOk())
//                .andExpect(view().name("learning/masterCardLearningRandomList"));
//        //.andExpect(model().attribute("journal", instanceOf(Journal.class)));
    }











    @Test
    public void testGetNextRandomLearningCard() throws Exception {

//        CardInfo cardInfo = learnCardController.getNextRandomLearningCard(1, false);


//        cardService.listAllCards();

    }

    @Test
    public void testNextOneLearnMasterCards() throws Exception {

//        CardInfo cardInfo = new CardInfo()
        Integer id = 1;

//        //should not call service
//        verifyZeroInteractions(cardService);


//        mockMvc.perform(get("/product/new"))
//                .andExpect(status().isOk())
//                .andExpect(view().name("product/productform"))
//                .andExpect(model().attribute("product", instanceOf(Product.class)));

        //        mockMvc.perform(post("/product")
//                .param("id", "1")
//                .param("description", description)
//                .param("price", "12.00")
//                .param("imageUrl", "example.com"))
//                .andExpect(status().is3xxRedirection())
//                .andExpect(view().name("redirect:/product/show/1"))
//                .andExpect(model().attribute("product", instanceOf(Product.class)))
//                .andExpect(model().attribute("product", hasProperty("id", is(id))))
//                .andExpect(model().attribute("product", hasProperty("description", is(description))))
//                .andExpect(model().attribute("product", hasProperty("price", is(price))))
//                .andExpect(model().attribute("product", hasProperty("imageUrl", is(imageUrl))));
//
//        mockMvc.perform(get("/nextOneLearnMasterCards?cardVisible=true")
//            .param("cardVisible", "true")
//            .param("firstTime", "true"))
//            .andExpect(status().isOk())
//            .andExpect(view().name("learning/nextOneLearnMasterCards"))
//            .andExpect(model().attribute("card", instanceOf(CardInfo.class)));
    }

//    @SimpleCardTest
//    public void testNewProduct() throws Exception {
//        Integer id = 1;
//
//        //should not call service
//        verifyZeroInteractions(productService);
//
////        mockMvc.perform(get("/product/new"))
////                .andExpect(status().isOk())
////                .andExpect(view().name("product/productform"))
////                .andExpect(model().attribute("product", instanceOf(Product.class)));
//    }
//
//    @SimpleCardTest
//    public void testSaveOrUpdate() throws Exception {
//        Integer id = 1;
//        String description = "SimpleCardTest Description";
//        BigDecimal price = new BigDecimal("12.00");
//        String imageUrl = "example.com";
//
//        Product returnProduct = new Product();
//        returnProduct.setId(id);
//        returnProduct.setDescription(description);
//        returnProduct.setPrice(price);
//        returnProduct.setImageUrl(imageUrl);
//
//        when(productService.saveOrUpdate(Matchers.<Product>any())).thenReturn(returnProduct);

//        mockMvc.perform(post("/product")
//                .param("id", "1")
//                .param("description", description)
//                .param("price", "12.00")
//                .param("imageUrl", "example.com"))
//                .andExpect(status().is3xxRedirection())
//                .andExpect(view().name("redirect:/product/show/1"))
//                .andExpect(model().attribute("product", instanceOf(Product.class)))
//                .andExpect(model().attribute("product", hasProperty("id", is(id))))
//                .andExpect(model().attribute("product", hasProperty("description", is(description))))
//                .andExpect(model().attribute("product", hasProperty("price", is(price))))
//                .andExpect(model().attribute("product", hasProperty("imageUrl", is(imageUrl))));
//
//        //verify properties of bound object
//        ArgumentCaptor<Product> boundProduct = ArgumentCaptor.forClass(Product.class);
//        verify(productService).saveOrUpdate(boundProduct.capture());
//
//        assertEquals(id, boundProduct.getValue().getId());
//        assertEquals(description, boundProduct.getValue().getDescription());
//        assertEquals(price, boundProduct.getValue().getPrice());
//        assertEquals(imageUrl, boundProduct.getValue().getImageUrl());
//    }

//    @SimpleCardTest
//    public void testDelete() throws Exception{
//        Integer id = 1;
//
//        mockMvc.perform(get("/product/delete/1"))
//                .andExpect(status().is3xxRedirection())
//                .andExpect(view().name("redirect:/product/list"));
//
//        verify(productService, times(1)).delete(id);
//    }
//
//    @SimpleCardTest
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
