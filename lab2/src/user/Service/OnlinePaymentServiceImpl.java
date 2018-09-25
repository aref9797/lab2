package user.Service;

import user.ServiceInteerface.*;
import common.exception.gException;
import Entity.OnlinePayment;
import baseService.baseUCServiceImpl;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;


@Service
public class OnlinePaymentServiceImpl extends baseUCServiceImpl<OnlinePayment> implements OnlinePaymentUCService
{

	@Override
	@Transactional
	public String Add(OnlinePayment entity) throws Exception, gException 
	{
		//do Business Logic HERE


		return super.Add(entity);
	}



	@Override
	@Transactional
	public OnlinePayment Edit(OnlinePayment entity)  throws Exception,gException
	{

		//do Business Logic HERE


		return super.Edit(entity);
	}



	@Override
	@Transactional
	public void Remove(OnlinePayment entity)  throws Exception,gException
	{

		//do Business Logic HERE


		super.Remove(entity);
	}


}
