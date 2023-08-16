package com.sn.entity;

/**
 * 客户实体类 auther:lxs
 */
public class Client {
	private Integer id; // 编号
	private Integer labelling; // 是否贴标签（0不贴，1贴）
	private Integer isForceSend; // 是否强制发送（0是，1否）
	private Integer provinceId; // 省份的id
	private Integer cityId; // 市的ID
	private String province; //省份
	private String city;//市
	private Double registerMoney; // 注册金额
	private Integer empCount; // 公司员工
	private Integer canUse; // 是否可用（1-可用，0-不可用）
	private Integer prepayDay; // 预交的天数
	private Integer isFreeze; // 是否冻结(0未冻结，1已冻结)
	private Integer isMixed;  //是否合并出库信息
	private Integer trend; // 趋势（-1下降，0不变，1上涨）
	private Integer modelSetRecordId; // 第59.该客户所对应的所有模板记录的ID
	private Double taxRate; // 税率
	private Integer machineCallPolice; // 加工报警0不报警，1报警
	
	private Integer customerIntroFileId;	  // 客户简介文件的ID
	private String customerIntroRealName = "";// 客户简介文件的真实文件名
	private String customerIntroUrl = ""; // 客户简介文件的保路径
	private String customerIntroNewName = ""; // 客户简介文件的新名
	
	private Integer processAgreeFileId;//加工协议文件ID
	private String processAgreeRealName = "";// 加工协议真实文件名
	private String processAgreeUrl = ""; // 加工协议文件的保存路径
	private String processAgreeNewName = ""; // 加工协议文件的新名
	
	private Integer invoiceMesFileId;//开票信息文件ID
	private String invoiceMesRealName = "";// 开票信息真实文件名
	private String invoiceMesUrl = ""; // 开票信息文件的保存路径
	private String invoiceMesNewName = ""; // 开票信息文件的新名
	
	private Integer licenseFileId;// 营业执照文件id
	private String licenseRealName = ""; // 营业执照文件真实名
	private String licenseUrl = ""; // 营业执照文件保存路径
	private String licenseNewName = ""; // 营业执照文件新名
	
	private Integer taxPayerFileId;// 一般纳税人文件id
	private String taxPayerRealName = ""; // 一般纳税人文件真实名
	private String taxPayerUrl = ""; // 一般纳税人文件保存路径
	private String taxPayerNewName = ""; // 一般纳税人文件新名
	
	private Integer otherMesFileId;//其他信息文件的ID
	private String otherMesRealName = ""; // 其他信息的文件真实名
	private String otherMesUrl = ""; // 其他信息文件保存路径
	private String otherMesNewName = ""; // 其他信息文件新名

	private String code = ""; // 客户编号
	private String rememberCode = ""; // 客户的助记码
	private String name = ""; // 客户全称
	private String nickName = ""; // 客户简称
	private String followMan = ""; // 跟单员
	private String followManPhone = "";//跟单员电话
	private String industryType = ""; // 产业类型
	private String transformation = ""; // 运输方式
	private String direction = ""; // 运输方向
	private String billing = ""; // 开单联（三联，四联，五联）
	private String billContent = ""; // 开单联具体内容
	private String homeOffice = ""; // 本部
	private String homeAddress = "";//本部地址
	private String payTime = ""; // 付款期
	private String sendMethod = ""; // 发货方式 0未禁止 1出库欠款提醒 2出库欠款禁止 3对账欠款提醒 4 对账欠款禁止
	private String payMethod = ""; // 结算方式
	private String returnGrade = ""; // 客户回款等级
	private String bank = ""; // 回款银行
	private String taxNumber = ""; // 税号
	private String openAccount = ""; // 开户账号
	private String taxType = ""; // 税种
	private String accCheckDay = ""; // 对账日
	private String invoiceHead = ""; // 发票开头
	private String mainLinkMan;//主要联系人
	private String phone = ""; // 联系电话
	private String fax = ""; // 传真
	private String invoiceAddress = ""; // 开票地址ַ
	private String industryAddress = ""; // 工厂地址ַ
	private String manageItems = ""; // 经营项目
	private String evaluate = ""; // 客户评价
	private String clientNote = ""; // 备注
	private String stopUseReason = ""; 	// 停用原因
	private String QQ = ""; 			// QQ
	private String weChat = ""; 		// 微信
	private String email = ""; 			// 邮箱
	private String clientTime = ""; 	// 用户添加时间
	private String grade = "";			//客户等级
	private Integer orderType;			//订单类型   0根据产品入库出库   1根据材料入库出库
	private Double crossCheckMoney;		//勾稽金额（上期对账的延结金额）
	private Double balance;				//账号余额,客户余额
	private Integer isInvoked;			//被引用的次数
	private Integer isBilling;//是否开票，0否，1是，2其他，默认为1
	private String industryClass;//客户行业分类
	
	private Integer inWriteId;			//入库填写模板ID
	private Integer outWriteId;			//出库填写模板ID
	
	private Integer inComingWriteId;//入库模板填写的id
	private Integer orderOutModelId;//出库打印单的id
	private Integer orderInModelId;//入库标示卡的id
	private Integer orderInIdentificationId;//入库流程卡模板id
	private Integer inComingPrintModelId;//入库模板的id
	private Integer moneyCheckPrintModelId;//对账打印单模板的id
	private Integer dieTimberMoneyRuModelId;//模材导出模板的id

	private Integer orderOutRuModelId;
	private Integer orderInRuModelId;
	
	private Integer inComingPrintModelIdTwo;
	private Integer orderOutModelIdTwo;
	private String orderOutModelName="";//出库打印单的名称
	private String orderInModelName="";//入库标示卡的名称
	private String inComingPrintModelName="";//入库模板的名称
	private String moneyCheckPrintModelName="";//对账打印单模板的名称
	private String orderOutRuModelName="";//出库录入模板的名称
	private String orderInRuModelName="";//入库录入模板的名称
	private String orderInIdentificationName;//入库流程卡模板名称
	private String dieTimberMoneyRuModelName;//模材导出模板的名称
	private String checkMan;//审核人 
	private String checkTime;//审核时间
	
	private String originator;//制单人 
	private String origTime;//制单时间
	private Integer moneyRuModelId;//客户对账单导出模板id
	private String moneyRuModelName;//客户对账单导出模板id
	private Integer inNum;//入库次数
	private Integer containSectcutNum;//合格数是否包含切割数 0 否 1 是
	private Integer isHalfPrice;//金额四舍五入至元
    private Integer productModelId;//客户关联的产品信息配置模板Id
    private String productModelName;//客户关联的产品信息配置模板Id
    private Integer scanCodeModelId;//客户关联的扫码模板id
    private String businessMan;//业务员
    private Integer startPlayModelId;//标识卡id
    private String startPlayModelName;//标识卡
    private Integer clientIsSeeMoney;//客户单价显示权限 0不显示 1显示
    private Integer seeMoney;//
    private Integer taxAvoidance;//避税是否展示 0不展示 1展示
	private String orderInTime;//第一次入库时间
	private String orderInTime1;//第一次入库时间
	private String orderInTime2;//第一次入库时间
	private Double returnMoney;//客户回款金额
	private String order;
	private String sort;
	private Integer importOrderInState;//导入入库是否合并 0否1是
	private Integer qualifiedLabelModelId;//合格标签ID
	//合格标签模板（展示）
	private String qualifiedLabelModel;
	
	// 最近一次加工时间
	private String lastProcessingTime;
	
	
	
	
	public Integer getQualifiedLabelModelId() {
		return qualifiedLabelModelId;
	}
	public void setQualifiedLabelModelId(Integer qualifiedLabelModelId) {
		this.qualifiedLabelModelId = qualifiedLabelModelId;
	}
	public String getOrderInTime1() {
		return orderInTime1;
	}
	public void setOrderInTime1(String orderInTime1) {
		this.orderInTime1 = orderInTime1;
	}
	public String getOrderInTime2() {
		return orderInTime2;
	}
	public void setOrderInTime2(String orderInTime2) {
		this.orderInTime2 = orderInTime2;
	}
	public Integer getImportOrderInState() {
		return importOrderInState;
	}
	public void setImportOrderInState(Integer importOrderInState) {
		this.importOrderInState = importOrderInState;
	}
	public String getOrder() {
		return order;
	}
	public void setOrder(String order) {
		this.order = order;
	}
	public String getSort() {
		return sort;
	}
	public void setSort(String sort) {
		this.sort = sort;
	}
	public Double getReturnMoney() {
		return returnMoney;
	}
	public void setReturnMoney(Double returnMoney) {
		this.returnMoney = returnMoney;
	}
	public String getOrderInTime() {
		return orderInTime;
	}
	public void setOrderInTime(String orderInTime) {
		this.orderInTime = orderInTime;
	}
	public Integer getTaxAvoidance() {
		return taxAvoidance;
	}
	public void setTaxAvoidance(Integer taxAvoidance) {
		this.taxAvoidance = taxAvoidance;
	}
	public Integer getSeeMoney() {
		return seeMoney;
	}
	public void setSeeMoney(Integer seeMoney) {
		this.seeMoney = seeMoney;
	}
	public Integer getClientIsSeeMoney() {
		return clientIsSeeMoney;
	}
	public void setClientIsSeeMoney(Integer clientIsSeeMoney) {
		this.clientIsSeeMoney = clientIsSeeMoney;
	}
	public Integer getStartPlayModelId() {
		return startPlayModelId;
	}
	public void setStartPlayModelId(Integer startPlayModelId) {
		this.startPlayModelId = startPlayModelId;
	}
	public String getStartPlayModelName() {
		return startPlayModelName;
	}
	public void setStartPlayModelName(String startPlayModelName) {
		this.startPlayModelName = startPlayModelName;
	}
	public String getBusinessMan() {
		return businessMan;
	}
	public void setBusinessMan(String businessMan) {
		this.businessMan = businessMan;
	}
	public Integer getScanCodeModelId() {
		return scanCodeModelId;
	}
	public void setScanCodeModelId(Integer scanCodeModelId) {
		this.scanCodeModelId = scanCodeModelId;
	}
	public Integer getDieTimberMoneyRuModelId() {
		return dieTimberMoneyRuModelId;
	}
	public void setDieTimberMoneyRuModelId(Integer dieTimberMoneyRuModelId) {
		this.dieTimberMoneyRuModelId = dieTimberMoneyRuModelId;
	}
	public String getDieTimberMoneyRuModelName() {
		return dieTimberMoneyRuModelName;
	}
	public void setDieTimberMoneyRuModelName(String dieTimberMoneyRuModelName) {
		this.dieTimberMoneyRuModelName = dieTimberMoneyRuModelName;
	}
	public String getProductModelName() {
		return productModelName;
	}
	public void setProductModelName(String productModelName) {
		this.productModelName = productModelName;
	}
	public String getMoneyRuModelName() {
		return moneyRuModelName;
	}
	public void setMoneyRuModelName(String moneyRuModelName) {
		this.moneyRuModelName = moneyRuModelName;
	}
	public String getOrderInIdentificationName() {
		return orderInIdentificationName;
	}
	public void setOrderInIdentificationName(String orderInIdentificationName) {
		this.orderInIdentificationName = orderInIdentificationName;
	}
	public Integer getProductModelId() {
		return productModelId;
	}
	public void setProductModelId(Integer productModelId) {
		this.productModelId = productModelId;
	}
	public Integer getContainSectcutNum() {
		return containSectcutNum;
	}
	public void setContainSectcutNum(Integer containSectcutNum) {
		this.containSectcutNum = containSectcutNum;
	}
	public String getProvince() {
		return province;
	}
	public void setProvince(String province) {
		this.province = province;
	}
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	public String getHomeAddress() {
		return homeAddress;
	}
	public void setHomeAddress(String homeAddress) {
		this.homeAddress = homeAddress;
	}
	public Integer getMoneyRuModelId() {
		return moneyRuModelId;
	}
	public void setMoneyRuModelId(Integer moneyRuModelId) {
		this.moneyRuModelId = moneyRuModelId;
	}
	public String getOrderOutRuModelName() {
		return orderOutRuModelName;
	}
	public void setOrderOutRuModelName(String orderOutRuModelName) {
		this.orderOutRuModelName = orderOutRuModelName;
	}
	public String getOrderInRuModelName() {
		return orderInRuModelName;
	}
	public void setOrderInRuModelName(String orderInRuModelName) {
		this.orderInRuModelName = orderInRuModelName;
	}
	public Integer getOrderInIdentificationId() {
		return orderInIdentificationId;
	}
	public void setOrderInIdentificationId(Integer orderInIdentificationId) {
		this.orderInIdentificationId = orderInIdentificationId;
	}
	public String getOriginator() {
		return originator;
	}
	public void setOriginator(String originator) {
		this.originator = originator;
	}
	public String getOrigTime() {
		return origTime;
	}
	public void setOrigTime(String origTime) {
		this.origTime = origTime;
	}
	public String getCheckMan() {
		return checkMan;
	}
	public void setCheckMan(String checkMan) {
		this.checkMan = checkMan;
	}
	public String getCheckTime() {
		return checkTime;
	}
	public void setCheckTime(String checkTime) {
		this.checkTime = checkTime;
	}
	public String getOrderOutModelName() {
		return orderOutModelName;
	}
	public void setOrderOutModelName(String orderOutModelName) {
		this.orderOutModelName = orderOutModelName;
	}
	public String getOrderInModelName() {
		return orderInModelName;
	}
	public void setOrderInModelName(String orderInModelName) {
		this.orderInModelName = orderInModelName;
	}
	public String getInComingPrintModelName() {
		return inComingPrintModelName;
	}
	public void setInComingPrintModelName(String inComingPrintModelName) {
		this.inComingPrintModelName = inComingPrintModelName;
	}
	public String getMoneyCheckPrintModelName() {
		return moneyCheckPrintModelName;
	}
	public void setMoneyCheckPrintModelName(String moneyCheckPrintModelName) {
		this.moneyCheckPrintModelName = moneyCheckPrintModelName;
	}
	private Integer priceDecimalReservation;//价格小数点的预留位数
	private Integer moneyCheckType;//对账类型（0为回单，1为出库）
	
	private String shipper;					//收货商
	private String shipperAddress;			//收货地址
	
	private Integer weightDecimalReservation;//单重小数点预留位数

	public Integer getOrderOutRuModelId() {
		return orderOutRuModelId;
	}

	public void setOrderOutRuModelId(Integer orderOutRuModelId) {
		this.orderOutRuModelId = orderOutRuModelId;
	}

	public Integer getOrderInRuModelId() {
		return orderInRuModelId;
	}

	public void setOrderInRuModelId(Integer orderInRuModelId) {
		this.orderInRuModelId = orderInRuModelId;
	}

	public Integer getInComingPrintModelIdTwo() {
		return inComingPrintModelIdTwo;
	}

	public Integer getOrderOutModelIdTwo() {
		return orderOutModelIdTwo;
	}

	public void setOrderOutModelIdTwo(Integer orderOutModelIdTwo) {
		this.orderOutModelIdTwo = orderOutModelIdTwo;
	}

	public void setInComingPrintModelIdTwo(Integer inComingPrintModelIdTwo) {
		this.inComingPrintModelIdTwo = inComingPrintModelIdTwo;
	}

	public Integer getWeightDecimalReservation() {
		return weightDecimalReservation;
	}
	public void setWeightDecimalReservation(Integer weightDecimalReservation) {
		this.weightDecimalReservation = weightDecimalReservation;
	}
	public String getShipper() {
		return shipper;
	}
	public void setShipper(String shipper) {
		this.shipper = shipper;
	}
	public String getShipperAddress() {
		return shipperAddress;
	}
	public void setShipperAddress(String shipperAddress) {
		this.shipperAddress = shipperAddress;
	}
	public Integer getMoneyCheckType() {
		return moneyCheckType;
	}
	public void setMoneyCheckType(Integer moneyCheckType) {
		this.moneyCheckType = moneyCheckType;
	}
	public Double getBalance() {
		return balance;
	}
	public void setBalance(Double balance) {
		this.balance = balance;
	}
	public Integer getMoneyCheckPrintModelId() {
		return moneyCheckPrintModelId;
	}
	public void setMoneyCheckPrintModelId(Integer moneyCheckPrintModelId) {
		this.moneyCheckPrintModelId = moneyCheckPrintModelId;
	}
	public String getMainLinkMan() {
		return mainLinkMan;
	}
	public void setMainLinkMan(String mainLinkMan) {
		this.mainLinkMan = mainLinkMan;
	}
	public Integer getInComingWriteId() {
		return inComingWriteId;
	}
	public void setInComingWriteId(Integer inComingWriteId) {
		this.inComingWriteId = inComingWriteId;
	}
	public Integer getInComingPrintModelId() {
		return inComingPrintModelId;
	}
	public void setInComingPrintModelId(Integer inComingPrintModelId) {
		this.inComingPrintModelId = inComingPrintModelId;
	}
	
	
	public Integer getPriceDecimalReservation() {
		return priceDecimalReservation;
	}
	public void setPriceDecimalReservation(Integer priceDecimalReservation) {
		this.priceDecimalReservation = priceDecimalReservation;
	}
	public Integer getIsInvoked() {
		return isInvoked;
	}
	public void setIsInvoked(Integer isInvoked) {
		this.isInvoked = isInvoked;
	}
	public Double getCrossCheckMoney() {
		return crossCheckMoney;
	}
	public void setCrossCheckMoney(Double crossCheckMoney) {
		this.crossCheckMoney = crossCheckMoney;
	}
	public Integer getOrderType() {
		return orderType;
	}
	public void setOrderType(Integer orderType) {
		this.orderType = orderType;
	}
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public Integer getLabelling() {
		return labelling;
	}
	public void setLabelling(Integer labelling) {
		this.labelling = labelling;
	}
	public Integer getIsForceSend() {
		return isForceSend;
	}
	public void setIsForceSend(Integer isForceSend) {
		this.isForceSend = isForceSend;
	}
	public Integer getProvinceId() {
		return provinceId;
	}
	public void setProvinceId(Integer provinceId) {
		this.provinceId = provinceId;
	}
	public Integer getCityId() {
		return cityId;
	}
	public void setCityId(Integer cityId) {
		this.cityId = cityId;
	}
	public Double getRegisterMoney() {
		return registerMoney;
	}
	public void setRegisterMoney(Double registerMoney) {
		this.registerMoney = registerMoney;
	}
	public Integer getEmpCount() {
		return empCount;
	}
	public void setEmpCount(Integer empCount) {
		this.empCount = empCount;
	}
	public Integer getCanUse() {
		return canUse;
	}
	public void setCanUse(Integer canUse) {
		this.canUse = canUse;
	}
	public Integer getPrepayDay() {
		return prepayDay;
	}
	public void setPrepayDay(Integer prepayDay) {
		this.prepayDay = prepayDay;
	}
	public Integer getIsFreeze() {
		return isFreeze;
	}
	public void setIsFreeze(Integer isFreeze) {
		this.isFreeze = isFreeze;
	}
	public Integer getTrend() {
		return trend;
	}
	public void setTrend(Integer trend) {
		this.trend = trend;
	}
	public Integer getModelSetRecordId() {
		return modelSetRecordId;
	}
	public void setModelSetRecordId(Integer modelSetRecordId) {
		this.modelSetRecordId = modelSetRecordId;
	}
	public Integer getCustomerIntroFileId() {
		return customerIntroFileId;
	}
	public void setCustomerIntroFileId(Integer customerIntroFileId) {
		this.customerIntroFileId = customerIntroFileId;
	}
	public String getCustomerIntroRealName() {
		return customerIntroRealName;
	}
	public void setCustomerIntroRealName(String customerIntroRealName) {
		this.customerIntroRealName = customerIntroRealName;
	}
	public String getCustomerIntroUrl() {
		return customerIntroUrl;
	}
	public void setCustomerIntroUrl(String customerIntroUrl) {
		this.customerIntroUrl = customerIntroUrl;
	}
	public Integer getProcessAgreeFileId() {
		return processAgreeFileId;
	}
	public void setProcessAgreeFileId(Integer processAgreeFileId) {
		this.processAgreeFileId = processAgreeFileId;
	}
	public String getProcessAgreeRealName() {
		return processAgreeRealName;
	}
	public void setProcessAgreeRealName(String processAgreeRealName) {
		this.processAgreeRealName = processAgreeRealName;
	}
	public String getProcessAgreeUrl() {
		return processAgreeUrl;
	}
	public void setProcessAgreeUrl(String processAgreeUrl) {
		this.processAgreeUrl = processAgreeUrl;
	}
	public Integer getInvoiceMesFileId() {
		return invoiceMesFileId;
	}
	public void setInvoiceMesFileId(Integer invoiceMesFileId) {
		this.invoiceMesFileId = invoiceMesFileId;
	}
	public String getInvoiceMesRealName() {
		return invoiceMesRealName;
	}
	public void setInvoiceMesRealName(String invoiceMesRealName) {
		this.invoiceMesRealName = invoiceMesRealName;
	}
	public String getInvoiceMesUrl() {
		return invoiceMesUrl;
	}
	public void setInvoiceMesUrl(String invoiceMesUrl) {
		this.invoiceMesUrl = invoiceMesUrl;
	}
	public Integer getLicenseFileId() {
		return licenseFileId;
	}
	public void setLicenseFileId(Integer licenseFileId) {
		this.licenseFileId = licenseFileId;
	}
	public String getLicenseRealName() {
		return licenseRealName;
	}
	public void setLicenseRealName(String licenseRealName) {
		this.licenseRealName = licenseRealName;
	}
	public String getLicenseUrl() {
		return licenseUrl;
	}
	public void setLicenseUrl(String licenseUrl) {
		this.licenseUrl = licenseUrl;
	}
	public Integer getTaxPayerFileId() {
		return taxPayerFileId;
	}
	public void setTaxPayerFileId(Integer taxPayerFileId) {
		this.taxPayerFileId = taxPayerFileId;
	}
	public String getTaxPayerRealName() {
		return taxPayerRealName;
	}
	public void setTaxPayerRealName(String taxPayerRealName) {
		this.taxPayerRealName = taxPayerRealName;
	}
	public String getTaxPayerUrl() {
		return taxPayerUrl;
	}
	public void setTaxPayerUrl(String taxPayerUrl) {
		this.taxPayerUrl = taxPayerUrl;
	}
	public Integer getOtherMesFileId() {
		return otherMesFileId;
	}
	public void setOtherMesFileId(Integer otherMesFileId) {
		this.otherMesFileId = otherMesFileId;
	}
	public String getOtherMesRealName() {
		return otherMesRealName;
	}
	public void setOtherMesRealName(String otherMesRealName) {
		this.otherMesRealName = otherMesRealName;
	}
	public String getOtherMesUrl() {
		return otherMesUrl;
	}
	public void setOtherMesUrl(String otherMesUrl) {
		this.otherMesUrl = otherMesUrl;
	}
	public String getCode() {
		return code;
	}
	public void setCode(String code) {
		this.code = code;
	}
	public String getRememberCode() {
		return rememberCode;
	}
	public void setRememberCode(String rememberCode) {
		this.rememberCode = rememberCode;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getNickName() {
		return nickName;
	}
	public void setNickName(String nickName) {
		this.nickName = nickName;
	}
	public String getFollowMan() {
		return followMan;
	}
	public void setFollowMan(String followMan) {
		this.followMan = followMan;
	}
	public String getIndustryType() {
		return industryType;
	}
	public void setIndustryType(String industryType) {
		this.industryType = industryType;
	}
	public String getTransformation() {
		return transformation;
	}
	public void setTransformation(String transformation) {
		this.transformation = transformation;
	}
	public String getDirection() {
		return direction;
	}
	public void setDirection(String direction) {
		this.direction = direction;
	}
	public String getBilling() {
		return billing;
	}
	public void setBilling(String billing) {
		this.billing = billing;
	}
	public String getBillContent() {
		return billContent;
	}
	public void setBillContent(String billContent) {
		this.billContent = billContent;
	}
	public String getHomeOffice() {
		return homeOffice;
	}
	public void setHomeOffice(String homeOffice) {
		this.homeOffice = homeOffice;
	}
	public String getPayTime() {
		return payTime;
	}
	public void setPayTime(String payTime) {
		this.payTime = payTime;
	}
	public String getSendMethod() {
		return sendMethod;
	}
	public void setSendMethod(String sendMethod) {
		this.sendMethod = sendMethod;
	}
	public String getPayMethod() {
		return payMethod;
	}
	public void setPayMethod(String payMethod) {
		this.payMethod = payMethod;
	}
	public String getReturnGrade() {
		return returnGrade;
	}
	public void setReturnGrade(String returnGrade) {
		this.returnGrade = returnGrade;
	}
	public String getBank() {
		return bank;
	}
	public void setBank(String bank) {
		this.bank = bank;
	}
	public String getTaxNumber() {
		return taxNumber;
	}
	public void setTaxNumber(String taxNumber) {
		this.taxNumber = taxNumber;
	}
	public Double getTaxRate() {
		return taxRate;
	}
	public void setTaxRate(Double taxRate) {
		this.taxRate = taxRate;
	}
	public String getOpenAccount() {
		return openAccount;
	}
	public void setOpenAccount(String openAccount) {
		this.openAccount = openAccount;
	}
	public String getTaxType() {
		return taxType;
	}
	public void setTaxType(String taxType) {
		this.taxType = taxType;
	}
	public String getAccCheckDay() {
		return accCheckDay;
	}
	public void setAccCheckDay(String accCheckDay) {
		this.accCheckDay = accCheckDay;
	}
	public String getInvoiceHead() {
		return invoiceHead;
	}
	public void setInvoiceHead(String invoiceHead) {
		this.invoiceHead = invoiceHead;
	}
	public String getPhone() {
		return phone;
	}
	public void setPhone(String phone) {
		this.phone = phone;
	}
	public String getFax() {
		return fax;
	}
	public void setFax(String fax) {
		this.fax = fax;
	}
	public String getInvoiceAddress() {
		return invoiceAddress;
	}
	public void setInvoiceAddress(String invoiceAddress) {
		this.invoiceAddress = invoiceAddress;
	}
	public String getIndustryAddress() {
		return industryAddress;
	}
	public void setIndustryAddress(String industryAddress) {
		this.industryAddress = industryAddress;
	}
	public String getManageItems() {
		return manageItems;
	}
	public void setManageItems(String manageItems) {
		this.manageItems = manageItems;
	}
	public String getEvaluate() {
		return evaluate;
	}
	public void setEvaluate(String evaluate) {
		this.evaluate = evaluate;
	}
	
	public String getClientNote() {
		return clientNote;
	}
	public void setClientNote(String clientNote) {
		this.clientNote = clientNote;
	}
	public String getStopUseReason() {
		return stopUseReason;
	}
	public void setStopUseReason(String stopUseReason) {
		this.stopUseReason = stopUseReason;
	}
	public String getQQ() {
		return QQ;
	}
	public void setQQ(String qQ) {
		QQ = qQ;
	}
	public String getWeChat() {
		return weChat;
	}
	public void setWeChat(String weChat) {
		this.weChat = weChat;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public Integer getMachineCallPolice() {
		return machineCallPolice;
	}
	public void setMachineCallPolice(Integer machineCallPolice) {
		this.machineCallPolice = machineCallPolice;
	}
	public String getClientTime() {
		return clientTime;
	}
	public void setClientTime(String clientTime) {
		this.clientTime = clientTime;
	}
	public String getGrade() {
		return grade;
	}
	public void setGrade(String grade) {
		this.grade = grade;
	}
	public String getCustomerIntroNewName() {
		return customerIntroNewName;
	}
	public void setCustomerIntroNewName(String customerIntroNewName) {
		this.customerIntroNewName = customerIntroNewName;
	}
	public String getProcessAgreeNewName() {
		return processAgreeNewName;
	}
	public void setProcessAgreeNewName(String processAgreeNewName) {
		this.processAgreeNewName = processAgreeNewName;
	}
	public String getInvoiceMesNewName() {
		return invoiceMesNewName;
	}
	public void setInvoiceMesNewName(String invoiceMesNewName) {
		this.invoiceMesNewName = invoiceMesNewName;
	}
	public String getLicenseNewName() {
		return licenseNewName;
	}
	public void setLicenseNewName(String licenseNewName) {
		this.licenseNewName = licenseNewName;
	}
	public String getTaxPayerNewName() {
		return taxPayerNewName;
	}
	public void setTaxPayerNewName(String taxPayerNewName) {
		this.taxPayerNewName = taxPayerNewName;
	}
	public String getOtherMesNewName() {
		return otherMesNewName;
	}
	public void setOtherMesNewName(String otherMesNewName) {
		this.otherMesNewName = otherMesNewName;
	}
	public Integer getOrderOutModelId() {
		return orderOutModelId;
	}
	public void setOrderOutModelId(Integer orderOutModelId) {
		this.orderOutModelId = orderOutModelId;
	}
	public Integer getInWriteId() {
		return inWriteId;
	}
	public void setInWriteId(Integer inWriteId) {
		this.inWriteId = inWriteId;
	}
	public Integer getOutWriteId() {
		return outWriteId;
	}
	public void setOutWriteId(Integer outWriteId) {
		this.outWriteId = outWriteId;
	}
	public Integer getOrderInModelId() {
		return orderInModelId;
	}
	public void setOrderInModelId(Integer orderInModelId) {
		this.orderInModelId = orderInModelId;
	}
	public Integer getIsBilling() {
		return isBilling;
	}
	public void setIsBilling(Integer isBilling) {
		this.isBilling = isBilling;
	}
	public String getIndustryClass() {
		return industryClass;
	}
	public void setIndustryClass(String industryClass) {
		this.industryClass = industryClass;
	}

	

	
	@Override
	public String toString() {
		return "Client [id=" + id + ", labelling=" + labelling
				+ ", isForceSend=" + isForceSend + ", provinceId=" + provinceId
				+ ", cityId=" + cityId + ", registerMoney=" + registerMoney
				+ ", empCount=" + empCount + ", canUse=" + canUse
				+ ", prepayDay=" + prepayDay + ", isFreeze=" + isFreeze
				+ ", isMixed=" + isMixed + ", trend=" + trend
				+ ", modelSetRecordId=" + modelSetRecordId + ", taxRate="
				+ taxRate + ", machineCallPolice=" + machineCallPolice
				+ ", customerIntroFileId=" + customerIntroFileId
				+ ", customerIntroRealName=" + customerIntroRealName
				+ ", customerIntroUrl=" + customerIntroUrl
				+ ", customerIntroNewName=" + customerIntroNewName
				+ ", processAgreeFileId=" + processAgreeFileId
				+ ", processAgreeRealName=" + processAgreeRealName
				+ ", processAgreeUrl=" + processAgreeUrl
				+ ", processAgreeNewName=" + processAgreeNewName
				+ ", invoiceMesFileId=" + invoiceMesFileId
				+ ", invoiceMesRealName=" + invoiceMesRealName
				+ ", invoiceMesUrl=" + invoiceMesUrl + ", invoiceMesNewName="
				+ invoiceMesNewName + ", licenseFileId=" + licenseFileId
				+ ", licenseRealName=" + licenseRealName + ", licenseUrl="
				+ licenseUrl + ", licenseNewName=" + licenseNewName
				+ ", taxPayerFileId=" + taxPayerFileId + ", taxPayerRealName="
				+ taxPayerRealName + ", taxPayerUrl=" + taxPayerUrl
				+ ", taxPayerNewName=" + taxPayerNewName + ", otherMesFileId="
				+ otherMesFileId + ", otherMesRealName=" + otherMesRealName
				+ ", otherMesUrl=" + otherMesUrl + ", otherMesNewName="
				+ otherMesNewName + ", code=" + code + ", rememberCode="
				+ rememberCode + ", name=" + name + ", nickName=" + nickName
				+ ", followMan=" + followMan + ", industryType=" + industryType
				+ ", transformation=" + transformation + ", direction="
				+ direction + ", billing=" + billing + ", billContent="
				+ billContent + ", homeOffice=" + homeOffice + ", payTime="
				+ payTime + ", sendMethod=" + sendMethod + ", payMethod="
				+ payMethod + ", returnGrade=" + returnGrade + ", bank=" + bank
				+ ", taxNumber=" + taxNumber + ", openAccount=" + openAccount
				+ ", taxType=" + taxType + ", accCheckDay=" + accCheckDay
				+ ", invoiceHead=" + invoiceHead + ", mainLinkMan="
				+ mainLinkMan + ", phone=" + phone + ", fax=" + fax
				+ ", invoiceAddress=" + invoiceAddress + ", industryAddress="
				+ industryAddress + ", manageItems=" + manageItems
				+ ", evaluate=" + evaluate + ", clientNote=" + clientNote
				+ ", stopUseReason=" + stopUseReason + ", QQ=" + QQ
				+ ", weChat=" + weChat + ", email=" + email + ", clientTime="
				+ clientTime + ", grade=" + grade + ", orderType=" + orderType
				+ ", crossCheckMoney=" + crossCheckMoney + ", balance="
				+ balance + ", isInvoked=" + isInvoked + ", isBilling="
				+ isBilling + ", industryClass=" + industryClass
				+ ", inWriteId=" + inWriteId + ", outWriteId=" + outWriteId
				+ ", inComingWriteId=" + inComingWriteId + ", orderOutModelId="
				+ orderOutModelId + ", orderInModelId=" + orderInModelId
				+ ", orderInIdentificationId=" + orderInIdentificationId
				+ ", inComingPrintModelId=" + inComingPrintModelId
				+ ", moneyCheckPrintModelId=" + moneyCheckPrintModelId
				+ ", orderOutRuModelId=" + orderOutRuModelId
				+ ", orderInRuModelId=" + orderInRuModelId
				+ ", inComingPrintModelIdTwo=" + inComingPrintModelIdTwo
				+ ", orderOutModelIdTwo=" + orderOutModelIdTwo
				+ ", orderOutModelName=" + orderOutModelName
				+ ", orderInModelName=" + orderInModelName
				+ ", inComingPrintModelName=" + inComingPrintModelName
				+ ", moneyCheckPrintModelName=" + moneyCheckPrintModelName
				+ ", orderOutRuModelName=" + orderOutRuModelName
				+ ", orderInRuModelName=" + orderInRuModelName + ", checkMan="
				+ checkMan + ", checkTime=" + checkTime + ", originator="
				+ originator + ", origTime=" + origTime + ", moneyRuModelId="
				+ moneyRuModelId + ", priceDecimalReservation="
				+ priceDecimalReservation + ", moneyCheckType="
				+ moneyCheckType + ", shipper=" + shipper + ", shipperAddress="
				+ shipperAddress + ", weightDecimalReservation="
				+ weightDecimalReservation + "]";
	}
	public Integer getIsMixed() {
		return isMixed;
	}
	public void setIsMixed(Integer isMixed) {
		this.isMixed = isMixed;
	}
	public String getFollowManPhone() {
		return followManPhone;
	}
	public void setFollowManPhone(String followManPhone) {
		this.followManPhone = followManPhone;
	}
	public Integer getInNum() {
		return inNum;
	}
	public void setInNum(Integer inNum) {
		this.inNum = inNum;
	}
	public Integer getIsHalfPrice() {
		return isHalfPrice;
	}
	public void setIsHalfPrice(Integer isHalfPrice) {
		this.isHalfPrice = isHalfPrice;
	}
	public String getLastProcessingTime() {
		return lastProcessingTime;
	}
	public void setLastProcessingTime(String lastProcessingTime) {
		this.lastProcessingTime = lastProcessingTime;
	}
	public String getQualifiedLabelModel() {
		return qualifiedLabelModel;
	}
	public void setQualifiedLabelModel(String qualifiedLabelModel) {
		this.qualifiedLabelModel = qualifiedLabelModel;
	}


}