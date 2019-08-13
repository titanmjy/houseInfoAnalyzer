package com.jinyu.model;

import org.springframework.boot.autoconfigure.data.jpa.JpaRepositoriesAutoConfiguration;

import javax.persistence.*;

/**
 * 房源实体类
 * */

@Entity
@Table(name="houseSource")
public class HouseSourceInfo extends JpaRepositoriesAutoConfiguration {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long id;
    // 单价
    @Column(name = "unit_price")
    private float unitPrice;
    // 总价
    @Column(name = "total_price")
    private float totalPrice;
    @Column(name = "area")
    private float area;
    // 小区名
    @Column(name = "village_name")
    private String villageName;
    // 地址
    @Column(name = "address")
    private String address;
    // 镇区
    @Column(name = "county")
    private String county;
    // 市
    @Column(name = "city")
    private String city;
    // 省
    @Column(name = "province")
    private String province;
    // 来源网站
    @Column(name = "source")
    private String source;
    // 详细信息地址
    @Column(name = "url")
    private String url;
    // 发布日期
    @Column(name = "publish_date")
    private String publishDate;

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public float getUnitPrice() {
        return unitPrice;
    }

    public void setUnitPrice(float unitPrice) {
        this.unitPrice = unitPrice;
    }

    public float getTotalPrice() {
        return totalPrice;
    }

    public void setTotalPrice(float totalPrice) {
        this.totalPrice = totalPrice;
    }

    public String getVillageName() {
        return villageName;
    }

    public void setVillageName(String villageName) {
        this.villageName = villageName;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getCounty() {
        return county;
    }

    public void setCounty(String county) {
        this.county = county;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getProvince() {
        return province;
    }

    public void setProvince(String province) {
        this.province = province;
    }

    public String getSource() {
        return source;
    }

    public void setSource(String source) {
        this.source = source;
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    public String getPublishDate() {
        return publishDate;
    }

    public void setPublishDate(String publishDate) {
        this.publishDate = publishDate;
    }

    public float getArea() {
        return area;
    }

    public void setArea(float area) {
        this.area = area;
    }
}
