package user.Service;

import user.ServiceInteerface.*;
import common.exception.gException;
import Entity.Student;
import baseService.baseUCServiceImpl;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;


@Service
public class StudentServiceImpl extends baseUCServiceImpl<Student> implements StudentUCService
{

	@Override
	@Transactional
	public String Add(Student entity) throws Exception, gException 
	{
		//do Business Logic HERE


		return super.Add(entity);
	}



	@Override
	@Transactional
	public Student Edit(Student entity)  throws Exception,gException
	{

		//do Business Logic HERE


		return super.Edit(entity);
	}



	@Override
	@Transactional
	public void Remove(Student entity)  throws Exception,gException
	{

		//do Business Logic HERE


		super.Remove(entity);
	}


}
