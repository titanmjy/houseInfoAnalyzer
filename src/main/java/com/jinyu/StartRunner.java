package com.jinyu;

import com.jinyu.dao.HouseSourceInfoRepo;
import com.jinyu.model.HouseSourceInfo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

@Component
public class StartRunner implements CommandLineRunner {

    @Autowired
    private HouseSourceInfoRepo houseSourceInfoRepo;

    @Override
    public void run(String... args) throws Exception {
        System.out.println("====================in runner==============================");
        HouseSourceInfo houseSourceInfo = new HouseSourceInfo();
        houseSourceInfo.setAddress("海盐路21号2栋");
        houseSourceInfo.setVillageName("金水湾");
        houseSourceInfo.setUnitPrice(90000);
        houseSourceInfo.setTotalPrice(9000000);
        houseSourceInfo.setArea(100);
//        houseSourceInfo.setId("1");
//        houseSourceInfo.setId(2);
        HouseSourceInfo savedInfo = houseSourceInfoRepo.save(houseSourceInfo);
    }
}
