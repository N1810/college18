package com.College.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;

import com.College.Dao.CollegeDo;
import com.College.Entity.College;


public class CollegeController {
	@Autowired
	CollegeDo em;
	
	
	
	

	@GetMapping("/testclg/{id}")
	public College testmore(@PathVariable String id) {
	
	return em.getcoll(id);
      }
	@PostMapping("/addclg")
	public College addone (@RequestBody College emp) {
		return em.addoneclg(emp);
	}

	@DeleteMapping("/deleteclg/{clg}")
	public String deleteoneclg(@PathVariable String clid) {
		return em.deleteoneclg(clid);
}

	@PutMapping("/updateclg")
    public String updateoneclg(@RequestBody College cl  ) {
		return em.updateoneclg(cl);
	
}
	
	@GetMapping("/getallcoll")
	public List<College> getallclg()
	{
		
		return em.getallclg();
		
	}
	
}
