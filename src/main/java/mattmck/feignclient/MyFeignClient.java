package mattmck.feignclient;

import java.util.List;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

@FeignClient(value = "objects-service", url = "${feign.client.config.objects-service.url}")
public interface MyFeignClient {

	@GetMapping(value = "/objects")
	List<ObjectDto> getObjects();

	@GetMapping(value = "/objects/{id}")
	ObjectDto getObjectById(@PathVariable("id") String id);

	
	
	
//    @GetMapping(value = "/latest")
//    ExchangeRate getLatest();
//
//
//    @GetMapping(value = "/latest")
//    ExchangeRate getByBaseCurrency(@RequestParam(value = "base") Currency currency);
}
