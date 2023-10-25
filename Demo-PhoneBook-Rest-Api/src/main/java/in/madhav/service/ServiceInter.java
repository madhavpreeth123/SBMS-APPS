package in.madhav.service;

import in.madhav.req.ReqCustomer;
import in.madhav.response.PhoneResponse;

public interface ServiceInter {
	
	public PhoneResponse saveData(ReqCustomer rc);
	public PhoneResponse getData(Integer uId);

}
