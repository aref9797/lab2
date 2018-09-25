package user.Service;

import user.ServiceInteerface.*;
import common.exception.gException;
import Entity.Enduser;
import baseService.baseUCServiceImpl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import AAA.ServiceInterface.UserWebService;


@Service
public class EnduserServiceImpl extends baseUCServiceImpl<Enduser> implements EnduserUCService
{

	
	@Autowired
	private UserWebService UserWebS;
	
	@Override
	@Transactional
	public String Add(Enduser entity) throws Exception, gException 
	{
		
		return super.Add(entity);
	}
	
	@Override
	public long Add_long(Enduser entity) throws Exception, gException {
		
		Long id=UserWebS.Add_long(entity.getAauser());
		entity.getAauser().setId(id);
		return super.Add_long(entity);
	}


	@Override
	@Transactional
	public Enduser Edit(Enduser entity)  throws Exception,gException
	{

		//do Business Logic HERE


		return super.Edit(entity);
	}



	@Override
	@Transactional
	public void Remove(Enduser entity)  throws Exception,gException
	{

		//do Business Logic HERE


		super.Remove(entity);
	}


}
