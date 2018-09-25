package user.Service;

import user.ServiceInteerface.*;
import common.exception.gException;
import Entity.Professor;
import baseService.baseUCServiceImpl;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;


@Service
public class ProfessorServiceImpl extends baseUCServiceImpl<Professor> implements ProfessorUCService
{

	@Override
	@Transactional
	public String Add(Professor entity) throws Exception, gException 
	{
		//do Business Logic HERE


		return super.Add(entity);
	}



	@Override
	@Transactional
	public Professor Edit(Professor entity)  throws Exception,gException
	{

		//do Business Logic HERE


		return super.Edit(entity);
	}



	@Override
	@Transactional
	public void Remove(Professor entity)  throws Exception,gException
	{

		//do Business Logic HERE


		super.Remove(entity);
	}


}
