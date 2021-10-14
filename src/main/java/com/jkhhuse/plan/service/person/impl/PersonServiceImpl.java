package com.jkhhuse.plan.service.person.impl;

import com.jkhhuse.plan.dao.person.PersonDao;
import com.jkhhuse.plan.dto.person.PersonDTO;
import com.jkhhuse.plan.entity.person.PersonDO;
import com.jkhhuse.plan.service.person.PersonService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

@Service
public class PersonServiceImpl implements PersonService {
    @Resource
    private PersonDao personDao;

    @Override
    public String addPerson(PersonDTO personDTO) throws ParseException {
        // 判断用户邮箱不能重复

        PersonDO personDO = new PersonDO();
        personDO.setName(personDTO.getName());
        SimpleDateFormat format = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        personDO.setBorn_time(format.parse(personDTO.getBorn_time()));
        personDO.setOrigin(personDTO.getOrigin());
        personDO.setCreate_time(new Date());
        personDO.setAddr(personDTO.getAddr());
        personDO.setEmail(personDTO.getEmail());
        personDO.setPaaswd(personDTO.getPaaswd());
        personDao.save(personDO);
        return null;
    }

    @Override
    public PersonDO updatePerson(long uuid, String lastName) {
        return null;
    }
}
