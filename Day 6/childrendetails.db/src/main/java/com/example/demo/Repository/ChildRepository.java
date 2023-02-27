package com.example.demo.Repository;


import java.util.List;

import org.springframework.data.repository.ListPagingAndSortingRepository;
import org.springframework.stereotype.Repository;

import com.example.demo.Model.ChildModel;
@Repository
public interface ChildRepository extends ListPagingAndSortingRepository<ChildModel,Integer> {

	void save(ChildModel model);

	List<ChildModel> findAll();

}
