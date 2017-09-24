package com.doug.controllers;


import com.doug.services.UserServiceImpl;
import org.junit.Before;

import org.junit.Test;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.web.servlet.MockMvc;

import org.springframework.test.web.servlet.request.MockMvcRequestBuilders;
import org.springframework.test.web.servlet.setup.MockMvcBuilders;
import org.springframework.test.web.servlet.result.MockMvcResultMatchers;
import org.springframework.ui.Model;

import javax.servlet.http.HttpSession;

import static org.mockito.MockitoAnnotations.initMocks;


@SpringBootTest
public class UserControllerTest {

    @Mock
    Model model;

    @Mock
    HttpSession session;

    @Mock
    private UserServiceImpl userServiceImpl;

    private UserServiceImpl mockUserServiceImpl;

    @InjectMocks
    private UserController userController;

    private MockMvc mockMvc;

    @Before
    public void setupMock() {
        initMocks(this);

        mockMvc = MockMvcBuilders.standaloneSetup(userController)
                .build();
    }

    @Test
    public void testUserListView() throws Exception {
        mockMvc.perform(MockMvcRequestBuilders.get("/userList"))
                .andExpect(MockMvcResultMatchers.status().isOk())
                .andExpect(MockMvcResultMatchers.view().name("user/users"));
    }


}