package ganzijo.controller;

import ganzijo.repository.DataRepository;
import ganzijo.vo.DataVO;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class DataController {
	@Autowired
	private DataRepository dataRepository;

	@RequestMapping("/test")
	@ResponseBody
	public String test(){
		return "test";
	}
	@RequestMapping("/test1")
	@ResponseBody
	public DataVO test2(@RequestParam(required=false) String test){
		return dataRepository.test(test);
	}
}
