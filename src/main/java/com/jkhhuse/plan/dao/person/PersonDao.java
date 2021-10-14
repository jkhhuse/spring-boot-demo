package com.jkhhuse.plan.dao.person;

import com.jkhhuse.plan.entity.person.PersonDO;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PersonDao extends JpaRepository<PersonDO, Long> {

	PersonDO findByUuid(long uuid);

}