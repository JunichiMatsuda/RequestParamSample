package com.example.demo.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

import com.example.demo.form.Form;

@Controller
public class RequestParamController {

	@GetMapping("show")
	public String showView() {
		return "entry";
	}
	
//	// 確認画面表示
//	@PostMapping("confirm")
//	public String confirmView(Model model, @RequestParam String name, @RequestParam Integer age,
//			@DateTimeFormat(iso = DateTimeFormat.ISO.DATE) @RequestParam LocalDate birth) {
//		//modelに格納
//		model.addAttribute("name", name);
//		model.addAttribute("age", age);
//		model.addAttribute("birth", birth);		
//		
//		return null;
//	}
	
	
	// 確認画面表示
	@PostMapping("confirm")
	public String confirmView(Form f) {
		//modelに格納
		return "confirm2";
	}	
}
