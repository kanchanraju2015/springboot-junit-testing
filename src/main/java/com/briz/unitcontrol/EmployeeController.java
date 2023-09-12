package com.briz.unitcontrol;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
class EmployeeController
{
@Autowired
EmployeeRepository erepo;
@RequestMapping("/")
public String save()
{
	Employee e=new Employee();
	e.setCity("paris");
	e.setName("maria");
	erepo.save(e);
	return "data saved";
}
}
