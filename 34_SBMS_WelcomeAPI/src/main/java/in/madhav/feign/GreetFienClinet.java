package in.madhav.feign;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;

@FeignClient(name="GREET-API")
public interface GreetFienClinet {

	@GetMapping("/greet")
	public String invokeGreetApi();
}
