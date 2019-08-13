package com.jinyu;

import com.jinyu.dao.HouseSourceInfoRepo;
import com.jinyu.model.HouseSourceInfo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;

public class StarterRunner  implements CommandLineRunner {

    @Autowired
    private HouseSourceInfoRepo houseSourceInfoRepo;

    @Override
    public void run(String... args) throws Exception {
        System.out.println("=========================in begining===================");
        HouseSourceInfo houseSourceInfo = new HouseSourceInfo();
        houseSourceInfo.setAddress("海盐路21号3栋");
        houseSourceInfo.setUnitPrice(90000);
        houseSourceInfo.setTotalPrice(9000000);
        houseSourceInfo.setArea(100);
        HouseSourceInfo savedInfo = houseSourceInfoRepo.save(houseSourceInfo);
    }
}
