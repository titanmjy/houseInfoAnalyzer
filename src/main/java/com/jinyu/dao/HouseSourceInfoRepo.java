package com.jinyu.dao;

import com.jinyu.model.HouseSourceInfo;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Component;

@Component
public interface HouseSourceInfoRepo extends CrudRepository<HouseSourceInfo,String> {

}
