
package  AAA.Service;

import java.util.List;

import  AAA.common.AAATools;
import  AAA.ServiceInterface.UserWebService;
import  baseService.baseUCServiceImpl;
import common.SendEmail;
import  common.exception.gException;
import  AAA.Entity.Aauser;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
public class UserServiceImpl extends baseUCServiceImpl<Aauser> implements UserWebService
{

	Aauser user = new Aauser();
	
	@SuppressWarnings("unchecked")
	@Override
	@Transactional
	public String Add(Aauser user) throws Exception, gException
	{
	
		// check the unique of username
		List<Aauser> users = (List<Aauser>) em.createNamedQuery("Aauser.findbyUsername")
					.setParameter("username", user.getUsername()).getResultList();
		if (users.size() > 0)
			throw new gException("نام کاربری قبلا در سیستم ثبت شده است، لطفا از نام کاربری دیگری استفاده کنید.");
		
		if(user.getUsername().length() < 3 || user.getUsername().length() >10)
			throw new gException("تعداد کاراکتر نام کاربری باید بین 3 تا 10 باشد.");
		
		
		//check the unique of email
		List<Aauser> lu = (List<Aauser>) em.createNamedQuery("Aauser.findbyEmail").setParameter("email", user.getEmail()).getResultList();
		if(lu.size() > 0)
			throw new gException("ایمیل مورد نظر قبلا در سیستم ثبت شده است، لطفا از ایمیل دیگری استفاده کنید.");
		
		
		
		
		//Convert to HPassword
		String newHPassword = AAATools.getHashed(user.getHpassword());
		user.setHpassword(newHPassword);
		
		
		
		return super.Add(user);
	}

	@Override
	@Transactional
	public Aauser Edit(Aauser user) throws Exception, gException
	{
		// check the unique of username
		Aauser tempUser = em.find(Aauser.class, user.getId());
		user.setUsername(tempUser.getUsername());

		super.Edit(user);
		return null;
	}
	
	
	

}