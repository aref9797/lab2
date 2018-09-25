package manger.Service;

import manger.ServiceInteerface.*;
import common.exception.gException;
import Entity.ExprimentEquipment;
import baseService.baseUCServiceImpl;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;


@Service
public class ExprimentEquipmentServiceImpl extends baseUCServiceImpl<ExprimentEquipment> implements ExprimentEquipmentUCService
{

	@Override
	@Transactional
	public String Add(ExprimentEquipment entity) throws Exception, gException 
	{
		//do Business Logic HERE


		return super.Add(entity);
	}



	@Override
	@Transactional
	public ExprimentEquipment Edit(ExprimentEquipment entity)  throws Exception,gException
	{

		//do Business Logic HERE


		return super.Edit(entity);
	}



	@Override
	@Transactional
	public void Remove(ExprimentEquipment entity)  throws Exception,gException
	{

		//do Business Logic HERE


		super.Remove(entity);
	}


}
