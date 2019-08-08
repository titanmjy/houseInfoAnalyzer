package com.jinyu.dao;

import com.jinyu.model.HouseSourceInfo;

import java.util.List;
import java.util.Map;

public interface IHouseDao {

    public void addHouseSourceInfo(HouseSourceInfo houseSourceInfo);

    public void addHouseSourceInfoList(List<HouseSourceInfo> houseSourceInfoList);

    public List<HouseSourceInfo> getHouseSourceInfoList(Map<String,Object> param);

    public HouseSourceInfo getHouseHourceInfo();
}
