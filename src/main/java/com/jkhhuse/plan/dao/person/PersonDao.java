package com.jkhhuse.plan.dao.person;

import com.jkhhuse.plan.entity.person.PersonDO;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface PersonDao extends JpaRepository<PersonDO, Long> {

	PersonDO findByUuid(long uuid);

	List<PersonDO> findByEmail(String email);

}