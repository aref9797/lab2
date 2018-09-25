package user.Service;

import user.ServiceInteerface.*;
import common.exception.gException;

import Entity.ChargePayment;
import baseService.baseUCServiceImpl;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;


@Service
public class ChargePaymentServiceImpl extends baseUCServiceImpl<ChargePayment> implements ChargePaymentUCService
{

	@Override
	@Transactional
	public String Add(ChargePayment entity) throws Exception, gException 
	{
		//do Business Logic HERE


		return super.Add(entity);
	}



	@Override
	@Transactional
	public ChargePayment Edit(ChargePayment entity)  throws Exception,gException
	{

		//do Business Logic HERE


		return super.Edit(entity);
	}



	@Override
	@Transactional
	public void Remove(ChargePayment entity)  throws Exception,gException
	{

		//do Business Logic HERE


		super.Remove(entity);
	}


}
