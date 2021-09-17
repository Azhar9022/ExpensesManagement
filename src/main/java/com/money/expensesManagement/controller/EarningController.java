package com.money.expensesManagement.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

import com.money.expensesManagement.modelImpl.Earning;
import com.money.expensesManagement.serviceImpl.EarningService;

@RestController
public class EarningController {

	@Autowired
	EarningService earningService;
	
	@RequestMapping("/earning")
	public ModelAndView welcomeEarning() {
		
		//return "earning";
		return new ModelAndView("earning", "earningForm", new Earning());
	}
	
	@PostMapping(path="/saveEarning")
	public @ResponseBody String saveEarning(@ModelAttribute("earningForm") Earning earningForm) {
		/*
		 * Earning earningObj = new Earning(); earningObj.setDate(expDate);
		 */
		Earning earningForm1 = earningForm;
		earningService.saveEarning(earningForm);
		return "earning";
	}
	
	@GetMapping(path="/getAllEarnings")
	public ResponseEntity<List<Earning>> getAllEarning(){
		List<Earning> listEarning = earningService.getAllEarning();
		 return new ResponseEntity<List<Earning>>(listEarning, HttpStatus.OK);
	}
	
	/*
	 * @GetMapping(path="/getEarning/{id}") public ResponseEntity<Earning>
	 * getEarningById(@PathVariable("id") int id) { Earning earningObj =
	 * earningService.getEarningById(id); return new
	 * ResponseEntity<Earning>(earningObj, HttpStatus.OK); }
	 */
	
	@GetMapping(path="/getEarning/{id}")
	public ModelAndView getEarningById(@PathVariable("id") int id) {
		Earning earningObj = earningService.getEarningById(id);
		return new ModelAndView("earning", "earningForm", earningObj);
	}
	
	 @DeleteMapping(path="/deleteEarning/{id}")
	    public ResponseEntity<HttpStatus> deleteEarningById(@PathVariable("id") int id){
		 earningService.deleteEarningById(id);
	        //return HttpStatus.FORBIDDEN;
		 return new ResponseEntity<>(HttpStatus.NO_CONTENT);
	    }

}
