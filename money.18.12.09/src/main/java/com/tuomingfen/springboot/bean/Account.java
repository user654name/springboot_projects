package com.tuomingfen.springboot.bean;

import java.util.Date;

public class Account {
    private Integer id;

    private Integer uid;

    private Date date;

    private String note;

    private String jiaotong;

    private String jiaotongxinyong;

    private String weixinLingqian;

    private String weixinLicai;

    private String alipayYeb;

    private String alipayLicai;

    private String alipay2Yeb;

    private String alipay2Licai;

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

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    public String getNote() {
        return note;
    }

    public void setNote(String note) {
        this.note = note == null ? null : note.trim();
    }

    public String getJiaotong() {
        return jiaotong;
    }

    public void setJiaotong(String jiaotong) {
        this.jiaotong = jiaotong == null ? null : jiaotong.trim();
    }

    public String getJiaotongxinyong() {
        return jiaotongxinyong;
    }

    public void setJiaotongxinyong(String jiaotongxinyong) {
        this.jiaotongxinyong = jiaotongxinyong == null ? null : jiaotongxinyong.trim();
    }

    public String getWeixinLingqian() {
        return weixinLingqian;
    }

    public void setWeixinLingqian(String weixinLingqian) {
        this.weixinLingqian = weixinLingqian == null ? null : weixinLingqian.trim();
    }

    public String getWeixinLicai() {
        return weixinLicai;
    }

    public void setWeixinLicai(String weixinLicai) {
        this.weixinLicai = weixinLicai == null ? null : weixinLicai.trim();
    }

    public String getAlipayYeb() {
        return alipayYeb;
    }

    public void setAlipayYeb(String alipayYeb) {
        this.alipayYeb = alipayYeb == null ? null : alipayYeb.trim();
    }

    public String getAlipayLicai() {
        return alipayLicai;
    }

    public void setAlipayLicai(String alipayLicai) {
        this.alipayLicai = alipayLicai == null ? null : alipayLicai.trim();
    }

    public String getAlipay2Yeb() {
        return alipay2Yeb;
    }

    public void setAlipay2Yeb(String alipay2Yeb) {
        this.alipay2Yeb = alipay2Yeb == null ? null : alipay2Yeb.trim();
    }

    public String getAlipay2Licai() {
        return alipay2Licai;
    }

    public void setAlipay2Licai(String alipay2Licai) {
        this.alipay2Licai = alipay2Licai == null ? null : alipay2Licai.trim();
    }
}