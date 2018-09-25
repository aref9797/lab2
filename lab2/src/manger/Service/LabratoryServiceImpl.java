package manger.Service;

import manger.ServiceInteerface.*;
import common.exception.gException;
import Entity.Labratory;
import baseService.baseUCServiceImpl;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;


@Service
public class LabratoryServiceImpl extends baseUCServiceImpl<Labratory> implements LabratoryUCService
{

	@Override
	@Transactional
	public String Add(Labratory entity) throws Exception, gException 
	{
		//do Business Logic HERE


		return super.Add(entity);
	}



	@Override
	@Transactional
	public Labratory Edit(Labratory entity)  throws Exception,gException
	{

		//do Business Logic HERE


		return super.Edit(entity);
	}



	@Override
	@Transactional
	public void Remove(Labratory entity)  throws Exception,gException
	{

		//do Business Logic HERE


		super.Remove(entity);
	}


}
