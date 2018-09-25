package user.Service;

import user.ServiceInteerface.*;
import common.exception.gException;
import Entity.ExprimentNewEquipment;
import baseService.baseUCServiceImpl;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;


@Service
public class ExprimentNewEquipmentServiceImpl extends baseUCServiceImpl<ExprimentNewEquipment> implements ExprimentNewEquipmentUCService
{

	@Override
	@Transactional
	public String Add(ExprimentNewEquipment entity) throws Exception, gException 
	{
		//do Business Logic HERE


		return super.Add(entity);
	}



	@Override
	@Transactional
	public ExprimentNewEquipment Edit(ExprimentNewEquipment entity)  throws Exception,gException
	{

		//do Business Logic HERE


		return super.Edit(entity);
	}



	@Override
	@Transactional
	public void Remove(ExprimentNewEquipment entity)  throws Exception,gException
	{

		//do Business Logic HERE


		super.Remove(entity);
	}


}
