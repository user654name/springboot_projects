package com.tuomingfen.springboot.model;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class AccountExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public AccountExample() {
        oredCriteria = new ArrayList<Criteria>();
    }

    public void setOrderByClause(String orderByClause) {
        this.orderByClause = orderByClause;
    }

    public String getOrderByClause() {
        return orderByClause;
    }

    public void setDistinct(boolean distinct) {
        this.distinct = distinct;
    }

    public boolean isDistinct() {
        return distinct;
    }

    public List<Criteria> getOredCriteria() {
        return oredCriteria;
    }

    public void or(Criteria criteria) {
        oredCriteria.add(criteria);
    }

    public Criteria or() {
        Criteria criteria = createCriteriaInternal();
        oredCriteria.add(criteria);
        return criteria;
    }

    public Criteria createCriteria() {
        Criteria criteria = createCriteriaInternal();
        if (oredCriteria.size() == 0) {
            oredCriteria.add(criteria);
        }
        return criteria;
    }

    protected Criteria createCriteriaInternal() {
        Criteria criteria = new Criteria();
        return criteria;
    }

    public void clear() {
        oredCriteria.clear();
        orderByClause = null;
        distinct = false;
    }

    protected abstract static class GeneratedCriteria {
        protected List<Criterion> criteria;

        protected GeneratedCriteria() {
            super();
            criteria = new ArrayList<Criterion>();
        }

        public boolean isValid() {
            return criteria.size() > 0;
        }

        public List<Criterion> getAllCriteria() {
            return criteria;
        }

        public List<Criterion> getCriteria() {
            return criteria;
        }

        protected void addCriterion(String condition) {
            if (condition == null) {
                throw new RuntimeException("Value for condition cannot be null");
            }
            criteria.add(new Criterion(condition));
        }

        protected void addCriterion(String condition, Object value, String property) {
            if (value == null) {
                throw new RuntimeException("Value for " + property + " cannot be null");
            }
            criteria.add(new Criterion(condition, value));
        }

        protected void addCriterion(String condition, Object value1, Object value2, String property) {
            if (value1 == null || value2 == null) {
                throw new RuntimeException("Between values for " + property + " cannot be null");
            }
            criteria.add(new Criterion(condition, value1, value2));
        }

        public Criteria andIdIsNull() {
            addCriterion("id is null");
            return (Criteria) this;
        }

        public Criteria andIdIsNotNull() {
            addCriterion("id is not null");
            return (Criteria) this;
        }

        public Criteria andIdEqualTo(Integer value) {
            addCriterion("id =", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotEqualTo(Integer value) {
            addCriterion("id <>", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdGreaterThan(Integer value) {
            addCriterion("id >", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("id >=", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdLessThan(Integer value) {
            addCriterion("id <", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdLessThanOrEqualTo(Integer value) {
            addCriterion("id <=", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdIn(List<Integer> values) {
            addCriterion("id in", values, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotIn(List<Integer> values) {
            addCriterion("id not in", values, "id");
            return (Criteria) this;
        }

        public Criteria andIdBetween(Integer value1, Integer value2) {
            addCriterion("id between", value1, value2, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotBetween(Integer value1, Integer value2) {
            addCriterion("id not between", value1, value2, "id");
            return (Criteria) this;
        }

        public Criteria andUidIsNull() {
            addCriterion("uid is null");
            return (Criteria) this;
        }

        public Criteria andUidIsNotNull() {
            addCriterion("uid is not null");
            return (Criteria) this;
        }

        public Criteria andUidEqualTo(Integer value) {
            addCriterion("uid =", value, "uid");
            return (Criteria) this;
        }

        public Criteria andUidNotEqualTo(Integer value) {
            addCriterion("uid <>", value, "uid");
            return (Criteria) this;
        }

        public Criteria andUidGreaterThan(Integer value) {
            addCriterion("uid >", value, "uid");
            return (Criteria) this;
        }

        public Criteria andUidGreaterThanOrEqualTo(Integer value) {
            addCriterion("uid >=", value, "uid");
            return (Criteria) this;
        }

        public Criteria andUidLessThan(Integer value) {
            addCriterion("uid <", value, "uid");
            return (Criteria) this;
        }

        public Criteria andUidLessThanOrEqualTo(Integer value) {
            addCriterion("uid <=", value, "uid");
            return (Criteria) this;
        }

        public Criteria andUidIn(List<Integer> values) {
            addCriterion("uid in", values, "uid");
            return (Criteria) this;
        }

        public Criteria andUidNotIn(List<Integer> values) {
            addCriterion("uid not in", values, "uid");
            return (Criteria) this;
        }

        public Criteria andUidBetween(Integer value1, Integer value2) {
            addCriterion("uid between", value1, value2, "uid");
            return (Criteria) this;
        }

        public Criteria andUidNotBetween(Integer value1, Integer value2) {
            addCriterion("uid not between", value1, value2, "uid");
            return (Criteria) this;
        }

        public Criteria andChuxuZhaoshangIsNull() {
            addCriterion("chuxu_zhaoshang is null");
            return (Criteria) this;
        }

        public Criteria andChuxuZhaoshangIsNotNull() {
            addCriterion("chuxu_zhaoshang is not null");
            return (Criteria) this;
        }

        public Criteria andChuxuZhaoshangEqualTo(Double value) {
            addCriterion("chuxu_zhaoshang =", value, "chuxuZhaoshang");
            return (Criteria) this;
        }

        public Criteria andChuxuZhaoshangNotEqualTo(Double value) {
            addCriterion("chuxu_zhaoshang <>", value, "chuxuZhaoshang");
            return (Criteria) this;
        }

        public Criteria andChuxuZhaoshangGreaterThan(Double value) {
            addCriterion("chuxu_zhaoshang >", value, "chuxuZhaoshang");
            return (Criteria) this;
        }

        public Criteria andChuxuZhaoshangGreaterThanOrEqualTo(Double value) {
            addCriterion("chuxu_zhaoshang >=", value, "chuxuZhaoshang");
            return (Criteria) this;
        }

        public Criteria andChuxuZhaoshangLessThan(Double value) {
            addCriterion("chuxu_zhaoshang <", value, "chuxuZhaoshang");
            return (Criteria) this;
        }

        public Criteria andChuxuZhaoshangLessThanOrEqualTo(Double value) {
            addCriterion("chuxu_zhaoshang <=", value, "chuxuZhaoshang");
            return (Criteria) this;
        }

        public Criteria andChuxuZhaoshangIn(List<Double> values) {
            addCriterion("chuxu_zhaoshang in", values, "chuxuZhaoshang");
            return (Criteria) this;
        }

        public Criteria andChuxuZhaoshangNotIn(List<Double> values) {
            addCriterion("chuxu_zhaoshang not in", values, "chuxuZhaoshang");
            return (Criteria) this;
        }

        public Criteria andChuxuZhaoshangBetween(Double value1, Double value2) {
            addCriterion("chuxu_zhaoshang between", value1, value2, "chuxuZhaoshang");
            return (Criteria) this;
        }

        public Criteria andChuxuZhaoshangNotBetween(Double value1, Double value2) {
            addCriterion("chuxu_zhaoshang not between", value1, value2, "chuxuZhaoshang");
            return (Criteria) this;
        }

        public Criteria andChuxuGongshangIsNull() {
            addCriterion("chuxu_gongshang is null");
            return (Criteria) this;
        }

        public Criteria andChuxuGongshangIsNotNull() {
            addCriterion("chuxu_gongshang is not null");
            return (Criteria) this;
        }

        public Criteria andChuxuGongshangEqualTo(Double value) {
            addCriterion("chuxu_gongshang =", value, "chuxuGongshang");
            return (Criteria) this;
        }

        public Criteria andChuxuGongshangNotEqualTo(Double value) {
            addCriterion("chuxu_gongshang <>", value, "chuxuGongshang");
            return (Criteria) this;
        }

        public Criteria andChuxuGongshangGreaterThan(Double value) {
            addCriterion("chuxu_gongshang >", value, "chuxuGongshang");
            return (Criteria) this;
        }

        public Criteria andChuxuGongshangGreaterThanOrEqualTo(Double value) {
            addCriterion("chuxu_gongshang >=", value, "chuxuGongshang");
            return (Criteria) this;
        }

        public Criteria andChuxuGongshangLessThan(Double value) {
            addCriterion("chuxu_gongshang <", value, "chuxuGongshang");
            return (Criteria) this;
        }

        public Criteria andChuxuGongshangLessThanOrEqualTo(Double value) {
            addCriterion("chuxu_gongshang <=", value, "chuxuGongshang");
            return (Criteria) this;
        }

        public Criteria andChuxuGongshangIn(List<Double> values) {
            addCriterion("chuxu_gongshang in", values, "chuxuGongshang");
            return (Criteria) this;
        }

        public Criteria andChuxuGongshangNotIn(List<Double> values) {
            addCriterion("chuxu_gongshang not in", values, "chuxuGongshang");
            return (Criteria) this;
        }

        public Criteria andChuxuGongshangBetween(Double value1, Double value2) {
            addCriterion("chuxu_gongshang between", value1, value2, "chuxuGongshang");
            return (Criteria) this;
        }

        public Criteria andChuxuGongshangNotBetween(Double value1, Double value2) {
            addCriterion("chuxu_gongshang not between", value1, value2, "chuxuGongshang");
            return (Criteria) this;
        }

        public Criteria andChuxuJiaotongIsNull() {
            addCriterion("chuxu_jiaotong is null");
            return (Criteria) this;
        }

        public Criteria andChuxuJiaotongIsNotNull() {
            addCriterion("chuxu_jiaotong is not null");
            return (Criteria) this;
        }

        public Criteria andChuxuJiaotongEqualTo(Double value) {
            addCriterion("chuxu_jiaotong =", value, "chuxuJiaotong");
            return (Criteria) this;
        }

        public Criteria andChuxuJiaotongNotEqualTo(Double value) {
            addCriterion("chuxu_jiaotong <>", value, "chuxuJiaotong");
            return (Criteria) this;
        }

        public Criteria andChuxuJiaotongGreaterThan(Double value) {
            addCriterion("chuxu_jiaotong >", value, "chuxuJiaotong");
            return (Criteria) this;
        }

        public Criteria andChuxuJiaotongGreaterThanOrEqualTo(Double value) {
            addCriterion("chuxu_jiaotong >=", value, "chuxuJiaotong");
            return (Criteria) this;
        }

        public Criteria andChuxuJiaotongLessThan(Double value) {
            addCriterion("chuxu_jiaotong <", value, "chuxuJiaotong");
            return (Criteria) this;
        }

        public Criteria andChuxuJiaotongLessThanOrEqualTo(Double value) {
            addCriterion("chuxu_jiaotong <=", value, "chuxuJiaotong");
            return (Criteria) this;
        }

        public Criteria andChuxuJiaotongIn(List<Double> values) {
            addCriterion("chuxu_jiaotong in", values, "chuxuJiaotong");
            return (Criteria) this;
        }

        public Criteria andChuxuJiaotongNotIn(List<Double> values) {
            addCriterion("chuxu_jiaotong not in", values, "chuxuJiaotong");
            return (Criteria) this;
        }

        public Criteria andChuxuJiaotongBetween(Double value1, Double value2) {
            addCriterion("chuxu_jiaotong between", value1, value2, "chuxuJiaotong");
            return (Criteria) this;
        }

        public Criteria andChuxuJiaotongNotBetween(Double value1, Double value2) {
            addCriterion("chuxu_jiaotong not between", value1, value2, "chuxuJiaotong");
            return (Criteria) this;
        }

        public Criteria andXinyongJiaotongIsNull() {
            addCriterion("xinyong_jiaotong is null");
            return (Criteria) this;
        }

        public Criteria andXinyongJiaotongIsNotNull() {
            addCriterion("xinyong_jiaotong is not null");
            return (Criteria) this;
        }

        public Criteria andXinyongJiaotongEqualTo(Double value) {
            addCriterion("xinyong_jiaotong =", value, "xinyongJiaotong");
            return (Criteria) this;
        }

        public Criteria andXinyongJiaotongNotEqualTo(Double value) {
            addCriterion("xinyong_jiaotong <>", value, "xinyongJiaotong");
            return (Criteria) this;
        }

        public Criteria andXinyongJiaotongGreaterThan(Double value) {
            addCriterion("xinyong_jiaotong >", value, "xinyongJiaotong");
            return (Criteria) this;
        }

        public Criteria andXinyongJiaotongGreaterThanOrEqualTo(Double value) {
            addCriterion("xinyong_jiaotong >=", value, "xinyongJiaotong");
            return (Criteria) this;
        }

        public Criteria andXinyongJiaotongLessThan(Double value) {
            addCriterion("xinyong_jiaotong <", value, "xinyongJiaotong");
            return (Criteria) this;
        }

        public Criteria andXinyongJiaotongLessThanOrEqualTo(Double value) {
            addCriterion("xinyong_jiaotong <=", value, "xinyongJiaotong");
            return (Criteria) this;
        }

        public Criteria andXinyongJiaotongIn(List<Double> values) {
            addCriterion("xinyong_jiaotong in", values, "xinyongJiaotong");
            return (Criteria) this;
        }

        public Criteria andXinyongJiaotongNotIn(List<Double> values) {
            addCriterion("xinyong_jiaotong not in", values, "xinyongJiaotong");
            return (Criteria) this;
        }

        public Criteria andXinyongJiaotongBetween(Double value1, Double value2) {
            addCriterion("xinyong_jiaotong between", value1, value2, "xinyongJiaotong");
            return (Criteria) this;
        }

        public Criteria andXinyongJiaotongNotBetween(Double value1, Double value2) {
            addCriterion("xinyong_jiaotong not between", value1, value2, "xinyongJiaotong");
            return (Criteria) this;
        }

        public Criteria andWeixinLingqianIsNull() {
            addCriterion("weixin_lingqian is null");
            return (Criteria) this;
        }

        public Criteria andWeixinLingqianIsNotNull() {
            addCriterion("weixin_lingqian is not null");
            return (Criteria) this;
        }

        public Criteria andWeixinLingqianEqualTo(Double value) {
            addCriterion("weixin_lingqian =", value, "weixinLingqian");
            return (Criteria) this;
        }

        public Criteria andWeixinLingqianNotEqualTo(Double value) {
            addCriterion("weixin_lingqian <>", value, "weixinLingqian");
            return (Criteria) this;
        }

        public Criteria andWeixinLingqianGreaterThan(Double value) {
            addCriterion("weixin_lingqian >", value, "weixinLingqian");
            return (Criteria) this;
        }

        public Criteria andWeixinLingqianGreaterThanOrEqualTo(Double value) {
            addCriterion("weixin_lingqian >=", value, "weixinLingqian");
            return (Criteria) this;
        }

        public Criteria andWeixinLingqianLessThan(Double value) {
            addCriterion("weixin_lingqian <", value, "weixinLingqian");
            return (Criteria) this;
        }

        public Criteria andWeixinLingqianLessThanOrEqualTo(Double value) {
            addCriterion("weixin_lingqian <=", value, "weixinLingqian");
            return (Criteria) this;
        }

        public Criteria andWeixinLingqianIn(List<Double> values) {
            addCriterion("weixin_lingqian in", values, "weixinLingqian");
            return (Criteria) this;
        }

        public Criteria andWeixinLingqianNotIn(List<Double> values) {
            addCriterion("weixin_lingqian not in", values, "weixinLingqian");
            return (Criteria) this;
        }

        public Criteria andWeixinLingqianBetween(Double value1, Double value2) {
            addCriterion("weixin_lingqian between", value1, value2, "weixinLingqian");
            return (Criteria) this;
        }

        public Criteria andWeixinLingqianNotBetween(Double value1, Double value2) {
            addCriterion("weixin_lingqian not between", value1, value2, "weixinLingqian");
            return (Criteria) this;
        }

        public Criteria andWeixinLicaiIsNull() {
            addCriterion("weixin_licai is null");
            return (Criteria) this;
        }

        public Criteria andWeixinLicaiIsNotNull() {
            addCriterion("weixin_licai is not null");
            return (Criteria) this;
        }

        public Criteria andWeixinLicaiEqualTo(Double value) {
            addCriterion("weixin_licai =", value, "weixinLicai");
            return (Criteria) this;
        }

        public Criteria andWeixinLicaiNotEqualTo(Double value) {
            addCriterion("weixin_licai <>", value, "weixinLicai");
            return (Criteria) this;
        }

        public Criteria andWeixinLicaiGreaterThan(Double value) {
            addCriterion("weixin_licai >", value, "weixinLicai");
            return (Criteria) this;
        }

        public Criteria andWeixinLicaiGreaterThanOrEqualTo(Double value) {
            addCriterion("weixin_licai >=", value, "weixinLicai");
            return (Criteria) this;
        }

        public Criteria andWeixinLicaiLessThan(Double value) {
            addCriterion("weixin_licai <", value, "weixinLicai");
            return (Criteria) this;
        }

        public Criteria andWeixinLicaiLessThanOrEqualTo(Double value) {
            addCriterion("weixin_licai <=", value, "weixinLicai");
            return (Criteria) this;
        }

        public Criteria andWeixinLicaiIn(List<Double> values) {
            addCriterion("weixin_licai in", values, "weixinLicai");
            return (Criteria) this;
        }

        public Criteria andWeixinLicaiNotIn(List<Double> values) {
            addCriterion("weixin_licai not in", values, "weixinLicai");
            return (Criteria) this;
        }

        public Criteria andWeixinLicaiBetween(Double value1, Double value2) {
            addCriterion("weixin_licai between", value1, value2, "weixinLicai");
            return (Criteria) this;
        }

        public Criteria andWeixinLicaiNotBetween(Double value1, Double value2) {
            addCriterion("weixin_licai not between", value1, value2, "weixinLicai");
            return (Criteria) this;
        }

        public Criteria andAlipayYebIsNull() {
            addCriterion("alipay_yeb is null");
            return (Criteria) this;
        }

        public Criteria andAlipayYebIsNotNull() {
            addCriterion("alipay_yeb is not null");
            return (Criteria) this;
        }

        public Criteria andAlipayYebEqualTo(Double value) {
            addCriterion("alipay_yeb =", value, "alipayYeb");
            return (Criteria) this;
        }

        public Criteria andAlipayYebNotEqualTo(Double value) {
            addCriterion("alipay_yeb <>", value, "alipayYeb");
            return (Criteria) this;
        }

        public Criteria andAlipayYebGreaterThan(Double value) {
            addCriterion("alipay_yeb >", value, "alipayYeb");
            return (Criteria) this;
        }

        public Criteria andAlipayYebGreaterThanOrEqualTo(Double value) {
            addCriterion("alipay_yeb >=", value, "alipayYeb");
            return (Criteria) this;
        }

        public Criteria andAlipayYebLessThan(Double value) {
            addCriterion("alipay_yeb <", value, "alipayYeb");
            return (Criteria) this;
        }

        public Criteria andAlipayYebLessThanOrEqualTo(Double value) {
            addCriterion("alipay_yeb <=", value, "alipayYeb");
            return (Criteria) this;
        }

        public Criteria andAlipayYebIn(List<Double> values) {
            addCriterion("alipay_yeb in", values, "alipayYeb");
            return (Criteria) this;
        }

        public Criteria andAlipayYebNotIn(List<Double> values) {
            addCriterion("alipay_yeb not in", values, "alipayYeb");
            return (Criteria) this;
        }

        public Criteria andAlipayYebBetween(Double value1, Double value2) {
            addCriterion("alipay_yeb between", value1, value2, "alipayYeb");
            return (Criteria) this;
        }

        public Criteria andAlipayYebNotBetween(Double value1, Double value2) {
            addCriterion("alipay_yeb not between", value1, value2, "alipayYeb");
            return (Criteria) this;
        }

        public Criteria andAlipayLicaiIsNull() {
            addCriterion("alipay_licai is null");
            return (Criteria) this;
        }

        public Criteria andAlipayLicaiIsNotNull() {
            addCriterion("alipay_licai is not null");
            return (Criteria) this;
        }

        public Criteria andAlipayLicaiEqualTo(Double value) {
            addCriterion("alipay_licai =", value, "alipayLicai");
            return (Criteria) this;
        }

        public Criteria andAlipayLicaiNotEqualTo(Double value) {
            addCriterion("alipay_licai <>", value, "alipayLicai");
            return (Criteria) this;
        }

        public Criteria andAlipayLicaiGreaterThan(Double value) {
            addCriterion("alipay_licai >", value, "alipayLicai");
            return (Criteria) this;
        }

        public Criteria andAlipayLicaiGreaterThanOrEqualTo(Double value) {
            addCriterion("alipay_licai >=", value, "alipayLicai");
            return (Criteria) this;
        }

        public Criteria andAlipayLicaiLessThan(Double value) {
            addCriterion("alipay_licai <", value, "alipayLicai");
            return (Criteria) this;
        }

        public Criteria andAlipayLicaiLessThanOrEqualTo(Double value) {
            addCriterion("alipay_licai <=", value, "alipayLicai");
            return (Criteria) this;
        }

        public Criteria andAlipayLicaiIn(List<Double> values) {
            addCriterion("alipay_licai in", values, "alipayLicai");
            return (Criteria) this;
        }

        public Criteria andAlipayLicaiNotIn(List<Double> values) {
            addCriterion("alipay_licai not in", values, "alipayLicai");
            return (Criteria) this;
        }

        public Criteria andAlipayLicaiBetween(Double value1, Double value2) {
            addCriterion("alipay_licai between", value1, value2, "alipayLicai");
            return (Criteria) this;
        }

        public Criteria andAlipayLicaiNotBetween(Double value1, Double value2) {
            addCriterion("alipay_licai not between", value1, value2, "alipayLicai");
            return (Criteria) this;
        }

        public Criteria andAlipayHbIsNull() {
            addCriterion("alipay_hb is null");
            return (Criteria) this;
        }

        public Criteria andAlipayHbIsNotNull() {
            addCriterion("alipay_hb is not null");
            return (Criteria) this;
        }

        public Criteria andAlipayHbEqualTo(Double value) {
            addCriterion("alipay_hb =", value, "alipayHb");
            return (Criteria) this;
        }

        public Criteria andAlipayHbNotEqualTo(Double value) {
            addCriterion("alipay_hb <>", value, "alipayHb");
            return (Criteria) this;
        }

        public Criteria andAlipayHbGreaterThan(Double value) {
            addCriterion("alipay_hb >", value, "alipayHb");
            return (Criteria) this;
        }

        public Criteria andAlipayHbGreaterThanOrEqualTo(Double value) {
            addCriterion("alipay_hb >=", value, "alipayHb");
            return (Criteria) this;
        }

        public Criteria andAlipayHbLessThan(Double value) {
            addCriterion("alipay_hb <", value, "alipayHb");
            return (Criteria) this;
        }

        public Criteria andAlipayHbLessThanOrEqualTo(Double value) {
            addCriterion("alipay_hb <=", value, "alipayHb");
            return (Criteria) this;
        }

        public Criteria andAlipayHbIn(List<Double> values) {
            addCriterion("alipay_hb in", values, "alipayHb");
            return (Criteria) this;
        }

        public Criteria andAlipayHbNotIn(List<Double> values) {
            addCriterion("alipay_hb not in", values, "alipayHb");
            return (Criteria) this;
        }

        public Criteria andAlipayHbBetween(Double value1, Double value2) {
            addCriterion("alipay_hb between", value1, value2, "alipayHb");
            return (Criteria) this;
        }

        public Criteria andAlipayHbNotBetween(Double value1, Double value2) {
            addCriterion("alipay_hb not between", value1, value2, "alipayHb");
            return (Criteria) this;
        }

        public Criteria andAlipay2YebIsNull() {
            addCriterion("alipay2_yeb is null");
            return (Criteria) this;
        }

        public Criteria andAlipay2YebIsNotNull() {
            addCriterion("alipay2_yeb is not null");
            return (Criteria) this;
        }

        public Criteria andAlipay2YebEqualTo(Double value) {
            addCriterion("alipay2_yeb =", value, "alipay2Yeb");
            return (Criteria) this;
        }

        public Criteria andAlipay2YebNotEqualTo(Double value) {
            addCriterion("alipay2_yeb <>", value, "alipay2Yeb");
            return (Criteria) this;
        }

        public Criteria andAlipay2YebGreaterThan(Double value) {
            addCriterion("alipay2_yeb >", value, "alipay2Yeb");
            return (Criteria) this;
        }

        public Criteria andAlipay2YebGreaterThanOrEqualTo(Double value) {
            addCriterion("alipay2_yeb >=", value, "alipay2Yeb");
            return (Criteria) this;
        }

        public Criteria andAlipay2YebLessThan(Double value) {
            addCriterion("alipay2_yeb <", value, "alipay2Yeb");
            return (Criteria) this;
        }

        public Criteria andAlipay2YebLessThanOrEqualTo(Double value) {
            addCriterion("alipay2_yeb <=", value, "alipay2Yeb");
            return (Criteria) this;
        }

        public Criteria andAlipay2YebIn(List<Double> values) {
            addCriterion("alipay2_yeb in", values, "alipay2Yeb");
            return (Criteria) this;
        }

        public Criteria andAlipay2YebNotIn(List<Double> values) {
            addCriterion("alipay2_yeb not in", values, "alipay2Yeb");
            return (Criteria) this;
        }

        public Criteria andAlipay2YebBetween(Double value1, Double value2) {
            addCriterion("alipay2_yeb between", value1, value2, "alipay2Yeb");
            return (Criteria) this;
        }

        public Criteria andAlipay2YebNotBetween(Double value1, Double value2) {
            addCriterion("alipay2_yeb not between", value1, value2, "alipay2Yeb");
            return (Criteria) this;
        }

        public Criteria andAlipay2LicaiIsNull() {
            addCriterion("alipay2_licai is null");
            return (Criteria) this;
        }

        public Criteria andAlipay2LicaiIsNotNull() {
            addCriterion("alipay2_licai is not null");
            return (Criteria) this;
        }

        public Criteria andAlipay2LicaiEqualTo(Double value) {
            addCriterion("alipay2_licai =", value, "alipay2Licai");
            return (Criteria) this;
        }

        public Criteria andAlipay2LicaiNotEqualTo(Double value) {
            addCriterion("alipay2_licai <>", value, "alipay2Licai");
            return (Criteria) this;
        }

        public Criteria andAlipay2LicaiGreaterThan(Double value) {
            addCriterion("alipay2_licai >", value, "alipay2Licai");
            return (Criteria) this;
        }

        public Criteria andAlipay2LicaiGreaterThanOrEqualTo(Double value) {
            addCriterion("alipay2_licai >=", value, "alipay2Licai");
            return (Criteria) this;
        }

        public Criteria andAlipay2LicaiLessThan(Double value) {
            addCriterion("alipay2_licai <", value, "alipay2Licai");
            return (Criteria) this;
        }

        public Criteria andAlipay2LicaiLessThanOrEqualTo(Double value) {
            addCriterion("alipay2_licai <=", value, "alipay2Licai");
            return (Criteria) this;
        }

        public Criteria andAlipay2LicaiIn(List<Double> values) {
            addCriterion("alipay2_licai in", values, "alipay2Licai");
            return (Criteria) this;
        }

        public Criteria andAlipay2LicaiNotIn(List<Double> values) {
            addCriterion("alipay2_licai not in", values, "alipay2Licai");
            return (Criteria) this;
        }

        public Criteria andAlipay2LicaiBetween(Double value1, Double value2) {
            addCriterion("alipay2_licai between", value1, value2, "alipay2Licai");
            return (Criteria) this;
        }

        public Criteria andAlipay2LicaiNotBetween(Double value1, Double value2) {
            addCriterion("alipay2_licai not between", value1, value2, "alipay2Licai");
            return (Criteria) this;
        }

        public Criteria andMiDebtIsNull() {
            addCriterion("mi_debt is null");
            return (Criteria) this;
        }

        public Criteria andMiDebtIsNotNull() {
            addCriterion("mi_debt is not null");
            return (Criteria) this;
        }

        public Criteria andMiDebtEqualTo(Double value) {
            addCriterion("mi_debt =", value, "miDebt");
            return (Criteria) this;
        }

        public Criteria andMiDebtNotEqualTo(Double value) {
            addCriterion("mi_debt <>", value, "miDebt");
            return (Criteria) this;
        }

        public Criteria andMiDebtGreaterThan(Double value) {
            addCriterion("mi_debt >", value, "miDebt");
            return (Criteria) this;
        }

        public Criteria andMiDebtGreaterThanOrEqualTo(Double value) {
            addCriterion("mi_debt >=", value, "miDebt");
            return (Criteria) this;
        }

        public Criteria andMiDebtLessThan(Double value) {
            addCriterion("mi_debt <", value, "miDebt");
            return (Criteria) this;
        }

        public Criteria andMiDebtLessThanOrEqualTo(Double value) {
            addCriterion("mi_debt <=", value, "miDebt");
            return (Criteria) this;
        }

        public Criteria andMiDebtIn(List<Double> values) {
            addCriterion("mi_debt in", values, "miDebt");
            return (Criteria) this;
        }

        public Criteria andMiDebtNotIn(List<Double> values) {
            addCriterion("mi_debt not in", values, "miDebt");
            return (Criteria) this;
        }

        public Criteria andMiDebtBetween(Double value1, Double value2) {
            addCriterion("mi_debt between", value1, value2, "miDebt");
            return (Criteria) this;
        }

        public Criteria andMiDebtNotBetween(Double value1, Double value2) {
            addCriterion("mi_debt not between", value1, value2, "miDebt");
            return (Criteria) this;
        }

        public Criteria andQqQianbaoIsNull() {
            addCriterion("qq_qianbao is null");
            return (Criteria) this;
        }

        public Criteria andQqQianbaoIsNotNull() {
            addCriterion("qq_qianbao is not null");
            return (Criteria) this;
        }

        public Criteria andQqQianbaoEqualTo(Double value) {
            addCriterion("qq_qianbao =", value, "qqQianbao");
            return (Criteria) this;
        }

        public Criteria andQqQianbaoNotEqualTo(Double value) {
            addCriterion("qq_qianbao <>", value, "qqQianbao");
            return (Criteria) this;
        }

        public Criteria andQqQianbaoGreaterThan(Double value) {
            addCriterion("qq_qianbao >", value, "qqQianbao");
            return (Criteria) this;
        }

        public Criteria andQqQianbaoGreaterThanOrEqualTo(Double value) {
            addCriterion("qq_qianbao >=", value, "qqQianbao");
            return (Criteria) this;
        }

        public Criteria andQqQianbaoLessThan(Double value) {
            addCriterion("qq_qianbao <", value, "qqQianbao");
            return (Criteria) this;
        }

        public Criteria andQqQianbaoLessThanOrEqualTo(Double value) {
            addCriterion("qq_qianbao <=", value, "qqQianbao");
            return (Criteria) this;
        }

        public Criteria andQqQianbaoIn(List<Double> values) {
            addCriterion("qq_qianbao in", values, "qqQianbao");
            return (Criteria) this;
        }

        public Criteria andQqQianbaoNotIn(List<Double> values) {
            addCriterion("qq_qianbao not in", values, "qqQianbao");
            return (Criteria) this;
        }

        public Criteria andQqQianbaoBetween(Double value1, Double value2) {
            addCriterion("qq_qianbao between", value1, value2, "qqQianbao");
            return (Criteria) this;
        }

        public Criteria andQqQianbaoNotBetween(Double value1, Double value2) {
            addCriterion("qq_qianbao not between", value1, value2, "qqQianbao");
            return (Criteria) this;
        }

        public Criteria andQqLicaiIsNull() {
            addCriterion("qq_licai is null");
            return (Criteria) this;
        }

        public Criteria andQqLicaiIsNotNull() {
            addCriterion("qq_licai is not null");
            return (Criteria) this;
        }

        public Criteria andQqLicaiEqualTo(Double value) {
            addCriterion("qq_licai =", value, "qqLicai");
            return (Criteria) this;
        }

        public Criteria andQqLicaiNotEqualTo(Double value) {
            addCriterion("qq_licai <>", value, "qqLicai");
            return (Criteria) this;
        }

        public Criteria andQqLicaiGreaterThan(Double value) {
            addCriterion("qq_licai >", value, "qqLicai");
            return (Criteria) this;
        }

        public Criteria andQqLicaiGreaterThanOrEqualTo(Double value) {
            addCriterion("qq_licai >=", value, "qqLicai");
            return (Criteria) this;
        }

        public Criteria andQqLicaiLessThan(Double value) {
            addCriterion("qq_licai <", value, "qqLicai");
            return (Criteria) this;
        }

        public Criteria andQqLicaiLessThanOrEqualTo(Double value) {
            addCriterion("qq_licai <=", value, "qqLicai");
            return (Criteria) this;
        }

        public Criteria andQqLicaiIn(List<Double> values) {
            addCriterion("qq_licai in", values, "qqLicai");
            return (Criteria) this;
        }

        public Criteria andQqLicaiNotIn(List<Double> values) {
            addCriterion("qq_licai not in", values, "qqLicai");
            return (Criteria) this;
        }

        public Criteria andQqLicaiBetween(Double value1, Double value2) {
            addCriterion("qq_licai between", value1, value2, "qqLicai");
            return (Criteria) this;
        }

        public Criteria andQqLicaiNotBetween(Double value1, Double value2) {
            addCriterion("qq_licai not between", value1, value2, "qqLicai");
            return (Criteria) this;
        }

        public Criteria andWalletIsNull() {
            addCriterion("wallet is null");
            return (Criteria) this;
        }

        public Criteria andWalletIsNotNull() {
            addCriterion("wallet is not null");
            return (Criteria) this;
        }

        public Criteria andWalletEqualTo(Double value) {
            addCriterion("wallet =", value, "wallet");
            return (Criteria) this;
        }

        public Criteria andWalletNotEqualTo(Double value) {
            addCriterion("wallet <>", value, "wallet");
            return (Criteria) this;
        }

        public Criteria andWalletGreaterThan(Double value) {
            addCriterion("wallet >", value, "wallet");
            return (Criteria) this;
        }

        public Criteria andWalletGreaterThanOrEqualTo(Double value) {
            addCriterion("wallet >=", value, "wallet");
            return (Criteria) this;
        }

        public Criteria andWalletLessThan(Double value) {
            addCriterion("wallet <", value, "wallet");
            return (Criteria) this;
        }

        public Criteria andWalletLessThanOrEqualTo(Double value) {
            addCriterion("wallet <=", value, "wallet");
            return (Criteria) this;
        }

        public Criteria andWalletIn(List<Double> values) {
            addCriterion("wallet in", values, "wallet");
            return (Criteria) this;
        }

        public Criteria andWalletNotIn(List<Double> values) {
            addCriterion("wallet not in", values, "wallet");
            return (Criteria) this;
        }

        public Criteria andWalletBetween(Double value1, Double value2) {
            addCriterion("wallet between", value1, value2, "wallet");
            return (Criteria) this;
        }

        public Criteria andWalletNotBetween(Double value1, Double value2) {
            addCriterion("wallet not between", value1, value2, "wallet");
            return (Criteria) this;
        }

        public Criteria andRecordDateIsNull() {
            addCriterion("record_date is null");
            return (Criteria) this;
        }

        public Criteria andRecordDateIsNotNull() {
            addCriterion("record_date is not null");
            return (Criteria) this;
        }

        public Criteria andRecordDateEqualTo(Date value) {
            addCriterion("record_date =", value, "recordDate");
            return (Criteria) this;
        }

        public Criteria andRecordDateNotEqualTo(Date value) {
            addCriterion("record_date <>", value, "recordDate");
            return (Criteria) this;
        }

        public Criteria andRecordDateGreaterThan(Date value) {
            addCriterion("record_date >", value, "recordDate");
            return (Criteria) this;
        }

        public Criteria andRecordDateGreaterThanOrEqualTo(Date value) {
            addCriterion("record_date >=", value, "recordDate");
            return (Criteria) this;
        }

        public Criteria andRecordDateLessThan(Date value) {
            addCriterion("record_date <", value, "recordDate");
            return (Criteria) this;
        }

        public Criteria andRecordDateLessThanOrEqualTo(Date value) {
            addCriterion("record_date <=", value, "recordDate");
            return (Criteria) this;
        }

        public Criteria andRecordDateIn(List<Date> values) {
            addCriterion("record_date in", values, "recordDate");
            return (Criteria) this;
        }

        public Criteria andRecordDateNotIn(List<Date> values) {
            addCriterion("record_date not in", values, "recordDate");
            return (Criteria) this;
        }

        public Criteria andRecordDateBetween(Date value1, Date value2) {
            addCriterion("record_date between", value1, value2, "recordDate");
            return (Criteria) this;
        }

        public Criteria andRecordDateNotBetween(Date value1, Date value2) {
            addCriterion("record_date not between", value1, value2, "recordDate");
            return (Criteria) this;
        }

        public Criteria andInsertDateIsNull() {
            addCriterion("insert_date is null");
            return (Criteria) this;
        }

        public Criteria andInsertDateIsNotNull() {
            addCriterion("insert_date is not null");
            return (Criteria) this;
        }

        public Criteria andInsertDateEqualTo(Date value) {
            addCriterion("insert_date =", value, "insertDate");
            return (Criteria) this;
        }

        public Criteria andInsertDateNotEqualTo(Date value) {
            addCriterion("insert_date <>", value, "insertDate");
            return (Criteria) this;
        }

        public Criteria andInsertDateGreaterThan(Date value) {
            addCriterion("insert_date >", value, "insertDate");
            return (Criteria) this;
        }

        public Criteria andInsertDateGreaterThanOrEqualTo(Date value) {
            addCriterion("insert_date >=", value, "insertDate");
            return (Criteria) this;
        }

        public Criteria andInsertDateLessThan(Date value) {
            addCriterion("insert_date <", value, "insertDate");
            return (Criteria) this;
        }

        public Criteria andInsertDateLessThanOrEqualTo(Date value) {
            addCriterion("insert_date <=", value, "insertDate");
            return (Criteria) this;
        }

        public Criteria andInsertDateIn(List<Date> values) {
            addCriterion("insert_date in", values, "insertDate");
            return (Criteria) this;
        }

        public Criteria andInsertDateNotIn(List<Date> values) {
            addCriterion("insert_date not in", values, "insertDate");
            return (Criteria) this;
        }

        public Criteria andInsertDateBetween(Date value1, Date value2) {
            addCriterion("insert_date between", value1, value2, "insertDate");
            return (Criteria) this;
        }

        public Criteria andInsertDateNotBetween(Date value1, Date value2) {
            addCriterion("insert_date not between", value1, value2, "insertDate");
            return (Criteria) this;
        }

        public Criteria andLastUpdateIsNull() {
            addCriterion("last_update is null");
            return (Criteria) this;
        }

        public Criteria andLastUpdateIsNotNull() {
            addCriterion("last_update is not null");
            return (Criteria) this;
        }

        public Criteria andLastUpdateEqualTo(Date value) {
            addCriterion("last_update =", value, "lastUpdate");
            return (Criteria) this;
        }

        public Criteria andLastUpdateNotEqualTo(Date value) {
            addCriterion("last_update <>", value, "lastUpdate");
            return (Criteria) this;
        }

        public Criteria andLastUpdateGreaterThan(Date value) {
            addCriterion("last_update >", value, "lastUpdate");
            return (Criteria) this;
        }

        public Criteria andLastUpdateGreaterThanOrEqualTo(Date value) {
            addCriterion("last_update >=", value, "lastUpdate");
            return (Criteria) this;
        }

        public Criteria andLastUpdateLessThan(Date value) {
            addCriterion("last_update <", value, "lastUpdate");
            return (Criteria) this;
        }

        public Criteria andLastUpdateLessThanOrEqualTo(Date value) {
            addCriterion("last_update <=", value, "lastUpdate");
            return (Criteria) this;
        }

        public Criteria andLastUpdateIn(List<Date> values) {
            addCriterion("last_update in", values, "lastUpdate");
            return (Criteria) this;
        }

        public Criteria andLastUpdateNotIn(List<Date> values) {
            addCriterion("last_update not in", values, "lastUpdate");
            return (Criteria) this;
        }

        public Criteria andLastUpdateBetween(Date value1, Date value2) {
            addCriterion("last_update between", value1, value2, "lastUpdate");
            return (Criteria) this;
        }

        public Criteria andLastUpdateNotBetween(Date value1, Date value2) {
            addCriterion("last_update not between", value1, value2, "lastUpdate");
            return (Criteria) this;
        }
    }

    public static class Criteria extends GeneratedCriteria {

        protected Criteria() {
            super();
        }
    }

    public static class Criterion {
        private String condition;

        private Object value;

        private Object secondValue;

        private boolean noValue;

        private boolean singleValue;

        private boolean betweenValue;

        private boolean listValue;

        private String typeHandler;

        public String getCondition() {
            return condition;
        }

        public Object getValue() {
            return value;
        }

        public Object getSecondValue() {
            return secondValue;
        }

        public boolean isNoValue() {
            return noValue;
        }

        public boolean isSingleValue() {
            return singleValue;
        }

        public boolean isBetweenValue() {
            return betweenValue;
        }

        public boolean isListValue() {
            return listValue;
        }

        public String getTypeHandler() {
            return typeHandler;
        }

        protected Criterion(String condition) {
            super();
            this.condition = condition;
            this.typeHandler = null;
            this.noValue = true;
        }

        protected Criterion(String condition, Object value, String typeHandler) {
            super();
            this.condition = condition;
            this.value = value;
            this.typeHandler = typeHandler;
            if (value instanceof List<?>) {
                this.listValue = true;
            } else {
                this.singleValue = true;
            }
        }

        protected Criterion(String condition, Object value) {
            this(condition, value, null);
        }

        protected Criterion(String condition, Object value, Object secondValue, String typeHandler) {
            super();
            this.condition = condition;
            this.value = value;
            this.secondValue = secondValue;
            this.typeHandler = typeHandler;
            this.betweenValue = true;
        }

        protected Criterion(String condition, Object value, Object secondValue) {
            this(condition, value, secondValue, null);
        }
    }
}