package user.Service;

import user.ServiceInteerface.*;
import common.exception.gException;
import Entity.Resrevation;
import baseService.baseUCServiceImpl;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;


@Service
public class ResrevationServiceImpl extends baseUCServiceImpl<Resrevation> implements ResrevationUCService
{

	@Override
	@Transactional
	public String Add(Resrevation entity) throws Exception, gException 
	{
		//do Business Logic HERE


		return super.Add(entity);
	}



	@Override
	@Transactional
	public Resrevation Edit(Resrevation entity)  throws Exception,gException
	{

		//do Business Logic HERE


		return super.Edit(entity);
	}



	@Override
	@Transactional
	public void Remove(Resrevation entity)  throws Exception,gException
	{

		//do Business Logic HERE


		super.Remove(entity);
	}


}
