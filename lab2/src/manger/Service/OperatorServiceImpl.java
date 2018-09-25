package manger.Service;

import manger.ServiceInteerface.*;
import common.exception.gException;
import Entity.Operator;
import baseService.baseUCServiceImpl;

import AAA.ServiceInterface.UserWebService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;


@Service
public class OperatorServiceImpl extends baseUCServiceImpl<Operator> implements OperatorUCService
{

	@Autowired
	private UserWebService UserWebS;
	
	@Override
	@Transactional
	public String Add(Operator entity) throws Exception, gException 
	{
		
		Long id=UserWebS.Add_long(entity.getAauser());
		entity.getAauser().setId(id);
		return super.Add(entity);
	}



	@Override
	@Transactional
	public Operator Edit(Operator entity)  throws Exception,gException
	{

		//do Business Logic HERE


		return super.Edit(entity);
	}



	@Override
	@Transactional
	public void Remove(Operator entity)  throws Exception,gException
	{

		//do Business Logic HERE


		super.Remove(entity);
	}


}
