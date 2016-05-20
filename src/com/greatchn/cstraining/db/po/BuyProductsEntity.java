package com.greatchn.cstraining.db.po;

/**
 * Created by DXG on 2016/4/12.
 */
public class BuyProductsEntity {
    private String id;
    private String ordersId;
    private String productstype;
    private Double productPrice;
    private String subjectId;
    private String subjectClassId;
    private String outlineId;
    private String bz;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getOrdersId() {
        return ordersId;
    }

    public void setOrdersId(String ordersId) {
        this.ordersId = ordersId;
    }

    public String getProductstype() {
        return productstype;
    }

    public void setProductstype(String productstype) {
        this.productstype = productstype;
    }

    public Double getProductPrice() {
        return productPrice;
    }

    public void setProductPrice(Double productPrice) {
        this.productPrice = productPrice;
    }

    public String getSubjectId() {
        return subjectId;
    }

    public void setSubjectId(String subjectId) {
        this.subjectId = subjectId;
    }

    public String getSubjectClassId() {
        return subjectClassId;
    }

    public void setSubjectClassId(String subjectClassId) {
        this.subjectClassId = subjectClassId;
    }

    public String getOutlineId() {
        return outlineId;
    }

    public void setOutlineId(String outlineId) {
        this.outlineId = outlineId;
    }

    public String getBz() {
        return bz;
    }

    public void setBz(String bz) {
        this.bz = bz;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        BuyProductsEntity that = (BuyProductsEntity) o;

        if (id != null ? !id.equals(that.id) : that.id != null) return false;
        if (ordersId != null ? !ordersId.equals(that.ordersId) : that.ordersId != null) return false;
        if (productstype != null ? !productstype.equals(that.productstype) : that.productstype != null) return false;
        if (productPrice != null ? !productPrice.equals(that.productPrice) : that.productPrice != null) return false;
        if (subjectId != null ? !subjectId.equals(that.subjectId) : that.subjectId != null) return false;
        if (subjectClassId != null ? !subjectClassId.equals(that.subjectClassId) : that.subjectClassId != null)
            return false;
        if (outlineId != null ? !outlineId.equals(that.outlineId) : that.outlineId != null) return false;
        if (bz != null ? !bz.equals(that.bz) : that.bz != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = id != null ? id.hashCode() : 0;
        result = 31 * result + (ordersId != null ? ordersId.hashCode() : 0);
        result = 31 * result + (productstype != null ? productstype.hashCode() : 0);
        result = 31 * result + (productPrice != null ? productPrice.hashCode() : 0);
        result = 31 * result + (subjectId != null ? subjectId.hashCode() : 0);
        result = 31 * result + (subjectClassId != null ? subjectClassId.hashCode() : 0);
        result = 31 * result + (outlineId != null ? outlineId.hashCode() : 0);
        result = 31 * result + (bz != null ? bz.hashCode() : 0);
        return result;
    }
}
