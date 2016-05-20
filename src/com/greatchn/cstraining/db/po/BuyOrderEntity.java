package com.greatchn.cstraining.db.po;

/**
 * Created by DXG on 2016/4/12.
 */
public class BuyOrderEntity {
    private String id;
    private String orderBh;
    private Double orderYfk;
    private Double orderSfk;
    private String orderly;
    private String orderstatus;
    private String buyTime;
    private String buyUserid;
    private String sellUserid;
    private String sffp;
    private String sfht;
    private String tradeno;
    private String tradetype;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getOrderBh() {
        return orderBh;
    }

    public void setOrderBh(String orderBh) {
        this.orderBh = orderBh;
    }

    public Double getOrderYfk() {
        return orderYfk;
    }

    public void setOrderYfk(Double orderYfk) {
        this.orderYfk = orderYfk;
    }

    public Double getOrderSfk() {
        return orderSfk;
    }

    public void setOrderSfk(Double orderSfk) {
        this.orderSfk = orderSfk;
    }

    public String getOrderly() {
        return orderly;
    }

    public void setOrderly(String orderly) {
        this.orderly = orderly;
    }

    public String getOrderstatus() {
        return orderstatus;
    }

    public void setOrderstatus(String orderstatus) {
        this.orderstatus = orderstatus;
    }

    public String getBuyTime() {
        return buyTime;
    }

    public void setBuyTime(String buyTime) {
        this.buyTime = buyTime;
    }

    public String getBuyUserid() {
        return buyUserid;
    }

    public void setBuyUserid(String buyUserid) {
        this.buyUserid = buyUserid;
    }

    public String getSellUserid() {
        return sellUserid;
    }

    public void setSellUserid(String sellUserid) {
        this.sellUserid = sellUserid;
    }

    public String getSffp() {
        return sffp;
    }

    public void setSffp(String sffp) {
        this.sffp = sffp;
    }

    public String getSfht() {
        return sfht;
    }

    public void setSfht(String sfht) {
        this.sfht = sfht;
    }

    public String getTradeno() {
        return tradeno;
    }

    public void setTradeno(String tradeno) {
        this.tradeno = tradeno;
    }

    public String getTradetype() {
        return tradetype;
    }

    public void setTradetype(String tradetype) {
        this.tradetype = tradetype;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        BuyOrderEntity that = (BuyOrderEntity) o;

        if (id != null ? !id.equals(that.id) : that.id != null) return false;
        if (orderBh != null ? !orderBh.equals(that.orderBh) : that.orderBh != null) return false;
        if (orderYfk != null ? !orderYfk.equals(that.orderYfk) : that.orderYfk != null) return false;
        if (orderSfk != null ? !orderSfk.equals(that.orderSfk) : that.orderSfk != null) return false;
        if (orderly != null ? !orderly.equals(that.orderly) : that.orderly != null) return false;
        if (orderstatus != null ? !orderstatus.equals(that.orderstatus) : that.orderstatus != null) return false;
        if (buyTime != null ? !buyTime.equals(that.buyTime) : that.buyTime != null) return false;
        if (buyUserid != null ? !buyUserid.equals(that.buyUserid) : that.buyUserid != null) return false;
        if (sellUserid != null ? !sellUserid.equals(that.sellUserid) : that.sellUserid != null) return false;
        if (sffp != null ? !sffp.equals(that.sffp) : that.sffp != null) return false;
        if (sfht != null ? !sfht.equals(that.sfht) : that.sfht != null) return false;
        if (tradeno != null ? !tradeno.equals(that.tradeno) : that.tradeno != null) return false;
        if (tradetype != null ? !tradetype.equals(that.tradetype) : that.tradetype != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = id != null ? id.hashCode() : 0;
        result = 31 * result + (orderBh != null ? orderBh.hashCode() : 0);
        result = 31 * result + (orderYfk != null ? orderYfk.hashCode() : 0);
        result = 31 * result + (orderSfk != null ? orderSfk.hashCode() : 0);
        result = 31 * result + (orderly != null ? orderly.hashCode() : 0);
        result = 31 * result + (orderstatus != null ? orderstatus.hashCode() : 0);
        result = 31 * result + (buyTime != null ? buyTime.hashCode() : 0);
        result = 31 * result + (buyUserid != null ? buyUserid.hashCode() : 0);
        result = 31 * result + (sellUserid != null ? sellUserid.hashCode() : 0);
        result = 31 * result + (sffp != null ? sffp.hashCode() : 0);
        result = 31 * result + (sfht != null ? sfht.hashCode() : 0);
        result = 31 * result + (tradeno != null ? tradeno.hashCode() : 0);
        result = 31 * result + (tradetype != null ? tradetype.hashCode() : 0);
        return result;
    }
}
