package com.doug;

import com.doug.domain.Card;
import com.doug.domain.CardInfo;
import com.doug.services.CardService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.util.ArrayList;

@SpringBootApplication
public class CardrandomizerwebApplication {

	public static void main(String[] args) {


		SpringApplication.run(CardrandomizerwebApplication.class, args);

	}

}
