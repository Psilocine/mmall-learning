package com.mmall.pojo;

import java.util.Date;

/**
 * Created by Administrator on 2018/1/4.
 */
public class Shop {
    private Integer id;
    private String shopname;
    private String username;
    private String desc;
    private Date createTime;
    private Date updateTime;

    public Shop(Integer id, String shopname, String username, String desc, Date createTime, Date updateTime) {
        this.id = id;
        this.shopname = shopname;
        this.username = username;
        this.desc = desc;
        this.createTime = createTime;
        this.updateTime = updateTime;
    }


    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getShopname() {
        return shopname;
    }

    public void setShopname(String shopname) {
        this.shopname = shopname;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getDesc() {
        return desc;
    }

    public void setDesc(String desc) {
        this.desc = desc;
    }

    public Date getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    public Date getUpdateTime() {
        return updateTime;
    }

    public void setUpdateTime(Date updateTime) {
        this.updateTime = updateTime;
    }
}
