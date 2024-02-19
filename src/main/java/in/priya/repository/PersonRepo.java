package in.priya.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import in.priya.entity.Person;

public interface PersonRepo extends JpaRepository<Person, Integer>{

}
