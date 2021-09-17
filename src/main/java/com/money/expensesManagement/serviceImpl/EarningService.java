package com.money.expensesManagement.serviceImpl;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.money.expensesManagement.IRepository.IEarningRepository;
import com.money.expensesManagement.Iservice.IEarningService;
import com.money.expensesManagement.modelImpl.Earning;

@Service
public class EarningService implements IEarningService{
	@Autowired
	private IEarningRepository earningRepository;
	
	public void saveEarning(Earning earningObj) {
		earningRepository.save(earningObj);
	}
	
	public List<Earning> getAllEarning(){
		List<Earning> listEarning = (List<Earning>) earningRepository.findAll(); // was giving error, hence needed to type cast
		if(listEarning.size() > 0) {
            return listEarning;
        } else {
            return new ArrayList<Earning>();
        }
	}
	
	//public Earning getExpenseById(int id) throws RecordNotFoundException{ // need to implement exception class
		public Earning getEarningById(int id) {
			Optional<Earning> earningObj =  earningRepository.findById(id);
			 if(earningObj.isPresent()) {
		            return earningObj.get();
		        } else {
		            //throw new RecordNotFoundException("No employee record exist for given id");
		        	return new Earning();
		        }
		}
		
		public void deleteEarningById(int id) {
			Optional<Earning> earningObj = earningRepository.findById(id);
			 if(earningObj.isPresent()) 
		        {
				 earningRepository.deleteById(id);
		        } else {
		            //throw new RecordNotFoundException("No employee record exist for given id");
		        	
		        }
		}

}
