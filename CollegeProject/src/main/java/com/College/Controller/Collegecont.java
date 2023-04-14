package com.College.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.College.Dao.CollegeDo;
import com.College.Entity.College;

@RestController
public class Collegecont {
	@Autowired
	CollegeDo cd;

	@GetMapping("/clgform")
	public String form() {

		return "Hello";
	}

}
