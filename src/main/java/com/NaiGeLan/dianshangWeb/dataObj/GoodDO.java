package com.NaiGeLan.dianshangWeb.dataObj;

import java.time.LocalDateTime;

public class GoodDO {
    private int goodId;

    private String goodname;

    private String price_original;

    private String price_now;

    private LocalDateTime gmt_created;

    private String inventory;

    public int getGoodId() {
        return goodId;
    }

    public void setGoodId(int goodId) {
        this.goodId = goodId;
    }

    public String getGoodname() {
        return goodname;
    }

    public void setGoodname(String goodname) {
        this.goodname = goodname;
    }

    public String getPrice_original() {
        return price_original;
    }

    public void setPrice_original(String price_original) {
        this.price_original = price_original;
    }

    public String getPrice_now() {
        return price_now;
    }

    public void setPrice_now(String price_now) {
        this.price_now = price_now;
    }

    public LocalDateTime getGmt_created() {
        return gmt_created;
    }

    public void setGmt_created(LocalDateTime gmt_created) {
        this.gmt_created = gmt_created;
    }

    public String getInventory() {
        return inventory;
    }

    public void setInventory(String inventory) {
        this.inventory = inventory;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public int getTypeId() {
        return typeId;
    }

    public void setTypeId(int typeId) {
        this.typeId = typeId;
    }

    public int getImageId() {
        return imageId;
    }

    public void setImageId(int imageId) {
        this.imageId = imageId;
    }

    public int getShopId() {
        return shopId;
    }

    public void setShopId(int shopId) {
        this.shopId = shopId;
    }

    private String status;

    private int typeId;

    private int imageId;

    private int shopId;

}
