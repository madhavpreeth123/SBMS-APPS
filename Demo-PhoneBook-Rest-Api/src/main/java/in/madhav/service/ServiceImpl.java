package in.madhav.service;

import java.util.HashMap;
import java.util.Map;

import org.springframework.beans.BeanUtils;
import org.springframework.stereotype.Service;

import in.madhav.req.ReqCustomer;
import in.madhav.response.PhoneResponse;

@Service
public class ServiceImpl implements ServiceInter{
	
	Map<Integer,PhoneResponse> map=new HashMap<>();
	Integer uId=1;
	
	@Override
	public PhoneResponse saveData(ReqCustomer rc) {
		
		PhoneResponse ps=new PhoneResponse();
		BeanUtils.copyProperties(rc, ps);
		ps.setUId(uId);
		ps.setStatus("SAVED");
		
		map.put(uId, ps);
		uId++;
		return ps;
	}
	
	@Override
	public PhoneResponse getData(Integer uId) {
		if(map.containsKey(uId)){
			return map.get(uId);
		}
		return null;

}
}
