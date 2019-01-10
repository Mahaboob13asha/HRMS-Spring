package com.hrms.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.hrms.ServiceImpl.HolidayServiceImpl;
import com.hrms.model.Holiday;


@Controller
@RequestMapping("holidays")
public class HolidayController {

	@Autowired
	HolidayServiceImpl holidayService;

	@RequestMapping("/OpenHolidayList")
	public String Holidays(Model model) {

		List<Holiday> holidays = holidayService.findAll();
		model.addAttribute("holidays", holidays);

		return "holiday";
	}

	@RequestMapping("/addNewHoliday")
	public String addNewHoliday(Holiday holiday) {

		holidayService.save(holiday);

		return "redirect:/holidays/OpenHolidayList";
	}

	@RequestMapping("/editHoliday")
	public String editHoliday(@RequestParam("id") long id, Model model) {
		Optional<Holiday> holiday = holidayService.findById(id);
		model.addAttribute("holiday", holiday.toString());
		return "editHoliday";
	}

	@RequestMapping("/updateHoliday")
	public String updateHoliday(Holiday holiday, Model model) {

		holidayService.save(holiday);

		return "redirect:/holidays/OpenHolidayList";
	}

	@RequestMapping("/deleteHoliday")
	public String deleteHoliday(@RequestParam("id") long id) {
		holidayService.deleteById(id);
		return "redirect:/holidays/OpenHolidayList";

	}

}
