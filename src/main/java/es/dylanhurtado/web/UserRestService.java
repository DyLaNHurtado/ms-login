package es.dylanhurtado.web;

import java.util.HashMap;
import java.util.Map;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RefreshScope
@RestController
public class UserRestService {
	@Value("${xParam}")
	private int xParam;
	@Value("${yParam}")
	private int yParam;
	@Value("${dylan}")
	private String dylan;
	@GetMapping("/myConfig")
	public Map<String,Object> myConfig(){
		Map<String,Object> params = new HashMap<>();
		params.put("xParam",xParam);
		params.put("yParam",yParam);
		params.put("dylan",dylan);		
		params.put("threadName",Thread.currentThread().getName());
		return params;
	}
	
	

}
