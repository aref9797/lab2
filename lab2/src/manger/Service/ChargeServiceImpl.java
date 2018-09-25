package manger.Service;

import manger.ServiceInteerface.*;
import common.exception.gException;
import Entity.Charge;
import baseService.baseUCServiceImpl;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;


@Service
public class ChargeServiceImpl extends baseUCServiceImpl<Charge> implements ChargeUCService
{

	@Override
	@Transactional
	public String Add(Charge entity) throws Exception, gException 
	{
		//do Business Logic HERE


		return super.Add(entity);
	}



	@Override
	@Transactional
	public Charge Edit(Charge entity)  throws Exception,gException
	{

		//do Business Logic HERE


		return super.Edit(entity);
	}



	@Override
	@Transactional
	public void Remove(Charge entity)  throws Exception,gException
	{

		//do Business Logic HERE


		super.Remove(entity);
	}


}
