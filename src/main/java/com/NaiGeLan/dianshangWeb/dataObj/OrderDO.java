package com.NaiGeLan.dianshangWeb.dataObj;

import java.time.LocalDateTime;

public class OrderDO {

    private int orderId;

    private int shopId;

    private int goodId;

    private LocalDateTime gmt_created;

    public int getOrderId() {
        return orderId;
    }

    public void setOrderId(int orderId) {
        this.orderId = orderId;
    }

    public int getShopId() {
        return shopId;
    }

    public void setShopId(int shopId) {
        this.shopId = shopId;
    }

    public int getGoodId() {
        return goodId;
    }

    public void setGoodId(int goodId) {
        this.goodId = goodId;
    }

    public LocalDateTime getGmt_created() {
        return gmt_created;
    }

    public void setGmt_created(LocalDateTime gmt_created) {
        this.gmt_created = gmt_created;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    private String status;

    private String location;

}
