package com.tuomingfen.springboot.model;

import java.util.Date;

public class Account {
    private Double chuxuZhaoshang;
    private Double chuxuGongshang;
    private Double chuxuJiaotong;
    private Double xinyongJiaotong;
    private Double weixinLingqian;
    private Double weixinLicai;
    private Double alipayYeb;
    private Double alipayLicai;
    private Double alipayHb;
    private Double alipay2Yeb;
    private Double alipay2Licai;
    private Double miDebt;
    private Double qqQianbao;
    private Double qqLicai;
    private Double wallet;

    @Override
    public String toString() {
        return "Account{" +
                "chuxuZhaoshang=" + chuxuZhaoshang +
                ", chuxuGongshang=" + chuxuGongshang +
                ", chuxuJiaotong=" + chuxuJiaotong +
                ", xinyongJiaotong=" + xinyongJiaotong +
                ", weixinLingqian=" + weixinLingqian +
                ", weixinLicai=" + weixinLicai +
                ", alipayYeb=" + alipayYeb +
                ", alipayLicai=" + alipayLicai +
                ", alipayHb=" + alipayHb +
                ", alipay2Yeb=" + alipay2Yeb +
                ", alipay2Licai=" + alipay2Licai +
                ", miDebt=" + miDebt +
                ", qqQianbao=" + qqQianbao +
                ", qqLicai=" + qqLicai +
                ", wallet=" + wallet +
                ", recordDate=" + recordDate +
                ", insertDate=" + insertDate +
                ", lastUpdate=" + lastUpdate +
                ", note='" + note + '\'' +
                ", id=" + id +
                ", uid=" + uid +
                '}';
    }

    public Double getRealAccount() {
        return chuxuZhaoshang + chuxuGongshang + chuxuJiaotong + (xinyongJiaotong - 8000)
                + weixinLingqian + weixinLicai + alipay2Yeb + alipay2Licai + alipayYeb + alipayLicai
                - alipayHb - miDebt + qqLicai + qqQianbao + wallet;
    }


    private Date recordDate;
    private Date insertDate;
    private Date lastUpdate;
    private String note;

    private Integer id;
    private Integer uid;
    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getUid() {
        return uid;
    }

    public void setUid(Integer uid) {
        this.uid = uid;
    }

    public Double getChuxuZhaoshang() {
        return chuxuZhaoshang;
    }

    public void setChuxuZhaoshang(Double chuxuZhaoshang) {
        this.chuxuZhaoshang = chuxuZhaoshang;
    }

    public Double getChuxuGongshang() {
        return chuxuGongshang;
    }

    public void setChuxuGongshang(Double chuxuGongshang) {
        this.chuxuGongshang = chuxuGongshang;
    }

    public Double getChuxuJiaotong() {
        return chuxuJiaotong;
    }

    public void setChuxuJiaotong(Double chuxuJiaotong) {
        this.chuxuJiaotong = chuxuJiaotong;
    }

    public Double getXinyongJiaotong() {
        return xinyongJiaotong;
    }

    public void setXinyongJiaotong(Double xinyongJiaotong) {
        this.xinyongJiaotong = xinyongJiaotong;
    }

    public Double getWeixinLingqian() {
        return weixinLingqian;
    }

    public void setWeixinLingqian(Double weixinLingqian) {
        this.weixinLingqian = weixinLingqian;
    }

    public Double getWeixinLicai() {
        return weixinLicai;
    }

    public void setWeixinLicai(Double weixinLicai) {
        this.weixinLicai = weixinLicai;
    }

    public Double getAlipayYeb() {
        return alipayYeb;
    }

    public void setAlipayYeb(Double alipayYeb) {
        this.alipayYeb = alipayYeb;
    }

    public Double getAlipayLicai() {
        return alipayLicai;
    }

    public void setAlipayLicai(Double alipayLicai) {
        this.alipayLicai = alipayLicai;
    }

    public Double getAlipayHb() {
        return alipayHb;
    }

    public void setAlipayHb(Double alipayHb) {
        this.alipayHb = alipayHb;
    }

    public Double getAlipay2Yeb() {
        return alipay2Yeb;
    }

    public void setAlipay2Yeb(Double alipay2Yeb) {
        this.alipay2Yeb = alipay2Yeb;
    }

    public Double getAlipay2Licai() {
        return alipay2Licai;
    }

    public void setAlipay2Licai(Double alipay2Licai) {
        this.alipay2Licai = alipay2Licai;
    }

    public Double getMiDebt() {
        return miDebt;
    }

    public void setMiDebt(Double miDebt) {
        this.miDebt = miDebt;
    }

    public Double getQqQianbao() {
        return qqQianbao;
    }

    public void setQqQianbao(Double qqQianbao) {
        this.qqQianbao = qqQianbao;
    }

    public Double getQqLicai() {
        return qqLicai;
    }

    public void setQqLicai(Double qqLicai) {
        this.qqLicai = qqLicai;
    }

    public Double getWallet() {
        return wallet;
    }

    public void setWallet(Double wallet) {
        this.wallet = wallet;
    }

    public Date getRecordDate() {
        return recordDate;
    }

    public void setRecordDate(Date recordDate) {
        this.recordDate = recordDate;
    }

    public Date getInsertDate() {
        return insertDate;
    }

    public void setInsertDate(Date insertDate) {
        this.insertDate = insertDate;
    }

    public Date getLastUpdate() {
        return lastUpdate;
    }

    public void setLastUpdate(Date lastUpdate) {
        this.lastUpdate = lastUpdate;
    }

    public String getNote() {
        return note;
    }

    public void setNote(String note) {
        this.note = note == null ? null : note.trim();
    }
}