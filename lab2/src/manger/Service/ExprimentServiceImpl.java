package manger.Service;

import manger.ServiceInteerface.*;
import common.exception.gException;
import Entity.Expriment;
import baseService.baseUCServiceImpl;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;


@Service
public class ExprimentServiceImpl extends baseUCServiceImpl<Expriment> implements ExprimentUCService
{

	@Override
	@Transactional
	public String Add(Expriment entity) throws Exception, gException 
	{
		//do Business Logic HERE


		return super.Add(entity);
	}



	@Override
	@Transactional
	public Expriment Edit(Expriment entity)  throws Exception,gException
	{

		//do Business Logic HERE


		return super.Edit(entity);
	}



	@Override
	@Transactional
	public void Remove(Expriment entity)  throws Exception,gException
	{

		//do Business Logic HERE


		super.Remove(entity);
	}


}
