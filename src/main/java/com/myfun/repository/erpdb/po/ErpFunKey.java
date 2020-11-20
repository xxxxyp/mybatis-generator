package com.myfun.repository.erpdb.po;

import com.myfun.repository.support.generator.shard.ShardDb;
import io.swagger.annotations.ApiModelProperty;
import java.io.Serializable;
import java.util.Date;

/**
* Generated date 2020-11-19 16:35
*/
public class ErpFunKey extends ShardDb implements Serializable {
    @ApiModelProperty(value= "主键ID")
    private Integer keyId;

    @ApiModelProperty(value= "公司ID")
    private Integer compId;

    @ApiModelProperty(value= "房源ID")
    private Integer caseId;

    @ApiModelProperty(value= "房源类型:1出售2出租")
    private Byte caseType;

    @ApiModelProperty(value= "钥匙所属门店")
    private Integer deptId;

    @ApiModelProperty(value= "钥匙跟进ID")
    private Integer trackId;

    @ApiModelProperty(value= "钥匙编号")
    private String keyNum;

    @ApiModelProperty(value= "员工ID")
    private Integer userId;

    @ApiModelProperty(value= "创建时间")
    private String creatorTime;

    @ApiModelProperty(value= "钥匙状态 0=只有钥匙备注 1=借出 2=归还 3=删除")
    private Byte keyStatus;

    @ApiModelProperty(value= "钥匙日志ID")
    private Integer keyLogId;

    @ApiModelProperty(value= "房源编号")
    private String caseNo;

    @ApiModelProperty(value= "用途")
    private Byte useage;

    @ApiModelProperty(value= "钥匙所在门店ID")
    private Integer keyDeptId;

    @ApiModelProperty(value= "钥匙借用日志 1=内部 2=外部")
    private Integer logType;

    @ApiModelProperty(value= "归档时间")
    private Date updateTime;

    @ApiModelProperty(value= "注销时间")
    private Date delTime;

    @ApiModelProperty(value= "借用时间")
    private Date borrowKeyTime;

    @ApiModelProperty(value= "借用人电话")
    private String borrowPhone;

    @ApiModelProperty(value= "押金")
    private Integer currentDeposit;

    @ApiModelProperty(value= "登记人")
    private String userName;

    @ApiModelProperty(value= "借用人")
    private String borrowUser;

    @ApiModelProperty(value= "到期时间")
    private Date maxBorrowTime;

    @ApiModelProperty(value= " 已支付=1 已退还=2   已扣押=3 正在支付=4")
    private Integer depositStatus;

    @ApiModelProperty(value= "楼盘id")
    private Integer buildId;

    @ApiModelProperty(value= "钥匙凭证")
    private String keyVoucher;

    @ApiModelProperty(value= "-")
    private Byte keyType;

    @ApiModelProperty(value= "-")
    private Date gatherTime;

    @ApiModelProperty(value= "-")
    private String keyPassword;

    @ApiModelProperty(value= "-")
    private Integer keyCount;

    @ApiModelProperty(value= "-")
    private Integer lendCount;

    @ApiModelProperty(value= "-")
    private Byte autoDelete;

    @ApiModelProperty(value= "-")
    private String keyVideoAddr;

    @ApiModelProperty(value= "-")
    private String keyVideoPicAddr;

    @ApiModelProperty(value= "房源合并标识，1代表合并后房源，其它代表正常房源")
    private Byte mergeStatus;

    private static final long serialVersionUID = 1L;

    /**
     * 主键ID
     */
    public Integer getKeyId() {
        return keyId;
    }

    /**
     * 主键ID
     */
    public void setKeyId(Integer keyId) {
        this.keyId = keyId;
    }

    /**
     * 公司ID
     */
    public Integer getCompId() {
        return compId;
    }

    /**
     * 公司ID
     */
    public void setCompId(Integer compId) {
        this.compId = compId;
    }

    /**
     * 房源ID
     */
    public Integer getCaseId() {
        return caseId;
    }

    /**
     * 房源ID
     */
    public void setCaseId(Integer caseId) {
        this.caseId = caseId;
    }

    /**
     * 房源类型:1出售2出租
     */
    public Byte getCaseType() {
        return caseType;
    }

    /**
     * 房源类型:1出售2出租
     */
    public void setCaseType(Byte caseType) {
        this.caseType = caseType;
    }

    /**
     * 钥匙所属门店
     */
    public Integer getDeptId() {
        return deptId;
    }

    /**
     * 钥匙所属门店
     */
    public void setDeptId(Integer deptId) {
        this.deptId = deptId;
    }

    /**
     * 钥匙跟进ID
     */
    public Integer getTrackId() {
        return trackId;
    }

    /**
     * 钥匙跟进ID
     */
    public void setTrackId(Integer trackId) {
        this.trackId = trackId;
    }

    /**
     * 钥匙编号
     */
    public String getKeyNum() {
        return keyNum;
    }

    /**
     * 钥匙编号
     */
    public void setKeyNum(String keyNum) {
        this.keyNum = keyNum;
    }

    /**
     * 员工ID
     */
    public Integer getUserId() {
        return userId;
    }

    /**
     * 员工ID
     */
    public void setUserId(Integer userId) {
        this.userId = userId;
    }

    /**
     * 创建时间
     */
    public String getCreatorTime() {
        return creatorTime;
    }

    /**
     * 创建时间
     */
    public void setCreatorTime(String creatorTime) {
        this.creatorTime = creatorTime;
    }

    /**
     * 钥匙状态 0=只有钥匙备注 1=借出 2=归还 3=删除
     */
    public Byte getKeyStatus() {
        return keyStatus;
    }

    /**
     * 钥匙状态 0=只有钥匙备注 1=借出 2=归还 3=删除
     */
    public void setKeyStatus(Byte keyStatus) {
        this.keyStatus = keyStatus;
    }

    /**
     * 钥匙日志ID
     */
    public Integer getKeyLogId() {
        return keyLogId;
    }

    /**
     * 钥匙日志ID
     */
    public void setKeyLogId(Integer keyLogId) {
        this.keyLogId = keyLogId;
    }

    /**
     * 房源编号
     */
    public String getCaseNo() {
        return caseNo;
    }

    /**
     * 房源编号
     */
    public void setCaseNo(String caseNo) {
        this.caseNo = caseNo;
    }

    /**
     * 用途
     */
    public Byte getUseage() {
        return useage;
    }

    /**
     * 用途
     */
    public void setUseage(Byte useage) {
        this.useage = useage;
    }

    /**
     * 钥匙所在门店ID
     */
    public Integer getKeyDeptId() {
        return keyDeptId;
    }

    /**
     * 钥匙所在门店ID
     */
    public void setKeyDeptId(Integer keyDeptId) {
        this.keyDeptId = keyDeptId;
    }

    /**
     * 钥匙借用日志 1=内部 2=外部
     */
    public Integer getLogType() {
        return logType;
    }

    /**
     * 钥匙借用日志 1=内部 2=外部
     */
    public void setLogType(Integer logType) {
        this.logType = logType;
    }

    /**
     * 归档时间
     */
    public Date getUpdateTime() {
        return updateTime;
    }

    /**
     * 归档时间
     */
    public void setUpdateTime(Date updateTime) {
        this.updateTime = updateTime;
    }

    /**
     * 注销时间
     */
    public Date getDelTime() {
        return delTime;
    }

    /**
     * 注销时间
     */
    public void setDelTime(Date delTime) {
        this.delTime = delTime;
    }

    /**
     * 借用时间
     */
    public Date getBorrowKeyTime() {
        return borrowKeyTime;
    }

    /**
     * 借用时间
     */
    public void setBorrowKeyTime(Date borrowKeyTime) {
        this.borrowKeyTime = borrowKeyTime;
    }

    /**
     * 借用人电话
     */
    public String getBorrowPhone() {
        return borrowPhone;
    }

    /**
     * 借用人电话
     */
    public void setBorrowPhone(String borrowPhone) {
        this.borrowPhone = borrowPhone;
    }

    /**
     * 押金
     */
    public Integer getCurrentDeposit() {
        return currentDeposit;
    }

    /**
     * 押金
     */
    public void setCurrentDeposit(Integer currentDeposit) {
        this.currentDeposit = currentDeposit;
    }

    /**
     * 登记人
     */
    public String getUserName() {
        return userName;
    }

    /**
     * 登记人
     */
    public void setUserName(String userName) {
        this.userName = userName;
    }

    /**
     * 借用人
     */
    public String getBorrowUser() {
        return borrowUser;
    }

    /**
     * 借用人
     */
    public void setBorrowUser(String borrowUser) {
        this.borrowUser = borrowUser;
    }

    /**
     * 到期时间
     */
    public Date getMaxBorrowTime() {
        return maxBorrowTime;
    }

    /**
     * 到期时间
     */
    public void setMaxBorrowTime(Date maxBorrowTime) {
        this.maxBorrowTime = maxBorrowTime;
    }

    /**
     *  已支付=1 已退还=2   已扣押=3 正在支付=4
     */
    public Integer getDepositStatus() {
        return depositStatus;
    }

    /**
     *  已支付=1 已退还=2   已扣押=3 正在支付=4
     */
    public void setDepositStatus(Integer depositStatus) {
        this.depositStatus = depositStatus;
    }

    /**
     * 楼盘id
     */
    public Integer getBuildId() {
        return buildId;
    }

    /**
     * 楼盘id
     */
    public void setBuildId(Integer buildId) {
        this.buildId = buildId;
    }

    /**
     * 钥匙凭证
     */
    public String getKeyVoucher() {
        return keyVoucher;
    }

    /**
     * 钥匙凭证
     */
    public void setKeyVoucher(String keyVoucher) {
        this.keyVoucher = keyVoucher;
    }

    /**
     * -
     */
    public Byte getKeyType() {
        return keyType;
    }

    /**
     * -
     */
    public void setKeyType(Byte keyType) {
        this.keyType = keyType;
    }

    /**
     * -
     */
    public Date getGatherTime() {
        return gatherTime;
    }

    /**
     * -
     */
    public void setGatherTime(Date gatherTime) {
        this.gatherTime = gatherTime;
    }

    /**
     * -
     */
    public String getKeyPassword() {
        return keyPassword;
    }

    /**
     * -
     */
    public void setKeyPassword(String keyPassword) {
        this.keyPassword = keyPassword;
    }

    /**
     * -
     */
    public Integer getKeyCount() {
        return keyCount;
    }

    /**
     * -
     */
    public void setKeyCount(Integer keyCount) {
        this.keyCount = keyCount;
    }

    /**
     * -
     */
    public Integer getLendCount() {
        return lendCount;
    }

    /**
     * -
     */
    public void setLendCount(Integer lendCount) {
        this.lendCount = lendCount;
    }

    /**
     * -
     */
    public Byte getAutoDelete() {
        return autoDelete;
    }

    /**
     * -
     */
    public void setAutoDelete(Byte autoDelete) {
        this.autoDelete = autoDelete;
    }

    /**
     * -
     */
    public String getKeyVideoAddr() {
        return keyVideoAddr;
    }

    /**
     * -
     */
    public void setKeyVideoAddr(String keyVideoAddr) {
        this.keyVideoAddr = keyVideoAddr;
    }

    /**
     * -
     */
    public String getKeyVideoPicAddr() {
        return keyVideoPicAddr;
    }

    /**
     * -
     */
    public void setKeyVideoPicAddr(String keyVideoPicAddr) {
        this.keyVideoPicAddr = keyVideoPicAddr;
    }

    /**
     * 房源合并标识，1代表合并后房源，其它代表正常房源
     */
    public Byte getMergeStatus() {
        return mergeStatus;
    }

    /**
     * 房源合并标识，1代表合并后房源，其它代表正常房源
     */
    public void setMergeStatus(Byte mergeStatus) {
        this.mergeStatus = mergeStatus;
    }

    public ErpFunKey() {
        
    }

    public ErpFunKey(Integer shardCityId, Integer keyId) {
        super(shardCityId);
        this.keyId = keyId;
    }
}