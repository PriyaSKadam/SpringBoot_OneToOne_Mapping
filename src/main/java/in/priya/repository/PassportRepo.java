package in.priya.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import in.priya.entity.Passport;

public interface PassportRepo extends JpaRepository<Passport, Integer> {

}
