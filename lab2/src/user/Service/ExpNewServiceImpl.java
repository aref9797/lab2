package user.Service;

import user.ServiceInteerface.*;
import common.exception.gException;
import Entity.ExpNew;
import baseService.baseUCServiceImpl;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;


@Service
public class ExpNewServiceImpl extends baseUCServiceImpl<ExpNew> implements ExpNewUCService
{

	@Override
	@Transactional
	public String Add(ExpNew entity) throws Exception, gException 
	{
		//do Business Logic HERE


		return super.Add(entity);
	}



	@Override
	@Transactional
	public ExpNew Edit(ExpNew entity)  throws Exception,gException
	{

		//do Business Logic HERE


		return super.Edit(entity);
	}



	@Override
	@Transactional
	public void Remove(ExpNew entity)  throws Exception,gException
	{

		//do Business Logic HERE


		super.Remove(entity);
	}


}
