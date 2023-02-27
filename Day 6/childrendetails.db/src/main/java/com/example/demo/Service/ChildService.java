package com.example.demo.Service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.PathVariable;

import com.example.demo.Model.ChildModel;
import com.example.demo.Repository.ChildRepository;

@Service
public class ChildService {
@Autowired
ChildRepository rep;

public String addchild(ChildModel model)
{
	rep.save(model);
	return "added";
}
public List<ChildModel> addchild()
{
	return rep.findAll();
}
public List<ChildModel> getSorted(String field)
{
	return rep.findAll(Sort.by(Sort.Direction.ASC,field));
}
public List<ChildModel> getPagination(@PathVariable int offset,@PathVariable int pagesize)
{
	Page<ChildModel> page=rep.findAll(PageRequest.of(offset, pagesize));
	return page.getContent();
}
}
