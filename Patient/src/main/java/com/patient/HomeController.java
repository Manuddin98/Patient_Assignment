package com.patient;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/home")
public class HomeController {

	@Autowired
    private PatientRepository patientRepository; 
	
	//for get all 
	
			@GetMapping("/patient")
			public List<PatientInfo> getAllInsurancePolicy(){
				
				return patientRepository.findAll();
			}
			
			
			//for get by id
			@GetMapping("/patient/{id}")
			public PatientInfo getPolicyById(@PathVariable int id) {
				
				Optional<PatientInfo> client=patientRepository.findById(id);
				
				return client.get();
				
			}
			
			
			//create patient
			@PostMapping("/patient/add")
			public PatientInfo createClient(@RequestBody PatientInfo client) {
				
				
				return patientRepository.save(client);
				
			}
			

			//update patient
			
			@PutMapping("/patient/{id}")
			public PatientInfo updateClient(@RequestBody PatientInfo client,@PathVariable int id) {
				
				 
				client.setId(id);
				
				return patientRepository.save(client);
				
			}
			
			

			//delete patient	
			
			@DeleteMapping("/patient/{id}")
			public String deleteClient(@PathVariable int id) {
				
				 patientRepository.deleteById(id);
				 return "patient deleted";
				 
				
			}
			
	
	
}
