package com.myfun.repository.admindb.po;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class AdminFunSectionExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public AdminFunSectionExample() {
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

    /**
     *
     */
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

        public Criteria andSectionIdIsNull() {
            addCriterion("SECTION_ID is null");
            return (Criteria) this;
        }

        public Criteria andSectionIdIsNotNull() {
            addCriterion("SECTION_ID is not null");
            return (Criteria) this;
        }

        public Criteria andSectionIdEqualTo(Integer value) {
            addCriterion("SECTION_ID =", value, "sectionId");
            return (Criteria) this;
        }

        public Criteria andSectionIdNotEqualTo(Integer value) {
            addCriterion("SECTION_ID <>", value, "sectionId");
            return (Criteria) this;
        }

        public Criteria andSectionIdGreaterThan(Integer value) {
            addCriterion("SECTION_ID >", value, "sectionId");
            return (Criteria) this;
        }

        public Criteria andSectionIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("SECTION_ID >=", value, "sectionId");
            return (Criteria) this;
        }

        public Criteria andSectionIdLessThan(Integer value) {
            addCriterion("SECTION_ID <", value, "sectionId");
            return (Criteria) this;
        }

        public Criteria andSectionIdLessThanOrEqualTo(Integer value) {
            addCriterion("SECTION_ID <=", value, "sectionId");
            return (Criteria) this;
        }

        public Criteria andSectionIdIn(List<Integer> values) {
            addCriterion("SECTION_ID in", values, "sectionId");
            return (Criteria) this;
        }

        public Criteria andSectionIdNotIn(List<Integer> values) {
            addCriterion("SECTION_ID not in", values, "sectionId");
            return (Criteria) this;
        }

        public Criteria andSectionIdBetween(Integer value1, Integer value2) {
            addCriterion("SECTION_ID between", value1, value2, "sectionId");
            return (Criteria) this;
        }

        public Criteria andSectionIdNotBetween(Integer value1, Integer value2) {
            addCriterion("SECTION_ID not between", value1, value2, "sectionId");
            return (Criteria) this;
        }

        public Criteria andCityIdIsNull() {
            addCriterion("CITY_ID is null");
            return (Criteria) this;
        }

        public Criteria andCityIdIsNotNull() {
            addCriterion("CITY_ID is not null");
            return (Criteria) this;
        }

        public Criteria andCityIdEqualTo(Short value) {
            addCriterion("CITY_ID =", value, "cityId");
            return (Criteria) this;
        }

        public Criteria andCityIdNotEqualTo(Short value) {
            addCriterion("CITY_ID <>", value, "cityId");
            return (Criteria) this;
        }

        public Criteria andCityIdGreaterThan(Short value) {
            addCriterion("CITY_ID >", value, "cityId");
            return (Criteria) this;
        }

        public Criteria andCityIdGreaterThanOrEqualTo(Short value) {
            addCriterion("CITY_ID >=", value, "cityId");
            return (Criteria) this;
        }

        public Criteria andCityIdLessThan(Short value) {
            addCriterion("CITY_ID <", value, "cityId");
            return (Criteria) this;
        }

        public Criteria andCityIdLessThanOrEqualTo(Short value) {
            addCriterion("CITY_ID <=", value, "cityId");
            return (Criteria) this;
        }

        public Criteria andCityIdIn(List<Short> values) {
            addCriterion("CITY_ID in", values, "cityId");
            return (Criteria) this;
        }

        public Criteria andCityIdNotIn(List<Short> values) {
            addCriterion("CITY_ID not in", values, "cityId");
            return (Criteria) this;
        }

        public Criteria andCityIdBetween(Short value1, Short value2) {
            addCriterion("CITY_ID between", value1, value2, "cityId");
            return (Criteria) this;
        }

        public Criteria andCityIdNotBetween(Short value1, Short value2) {
            addCriterion("CITY_ID not between", value1, value2, "cityId");
            return (Criteria) this;
        }

        public Criteria andRegIdIsNull() {
            addCriterion("REG_ID is null");
            return (Criteria) this;
        }

        public Criteria andRegIdIsNotNull() {
            addCriterion("REG_ID is not null");
            return (Criteria) this;
        }

        public Criteria andRegIdEqualTo(Integer value) {
            addCriterion("REG_ID =", value, "regId");
            return (Criteria) this;
        }

        public Criteria andRegIdNotEqualTo(Integer value) {
            addCriterion("REG_ID <>", value, "regId");
            return (Criteria) this;
        }

        public Criteria andRegIdGreaterThan(Integer value) {
            addCriterion("REG_ID >", value, "regId");
            return (Criteria) this;
        }

        public Criteria andRegIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("REG_ID >=", value, "regId");
            return (Criteria) this;
        }

        public Criteria andRegIdLessThan(Integer value) {
            addCriterion("REG_ID <", value, "regId");
            return (Criteria) this;
        }

        public Criteria andRegIdLessThanOrEqualTo(Integer value) {
            addCriterion("REG_ID <=", value, "regId");
            return (Criteria) this;
        }

        public Criteria andRegIdIn(List<Integer> values) {
            addCriterion("REG_ID in", values, "regId");
            return (Criteria) this;
        }

        public Criteria andRegIdNotIn(List<Integer> values) {
            addCriterion("REG_ID not in", values, "regId");
            return (Criteria) this;
        }

        public Criteria andRegIdBetween(Integer value1, Integer value2) {
            addCriterion("REG_ID between", value1, value2, "regId");
            return (Criteria) this;
        }

        public Criteria andRegIdNotBetween(Integer value1, Integer value2) {
            addCriterion("REG_ID not between", value1, value2, "regId");
            return (Criteria) this;
        }

        public Criteria andSectionCodeIsNull() {
            addCriterion("SECTION_CODE is null");
            return (Criteria) this;
        }

        public Criteria andSectionCodeIsNotNull() {
            addCriterion("SECTION_CODE is not null");
            return (Criteria) this;
        }

        public Criteria andSectionCodeEqualTo(String value) {
            addCriterion("SECTION_CODE =", value, "sectionCode");
            return (Criteria) this;
        }

        public Criteria andSectionCodeNotEqualTo(String value) {
            addCriterion("SECTION_CODE <>", value, "sectionCode");
            return (Criteria) this;
        }

        public Criteria andSectionCodeGreaterThan(String value) {
            addCriterion("SECTION_CODE >", value, "sectionCode");
            return (Criteria) this;
        }

        public Criteria andSectionCodeGreaterThanOrEqualTo(String value) {
            addCriterion("SECTION_CODE >=", value, "sectionCode");
            return (Criteria) this;
        }

        public Criteria andSectionCodeLessThan(String value) {
            addCriterion("SECTION_CODE <", value, "sectionCode");
            return (Criteria) this;
        }

        public Criteria andSectionCodeLessThanOrEqualTo(String value) {
            addCriterion("SECTION_CODE <=", value, "sectionCode");
            return (Criteria) this;
        }

        public Criteria andSectionCodeLike(String value) {
            addCriterion("SECTION_CODE like", value, "sectionCode");
            return (Criteria) this;
        }

        public Criteria andSectionCodeNotLike(String value) {
            addCriterion("SECTION_CODE not like", value, "sectionCode");
            return (Criteria) this;
        }

        public Criteria andSectionCodeIn(List<String> values) {
            addCriterion("SECTION_CODE in", values, "sectionCode");
            return (Criteria) this;
        }

        public Criteria andSectionCodeNotIn(List<String> values) {
            addCriterion("SECTION_CODE not in", values, "sectionCode");
            return (Criteria) this;
        }

        public Criteria andSectionCodeBetween(String value1, String value2) {
            addCriterion("SECTION_CODE between", value1, value2, "sectionCode");
            return (Criteria) this;
        }

        public Criteria andSectionCodeNotBetween(String value1, String value2) {
            addCriterion("SECTION_CODE not between", value1, value2, "sectionCode");
            return (Criteria) this;
        }

        public Criteria andSectionNameIsNull() {
            addCriterion("SECTION_NAME is null");
            return (Criteria) this;
        }

        public Criteria andSectionNameIsNotNull() {
            addCriterion("SECTION_NAME is not null");
            return (Criteria) this;
        }

        public Criteria andSectionNameEqualTo(String value) {
            addCriterion("SECTION_NAME =", value, "sectionName");
            return (Criteria) this;
        }

        public Criteria andSectionNameNotEqualTo(String value) {
            addCriterion("SECTION_NAME <>", value, "sectionName");
            return (Criteria) this;
        }

        public Criteria andSectionNameGreaterThan(String value) {
            addCriterion("SECTION_NAME >", value, "sectionName");
            return (Criteria) this;
        }

        public Criteria andSectionNameGreaterThanOrEqualTo(String value) {
            addCriterion("SECTION_NAME >=", value, "sectionName");
            return (Criteria) this;
        }

        public Criteria andSectionNameLessThan(String value) {
            addCriterion("SECTION_NAME <", value, "sectionName");
            return (Criteria) this;
        }

        public Criteria andSectionNameLessThanOrEqualTo(String value) {
            addCriterion("SECTION_NAME <=", value, "sectionName");
            return (Criteria) this;
        }

        public Criteria andSectionNameLike(String value) {
            addCriterion("SECTION_NAME like", value, "sectionName");
            return (Criteria) this;
        }

        public Criteria andSectionNameNotLike(String value) {
            addCriterion("SECTION_NAME not like", value, "sectionName");
            return (Criteria) this;
        }

        public Criteria andSectionNameIn(List<String> values) {
            addCriterion("SECTION_NAME in", values, "sectionName");
            return (Criteria) this;
        }

        public Criteria andSectionNameNotIn(List<String> values) {
            addCriterion("SECTION_NAME not in", values, "sectionName");
            return (Criteria) this;
        }

        public Criteria andSectionNameBetween(String value1, String value2) {
            addCriterion("SECTION_NAME between", value1, value2, "sectionName");
            return (Criteria) this;
        }

        public Criteria andSectionNameNotBetween(String value1, String value2) {
            addCriterion("SECTION_NAME not between", value1, value2, "sectionName");
            return (Criteria) this;
        }

        public Criteria andVertifyFlagIsNull() {
            addCriterion("VERTIFY_FLAG is null");
            return (Criteria) this;
        }

        public Criteria andVertifyFlagIsNotNull() {
            addCriterion("VERTIFY_FLAG is not null");
            return (Criteria) this;
        }

        public Criteria andVertifyFlagEqualTo(Byte value) {
            addCriterion("VERTIFY_FLAG =", value, "vertifyFlag");
            return (Criteria) this;
        }

        public Criteria andVertifyFlagNotEqualTo(Byte value) {
            addCriterion("VERTIFY_FLAG <>", value, "vertifyFlag");
            return (Criteria) this;
        }

        public Criteria andVertifyFlagGreaterThan(Byte value) {
            addCriterion("VERTIFY_FLAG >", value, "vertifyFlag");
            return (Criteria) this;
        }

        public Criteria andVertifyFlagGreaterThanOrEqualTo(Byte value) {
            addCriterion("VERTIFY_FLAG >=", value, "vertifyFlag");
            return (Criteria) this;
        }

        public Criteria andVertifyFlagLessThan(Byte value) {
            addCriterion("VERTIFY_FLAG <", value, "vertifyFlag");
            return (Criteria) this;
        }

        public Criteria andVertifyFlagLessThanOrEqualTo(Byte value) {
            addCriterion("VERTIFY_FLAG <=", value, "vertifyFlag");
            return (Criteria) this;
        }

        public Criteria andVertifyFlagIn(List<Byte> values) {
            addCriterion("VERTIFY_FLAG in", values, "vertifyFlag");
            return (Criteria) this;
        }

        public Criteria andVertifyFlagNotIn(List<Byte> values) {
            addCriterion("VERTIFY_FLAG not in", values, "vertifyFlag");
            return (Criteria) this;
        }

        public Criteria andVertifyFlagBetween(Byte value1, Byte value2) {
            addCriterion("VERTIFY_FLAG between", value1, value2, "vertifyFlag");
            return (Criteria) this;
        }

        public Criteria andVertifyFlagNotBetween(Byte value1, Byte value2) {
            addCriterion("VERTIFY_FLAG not between", value1, value2, "vertifyFlag");
            return (Criteria) this;
        }

        public Criteria andFidIsNull() {
            addCriterion("FId is null");
            return (Criteria) this;
        }

        public Criteria andFidIsNotNull() {
            addCriterion("FId is not null");
            return (Criteria) this;
        }

        public Criteria andFidEqualTo(Integer value) {
            addCriterion("FId =", value, "fid");
            return (Criteria) this;
        }

        public Criteria andFidNotEqualTo(Integer value) {
            addCriterion("FId <>", value, "fid");
            return (Criteria) this;
        }

        public Criteria andFidGreaterThan(Integer value) {
            addCriterion("FId >", value, "fid");
            return (Criteria) this;
        }

        public Criteria andFidGreaterThanOrEqualTo(Integer value) {
            addCriterion("FId >=", value, "fid");
            return (Criteria) this;
        }

        public Criteria andFidLessThan(Integer value) {
            addCriterion("FId <", value, "fid");
            return (Criteria) this;
        }

        public Criteria andFidLessThanOrEqualTo(Integer value) {
            addCriterion("FId <=", value, "fid");
            return (Criteria) this;
        }

        public Criteria andFidIn(List<Integer> values) {
            addCriterion("FId in", values, "fid");
            return (Criteria) this;
        }

        public Criteria andFidNotIn(List<Integer> values) {
            addCriterion("FId not in", values, "fid");
            return (Criteria) this;
        }

        public Criteria andFidBetween(Integer value1, Integer value2) {
            addCriterion("FId between", value1, value2, "fid");
            return (Criteria) this;
        }

        public Criteria andFidNotBetween(Integer value1, Integer value2) {
            addCriterion("FId not between", value1, value2, "fid");
            return (Criteria) this;
        }

        public Criteria andErpSectionIdIsNull() {
            addCriterion("ERP_SECTION_ID is null");
            return (Criteria) this;
        }

        public Criteria andErpSectionIdIsNotNull() {
            addCriterion("ERP_SECTION_ID is not null");
            return (Criteria) this;
        }

        public Criteria andErpSectionIdEqualTo(Integer value) {
            addCriterion("ERP_SECTION_ID =", value, "erpSectionId");
            return (Criteria) this;
        }

        public Criteria andErpSectionIdNotEqualTo(Integer value) {
            addCriterion("ERP_SECTION_ID <>", value, "erpSectionId");
            return (Criteria) this;
        }

        public Criteria andErpSectionIdGreaterThan(Integer value) {
            addCriterion("ERP_SECTION_ID >", value, "erpSectionId");
            return (Criteria) this;
        }

        public Criteria andErpSectionIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("ERP_SECTION_ID >=", value, "erpSectionId");
            return (Criteria) this;
        }

        public Criteria andErpSectionIdLessThan(Integer value) {
            addCriterion("ERP_SECTION_ID <", value, "erpSectionId");
            return (Criteria) this;
        }

        public Criteria andErpSectionIdLessThanOrEqualTo(Integer value) {
            addCriterion("ERP_SECTION_ID <=", value, "erpSectionId");
            return (Criteria) this;
        }

        public Criteria andErpSectionIdIn(List<Integer> values) {
            addCriterion("ERP_SECTION_ID in", values, "erpSectionId");
            return (Criteria) this;
        }

        public Criteria andErpSectionIdNotIn(List<Integer> values) {
            addCriterion("ERP_SECTION_ID not in", values, "erpSectionId");
            return (Criteria) this;
        }

        public Criteria andErpSectionIdBetween(Integer value1, Integer value2) {
            addCriterion("ERP_SECTION_ID between", value1, value2, "erpSectionId");
            return (Criteria) this;
        }

        public Criteria andErpSectionIdNotBetween(Integer value1, Integer value2) {
            addCriterion("ERP_SECTION_ID not between", value1, value2, "erpSectionId");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeIsNull() {
            addCriterion("UPDATE_TIME is null");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeIsNotNull() {
            addCriterion("UPDATE_TIME is not null");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeEqualTo(Date value) {
            addCriterion("UPDATE_TIME =", value, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeNotEqualTo(Date value) {
            addCriterion("UPDATE_TIME <>", value, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeGreaterThan(Date value) {
            addCriterion("UPDATE_TIME >", value, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("UPDATE_TIME >=", value, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeLessThan(Date value) {
            addCriterion("UPDATE_TIME <", value, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeLessThanOrEqualTo(Date value) {
            addCriterion("UPDATE_TIME <=", value, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeIn(List<Date> values) {
            addCriterion("UPDATE_TIME in", values, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeNotIn(List<Date> values) {
            addCriterion("UPDATE_TIME not in", values, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeBetween(Date value1, Date value2) {
            addCriterion("UPDATE_TIME between", value1, value2, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeNotBetween(Date value1, Date value2) {
            addCriterion("UPDATE_TIME not between", value1, value2, "updateTime");
            return (Criteria) this;
        }

        public Criteria andSectionPinyinIsNull() {
            addCriterion("SECTION_PINYIN is null");
            return (Criteria) this;
        }

        public Criteria andSectionPinyinIsNotNull() {
            addCriterion("SECTION_PINYIN is not null");
            return (Criteria) this;
        }

        public Criteria andSectionPinyinEqualTo(String value) {
            addCriterion("SECTION_PINYIN =", value, "sectionPinyin");
            return (Criteria) this;
        }

        public Criteria andSectionPinyinNotEqualTo(String value) {
            addCriterion("SECTION_PINYIN <>", value, "sectionPinyin");
            return (Criteria) this;
        }

        public Criteria andSectionPinyinGreaterThan(String value) {
            addCriterion("SECTION_PINYIN >", value, "sectionPinyin");
            return (Criteria) this;
        }

        public Criteria andSectionPinyinGreaterThanOrEqualTo(String value) {
            addCriterion("SECTION_PINYIN >=", value, "sectionPinyin");
            return (Criteria) this;
        }

        public Criteria andSectionPinyinLessThan(String value) {
            addCriterion("SECTION_PINYIN <", value, "sectionPinyin");
            return (Criteria) this;
        }

        public Criteria andSectionPinyinLessThanOrEqualTo(String value) {
            addCriterion("SECTION_PINYIN <=", value, "sectionPinyin");
            return (Criteria) this;
        }

        public Criteria andSectionPinyinLike(String value) {
            addCriterion("SECTION_PINYIN like", value, "sectionPinyin");
            return (Criteria) this;
        }

        public Criteria andSectionPinyinNotLike(String value) {
            addCriterion("SECTION_PINYIN not like", value, "sectionPinyin");
            return (Criteria) this;
        }

        public Criteria andSectionPinyinIn(List<String> values) {
            addCriterion("SECTION_PINYIN in", values, "sectionPinyin");
            return (Criteria) this;
        }

        public Criteria andSectionPinyinNotIn(List<String> values) {
            addCriterion("SECTION_PINYIN not in", values, "sectionPinyin");
            return (Criteria) this;
        }

        public Criteria andSectionPinyinBetween(String value1, String value2) {
            addCriterion("SECTION_PINYIN between", value1, value2, "sectionPinyin");
            return (Criteria) this;
        }

        public Criteria andSectionPinyinNotBetween(String value1, String value2) {
            addCriterion("SECTION_PINYIN not between", value1, value2, "sectionPinyin");
            return (Criteria) this;
        }

        public Criteria andFddSectionIdIsNull() {
            addCriterion("FDD_SECTION_ID is null");
            return (Criteria) this;
        }

        public Criteria andFddSectionIdIsNotNull() {
            addCriterion("FDD_SECTION_ID is not null");
            return (Criteria) this;
        }

        public Criteria andFddSectionIdEqualTo(Integer value) {
            addCriterion("FDD_SECTION_ID =", value, "fddSectionId");
            return (Criteria) this;
        }

        public Criteria andFddSectionIdNotEqualTo(Integer value) {
            addCriterion("FDD_SECTION_ID <>", value, "fddSectionId");
            return (Criteria) this;
        }

        public Criteria andFddSectionIdGreaterThan(Integer value) {
            addCriterion("FDD_SECTION_ID >", value, "fddSectionId");
            return (Criteria) this;
        }

        public Criteria andFddSectionIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("FDD_SECTION_ID >=", value, "fddSectionId");
            return (Criteria) this;
        }

        public Criteria andFddSectionIdLessThan(Integer value) {
            addCriterion("FDD_SECTION_ID <", value, "fddSectionId");
            return (Criteria) this;
        }

        public Criteria andFddSectionIdLessThanOrEqualTo(Integer value) {
            addCriterion("FDD_SECTION_ID <=", value, "fddSectionId");
            return (Criteria) this;
        }

        public Criteria andFddSectionIdIn(List<Integer> values) {
            addCriterion("FDD_SECTION_ID in", values, "fddSectionId");
            return (Criteria) this;
        }

        public Criteria andFddSectionIdNotIn(List<Integer> values) {
            addCriterion("FDD_SECTION_ID not in", values, "fddSectionId");
            return (Criteria) this;
        }

        public Criteria andFddSectionIdBetween(Integer value1, Integer value2) {
            addCriterion("FDD_SECTION_ID between", value1, value2, "fddSectionId");
            return (Criteria) this;
        }

        public Criteria andFddSectionIdNotBetween(Integer value1, Integer value2) {
            addCriterion("FDD_SECTION_ID not between", value1, value2, "fddSectionId");
            return (Criteria) this;
        }

        public Criteria andPositionYIsNull() {
            addCriterion("POSITION_Y is null");
            return (Criteria) this;
        }

        public Criteria andPositionYIsNotNull() {
            addCriterion("POSITION_Y is not null");
            return (Criteria) this;
        }

        public Criteria andPositionYEqualTo(String value) {
            addCriterion("POSITION_Y =", value, "positionY");
            return (Criteria) this;
        }

        public Criteria andPositionYNotEqualTo(String value) {
            addCriterion("POSITION_Y <>", value, "positionY");
            return (Criteria) this;
        }

        public Criteria andPositionYGreaterThan(String value) {
            addCriterion("POSITION_Y >", value, "positionY");
            return (Criteria) this;
        }

        public Criteria andPositionYGreaterThanOrEqualTo(String value) {
            addCriterion("POSITION_Y >=", value, "positionY");
            return (Criteria) this;
        }

        public Criteria andPositionYLessThan(String value) {
            addCriterion("POSITION_Y <", value, "positionY");
            return (Criteria) this;
        }

        public Criteria andPositionYLessThanOrEqualTo(String value) {
            addCriterion("POSITION_Y <=", value, "positionY");
            return (Criteria) this;
        }

        public Criteria andPositionYLike(String value) {
            addCriterion("POSITION_Y like", value, "positionY");
            return (Criteria) this;
        }

        public Criteria andPositionYNotLike(String value) {
            addCriterion("POSITION_Y not like", value, "positionY");
            return (Criteria) this;
        }

        public Criteria andPositionYIn(List<String> values) {
            addCriterion("POSITION_Y in", values, "positionY");
            return (Criteria) this;
        }

        public Criteria andPositionYNotIn(List<String> values) {
            addCriterion("POSITION_Y not in", values, "positionY");
            return (Criteria) this;
        }

        public Criteria andPositionYBetween(String value1, String value2) {
            addCriterion("POSITION_Y between", value1, value2, "positionY");
            return (Criteria) this;
        }

        public Criteria andPositionYNotBetween(String value1, String value2) {
            addCriterion("POSITION_Y not between", value1, value2, "positionY");
            return (Criteria) this;
        }

        public Criteria andPositionXIsNull() {
            addCriterion("POSITION_X is null");
            return (Criteria) this;
        }

        public Criteria andPositionXIsNotNull() {
            addCriterion("POSITION_X is not null");
            return (Criteria) this;
        }

        public Criteria andPositionXEqualTo(String value) {
            addCriterion("POSITION_X =", value, "positionX");
            return (Criteria) this;
        }

        public Criteria andPositionXNotEqualTo(String value) {
            addCriterion("POSITION_X <>", value, "positionX");
            return (Criteria) this;
        }

        public Criteria andPositionXGreaterThan(String value) {
            addCriterion("POSITION_X >", value, "positionX");
            return (Criteria) this;
        }

        public Criteria andPositionXGreaterThanOrEqualTo(String value) {
            addCriterion("POSITION_X >=", value, "positionX");
            return (Criteria) this;
        }

        public Criteria andPositionXLessThan(String value) {
            addCriterion("POSITION_X <", value, "positionX");
            return (Criteria) this;
        }

        public Criteria andPositionXLessThanOrEqualTo(String value) {
            addCriterion("POSITION_X <=", value, "positionX");
            return (Criteria) this;
        }

        public Criteria andPositionXLike(String value) {
            addCriterion("POSITION_X like", value, "positionX");
            return (Criteria) this;
        }

        public Criteria andPositionXNotLike(String value) {
            addCriterion("POSITION_X not like", value, "positionX");
            return (Criteria) this;
        }

        public Criteria andPositionXIn(List<String> values) {
            addCriterion("POSITION_X in", values, "positionX");
            return (Criteria) this;
        }

        public Criteria andPositionXNotIn(List<String> values) {
            addCriterion("POSITION_X not in", values, "positionX");
            return (Criteria) this;
        }

        public Criteria andPositionXBetween(String value1, String value2) {
            addCriterion("POSITION_X between", value1, value2, "positionX");
            return (Criteria) this;
        }

        public Criteria andPositionXNotBetween(String value1, String value2) {
            addCriterion("POSITION_X not between", value1, value2, "positionX");
            return (Criteria) this;
        }
    }

    /**
     *
     */
    public static class Criteria extends GeneratedCriteria {

        protected Criteria() {
            super();
        }
    }

    /**
     *
     */
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