package com.jkhhuse.plan.service.person;

import com.jkhhuse.plan.dto.person.PersonDTO;
import com.jkhhuse.plan.entity.person.PersonDO;

import java.text.ParseException;

public interface PersonService {

    /**
     * 新增用户信息
     * @param personDTO
     * @return
     */
    String addPerson(PersonDTO personDTO) throws ParseException;

    /**
     * 更新用户信息
     * @param uuid
     * @param lastName
     * @return
     */
    PersonDO updatePerson(long uuid, String lastName);

}
