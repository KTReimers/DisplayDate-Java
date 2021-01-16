package com.codingdojo.displaydate;

import java.time.LocalDate;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller

public class index {
	@RequestMapping("/")
	public String home(Model model){
		return "index.jsp";
	}

	@RequestMapping("/date")
	public String date(Model model) {
		LocalDate today = LocalDate.now();
		DateTimeFormatter day = DateTimeFormatter.ofPattern("EEEE");
		DateTimeFormatter dayNum = DateTimeFormatter.ofPattern("dd");
		DateTimeFormatter month = DateTimeFormatter.ofPattern("MMMM");
		DateTimeFormatter year = DateTimeFormatter.ofPattern("yyyy");
		String today2 = today.format(day) + ", the " + today.format(dayNum) + " of " + today.format(month) + ", " + today.format(year);
		model.addAttribute("date", today2 );
		return "date.jsp";
	}
	
	@RequestMapping("/time")
	public String time(Model model) {
		LocalTime time = LocalTime.now();
		DateTimeFormatter time1 = DateTimeFormatter.ofPattern("HH:mm a");
		String time2 = time.format(time1);
		model.addAttribute("time", time2);
		return "time.jsp";
	}

}
