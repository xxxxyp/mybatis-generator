package com.myfun.repository.admindb.po;

import io.swagger.annotations.ApiModelProperty;
import java.io.Serializable;
import java.util.Date;

/**
* Generated date 2020-11-18 18:58
*/
public class AdminFunSection implements Serializable {
    @ApiModelProperty(value= "-")
    private Integer sectionId;

    @ApiModelProperty(value= "-")
    private Short cityId;

    @ApiModelProperty(value= "-")
    private Integer regId;

    @ApiModelProperty(value= "-")
    private String sectionCode;

    @ApiModelProperty(value= "-")
    private String sectionName;

    @ApiModelProperty(value= "-")
    private Byte vertifyFlag;

    @ApiModelProperty(value= "-")
    private Integer fid;

    @ApiModelProperty(value= "-")
    private Integer erpSectionId;

    @ApiModelProperty(value= "-")
    private Date updateTime;

    @ApiModelProperty(value= "-")
    private String sectionPinyin;

    @ApiModelProperty(value= "-")
    private Integer fddSectionId;

    @ApiModelProperty(value= "-")
    private String positionY;

    @ApiModelProperty(value= "-")
    private String positionX;

    private static final long serialVersionUID = 1L;

    /**
     * -
     */
    public Integer getSectionId() {
        return sectionId;
    }

    /**
     * -
     */
    public void setSectionId(Integer sectionId) {
        this.sectionId = sectionId;
    }

    /**
     * -
     */
    public Short getCityId() {
        return cityId;
    }

    /**
     * -
     */
    public void setCityId(Short cityId) {
        this.cityId = cityId;
    }

    /**
     * -
     */
    public Integer getRegId() {
        return regId;
    }

    /**
     * -
     */
    public void setRegId(Integer regId) {
        this.regId = regId;
    }

    /**
     * -
     */
    public String getSectionCode() {
        return sectionCode;
    }

    /**
     * -
     */
    public void setSectionCode(String sectionCode) {
        this.sectionCode = sectionCode;
    }

    /**
     * -
     */
    public String getSectionName() {
        return sectionName;
    }

    /**
     * -
     */
    public void setSectionName(String sectionName) {
        this.sectionName = sectionName;
    }

    /**
     * -
     */
    public Byte getVertifyFlag() {
        return vertifyFlag;
    }

    /**
     * -
     */
    public void setVertifyFlag(Byte vertifyFlag) {
        this.vertifyFlag = vertifyFlag;
    }

    /**
     * -
     */
    public Integer getFid() {
        return fid;
    }

    /**
     * -
     */
    public void setFid(Integer fid) {
        this.fid = fid;
    }

    /**
     * -
     */
    public Integer getErpSectionId() {
        return erpSectionId;
    }

    /**
     * -
     */
    public void setErpSectionId(Integer erpSectionId) {
        this.erpSectionId = erpSectionId;
    }

    /**
     * -
     */
    public Date getUpdateTime() {
        return updateTime;
    }

    /**
     * -
     */
    public void setUpdateTime(Date updateTime) {
        this.updateTime = updateTime;
    }

    /**
     * -
     */
    public String getSectionPinyin() {
        return sectionPinyin;
    }

    /**
     * -
     */
    public void setSectionPinyin(String sectionPinyin) {
        this.sectionPinyin = sectionPinyin;
    }

    /**
     * -
     */
    public Integer getFddSectionId() {
        return fddSectionId;
    }

    /**
     * -
     */
    public void setFddSectionId(Integer fddSectionId) {
        this.fddSectionId = fddSectionId;
    }

    /**
     * -
     */
    public String getPositionY() {
        return positionY;
    }

    /**
     * -
     */
    public void setPositionY(String positionY) {
        this.positionY = positionY;
    }

    /**
     * -
     */
    public String getPositionX() {
        return positionX;
    }

    /**
     * -
     */
    public void setPositionX(String positionX) {
        this.positionX = positionX;
    }
}