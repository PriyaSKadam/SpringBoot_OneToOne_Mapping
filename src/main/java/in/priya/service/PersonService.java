package in.priya.service;

import java.time.LocalDate;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import in.priya.entity.Passport;
import in.priya.entity.Person;
import in.priya.repository.PassportRepo;
import in.priya.repository.PersonRepo;

@Service
public class PersonService {
 
	 @Autowired
	 private PersonRepo personRepo;
	 
	 @Autowired
	 private PassportRepo passportRepo;
	 
	 Passport passport=null;
	 
	 public void savePersonWithPassport()
	 {
		 
		 Person p=new Person();
		 Passport passport=new Passport();
		 
		 
		 passport.setPassportNum("KH478555");
		 passport.setPassportExDate(LocalDate.now().plusYears(10));
		 passport.setPassportIssuedDate(LocalDate.now().minusYears(2));
		 passport.setPerson(p);
         
		 p.setPersonName("Priyanak");
		 p.setPersonEmail("priya@gmail.com");
		  p.setPassport(passport);
		 personRepo.save(p); 
				 
	 }
	 public void deletePerson(Integer id)
	 {
		 personRepo.deleteById(id);
	 }
	 
	 public void deletePassport(Integer id)
	 {
		 passportRepo.existsById(id);
	 }
	 
	 public void getPerson(Integer id)
	 {
		 personRepo.findById(id);
	 }
	 
	 public void getPassport(Integer id)
	 {
		 passportRepo.findById(id);
	 }
	
	 



}
