package com.learn.youtube.devnitro.learnspringboot;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.learn.youtube.devnitro.learnspringboot.config.PizzaConfig;
import com.learn.youtube.devnitro.learnspringboot.imple.ColourPrinter;
import com.learn.youtube.devnitro.learnspringboot.printerClass.ColourPrinterImplents;

@SpringBootApplication

public class LearnspringbootApplication implements CommandLineRunner {

//	private ColourPrinter colorprinter;
//
//	public LearnspringbootApplication(ColourPrinter colorprinter) {
//		this.colorprinter = colorprinter;
//	}
	private PizzaConfig pizzaConfig;

	public LearnspringbootApplication(PizzaConfig pizzaConfig) {
	this.pizzaConfig=pizzaConfig;
}

	public static void main(String[] args) {
		SpringApplication.run(LearnspringbootApplication.class, args);

	}

	@Override
	public void run(String... args) throws Exception {
		// TODO Auto-generated method stub

	//	System.out.println(colorprinter.print());
		//System.out.println(String.format("i want %s size pizza and cheese is %s with the %s Topping ",pizzaConfig.getTopping()));
       System.out.println(pizzaConfig.toString());
	}

}
