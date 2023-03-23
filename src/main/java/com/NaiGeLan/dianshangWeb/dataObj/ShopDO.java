package com.NaiGeLan.dianshangWeb.dataObj;

import java.time.LocalDateTime;

public class ShopDO {
    private int shopId;

    private String shopname;

    private String status;

    private String IP;

    private LocalDateTime gmt_created;

    private int admin;

    public int getShopId() {
        return shopId;
    }

    public void setShopId(int shopId) {
        this.shopId = shopId;
    }

    public String getShopname() {
        return shopname;
    }

    public void setShopname(String shopname) {
        this.shopname = shopname;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public String getIP() {
        return IP;
    }

    public void setIP(String IP) {
        this.IP = IP;
    }

    public LocalDateTime getGmt_created() {
        return gmt_created;
    }

    public void setGmt_created(LocalDateTime gmt_created) {
        this.gmt_created = gmt_created;
    }

    public int getAdmin() {
        return admin;
    }

    public void setAdmin(int admin) {
        this.admin = admin;
    }
}
