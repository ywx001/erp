package com.sn.entity;


import com.baomidou.mybatisplus.extension.activerecord.Model;

import java.io.Serializable;

/**
 * 用户信息表(User)表实体类
 *
 * @author makejava
 * @since 2023-07-10 09:12:36
 */
@SuppressWarnings("serial")
public class User extends Model<User> {

    private Integer id;
    //员工名
    private String username;
    //密码
    private String password;
    //账号
    private String account;
    //是否在登录0否，1是
    private Integer logining;
    //角色的id的集合
    private String roleids;
    //工号
    private String jobNumber;
    //联系方式
    private String telPhone;
    //银行卡号
    private String bankCard;
    //部门ID
    private Integer departmentid;
    //班组
    private String onegroup;
    //岗位
    private String job;
    //职务
    private String duty;
    //离职时间
    private String leaveTime;
    //入职时间
    private String entryTime;
    //是否被引用 0没有，>0被引用 
    private Integer isInvoked;
    //冻结状态（0未，1冻结）
    private Integer isFreese;
    //工种
    private String workType;
    //档案编号
    private Integer recordid;
    //技术等级
    private String technicalGrade;
    //合同期限
    private String contractTime;
    //合同开始时间
    private String contractBegin;
    //合同结束时间
    private String contractEnd;
    //备注
    private String note;
    //工资标准
    private String wageLevel;
    //权限ID
    private String privilegeids;
    //在职状态，0不在职，1在职,-1岗下
    private Integer instate;
    //图片真实名
    private String pictureRealname;
    //图片的ID
    private Integer fileId;
    //图片保存地址
    private String pictureUrl;
    //可以管理的产品的ID
    private String productids;
    //与用户关联的一系列模板记录ID号
    private Integer modelSetRecordId;
    //职业资格
    private String professionQuality;
    //年休假
    private Integer annualLeave;
    //户口性质id
    private Integer householdtypeid;
    //紧急联系人
    private String emergencycontact;
    //紧急联系人电话
    private String emergencycontactphone;
    //工服尺寸
    private String clothingsize;
    //鞋号
    private Double shoesize;
    //个人银行卡号
    private String cardno;
    //职称
    private String jobTitle;
    //对应的显示开票信息的配置项
    private Integer showColumnBillingId;
    //库存信息显示配置项
    private Integer showColumnStockId;
    //对应的显示用户信息的ID
    private Integer showColumnUserId;
    //对应的显示回单信息的配置项
    private Integer showColumnBackBillId;
    //按客户统计的显示项配置的ID
    private Integer showColumnStatByClientId;
    //对应的显示赔偿信息的ID
    private Integer showColumnCompensationId;
    //按日期统计的显示项配置的ID
    private Integer showColumnStatByDateId;
    //对应的显示差数原因汇总的ID
    private Integer showColumnSumOfMarginReasonId;
    //对应的显示对账信息的ID
    private Integer showColumnMoneyCheckId;
    //对应的显示回款信息的显示配置的ID
    private Integer showColumnReturnMoneyId;
    //对应延误原因汇总的显示配置的id
    private Integer showColumnSumOfDeliveryDelayId;
    //对应生产排产的显示项的配置id
    private Integer showColumnProductionSchedulingId;
    //对应的显示工艺编制显示配置的ID
    private Integer showColumnCraftModelCompileId;
    //工艺显示项id
    private Integer showColumnCraftId;
    //对应的显示典型工艺的显示配置的ID
    private Integer showColumnCraftModelId;

    private Integer showBillingId;
    //对应的IQC栏目显示的ID
    private Integer showColumnIqcId;
    //按炉次显示配置id
    private Integer showCulumnProcessRecordByStoveId;
    //生产排产—已排显示配置的id
    private Integer showColumnAlreadyInProduceId;
    //生产过程汇总显示id
    private Integer showcolumnprocesssummarysheetid;
    //产品信息显示栏配置的id
    private Integer showColumnProductId;
    //客户信息显示栏的配置id
    private Integer showColumnClientId;
    //对账打印的表头配置的模板ID
    private Integer showprintmoneycheckid;
    //添加对账单的表头
    private Integer showaddmoneycheckid;
    //物料信息的显示项
    private Integer showcolumnbuymaterialmessageid;
    //检验记录的显示配置项
    private Integer showcolumninspectionrecordid;
    //供应商的显示项
    private Integer showcolumnsupplierid;
    //申购审批显示项配置的id
    private Integer showcolumnsubscribeapproveid;
    //入库展示栏的id
    private Integer showcolumnorderinid;
    //仅仅是数据迁移时用的
    private String showCulumnProcess;
    //出库展示栏的默认值
    private Integer showcolumnorderoutid;
    //生产记录的显示栏配置
    private Integer showCulumnProcessRecordId;
    //是否分配权限，0未分配(表示一点权限都没有)，1已分配
    private Integer isSetPrivilege;
    //产品搜索项集合
    private String soProductids;
    //客户搜索项ID集合
    private String soClientids;
    //搜索用户的配置ID集合
    private String soUesrids;
    //搜索回单的配置
    private String soBackBillIds;
    //对账的搜索项的配置ID
    private String soMoneyCheckIds;
    //开票信息的搜索项的配置ID
    private String soBillingIds;
    //回款信息搜索配置项
    private String soResultMoneyIds;
    //库存信息搜索项的ID
    private String soStockIds;
    //按客户统计搜索项的ID
    private String soStatByClientIds;
    //按日期统计搜索项的ID
    private String soStatByDateIds;
    //客户回款统计搜索配置项
    private String soStatByCliBillBackIds;
    //出库按单号显示时的搜索项的配置
    private String soOrderOutByCodeIds;
    //出库信息按批次显示时的搜索配置
    private String soOrderOutByComIds;
    //搜索工艺编制的配置
    private String soCraftModelCompileIds;
    //IQC搜索配置的IDS
    private String soIqcIds;
    //工艺模板的搜索项
    private String soCraftModelIds;
    //典型工艺搜索的配置
    private String soCraftIds;
    //生产排产对应搜索项的ids
    private String soProductionSchedulingIds;
    //生产排产—已排的搜索配置项
    private String soAlreadyInProduceIds;
    //生产记录的搜索项的配置
    private String soProcessRecordIds;
    //按炉次显示的生产记录搜索项
    private String soprocessrecordbystovebatchids;
    //生产过程汇总搜索项
    private String soprocesssummarysheetids;
    //检验记录的搜索配置项
    private String soinspectionrecordids;
    //供应商的搜索项
    private String sosupplierids;
    //申购审批的搜索项id
    private String sosubscribeapproveids;
    //1,2,3,4,5,6,7,8,9,10,11,12
    private String soorderinids;

    private String soorderoutids;
    //物料信息的搜索项
    private String sobuymaterialmessageids;
    //查询中心的所有ids
    private String querycenterids;
    //个人印章
    private String userseal;
    //每页显示的行数，默认是20行
    private Integer pagesize;
    //1,2,3,4,5,6,7,8,9,10,11,12
    private String soqueryorderinids;

    private String soqueryorderoutids;
    //1,2,3
    private String soquerycheckaccountids;
    //入库展示栏的id
    private String showquerycolumnorderinid;
    //出库展示栏的默认值
    private String showquerycolumnorderoutid;
    //对账展示栏默认显示ID
    private Integer showquerycolumncheckaccountid;
    //试样栏目搜索项配置
    private String sotestorderinids;
    //试样
    private Integer showcolumntestorderinid;
    //设备台账搜索项配置
    private String soequipledgerids;
    //设备台账展示栏显示id
    private Integer showcolumnequipledgerid;
    //设备维修搜索项配置
    private String soequiprepairids;
    //设备维修展示栏id
    private Integer showcolumnequiprepairid;
    //外协发货搜索项配置
    private String sooutsourceids;
    //外协发货显示项id
    private Integer showcolumnoutsourceid;
    //回款信息搜索项
    private String sofinancereturnids;
    //回款信息显示项
    private Integer showcolumnfinancereturnid;
    //假期信息显示id
    private Integer showcolumnuserleaveid;
    //假期信息搜索项
    private String souserleaveids;
    //设备请修搜索项配置
    private String sopleaserepairids;
    //设备请修展示栏id
    private Integer showcolumnpleaserepairid;
    //特殊设备搜索项
    private String sospecialequipmentids;
    //显示项Id
    private Integer showcolumnspecialequipmentid;
    //在职培训搜索项配置
    private String sousertrainids;
    //在职培训展示栏id
    private Integer showcolumnusertrainid;
    //外协取货搜索项id集合
    private String soinsourceids;
    //外协取货显示项配置id
    private Integer showcolumninsourceid;

    private String contract;
    //制单人
    private String originator;
    //制单时间
    private String origtime;
    //审核人
    private String checkman;
    //审核时间
    private String checktime;
    //采购对账显示项配置id
    private Integer showcolumnaccountid;
    //采购对账搜索项配置
    private String soaccountids;
    //查询中心按入库显示项
    private String showruordercolumn;
    //查询中心按出库显示项
    private String showoutordercolumn;
    //工资核算显示项
    private String showColumnSalaryId;
    //工资核算搜索项id集合
    private String soSalaryIds;
    //工龄
    private Integer lengthof;
    //保险
    private String insurance;

    private Integer showcolumndietimberid;

    private Integer showcolumndietimberpurchasingid;

    private Integer showcolumndietimbersaleid;

    private String sodietimbersaleids;

    private Integer showcolumndietimberstockid;

    private String soprostateids;

    private Integer showcolumnprostateid;

    private String sodietimberaccountids;

    private Integer showcolumndietimberaccountid;
    //开票/回款显示项
    private String showbillingandbackmoneycolumn;

    private String sodietimberstockids;
    //客户模材显示id
    private Integer showcolumndietimberclientid;
    //现结显示项
    private String shownowpaycolumn;
    //炉温监控每行显示个数
    private Integer stovetemperaturecount;
    //采购入库页面显示项
    private Integer showcolumnbuybill;
    //模材合同id
    private Integer showcolumndietimbercontractid;
    //员工图片
    private String pic;
    //待入库显示项
    private String showorderinbasicid;
    //待出库列表显示项
    private String showorderoutbasicid;
    //年假时间(小时)
    private Double annualvacation;
    //物料结存显示项
    private String showmaterialbalancesids;
    //采购报表
    private Integer showcolumnbuyformid;
    //采购报表搜索项
    private String sobuyformids;
    //应收账款显示项
    private String showfinancereturnmoneyid;
    //开票信息显示项
    private String showbillsbasicid;
    //客户信息指引 0关闭 1开启
    private Integer clientguide;
    //产品信息指引 0关闭 1开启
    private Integer productguide;
    //入库信息指引
    private Integer orderinguide;
    //出库信息指引 0 关闭 1开启
    private Integer orderoutguide;
    //待出库搜索项
    private String sowaitorderoutbasicids;
    //采购入库搜索项
    private String sobuybillids;
    //待入库搜索项
    private String sowaitorderinbasicids;
    //语言 0中文 1越南语
    private Integer language;
    //生产记录填写项
    private String fillcolumnprocess;
    //不合格处置搜索项
    private String sounqualifiedpro;
    //不合格处置显示项
    private String showunqualifiedpro;
    //领料出库显示项
    private String showgetmaterials;
    //工艺编制显示项
    private String showcolumncraft;
    //文件管理显示项
    private Integer showcolumnfilesid;
    //新增领料出库显示项配置
    private String showcangetmaterials;
    //培训计划显示项
    private String showtrainplan;
    //客户统计显示项
    private String showcustomerstatistics;
    //维保管理显示项
    private String showequipmentmaintain;
    //客户返工统计显示项
    private String showcustomerrework;
    //领料报表显示项
    private String showmaterialjournaling;
    //是否伪删除标识 0 否 1 是
    private Integer softdeleteflag;
    //产品结存统计显示项
    private String showproductstatistics;


    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getAccount() {
        return account;
    }

    public void setAccount(String account) {
        this.account = account;
    }

    public Integer getLogining() {
        return logining;
    }

    public void setLogining(Integer logining) {
        this.logining = logining;
    }

    public String getRoleids() {
        return roleids;
    }

    public void setRoleids(String roleids) {
        this.roleids = roleids;
    }

    public String getJobNumber() {
        return jobNumber;
    }

    public void setJobNumber(String jobNumber) {
        this.jobNumber = jobNumber;
    }

    public String getTelPhone() {
        return telPhone;
    }

    public void setTelPhone(String telPhone) {
        this.telPhone = telPhone;
    }

    public String getBankCard() {
        return bankCard;
    }

    public void setBankCard(String bankCard) {
        this.bankCard = bankCard;
    }

    public Integer getDepartmentid() {
        return departmentid;
    }

    public void setDepartmentid(Integer departmentid) {
        this.departmentid = departmentid;
    }

    public String getOnegroup() {
        return onegroup;
    }

    public void setOnegroup(String onegroup) {
        this.onegroup = onegroup;
    }

    public String getJob() {
        return job;
    }

    public void setJob(String job) {
        this.job = job;
    }

    public String getDuty() {
        return duty;
    }

    public void setDuty(String duty) {
        this.duty = duty;
    }

    public String getLeaveTime() {
        return leaveTime;
    }

    public void setLeaveTime(String leaveTime) {
        this.leaveTime = leaveTime;
    }

    public String getEntryTime() {
        return entryTime;
    }

    public void setEntryTime(String entryTime) {
        this.entryTime = entryTime;
    }

    public Integer getIsInvoked() {
        return isInvoked;
    }

    public void setIsInvoked(Integer isInvoked) {
        this.isInvoked = isInvoked;
    }

    public Integer getIsFreese() {
        return isFreese;
    }

    public void setIsFreese(Integer isFreese) {
        this.isFreese = isFreese;
    }

    public String getWorkType() {
        return workType;
    }

    public void setWorkType(String workType) {
        this.workType = workType;
    }

    public Integer getRecordid() {
        return recordid;
    }

    public void setRecordid(Integer recordid) {
        this.recordid = recordid;
    }

    public String getTechnicalGrade() {
        return technicalGrade;
    }

    public void setTechnicalGrade(String technicalGrade) {
        this.technicalGrade = technicalGrade;
    }

    public String getContractTime() {
        return contractTime;
    }

    public void setContractTime(String contractTime) {
        this.contractTime = contractTime;
    }

    public String getContractBegin() {
        return contractBegin;
    }

    public void setContractBegin(String contractBegin) {
        this.contractBegin = contractBegin;
    }

    public String getContractEnd() {
        return contractEnd;
    }

    public void setContractEnd(String contractEnd) {
        this.contractEnd = contractEnd;
    }

    public String getNote() {
        return note;
    }

    public void setNote(String note) {
        this.note = note;
    }

    public String getWageLevel() {
        return wageLevel;
    }

    public void setWageLevel(String wageLevel) {
        this.wageLevel = wageLevel;
    }

    public String getPrivilegeids() {
        return privilegeids;
    }

    public void setPrivilegeids(String privilegeids) {
        this.privilegeids = privilegeids;
    }

    public Integer getInstate() {
        return instate;
    }

    public void setInstate(Integer instate) {
        this.instate = instate;
    }

    public String getPictureRealname() {
        return pictureRealname;
    }

    public void setPictureRealname(String pictureRealname) {
        this.pictureRealname = pictureRealname;
    }

    public Integer getFileId() {
        return fileId;
    }

    public void setFileId(Integer fileId) {
        this.fileId = fileId;
    }

    public String getPictureUrl() {
        return pictureUrl;
    }

    public void setPictureUrl(String pictureUrl) {
        this.pictureUrl = pictureUrl;
    }

    public String getProductids() {
        return productids;
    }

    public void setProductids(String productids) {
        this.productids = productids;
    }

    public Integer getModelSetRecordId() {
        return modelSetRecordId;
    }

    public void setModelSetRecordId(Integer modelSetRecordId) {
        this.modelSetRecordId = modelSetRecordId;
    }

    public String getProfessionQuality() {
        return professionQuality;
    }

    public void setProfessionQuality(String professionQuality) {
        this.professionQuality = professionQuality;
    }

    public Integer getAnnualLeave() {
        return annualLeave;
    }

    public void setAnnualLeave(Integer annualLeave) {
        this.annualLeave = annualLeave;
    }

    public Integer getHouseholdtypeid() {
        return householdtypeid;
    }

    public void setHouseholdtypeid(Integer householdtypeid) {
        this.householdtypeid = householdtypeid;
    }

    public String getEmergencycontact() {
        return emergencycontact;
    }

    public void setEmergencycontact(String emergencycontact) {
        this.emergencycontact = emergencycontact;
    }

    public String getEmergencycontactphone() {
        return emergencycontactphone;
    }

    public void setEmergencycontactphone(String emergencycontactphone) {
        this.emergencycontactphone = emergencycontactphone;
    }

    public String getClothingsize() {
        return clothingsize;
    }

    public void setClothingsize(String clothingsize) {
        this.clothingsize = clothingsize;
    }

    public Double getShoesize() {
        return shoesize;
    }

    public void setShoesize(Double shoesize) {
        this.shoesize = shoesize;
    }

    public String getCardno() {
        return cardno;
    }

    public void setCardno(String cardno) {
        this.cardno = cardno;
    }

    public String getJobTitle() {
        return jobTitle;
    }

    public void setJobTitle(String jobTitle) {
        this.jobTitle = jobTitle;
    }

    public Integer getShowColumnBillingId() {
        return showColumnBillingId;
    }

    public void setShowColumnBillingId(Integer showColumnBillingId) {
        this.showColumnBillingId = showColumnBillingId;
    }

    public Integer getShowColumnStockId() {
        return showColumnStockId;
    }

    public void setShowColumnStockId(Integer showColumnStockId) {
        this.showColumnStockId = showColumnStockId;
    }

    public Integer getShowColumnUserId() {
        return showColumnUserId;
    }

    public void setShowColumnUserId(Integer showColumnUserId) {
        this.showColumnUserId = showColumnUserId;
    }

    public Integer getShowColumnBackBillId() {
        return showColumnBackBillId;
    }

    public void setShowColumnBackBillId(Integer showColumnBackBillId) {
        this.showColumnBackBillId = showColumnBackBillId;
    }

    public Integer getShowColumnStatByClientId() {
        return showColumnStatByClientId;
    }

    public void setShowColumnStatByClientId(Integer showColumnStatByClientId) {
        this.showColumnStatByClientId = showColumnStatByClientId;
    }

    public Integer getShowColumnCompensationId() {
        return showColumnCompensationId;
    }

    public void setShowColumnCompensationId(Integer showColumnCompensationId) {
        this.showColumnCompensationId = showColumnCompensationId;
    }

    public Integer getShowColumnStatByDateId() {
        return showColumnStatByDateId;
    }

    public void setShowColumnStatByDateId(Integer showColumnStatByDateId) {
        this.showColumnStatByDateId = showColumnStatByDateId;
    }

    public Integer getShowColumnSumOfMarginReasonId() {
        return showColumnSumOfMarginReasonId;
    }

    public void setShowColumnSumOfMarginReasonId(Integer showColumnSumOfMarginReasonId) {
        this.showColumnSumOfMarginReasonId = showColumnSumOfMarginReasonId;
    }

    public Integer getShowColumnMoneyCheckId() {
        return showColumnMoneyCheckId;
    }

    public void setShowColumnMoneyCheckId(Integer showColumnMoneyCheckId) {
        this.showColumnMoneyCheckId = showColumnMoneyCheckId;
    }

    public Integer getShowColumnReturnMoneyId() {
        return showColumnReturnMoneyId;
    }

    public void setShowColumnReturnMoneyId(Integer showColumnReturnMoneyId) {
        this.showColumnReturnMoneyId = showColumnReturnMoneyId;
    }

    public Integer getShowColumnSumOfDeliveryDelayId() {
        return showColumnSumOfDeliveryDelayId;
    }

    public void setShowColumnSumOfDeliveryDelayId(Integer showColumnSumOfDeliveryDelayId) {
        this.showColumnSumOfDeliveryDelayId = showColumnSumOfDeliveryDelayId;
    }

    public Integer getShowColumnProductionSchedulingId() {
        return showColumnProductionSchedulingId;
    }

    public void setShowColumnProductionSchedulingId(Integer showColumnProductionSchedulingId) {
        this.showColumnProductionSchedulingId = showColumnProductionSchedulingId;
    }

    public Integer getShowColumnCraftModelCompileId() {
        return showColumnCraftModelCompileId;
    }

    public void setShowColumnCraftModelCompileId(Integer showColumnCraftModelCompileId) {
        this.showColumnCraftModelCompileId = showColumnCraftModelCompileId;
    }

    public Integer getShowColumnCraftId() {
        return showColumnCraftId;
    }

    public void setShowColumnCraftId(Integer showColumnCraftId) {
        this.showColumnCraftId = showColumnCraftId;
    }

    public Integer getShowColumnCraftModelId() {
        return showColumnCraftModelId;
    }

    public void setShowColumnCraftModelId(Integer showColumnCraftModelId) {
        this.showColumnCraftModelId = showColumnCraftModelId;
    }

    public Integer getShowBillingId() {
        return showBillingId;
    }

    public void setShowBillingId(Integer showBillingId) {
        this.showBillingId = showBillingId;
    }

    public Integer getShowColumnIqcId() {
        return showColumnIqcId;
    }

    public void setShowColumnIqcId(Integer showColumnIqcId) {
        this.showColumnIqcId = showColumnIqcId;
    }

    public Integer getShowCulumnProcessRecordByStoveId() {
        return showCulumnProcessRecordByStoveId;
    }

    public void setShowCulumnProcessRecordByStoveId(Integer showCulumnProcessRecordByStoveId) {
        this.showCulumnProcessRecordByStoveId = showCulumnProcessRecordByStoveId;
    }

    public Integer getShowColumnAlreadyInProduceId() {
        return showColumnAlreadyInProduceId;
    }

    public void setShowColumnAlreadyInProduceId(Integer showColumnAlreadyInProduceId) {
        this.showColumnAlreadyInProduceId = showColumnAlreadyInProduceId;
    }

    public Integer getShowcolumnprocesssummarysheetid() {
        return showcolumnprocesssummarysheetid;
    }

    public void setShowcolumnprocesssummarysheetid(Integer showcolumnprocesssummarysheetid) {
        this.showcolumnprocesssummarysheetid = showcolumnprocesssummarysheetid;
    }

    public Integer getShowColumnProductId() {
        return showColumnProductId;
    }

    public void setShowColumnProductId(Integer showColumnProductId) {
        this.showColumnProductId = showColumnProductId;
    }

    public Integer getShowColumnClientId() {
        return showColumnClientId;
    }

    public void setShowColumnClientId(Integer showColumnClientId) {
        this.showColumnClientId = showColumnClientId;
    }

    public Integer getShowprintmoneycheckid() {
        return showprintmoneycheckid;
    }

    public void setShowprintmoneycheckid(Integer showprintmoneycheckid) {
        this.showprintmoneycheckid = showprintmoneycheckid;
    }

    public Integer getShowaddmoneycheckid() {
        return showaddmoneycheckid;
    }

    public void setShowaddmoneycheckid(Integer showaddmoneycheckid) {
        this.showaddmoneycheckid = showaddmoneycheckid;
    }

    public Integer getShowcolumnbuymaterialmessageid() {
        return showcolumnbuymaterialmessageid;
    }

    public void setShowcolumnbuymaterialmessageid(Integer showcolumnbuymaterialmessageid) {
        this.showcolumnbuymaterialmessageid = showcolumnbuymaterialmessageid;
    }

    public Integer getShowcolumninspectionrecordid() {
        return showcolumninspectionrecordid;
    }

    public void setShowcolumninspectionrecordid(Integer showcolumninspectionrecordid) {
        this.showcolumninspectionrecordid = showcolumninspectionrecordid;
    }

    public Integer getShowcolumnsupplierid() {
        return showcolumnsupplierid;
    }

    public void setShowcolumnsupplierid(Integer showcolumnsupplierid) {
        this.showcolumnsupplierid = showcolumnsupplierid;
    }

    public Integer getShowcolumnsubscribeapproveid() {
        return showcolumnsubscribeapproveid;
    }

    public void setShowcolumnsubscribeapproveid(Integer showcolumnsubscribeapproveid) {
        this.showcolumnsubscribeapproveid = showcolumnsubscribeapproveid;
    }

    public Integer getShowcolumnorderinid() {
        return showcolumnorderinid;
    }

    public void setShowcolumnorderinid(Integer showcolumnorderinid) {
        this.showcolumnorderinid = showcolumnorderinid;
    }

    public String getShowCulumnProcess() {
        return showCulumnProcess;
    }

    public void setShowCulumnProcess(String showCulumnProcess) {
        this.showCulumnProcess = showCulumnProcess;
    }

    public Integer getShowcolumnorderoutid() {
        return showcolumnorderoutid;
    }

    public void setShowcolumnorderoutid(Integer showcolumnorderoutid) {
        this.showcolumnorderoutid = showcolumnorderoutid;
    }

    public Integer getShowCulumnProcessRecordId() {
        return showCulumnProcessRecordId;
    }

    public void setShowCulumnProcessRecordId(Integer showCulumnProcessRecordId) {
        this.showCulumnProcessRecordId = showCulumnProcessRecordId;
    }

    public Integer getIsSetPrivilege() {
        return isSetPrivilege;
    }

    public void setIsSetPrivilege(Integer isSetPrivilege) {
        this.isSetPrivilege = isSetPrivilege;
    }

    public String getSoProductids() {
        return soProductids;
    }

    public void setSoProductids(String soProductids) {
        this.soProductids = soProductids;
    }

    public String getSoClientids() {
        return soClientids;
    }

    public void setSoClientids(String soClientids) {
        this.soClientids = soClientids;
    }

    public String getSoUesrids() {
        return soUesrids;
    }

    public void setSoUesrids(String soUesrids) {
        this.soUesrids = soUesrids;
    }

    public String getSoBackBillIds() {
        return soBackBillIds;
    }

    public void setSoBackBillIds(String soBackBillIds) {
        this.soBackBillIds = soBackBillIds;
    }

    public String getSoMoneyCheckIds() {
        return soMoneyCheckIds;
    }

    public void setSoMoneyCheckIds(String soMoneyCheckIds) {
        this.soMoneyCheckIds = soMoneyCheckIds;
    }

    public String getSoBillingIds() {
        return soBillingIds;
    }

    public void setSoBillingIds(String soBillingIds) {
        this.soBillingIds = soBillingIds;
    }

    public String getSoResultMoneyIds() {
        return soResultMoneyIds;
    }

    public void setSoResultMoneyIds(String soResultMoneyIds) {
        this.soResultMoneyIds = soResultMoneyIds;
    }

    public String getSoStockIds() {
        return soStockIds;
    }

    public void setSoStockIds(String soStockIds) {
        this.soStockIds = soStockIds;
    }

    public String getSoStatByClientIds() {
        return soStatByClientIds;
    }

    public void setSoStatByClientIds(String soStatByClientIds) {
        this.soStatByClientIds = soStatByClientIds;
    }

    public String getSoStatByDateIds() {
        return soStatByDateIds;
    }

    public void setSoStatByDateIds(String soStatByDateIds) {
        this.soStatByDateIds = soStatByDateIds;
    }

    public String getSoStatByCliBillBackIds() {
        return soStatByCliBillBackIds;
    }

    public void setSoStatByCliBillBackIds(String soStatByCliBillBackIds) {
        this.soStatByCliBillBackIds = soStatByCliBillBackIds;
    }

    public String getSoOrderOutByCodeIds() {
        return soOrderOutByCodeIds;
    }

    public void setSoOrderOutByCodeIds(String soOrderOutByCodeIds) {
        this.soOrderOutByCodeIds = soOrderOutByCodeIds;
    }

    public String getSoOrderOutByComIds() {
        return soOrderOutByComIds;
    }

    public void setSoOrderOutByComIds(String soOrderOutByComIds) {
        this.soOrderOutByComIds = soOrderOutByComIds;
    }

    public String getSoCraftModelCompileIds() {
        return soCraftModelCompileIds;
    }

    public void setSoCraftModelCompileIds(String soCraftModelCompileIds) {
        this.soCraftModelCompileIds = soCraftModelCompileIds;
    }

    public String getSoIqcIds() {
        return soIqcIds;
    }

    public void setSoIqcIds(String soIqcIds) {
        this.soIqcIds = soIqcIds;
    }

    public String getSoCraftModelIds() {
        return soCraftModelIds;
    }

    public void setSoCraftModelIds(String soCraftModelIds) {
        this.soCraftModelIds = soCraftModelIds;
    }

    public String getSoCraftIds() {
        return soCraftIds;
    }

    public void setSoCraftIds(String soCraftIds) {
        this.soCraftIds = soCraftIds;
    }

    public String getSoProductionSchedulingIds() {
        return soProductionSchedulingIds;
    }

    public void setSoProductionSchedulingIds(String soProductionSchedulingIds) {
        this.soProductionSchedulingIds = soProductionSchedulingIds;
    }

    public String getSoAlreadyInProduceIds() {
        return soAlreadyInProduceIds;
    }

    public void setSoAlreadyInProduceIds(String soAlreadyInProduceIds) {
        this.soAlreadyInProduceIds = soAlreadyInProduceIds;
    }

    public String getSoProcessRecordIds() {
        return soProcessRecordIds;
    }

    public void setSoProcessRecordIds(String soProcessRecordIds) {
        this.soProcessRecordIds = soProcessRecordIds;
    }

    public String getSoprocessrecordbystovebatchids() {
        return soprocessrecordbystovebatchids;
    }

    public void setSoprocessrecordbystovebatchids(String soprocessrecordbystovebatchids) {
        this.soprocessrecordbystovebatchids = soprocessrecordbystovebatchids;
    }

    public String getSoprocesssummarysheetids() {
        return soprocesssummarysheetids;
    }

    public void setSoprocesssummarysheetids(String soprocesssummarysheetids) {
        this.soprocesssummarysheetids = soprocesssummarysheetids;
    }

    public String getSoinspectionrecordids() {
        return soinspectionrecordids;
    }

    public void setSoinspectionrecordids(String soinspectionrecordids) {
        this.soinspectionrecordids = soinspectionrecordids;
    }

    public String getSosupplierids() {
        return sosupplierids;
    }

    public void setSosupplierids(String sosupplierids) {
        this.sosupplierids = sosupplierids;
    }

    public String getSosubscribeapproveids() {
        return sosubscribeapproveids;
    }

    public void setSosubscribeapproveids(String sosubscribeapproveids) {
        this.sosubscribeapproveids = sosubscribeapproveids;
    }

    public String getSoorderinids() {
        return soorderinids;
    }

    public void setSoorderinids(String soorderinids) {
        this.soorderinids = soorderinids;
    }

    public String getSoorderoutids() {
        return soorderoutids;
    }

    public void setSoorderoutids(String soorderoutids) {
        this.soorderoutids = soorderoutids;
    }

    public String getSobuymaterialmessageids() {
        return sobuymaterialmessageids;
    }

    public void setSobuymaterialmessageids(String sobuymaterialmessageids) {
        this.sobuymaterialmessageids = sobuymaterialmessageids;
    }

    public String getQuerycenterids() {
        return querycenterids;
    }

    public void setQuerycenterids(String querycenterids) {
        this.querycenterids = querycenterids;
    }

    public String getUserseal() {
        return userseal;
    }

    public void setUserseal(String userseal) {
        this.userseal = userseal;
    }

    public Integer getPagesize() {
        return pagesize;
    }

    public void setPagesize(Integer pagesize) {
        this.pagesize = pagesize;
    }

    public String getSoqueryorderinids() {
        return soqueryorderinids;
    }

    public void setSoqueryorderinids(String soqueryorderinids) {
        this.soqueryorderinids = soqueryorderinids;
    }

    public String getSoqueryorderoutids() {
        return soqueryorderoutids;
    }

    public void setSoqueryorderoutids(String soqueryorderoutids) {
        this.soqueryorderoutids = soqueryorderoutids;
    }

    public String getSoquerycheckaccountids() {
        return soquerycheckaccountids;
    }

    public void setSoquerycheckaccountids(String soquerycheckaccountids) {
        this.soquerycheckaccountids = soquerycheckaccountids;
    }

    public String getShowquerycolumnorderinid() {
        return showquerycolumnorderinid;
    }

    public void setShowquerycolumnorderinid(String showquerycolumnorderinid) {
        this.showquerycolumnorderinid = showquerycolumnorderinid;
    }

    public String getShowquerycolumnorderoutid() {
        return showquerycolumnorderoutid;
    }

    public void setShowquerycolumnorderoutid(String showquerycolumnorderoutid) {
        this.showquerycolumnorderoutid = showquerycolumnorderoutid;
    }

    public Integer getShowquerycolumncheckaccountid() {
        return showquerycolumncheckaccountid;
    }

    public void setShowquerycolumncheckaccountid(Integer showquerycolumncheckaccountid) {
        this.showquerycolumncheckaccountid = showquerycolumncheckaccountid;
    }

    public String getSotestorderinids() {
        return sotestorderinids;
    }

    public void setSotestorderinids(String sotestorderinids) {
        this.sotestorderinids = sotestorderinids;
    }

    public Integer getShowcolumntestorderinid() {
        return showcolumntestorderinid;
    }

    public void setShowcolumntestorderinid(Integer showcolumntestorderinid) {
        this.showcolumntestorderinid = showcolumntestorderinid;
    }

    public String getSoequipledgerids() {
        return soequipledgerids;
    }

    public void setSoequipledgerids(String soequipledgerids) {
        this.soequipledgerids = soequipledgerids;
    }

    public Integer getShowcolumnequipledgerid() {
        return showcolumnequipledgerid;
    }

    public void setShowcolumnequipledgerid(Integer showcolumnequipledgerid) {
        this.showcolumnequipledgerid = showcolumnequipledgerid;
    }

    public String getSoequiprepairids() {
        return soequiprepairids;
    }

    public void setSoequiprepairids(String soequiprepairids) {
        this.soequiprepairids = soequiprepairids;
    }

    public Integer getShowcolumnequiprepairid() {
        return showcolumnequiprepairid;
    }

    public void setShowcolumnequiprepairid(Integer showcolumnequiprepairid) {
        this.showcolumnequiprepairid = showcolumnequiprepairid;
    }

    public String getSooutsourceids() {
        return sooutsourceids;
    }

    public void setSooutsourceids(String sooutsourceids) {
        this.sooutsourceids = sooutsourceids;
    }

    public Integer getShowcolumnoutsourceid() {
        return showcolumnoutsourceid;
    }

    public void setShowcolumnoutsourceid(Integer showcolumnoutsourceid) {
        this.showcolumnoutsourceid = showcolumnoutsourceid;
    }

    public String getSofinancereturnids() {
        return sofinancereturnids;
    }

    public void setSofinancereturnids(String sofinancereturnids) {
        this.sofinancereturnids = sofinancereturnids;
    }

    public Integer getShowcolumnfinancereturnid() {
        return showcolumnfinancereturnid;
    }

    public void setShowcolumnfinancereturnid(Integer showcolumnfinancereturnid) {
        this.showcolumnfinancereturnid = showcolumnfinancereturnid;
    }

    public Integer getShowcolumnuserleaveid() {
        return showcolumnuserleaveid;
    }

    public void setShowcolumnuserleaveid(Integer showcolumnuserleaveid) {
        this.showcolumnuserleaveid = showcolumnuserleaveid;
    }

    public String getSouserleaveids() {
        return souserleaveids;
    }

    public void setSouserleaveids(String souserleaveids) {
        this.souserleaveids = souserleaveids;
    }

    public String getSopleaserepairids() {
        return sopleaserepairids;
    }

    public void setSopleaserepairids(String sopleaserepairids) {
        this.sopleaserepairids = sopleaserepairids;
    }

    public Integer getShowcolumnpleaserepairid() {
        return showcolumnpleaserepairid;
    }

    public void setShowcolumnpleaserepairid(Integer showcolumnpleaserepairid) {
        this.showcolumnpleaserepairid = showcolumnpleaserepairid;
    }

    public String getSospecialequipmentids() {
        return sospecialequipmentids;
    }

    public void setSospecialequipmentids(String sospecialequipmentids) {
        this.sospecialequipmentids = sospecialequipmentids;
    }

    public Integer getShowcolumnspecialequipmentid() {
        return showcolumnspecialequipmentid;
    }

    public void setShowcolumnspecialequipmentid(Integer showcolumnspecialequipmentid) {
        this.showcolumnspecialequipmentid = showcolumnspecialequipmentid;
    }

    public String getSousertrainids() {
        return sousertrainids;
    }

    public void setSousertrainids(String sousertrainids) {
        this.sousertrainids = sousertrainids;
    }

    public Integer getShowcolumnusertrainid() {
        return showcolumnusertrainid;
    }

    public void setShowcolumnusertrainid(Integer showcolumnusertrainid) {
        this.showcolumnusertrainid = showcolumnusertrainid;
    }

    public String getSoinsourceids() {
        return soinsourceids;
    }

    public void setSoinsourceids(String soinsourceids) {
        this.soinsourceids = soinsourceids;
    }

    public Integer getShowcolumninsourceid() {
        return showcolumninsourceid;
    }

    public void setShowcolumninsourceid(Integer showcolumninsourceid) {
        this.showcolumninsourceid = showcolumninsourceid;
    }

    public String getContract() {
        return contract;
    }

    public void setContract(String contract) {
        this.contract = contract;
    }

    public String getOriginator() {
        return originator;
    }

    public void setOriginator(String originator) {
        this.originator = originator;
    }

    public String getOrigtime() {
        return origtime;
    }

    public void setOrigtime(String origtime) {
        this.origtime = origtime;
    }

    public String getCheckman() {
        return checkman;
    }

    public void setCheckman(String checkman) {
        this.checkman = checkman;
    }

    public String getChecktime() {
        return checktime;
    }

    public void setChecktime(String checktime) {
        this.checktime = checktime;
    }

    public Integer getShowcolumnaccountid() {
        return showcolumnaccountid;
    }

    public void setShowcolumnaccountid(Integer showcolumnaccountid) {
        this.showcolumnaccountid = showcolumnaccountid;
    }

    public String getSoaccountids() {
        return soaccountids;
    }

    public void setSoaccountids(String soaccountids) {
        this.soaccountids = soaccountids;
    }

    public String getShowruordercolumn() {
        return showruordercolumn;
    }

    public void setShowruordercolumn(String showruordercolumn) {
        this.showruordercolumn = showruordercolumn;
    }

    public String getShowoutordercolumn() {
        return showoutordercolumn;
    }

    public void setShowoutordercolumn(String showoutordercolumn) {
        this.showoutordercolumn = showoutordercolumn;
    }

    public String getShowColumnSalaryId() {
        return showColumnSalaryId;
    }

    public void setShowColumnSalaryId(String showColumnSalaryId) {
        this.showColumnSalaryId = showColumnSalaryId;
    }

    public String getSoSalaryIds() {
        return soSalaryIds;
    }

    public void setSoSalaryIds(String soSalaryIds) {
        this.soSalaryIds = soSalaryIds;
    }

    public Integer getLengthof() {
        return lengthof;
    }

    public void setLengthof(Integer lengthof) {
        this.lengthof = lengthof;
    }

    public String getInsurance() {
        return insurance;
    }

    public void setInsurance(String insurance) {
        this.insurance = insurance;
    }

    public Integer getShowcolumndietimberid() {
        return showcolumndietimberid;
    }

    public void setShowcolumndietimberid(Integer showcolumndietimberid) {
        this.showcolumndietimberid = showcolumndietimberid;
    }

    public Integer getShowcolumndietimberpurchasingid() {
        return showcolumndietimberpurchasingid;
    }

    public void setShowcolumndietimberpurchasingid(Integer showcolumndietimberpurchasingid) {
        this.showcolumndietimberpurchasingid = showcolumndietimberpurchasingid;
    }

    public Integer getShowcolumndietimbersaleid() {
        return showcolumndietimbersaleid;
    }

    public void setShowcolumndietimbersaleid(Integer showcolumndietimbersaleid) {
        this.showcolumndietimbersaleid = showcolumndietimbersaleid;
    }

    public String getSodietimbersaleids() {
        return sodietimbersaleids;
    }

    public void setSodietimbersaleids(String sodietimbersaleids) {
        this.sodietimbersaleids = sodietimbersaleids;
    }

    public Integer getShowcolumndietimberstockid() {
        return showcolumndietimberstockid;
    }

    public void setShowcolumndietimberstockid(Integer showcolumndietimberstockid) {
        this.showcolumndietimberstockid = showcolumndietimberstockid;
    }

    public String getSoprostateids() {
        return soprostateids;
    }

    public void setSoprostateids(String soprostateids) {
        this.soprostateids = soprostateids;
    }

    public Integer getShowcolumnprostateid() {
        return showcolumnprostateid;
    }

    public void setShowcolumnprostateid(Integer showcolumnprostateid) {
        this.showcolumnprostateid = showcolumnprostateid;
    }

    public String getSodietimberaccountids() {
        return sodietimberaccountids;
    }

    public void setSodietimberaccountids(String sodietimberaccountids) {
        this.sodietimberaccountids = sodietimberaccountids;
    }

    public Integer getShowcolumndietimberaccountid() {
        return showcolumndietimberaccountid;
    }

    public void setShowcolumndietimberaccountid(Integer showcolumndietimberaccountid) {
        this.showcolumndietimberaccountid = showcolumndietimberaccountid;
    }

    public String getShowbillingandbackmoneycolumn() {
        return showbillingandbackmoneycolumn;
    }

    public void setShowbillingandbackmoneycolumn(String showbillingandbackmoneycolumn) {
        this.showbillingandbackmoneycolumn = showbillingandbackmoneycolumn;
    }

    public String getSodietimberstockids() {
        return sodietimberstockids;
    }

    public void setSodietimberstockids(String sodietimberstockids) {
        this.sodietimberstockids = sodietimberstockids;
    }

    public Integer getShowcolumndietimberclientid() {
        return showcolumndietimberclientid;
    }

    public void setShowcolumndietimberclientid(Integer showcolumndietimberclientid) {
        this.showcolumndietimberclientid = showcolumndietimberclientid;
    }

    public String getShownowpaycolumn() {
        return shownowpaycolumn;
    }

    public void setShownowpaycolumn(String shownowpaycolumn) {
        this.shownowpaycolumn = shownowpaycolumn;
    }

    public Integer getStovetemperaturecount() {
        return stovetemperaturecount;
    }

    public void setStovetemperaturecount(Integer stovetemperaturecount) {
        this.stovetemperaturecount = stovetemperaturecount;
    }

    public Integer getShowcolumnbuybill() {
        return showcolumnbuybill;
    }

    public void setShowcolumnbuybill(Integer showcolumnbuybill) {
        this.showcolumnbuybill = showcolumnbuybill;
    }

    public Integer getShowcolumndietimbercontractid() {
        return showcolumndietimbercontractid;
    }

    public void setShowcolumndietimbercontractid(Integer showcolumndietimbercontractid) {
        this.showcolumndietimbercontractid = showcolumndietimbercontractid;
    }

    public String getPic() {
        return pic;
    }

    public void setPic(String pic) {
        this.pic = pic;
    }

    public String getShoworderinbasicid() {
        return showorderinbasicid;
    }

    public void setShoworderinbasicid(String showorderinbasicid) {
        this.showorderinbasicid = showorderinbasicid;
    }

    public String getShoworderoutbasicid() {
        return showorderoutbasicid;
    }

    public void setShoworderoutbasicid(String showorderoutbasicid) {
        this.showorderoutbasicid = showorderoutbasicid;
    }

    public Double getAnnualvacation() {
        return annualvacation;
    }

    public void setAnnualvacation(Double annualvacation) {
        this.annualvacation = annualvacation;
    }

    public String getShowmaterialbalancesids() {
        return showmaterialbalancesids;
    }

    public void setShowmaterialbalancesids(String showmaterialbalancesids) {
        this.showmaterialbalancesids = showmaterialbalancesids;
    }

    public Integer getShowcolumnbuyformid() {
        return showcolumnbuyformid;
    }

    public void setShowcolumnbuyformid(Integer showcolumnbuyformid) {
        this.showcolumnbuyformid = showcolumnbuyformid;
    }

    public String getSobuyformids() {
        return sobuyformids;
    }

    public void setSobuyformids(String sobuyformids) {
        this.sobuyformids = sobuyformids;
    }

    public String getShowfinancereturnmoneyid() {
        return showfinancereturnmoneyid;
    }

    public void setShowfinancereturnmoneyid(String showfinancereturnmoneyid) {
        this.showfinancereturnmoneyid = showfinancereturnmoneyid;
    }

    public String getShowbillsbasicid() {
        return showbillsbasicid;
    }

    public void setShowbillsbasicid(String showbillsbasicid) {
        this.showbillsbasicid = showbillsbasicid;
    }

    public Integer getClientguide() {
        return clientguide;
    }

    public void setClientguide(Integer clientguide) {
        this.clientguide = clientguide;
    }

    public Integer getProductguide() {
        return productguide;
    }

    public void setProductguide(Integer productguide) {
        this.productguide = productguide;
    }

    public Integer getOrderinguide() {
        return orderinguide;
    }

    public void setOrderinguide(Integer orderinguide) {
        this.orderinguide = orderinguide;
    }

    public Integer getOrderoutguide() {
        return orderoutguide;
    }

    public void setOrderoutguide(Integer orderoutguide) {
        this.orderoutguide = orderoutguide;
    }

    public String getSowaitorderoutbasicids() {
        return sowaitorderoutbasicids;
    }

    public void setSowaitorderoutbasicids(String sowaitorderoutbasicids) {
        this.sowaitorderoutbasicids = sowaitorderoutbasicids;
    }

    public String getSobuybillids() {
        return sobuybillids;
    }

    public void setSobuybillids(String sobuybillids) {
        this.sobuybillids = sobuybillids;
    }

    public String getSowaitorderinbasicids() {
        return sowaitorderinbasicids;
    }

    public void setSowaitorderinbasicids(String sowaitorderinbasicids) {
        this.sowaitorderinbasicids = sowaitorderinbasicids;
    }

    public Integer getLanguage() {
        return language;
    }

    public void setLanguage(Integer language) {
        this.language = language;
    }

    public String getFillcolumnprocess() {
        return fillcolumnprocess;
    }

    public void setFillcolumnprocess(String fillcolumnprocess) {
        this.fillcolumnprocess = fillcolumnprocess;
    }

    public String getSounqualifiedpro() {
        return sounqualifiedpro;
    }

    public void setSounqualifiedpro(String sounqualifiedpro) {
        this.sounqualifiedpro = sounqualifiedpro;
    }

    public String getShowunqualifiedpro() {
        return showunqualifiedpro;
    }

    public void setShowunqualifiedpro(String showunqualifiedpro) {
        this.showunqualifiedpro = showunqualifiedpro;
    }

    public String getShowgetmaterials() {
        return showgetmaterials;
    }

    public void setShowgetmaterials(String showgetmaterials) {
        this.showgetmaterials = showgetmaterials;
    }

    public String getShowcolumncraft() {
        return showcolumncraft;
    }

    public void setShowcolumncraft(String showcolumncraft) {
        this.showcolumncraft = showcolumncraft;
    }

    public Integer getShowcolumnfilesid() {
        return showcolumnfilesid;
    }

    public void setShowcolumnfilesid(Integer showcolumnfilesid) {
        this.showcolumnfilesid = showcolumnfilesid;
    }

    public String getShowcangetmaterials() {
        return showcangetmaterials;
    }

    public void setShowcangetmaterials(String showcangetmaterials) {
        this.showcangetmaterials = showcangetmaterials;
    }

    public String getShowtrainplan() {
        return showtrainplan;
    }

    public void setShowtrainplan(String showtrainplan) {
        this.showtrainplan = showtrainplan;
    }

    public String getShowcustomerstatistics() {
        return showcustomerstatistics;
    }

    public void setShowcustomerstatistics(String showcustomerstatistics) {
        this.showcustomerstatistics = showcustomerstatistics;
    }

    public String getShowequipmentmaintain() {
        return showequipmentmaintain;
    }

    public void setShowequipmentmaintain(String showequipmentmaintain) {
        this.showequipmentmaintain = showequipmentmaintain;
    }

    public String getShowcustomerrework() {
        return showcustomerrework;
    }

    public void setShowcustomerrework(String showcustomerrework) {
        this.showcustomerrework = showcustomerrework;
    }

    public String getShowmaterialjournaling() {
        return showmaterialjournaling;
    }

    public void setShowmaterialjournaling(String showmaterialjournaling) {
        this.showmaterialjournaling = showmaterialjournaling;
    }

    public Integer getSoftdeleteflag() {
        return softdeleteflag;
    }

    public void setSoftdeleteflag(Integer softdeleteflag) {
        this.softdeleteflag = softdeleteflag;
    }

    public String getShowproductstatistics() {
        return showproductstatistics;
    }

    public void setShowproductstatistics(String showproductstatistics) {
        this.showproductstatistics = showproductstatistics;
    }

    /**
     * 获取主键值
     *
     * @return 主键值
     */
    @Override
    protected Serializable pkVal() {
        return this.id;
    }
}

