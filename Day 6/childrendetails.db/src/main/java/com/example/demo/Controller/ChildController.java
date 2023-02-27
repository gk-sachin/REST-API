package com.example.demo.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.Model.ChildModel;
import com.example.demo.Service.ChildService;

@RestController
public class ChildController {
	@Autowired
	
	ChildService service;
	@PostMapping("/child")
	public String addChild(@RequestBody ChildModel model)
	{
		return service.addchild(model);
	}
	@GetMapping("/child")
	public List<ChildModel> getChild()
	{
		return service.addchild();
	}
	@GetMapping("/child/{field}")
	public List<ChildModel> sorted(@PathVariable String field)
	{
		return service.getSorted(field);
	}
	@GetMapping("/child/{offset}/{pagesize}")
	public List<ChildModel> pagination(@PathVariable int offset,@PathVariable int pagesize)
	{
		return service.getPagination(offset,pagesize);
	}
	
	

}
