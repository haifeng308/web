package com.greatchn.cstraining.db.po;

/**
 * Created by DXG on 2016/4/12.
 */
public class BuyFpInfosEntity {
    private String id;
    private String fpTitle;
    private String nsrsbh;
    private String companyAddress;
    private String companyPhone;
    private String bankacc;
    private String registerbank;
    private String contactPeople;
    private String contactPhone;
    private String mailaddress;
    private String portnum;
    private String orderId;
    private String companyName;
    private String fptype;
    private String receivetype;
    private String isprint;
    private String fpnum;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getFpTitle() {
        return fpTitle;
    }

    public void setFpTitle(String fpTitle) {
        this.fpTitle = fpTitle;
    }

    public String getNsrsbh() {
        return nsrsbh;
    }

    public void setNsrsbh(String nsrsbh) {
        this.nsrsbh = nsrsbh;
    }

    public String getCompanyAddress() {
        return companyAddress;
    }

    public void setCompanyAddress(String companyAddress) {
        this.companyAddress = companyAddress;
    }

    public String getCompanyPhone() {
        return companyPhone;
    }

    public void setCompanyPhone(String companyPhone) {
        this.companyPhone = companyPhone;
    }

    public String getBankacc() {
        return bankacc;
    }

    public void setBankacc(String bankacc) {
        this.bankacc = bankacc;
    }

    public String getRegisterbank() {
        return registerbank;
    }

    public void setRegisterbank(String registerbank) {
        this.registerbank = registerbank;
    }

    public String getContactPeople() {
        return contactPeople;
    }

    public void setContactPeople(String contactPeople) {
        this.contactPeople = contactPeople;
    }

    public String getContactPhone() {
        return contactPhone;
    }

    public void setContactPhone(String contactPhone) {
        this.contactPhone = contactPhone;
    }

    public String getMailaddress() {
        return mailaddress;
    }

    public void setMailaddress(String mailaddress) {
        this.mailaddress = mailaddress;
    }

    public String getPortnum() {
        return portnum;
    }

    public void setPortnum(String portnum) {
        this.portnum = portnum;
    }

    public String getOrderId() {
        return orderId;
    }

    public void setOrderId(String orderId) {
        this.orderId = orderId;
    }

    public String getCompanyName() {
        return companyName;
    }

    public void setCompanyName(String companyName) {
        this.companyName = companyName;
    }

    public String getFptype() {
        return fptype;
    }

    public void setFptype(String fptype) {
        this.fptype = fptype;
    }

    public String getReceivetype() {
        return receivetype;
    }

    public void setReceivetype(String receivetype) {
        this.receivetype = receivetype;
    }

    public String getIsprint() {
        return isprint;
    }

    public void setIsprint(String isprint) {
        this.isprint = isprint;
    }

    public String getFpnum() {
        return fpnum;
    }

    public void setFpnum(String fpnum) {
        this.fpnum = fpnum;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        BuyFpInfosEntity that = (BuyFpInfosEntity) o;

        if (id != null ? !id.equals(that.id) : that.id != null) return false;
        if (fpTitle != null ? !fpTitle.equals(that.fpTitle) : that.fpTitle != null) return false;
        if (nsrsbh != null ? !nsrsbh.equals(that.nsrsbh) : that.nsrsbh != null) return false;
        if (companyAddress != null ? !companyAddress.equals(that.companyAddress) : that.companyAddress != null)
            return false;
        if (companyPhone != null ? !companyPhone.equals(that.companyPhone) : that.companyPhone != null) return false;
        if (bankacc != null ? !bankacc.equals(that.bankacc) : that.bankacc != null) return false;
        if (registerbank != null ? !registerbank.equals(that.registerbank) : that.registerbank != null) return false;
        if (contactPeople != null ? !contactPeople.equals(that.contactPeople) : that.contactPeople != null)
            return false;
        if (contactPhone != null ? !contactPhone.equals(that.contactPhone) : that.contactPhone != null) return false;
        if (mailaddress != null ? !mailaddress.equals(that.mailaddress) : that.mailaddress != null) return false;
        if (portnum != null ? !portnum.equals(that.portnum) : that.portnum != null) return false;
        if (orderId != null ? !orderId.equals(that.orderId) : that.orderId != null) return false;
        if (companyName != null ? !companyName.equals(that.companyName) : that.companyName != null) return false;
        if (fptype != null ? !fptype.equals(that.fptype) : that.fptype != null) return false;
        if (receivetype != null ? !receivetype.equals(that.receivetype) : that.receivetype != null) return false;
        if (isprint != null ? !isprint.equals(that.isprint) : that.isprint != null) return false;
        if (fpnum != null ? !fpnum.equals(that.fpnum) : that.fpnum != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = id != null ? id.hashCode() : 0;
        result = 31 * result + (fpTitle != null ? fpTitle.hashCode() : 0);
        result = 31 * result + (nsrsbh != null ? nsrsbh.hashCode() : 0);
        result = 31 * result + (companyAddress != null ? companyAddress.hashCode() : 0);
        result = 31 * result + (companyPhone != null ? companyPhone.hashCode() : 0);
        result = 31 * result + (bankacc != null ? bankacc.hashCode() : 0);
        result = 31 * result + (registerbank != null ? registerbank.hashCode() : 0);
        result = 31 * result + (contactPeople != null ? contactPeople.hashCode() : 0);
        result = 31 * result + (contactPhone != null ? contactPhone.hashCode() : 0);
        result = 31 * result + (mailaddress != null ? mailaddress.hashCode() : 0);
        result = 31 * result + (portnum != null ? portnum.hashCode() : 0);
        result = 31 * result + (orderId != null ? orderId.hashCode() : 0);
        result = 31 * result + (companyName != null ? companyName.hashCode() : 0);
        result = 31 * result + (fptype != null ? fptype.hashCode() : 0);
        result = 31 * result + (receivetype != null ? receivetype.hashCode() : 0);
        result = 31 * result + (isprint != null ? isprint.hashCode() : 0);
        result = 31 * result + (fpnum != null ? fpnum.hashCode() : 0);
        return result;
    }
}
