package com.myfun.repository.support.constant;


import java.math.BigDecimal;
import java.util.*;

/**
 * 全局常量类
 *
 * @ClassName: Constant
 * @Description:
 * @author jiangsonggui
 * @date 2015年11月25日 下午4:28:07
 *
 */
public class Const {
	/*数据字典HOUSE_USEAGE*/
	/**房屋用途：住宅 值:1*/
	public final static Byte DIC_HOUSE_USEAGE_HOUSING = 1;
	/**房屋用途：别墅 值:2*/
	public final static Byte DIC_HOUSE_USEAGE_VILLA = 2;
	/**房屋用途：商铺 值:3*/
	public final static Byte DIC_HOUSE_USEAGE_TRADE = 3;
	/**房屋用途：写字 值:4*/
	public final static Byte DIC_HOUSE_USEAGE_OFFICE = 4;
	/**房屋用途：厂房 值:5*/
	public final static Byte DIC_HOUSE_USEAGE_MANUFACT = 5;
	/**房屋用途：仓库 值:6*/
	public final static Byte DIC_HOUSE_USEAGE_STORE = 6;
	/**房屋用途：车库 值:7*/
	public final static Byte DIC_HOUSE_USEAGE_GARAGE = 7;

	/**客服电话*/
	public final static String CUSTOMER_SERVICE_PHONE = "02888889666";

	public static final Map<String,String> PERFORMANCETYPENAME_MAP = new HashMap<String,String>();
	public static final Map<Integer,String> PLATETYPEMSG_MAP = new HashMap<Integer,String>();
	public final static Map<String,Integer> RANGE_LEVEL = new HashMap<String,Integer>();
	public final static Set<Byte> DIC_KEY_TRACK = new HashSet<>();

	public static final Map<Byte,Integer> HOUSEUSEAGE_INNERPHOTOCOUNT = new HashMap<>();
	public static final Map<Byte,Integer> HOUSEUSEAGE_TOTALPHOTOCOUNT = new HashMap<>();
	public static final List<String> COMPLAINT_COPIES = Arrays.asList("虚假信息", "中介房源", "房源已成交", "业主无意向");

	public static Set<Integer> SHOW_VIEW_HISTORY_LIST_SET = new HashSet<>();

	static{
		PERFORMANCETYPENAME_MAP.put("0","总业绩");
		PERFORMANCETYPENAME_MAP.put("1","过户业绩");
		PERFORMANCETYPENAME_MAP.put("2","二手");
		PERFORMANCETYPENAME_MAP.put("3","新房");
		PERFORMANCETYPENAME_MAP.put("4","租赁");
		PERFORMANCETYPENAME_MAP.put("5","金融");
		PLATETYPEMSG_MAP.put(1, "淘宝池");
		PLATETYPEMSG_MAP.put(2, "私盘");
		PLATETYPEMSG_MAP.put(3, "公盘");
		HOUSEUSEAGE_INNERPHOTOCOUNT.put(DIC_HOUSE_USEAGE_HOUSING, 12);
		//modify 2020-06-10 需求id# 12398 zhangjiping 别墅和商铺上传室内图最多为30
		HOUSEUSEAGE_INNERPHOTOCOUNT.put(DIC_HOUSE_USEAGE_VILLA, 30);
		HOUSEUSEAGE_INNERPHOTOCOUNT.put(DIC_HOUSE_USEAGE_TRADE, 30);
		HOUSEUSEAGE_INNERPHOTOCOUNT.put(DIC_HOUSE_USEAGE_OFFICE, 12);
		HOUSEUSEAGE_INNERPHOTOCOUNT.put(DIC_HOUSE_USEAGE_MANUFACT, 12);
		HOUSEUSEAGE_INNERPHOTOCOUNT.put(DIC_HOUSE_USEAGE_STORE, 12);
		HOUSEUSEAGE_INNERPHOTOCOUNT.put(DIC_HOUSE_USEAGE_GARAGE, 12);
		HOUSEUSEAGE_TOTALPHOTOCOUNT.put(DIC_HOUSE_USEAGE_HOUSING, 15);
		//modify 2020-06-10 需求id# 12398 zhangjiping 别墅和商铺上传室内图+户型图最多为33
		HOUSEUSEAGE_TOTALPHOTOCOUNT.put(DIC_HOUSE_USEAGE_VILLA, 33);
		HOUSEUSEAGE_TOTALPHOTOCOUNT.put(DIC_HOUSE_USEAGE_TRADE, 33);
		HOUSEUSEAGE_TOTALPHOTOCOUNT.put(DIC_HOUSE_USEAGE_OFFICE, 15);
		HOUSEUSEAGE_TOTALPHOTOCOUNT.put(DIC_HOUSE_USEAGE_MANUFACT, 15);
		HOUSEUSEAGE_TOTALPHOTOCOUNT.put(DIC_HOUSE_USEAGE_STORE, 15);
		HOUSEUSEAGE_TOTALPHOTOCOUNT.put(DIC_HOUSE_USEAGE_GARAGE, 15);
		RANGE_LEVEL.put("COMP_ID", 5);
		RANGE_LEVEL.put("AREA_ID", 4);
		RANGE_LEVEL.put("REG_ID", 3);
		RANGE_LEVEL.put("DEPT_ID", 2);
		RANGE_LEVEL.put("GR_ID", 1);
		RANGE_LEVEL.put("USER_ID", 0);
	}

	//押金状态 已支付=1 已退还=2   已扣押=3 正在支付=4 key_property_log
	public static final Integer ALREADY_PAID = 1;

	public static final Integer OUT_PAY_TIME = 3 * 60 *1000;

	public static final Integer REFUNDED = 2;

	public static final Integer CUSTED = 3;

	public static final Integer PAYING = 4;
	public static final Integer DEFAULT_BORROW_TIME = 24;
	//钥匙状态 归还=1 借出中=2 超时中=3 4=正在被借  key_property_log
	public static final Integer RETURN_KEY = 2;
	public static final Integer LENDING = 1;
	public static final Integer BEING_BORROWED = 4;
	public static final Integer OUT_TIME = 3;

	public static final Integer INNER_BORROW = 1;
	public static final Integer OUT_BORROW = 2;
	//服务类型:1【带看】 2【借出钥匙】3【归还钥匙】
	public static final Integer BORROW_THE_KEY = 2;

	public static final Integer BACK_THE_KEY = 3;

	/**
	 * 竞价推广使用 只使用了公司 值：1
	 */
	public final static Byte DIC_BIDD_COMP_UA_TYPE = 1;//只使用了公司
	/**
	 * 竞价推广使用 只使用了个人 值：2
	 */
	public final static Byte DIC_BIDD_PER_UA_TYPE = 2;//只使用了个人
	/**
	 * 竞价推广使用 公司和个人都是用了 值：3
	 */
	public final static Byte DIC_BIDD_ALL_UA_TYPE = 3;//公司和个人都是用了
	/** 每页显示条数 **/
	public static final int PAGE_NUMBER = 50;
	/** 默认当前页 **/
	public static final int CURRENT_PAGE = 1;
	/** 省份城市每页显示条数 **/
	public static final int PROVINCE_CITY_PAGE_NUMBER = 12;
	/** 浓缩图保存地址 **/
	public static final String docPath = "d://opt";
	/** 图片域名 **/
	public static final String pinUrl = "http://test.uj.cn:11011/pic/hftpic/house";
	/** 文件上傳物理路徑 **/
	public static final String picPyURL = "F:\\zz\\upload\\";// F:\\zz\\upload\\

	public enum SearchDate {
		DAY(0), WEEK(1), MONTH(2), QUARTER(3), HALF_YEAR(4), YEAR(5), TWO_YEAR(6), HALF_YEAR_AGO(7), TWO_YEAR_AGO(8);
		int code;

		SearchDate(int code) {
			this.code = code;
		}
	}
	public static final String DATE_ONE_WEEK = "0";// 一周
	public static final String DATE_ONE_MONTH = "1";// 一月
	public static final String DATE_ONE_QUARTER = "2";// 一季
	public static final String DATE_half_YEAR = "3";// 半年
	public static final String DATE_ONE_YEAR = "4";// 一年
	public static final String DATE_ONE_DAY = "5";// 当天
	public static final String WEIXIN_PICROOT = "http://test.uj.cn:11011/";// 微信合同生成保存地址
	public static final String IMG_REAL_PATH = "d://opt//";// 微信合同文件保存地址
	public static final String UCENTER_ROOT = "http://user.uj.cn/hftWebService/ucenter/";
	/** 精英版提成边界值 */
	public final static String DIC_DIC_PERSON_BOUND_30 = "30";
	/** 精英版30及以下提成每套30元 */
	public final static String DIC_DIC_PERSON_COMMISSION_30 = "30";
	/** 精英版30以上提成每套60元 */
	public final static String DIC_DIC_PERSON_COMMISSION_60 = "60";
	/** O2O服务费，提成20% */
	public final static String DIC_DIC_O2O_COMMISSION = "0.2";
	/* 软件提成 */
	/** 7000及以下 */
	public final static String DIC_DIC_SOFT_COMMISSION_7000 = "0.1";
	/** 7001-20000 */
	public final static String DIC_DIC_SOFT_COMMISSION_20000 = "0.2";
	/** 20001及以上 */
	public final static String DIC_DIC_SOFT_COMMISSION_20001 = "0.3";
	public final static String DIC_DIC_PERSON_BOUND_7000 = "7000";
	public final static String DIC_DIC_PERSON_BOUND_20000 = "20000";

	/**
	 * O2O服务开始执行时间（区分新老客户，是否有权限充值120空间费）
	 */

	/**
	 * 合同管理安全协议
	 */
	public static final String safetyPath = "finance/contract/template/";
	/**
	 * 电子合同
	 */
	public static final String ELECONTRACT = "/finance/contract/template/";
	/**
	 * 微信路径
	 */
	public static final String WEIXINGPICDOC = "/finance/contract/template/";
	/**
	 *
	 */
	public static final String userPhotoDoc = "http://192.168.0.246/hftCRM/bizFRM/";

	/** 消费记录：赠送 */
	public final static String DIC_DIC_TYPE_GIFT = "GIFT";
	/** 消费记录：支出 */
	public final static String DIC_DIC_TYPE_PAY = "PAY";
	/** 消费记录：收入 */
	public final static String DIC_DIC_TYPE_INCOME = "INCOME";
	/** 消费记录：ERP转帐类型 */
	public final static String DIC_DIC_TYPE_ERPVIRE = "ERPVIRE";
	/** 消费记录：CRM转帐类型 */
	public final static String DIC_DIC_TYPE_CRMVIRE = "CRMVIRE";
	/** 门店盘别：私盘 0 */
	public final static Integer DIC_DEPT_PLATE_TYPE_0 = 0;
	/** 门店盘别：公盘 1 */
	public final static Integer DIC_DEPT_PLATE_TYPE_1 = 1;
	/** 门店盘别：淘宝池 2 */
	public final static Integer DIC_DEPT_PLATE_TYPE_2 = 2;
	/** 门店盘别：隐藏盘 3 */
	public final static Integer DIC_DEPT_PLATE_TYPE_3 = 3;
	/** 门店封盘状态：0 否 */
	public final static Integer DIC_DEPT_SPECIAL_FLAG_0 = 0;
	/** 门店封盘状态：1 是 */
	public final static Integer DIC_DEPT_SPECIAL_FLAG_1 = 1;
	/**公司门店版的类型---企业版 值：1*/
	public final static Integer DIC_COMP_TYPE_1 = 1;
	/**公司门店版的类型---专业版 值：2*/
	public final static Integer DIC_COMP_TYPE_2 = 2;
	/**公司门店版的类型---赢销版 值：3*/
	public final static Integer DIC_COMP_TYPE_3 = 3;
	/**
	 * 公司门店版的类型---新赢销版 值：4
	 * 目前在使用的赢销版-陈文超-2018-06-01
	 */
	public final static Integer DIC_COMP_TYPE_4 = 4;

	/**物业版**/
	public final static Integer DIC_COMP_TYPE_5 = 5;

	/**单店版 */
    public final static Integer DIC_COMP_TYPE_6 = 6;

    /**公司门店版的类型---新房版 值：7*/
	public final static Integer DIC_COMP_TYPE_7 = 7;

	/**公司企业版子类型---物业版 值：1*/
	public final static Integer DIC_COMP_TYPE_2_SUB_VERSION_1 = 1;

	/**公司是否是定制类型--- 值：1*/
	public final static Integer DIC_IS_SPECIAL_CUSTOMIZED_1 = 1;

	//同步房源到幸福里
	public static final String SYNCHRONIZE_LISTINGS_INTO_HAPPINESS = "SYNCHRONIZE_LISTINGS_INTO_HAPPINESS_A";

	public static class RegType {
		public static final Byte PHONE = 1;
		public static final Byte EMAIL = 2;
	}
	/**task type flag [ 提醒任务 ]*/
	public final static byte DIC_TASK_TYPE_FLAG_0 = 0;
	/**task type flag [ 审核任务 ]*/
	public  final static byte DIC_TASK_TYPE_FLAG_1 = 1;
	/**task type flag [ 钉任务  ]*/
	public  final static byte DIC_TASK_TYPE_FLAG_2 = 2;
	/** 房客源类型 */
	public static class HouseCustType {
		public static final byte SALE = 1;
		public static final byte LEASE = 2;
		public static final byte BUY_CUST = 3;
		public static final byte RENT_CUST = 4;
		public static final byte HEZU = 5;
		/**
		 * 新盘
		 */
		public static final Byte NEW_HOUSE = 6;
		//公寓整租
		public static final Byte APARTMENT_7 = 7;
		//公寓合租
		public static final Byte APARTMENT_8 = 8;
		//旅居
		public static final Byte TRISM_9 = 9;
	}

	/**
	 * 行政区和板块
	 * @author Administrator
	 *
	 */
	public static class RegSections {
		/**
		 * 行政区 0
		 */
		public static final byte SOURCE_TYPE_0 = 0;
		/**
		 * 板块1
		 */
		public static final byte SOURCE_TYPE_1 = 1;
	}

	public static class CustDemandSplit  {
		/**
		 * 楼盘
		 */
		public static final byte SOURCE_TYPE_1 = 1;
		/**
		 * 用途
		 */
		public static final byte SOURCE_TYPE_2 = 2;
		/**
		 * 房屋类型
		 */
		public static final byte SOURCE_TYPE_3 = 3;
	}

	/** 房客源状态 */
	public static class HouseCustStatus {
		public final static Map<Byte, String> HOUSE_STATUS_MAP = new HashMap<Byte, String>();
		static{
			HOUSE_STATUS_MAP.put(HouseCustStatus.DIC_STATUS_AVAILABLE, "有效 ");
			HOUSE_STATUS_MAP.put(HouseCustStatus.DIC_STATUS_SPECIAL, "封盘 ");
			HOUSE_STATUS_MAP.put(HouseCustStatus.DIC_STATUS_RESPITE, "暂缓 ");
			HOUSE_STATUS_MAP.put(HouseCustStatus.DIC_STATUS_SCHEDULE, "预订 ");
			HOUSE_STATUS_MAP.put(HouseCustStatus.DIC_STATUS_INNERDEAL, "内成交");
			HOUSE_STATUS_MAP.put(HouseCustStatus.DIC_STATUS_DEAL, "外成交");
			HOUSE_STATUS_MAP.put(HouseCustStatus.DIC_STATUS_WRITEOFF, "注销");
		}

		/** 房屋状态：有效 值:1 */
		public final static byte DIC_STATUS_AVAILABLE = 1;
		/** 房屋状态：封盘 值:2 */
		public final static byte DIC_STATUS_SPECIAL = 2;
		/** 房屋状态：暂缓 值:3 */
		public final static byte DIC_STATUS_RESPITE = 3;
		/** 房屋状态：预订 值:4 */
		public final static byte DIC_STATUS_SCHEDULE = 4;
		/** 房屋状态：内成交 值:5 */
		public final static byte DIC_STATUS_INNERDEAL = 5;
		/** 房屋状态：外成交 值:6 */
		public final static byte DIC_STATUS_DEAL = 6;
		/** 房屋状态：注销 值:7 */
		public final static byte DIC_STATUS_WRITEOFF = 7;
		/** 房屋状态：转售 值:101 */
		public final static byte DIC_STATUS_TRANSSALE = 101;
		/** 房屋状态：转租 值:102 */
		public final static byte DIC_STATUS_TRANSLEASE = 102;
		/** 房屋状态：转有效 值:103 */
		public final static byte DIC_STATUS_TRANSAVAILABLE = 103;
		/** 房屋状态：转私盘 值:104 */
		public final static byte DIC_STATUS_TRANSPRIVATE = 104;
	}

	/**盘别英文描述：淘宝池 值:PUBLIC*/
	public final static String DIC_PLATE_TYPE_PUBLIC_EN = "PUBLIC";
	/**盘别英文描述：私盘 值:PRIVATE*/
	public final static String DIC_PLATE_TYPE_PRIVATE_EN = "PRIVATE";
	/**盘别英文描述：公盘 值:SHARE*/
	public final static String DIC_PLATE_TYPE_SHARE_EN = "SHARE";

	/**
	 * 统一模式不区分盘别
	 */
	public final static String DIC_PLATE_TYPE_ALL_EN = "ALL";

	/**
	 * 0 全公司【本公司】 范围
	 */
	public static final Integer DIC_BOUND_0 = 0;
	/**
	 * 1 共享圈 范围
	 */
	public static final Integer DIC_BOUND_1 = 1;
	/**
	 * 2 全系统 范围
	 */
	public static final Integer DIC_BOUND_2 = 2;
	/**
	 * 3 好友圈 范围  至于为什么要用3，不要问为什么，用就是了。
	 */
	public static final Integer DIC_BOUND_3 = 3;

	/**默认分组ID【GROUP_ID】值：0如果用户没有分组的话默认使用0 */
	public final static Integer DIC_DEFAULT_GROUP_ID = 0;

	/*数据字典TASK_STATUS*/
	/**任务状态：未审 未阅 值:1*/
	public final static Byte DIC_TASK_STATUS_NEW = 1;
	/**任务状态：处理中 值:2*/
	public final static Byte DIC_TASK_STATUS_DEAL = 2;
	/**任务状态：已审 已阅 值:3*/
	public final static Byte DIC_TASK_STATUS_COMPLETE = 3;
	/**任务状态：取消 值:4*/
	public final static Byte DIC_TASK_STATUS_CANCEL = 4;


	/*数据字典PLATE_TYPE*/
	/**盘别：淘宝池 值:1*/
	public final static Integer DIC_PLATE_TYPE_PUBLIC = 1;
	/**盘别：私盘 值:2*/
	public final static Integer DIC_PLATE_TYPE_PRIVATE = 2;
	/**盘别：公盘 值:3*/
	public final static Integer DIC_PLATE_TYPE_SHARE = 3;


	/*数据字典TRACK_TYPE*/
	/**广播类型：公告 值:1*/
	public final static Byte DIC_BROADCAST_TYPE_BULLET = 1;
	/**广播类型：商家信息 值:2*/
	public final static Byte DIC_BROADCAST_TYPE_BUSUSINESS_INFORMATION = 2;
	/**广播类型：公告回复 值:3*/
	public final static Byte DIC_BROADCAST_TYPE_ANNOUNCEMENT_REPLY = 3;
	/**广播类型：提醒任务 值:4*/
	public final static Byte DIC_BROADCAST_TYPE_REMINDER_TASK = 4;
	/**广播类型：对公告回复的回复 值:5*/
	public final static Byte DIC_BROADCAST_TYPE_ANNOUNCEMENT_REPLY_REPLY = 5;
	/**广播类型：对引用回复的回复 值:6*/
	public final static Byte DIC_BROADCAST_TYPE_QUOTE_REPLY = 6;





	/*数据字典HOUSE_CONSIGN*/
	/**委托：未委托 值：1*/
	public final static Byte DIC_HOUSE_CONSIGN_UNCONSIGN = 1;
	/**委托：限时 值：2*/
	public final static Byte DIC_HOUSE_CONSIGN_LIMITED = 2;
	/**委托：独家 值：3*/
	public final static Byte DIC_HOUSE_CONSIGN_ALONE = 3;
	/**委托：现收 值：4 -- 字典中已经取消该值*/
	public final static Byte DIC_HOUSE_CONSIGN_CASH = 4;
	/**委托：包租 值：5*/
	public final static Byte DIC_HOUSE_CONSIGN_RENT = 5;
	/** 委托：普通 值：6 */
	public final static Byte DIC_HOUSE_CONSIGN_GENERAL = 6;

	// TODO 跟进类型
	/**跟进类别：电话 值:1*/
	public final static Byte DIC_TRACK_TYPE_PHONE = 1;
	/**跟进类别：面谈 值:2*/
	public final static Byte DIC_TRACK_TYPE_TALK = 2;
	/**跟进类别：房勘 值:3*/
	public final static Byte DIC_TRACK_TYPE_FUNCAN = 3;
	/**跟进类别：带看 值:4*/
	public final static Byte DIC_TRACK_TYPE_DAIKAN = 4;
	/**跟进类别：钥匙 值:5*/
	public final static Byte DIC_TRACK_TYPE_KEY = 5;
	/**跟进类别：限时 值:6*/
	public final static Byte DIC_TRACK_TYPE_LIMITED = 6;
	/**跟进类别：独家 值:7*/
	public final static Byte DIC_TRACK_TYPE_ALONE = 7;
	/**跟进类别：现收 值:8*/
	public final static Byte DIC_TRACK_TYPE_CASH = 8;
	/**跟进类别：包租 值:9*/
	public final static Byte DIC_TRACK_TYPE_RENT = 9;
	/**跟进类别：修改 值:10*/
	public final static Byte DIC_TRACK_TYPE_EDIT = 10;
	/**跟进类别：去电 值:11*/
	public final static Byte DIC_TRACK_TYPE_OTHER = 11;
	/**跟进类别：审核 值:12*/
	public final static Byte DIC_TRACK_TYPE_AUDIT = 12;
	/**跟进类别：系统 值:13*/
	public final static Byte DIC_TRACK_TYPE_SYSTEM = 13;
	/**跟进类别：状态 值:14*/
	public final static Byte DIC_TRACK_TYPE_STATUS = 14;
	/**跟进类别：议价 值:15*/
	public final static Byte DIC_TRACK_TYPE_BARGAIN = 15;
	/**跟进类别：空看 值:16*/
	public final static Byte DIC_TRACK_TYPE_KONGKAN = 16;
	/**跟进类别：级别-加密 值:17*/
	public final static Byte DIC_TRACK_TYPE_HOUSE_LEVEL_PASSWORD = 17;
	/**跟进类别：级别-推荐 值:18*/
	public final static Byte DIC_TRACK_TYPE_HOUSE_LEVEL_COMMEND = 18;
	/** 跟进类别：普通委托 值:19 */
	public final static Byte DIC_TRACK_TYPE_GENERAL_ENTRUSTMENT = 19;
	/** 跟进类别： 修改房源所属楼盘 值:20 */
	public final static Byte DIC_TRACK_TYPE_UPDATE_HOUSE_BUILD = 20;
	/** 跟进类别： 转有效 值:21 */
	public final static Byte DIC_TRACK_TYPE_STATUS_TRANSAVAILABLE = 21;
	/** 跟进类别： 转私盘 值:22 */
	public final static Byte DIC_TRACK_TYPE_STATUS_TRANSPRIVATE = 22;
	/** 跟进类别： 转售 值:23 */
	public final static Byte DIC_TRACK_TYPE_STATUS_TRANSSALE = 23;
	/** 跟进类别： 转租 值:24 */
	public final static Byte DIC_TRACK_TYPE_STATUS_TRANSLEASE = 24;
	/** 跟进类别： 预定 值:25 */
	public final static Byte DIC_TRACK_TYPE_STATUS_SCHEDULE = 25;
	/** 跟进类别： 封盘 值:26 */
	public final static Byte DIC_TRACK_TYPE_STATUS_SPECIAL = 26;
	/** 跟进类别： 暂缓 值:27 */
	public final static Byte DIC_TRACK_TYPE_STATUS_RESPITE = 27;
	/** 跟进类别： 内成交 值:28 */
	public final static Byte DIC_TRACK_TYPE_STATUS_INNERDEAL = 28;
	/** 跟进类别： 外成交 值:29 */
	public final static Byte DIC_TRACK_TYPE_STATUS_OUTDEAL = 29;
	/** 跟进类别： 注销 值:30 */
	public final static Byte DIC_TRACK_TYPE_STATUS_WRITEOFF = 30;
	/** 跟进类别： 查看电话 值:31 */
	public final static Byte DIC_TRACK_TYPE_VIEW_PHONE = 31;
	/** 跟进类别：钥匙提交 值:32 */
	public final static Byte DIC_TRACK_TYPE_SUBMIT_KEY = 32;
	/** 跟进类别：借用钥匙 值:33 */
	public final static Byte DIC_TRACK_TYPE_BORROW_KEY = 33;
	/** 跟进类别：归还钥匙 值:34 */
	public final static Byte DIC_TRACK_TYPE_RETURN_KEY = 34;
	/** 跟进类别：钥匙注销 值:35 */
	public final static Byte DIC_TRACK_TYPE_DESTROY_KEY = 35;
	/** 跟进类别：上传图片 值:36 */
	public final static Byte DIC_TRACK_TYPE_PHOTO_UPLOAD = 36;
	/** 跟进类别：删除图片 值:37 */
	public final static Byte DIC_TRACK_TYPE_PHOTO_DELETE = 37;
	/** 跟进类别：设置首图 值:38 */
	public final static Byte DIC_TRACK_TYPE_PHOTO_TOP = 38;
	/** 跟进类别：上传视频 值:39 */
	public final static Byte DIC_TRACK_TYPE_VIDEO_UPLOAD = 39;
	/** 跟进类别：删除视频 值:40 */
	public final static Byte DIC_TRACK_TYPE_VIDEO_DELETE = 40;
	/** 跟进类别：上传VR 值:41 */
	public final static Byte DIC_TRACK_TYPE_VR_UPLOAD = 41;
	/** 跟进类别：删除VR 值:42 */
	public final static Byte DIC_TRACK_TYPE_VR_DELETE = 42;
	/** 跟进类别：钥匙说明 值:43 */
	public final static Byte DIC_TRACK_TYPE_KEY_EXPLAIN = 43;
	/** 跟进类别：图片编辑 值:44 */
	public final static Byte DIC_TRACK_TYPE_PHOTO_EDIT = 44;
	/** 跟进类别：图片导入 值:45 */
	public final static Byte DIC_TRACK_TYPE_PHOTO_IMPORT = 45;
	/** 跟进类别：重盘提醒 值:46 */
	public final static Byte DIC_TRACK_TYPE_REPAEAT_REMIND = 46;
	/**跟进类别： 房源相关人变更 值:47*/
	public final static Byte DIC_TRACK_TYPE_RELATIVE_PEOPLE_CHANGE = 47;
	/**跟进类别： 信息登记 值:48*/
	public final static Byte DIC_TRACK_TYPE_REGISTER = 48;
	/**跟进类别： 广告房源 值:49*/
	public final static Byte DIC_TRACK_TYPE_ADSCASE = 49;
	/**跟进类别： 状态转普通 50值：*/
	public final static Byte DIC_TRACK_TYPE_STATUS_AVAILABLE = 50;
	/**跟进类别： 跳抢 值:51*/
	public final static Byte DIC_TRACK_TYPE_JUMPPUBLIC= 51;
	/**跟进类别： 跳公 值:52*/
	public final static Byte DIC_TRACK_TYPE_JUMPSHARE = 52;
	/**跟进类别： 取消委托 53值：*/
	public final static Byte DIC_TRACK_TYPE_CANCEL_WEITUO = 53;
	/**跟进类别： 公盘数据移交 54值：*/
	public final static Byte DIC_TRACK_TYPE_CASE_TRANSFER = 54;
	/**跟进类别：私盘数据移交 55值：*/
	public final static Byte DIC_TRACK_TYPE_PRIVATE_TRANSFER = 55;

/*	*//**跟进类别：取消委托 56值：*//*
	public final static Byte DIC_TRACK_TYPE_CANCEL_ENTRUST = 56;*/
	/**跟进类别：查看预订电话 57值：*/
	public final static Byte DIC_TRACK_TYPE_VIEW_PHONE_SCHEDULE = 57;
	/**跟进类别：查看封盘电话 58值：*/
	public final static Byte DIC_TRACK_TYPE_VIEW_PHONE_SPECIAL = 58;
	/**跟进类别：查看暂缓电话 59值：*/
	public final static Byte DIC_TRACK_TYPE_VIEW_PHONE_RESPITE = 59;
	/**跟进类别：查看内成交电话 60值：*/
	public final static Byte DIC_TRACK_TYPE_VIEW_PHONE_INNERDEAL = 60;
	/**跟进类别：查看外成交电话 61值：*/
	public final static Byte DIC_TRACK_TYPE_VIEW_PHONE_OUTDEAL = 61;
	/**跟进类别：查看有效电话 62值：*/
	public final static Byte DIC_TRACK_TYPE_VIEW_PHONE_AVAILABLE = 62;
	/**跟进类别：查看独家委托电话 63值：*/
	public final static Byte DIC_TRACK_TYPE_VIEW_PHONE_ENTRUST_ALONE = 63;
	/**跟进类别：查看限时委托电话 64值：*/
	public final static Byte DIC_TRACK_TYPE_VIEW_PHONE_ENTRUST_LIMITED = 64;
	/**跟进类别：查看包租委托电话 65值：*/
	public final static Byte DIC_TRACK_TYPE_VIEW_PHONE_ENTRUST_RENT = 65;
	/**跟进类别：查看普通委托电话 66值：*/
	public final static Byte DIC_TRACK_TYPE_VIEW_PHONE_ENTRUST_COMMON = 66;
	/**跟进类别：去电 67值：*/
	public final static Byte DIC_TRACK_TYPE_DAIL_PHONE_COMMON = 67;
	/**跟进类别：约看 68值：*/
	public final static Byte DIC_TRACK_TYPE_YUE_KAN = 68;
	/**跟进类别：店长回访 69值：*/
	public final static Byte DIC_TRACK_TYPE_RETURN_VISIT = 69;
	/**跟进类别：取消预订 70值：*/
	public final static Byte DIC_TRACK_TYPE_CANCEL_SCHEDULE = 70;
	/**跟进类别：取消封盘 71值：*/
	public final static Byte DIC_TRACK_TYPE_CANCEL_SPECIAL = 71;
	/**跟进类别：暂缓转有效 72值：*/
	public final static Byte DIC_TRACK_TYPE_CANCEL_RESPITE = 72;
	/**跟进类别：取消加密 73值：*/
	public final static Byte DIC_TRACK_TYPE_CANCEL_PASSWORD = 73;
	/**跟进类别：取消推荐 74值：*/
	public final static Byte DIC_TRACK_TYPE_CANCEL_COMMEND = 74;
	/**跟进类别：合作带看 75值：*/
	public final static Byte DIC_TRACK_TYPE_HEZUODAI_KAN = 75;
	/**跟进类别：(物业版)外借钥匙 76值：*/
	public final static Byte DIC_TRACK_TYPE_KEY_BORROW_OUT = 76;
	/**跟进类别：(物业版)外借归还钥匙 77值：*/
	public final static Byte DIC_TRACK_TYPE_PROPERTY_RETURN_KEY = 77;
	/**跟进类别：(物业版)外借超时 78值：*/
	public final static Byte DIC_TRACK_TYPE_BORROW_TIME_OUT = 78;
	/**跟进类别：查看房源底价 79值：*/
	public final static Byte DIC_TRACK_TYPE_FUN_LOWEST_PRICE_VIEW = 79;
	/**跟进类别：笋盘(以前的聚焦改为了笋盘) 80值：*/
	public final static Byte DIC_TRACK_TYPE_HOUSE_LEVEL_FOCUS = 80;
	/**跟进类别：取消笋盘(以前的聚焦改为了笋盘) 81值：*/
	public final static Byte DIC_TRACK_TYPE_HOUSE_LEVEL_CANCEL_FOCUS = 81;
	/**跟进类别：上传文件 82值 */
	public final static Byte DIC_TRACK_TYPE_HOUSE_FILE_UPLOAD = 82;
	/**跟进类别：删除文件 83值 */
	public final static Byte DIC_TRACK_TYPE_HOUSE_FILE_DELETE = 83;
	/**跟进类别：撤销房勘 84值 */
	public final static Byte DIC_TRACK_TYPE_HOUSE_CANCEL_FUNCAN = 84;
	/**跟进类别：无效 85值 房基地用**/
	public final static Byte DIC_TRACK_TYPE_STATUS_INVALID = 85;
	/**跟进类别：收定 86值 房基地用**/
	public final static Byte DIC_TRACK_TYPE_COLLECT_DEPOSIT = 86;
	/**跟进类别：取消收定 87值 房基地用**/
	public final static Byte DIC_TRACK_TYPE_CANCEL_COLLECT_DEPOSIT = 87;
	/**跟进类别：编辑钥匙**/
	public final static Byte DIC_TRACK_TYPE_EDIT_KEY = 88;

	// ↑↑加跟进类型一定要改数据字典TRACK_TYPE，通知各端↑↑
	
	/*数据字典HOUSE_STATUS   备注：1-4 都为有效状态*/
	/**房屋状态：有效 值:1*/
	public final static Byte DIC_HOUSE_STATUS_AVAILABLE = 1;
	/**房屋状态：封盘 值:2*/
	public final static Byte DIC_HOUSE_STATUS_SPECIAL = 2;
	/**房屋状态：暂缓 值:3*/
	public final static Byte DIC_HOUSE_STATUS_RESPITE = 3;
	/**房屋状态：预订 值:4*/
	public final static Byte DIC_HOUSE_STATUS_SCHEDULE = 4;
	/**房屋状态：内成交 值:5*/
	public final static Byte DIC_HOUSE_STATUS_INNERDEAL = 5;
	/**房屋状态：外成交 值:6*/
	public final static Byte DIC_HOUSE_STATUS_DEAL = 6;
	/**房屋状态：注销 值:7*/
	public final static Byte DIC_HOUSE_STATUS_WRITEOFF = 7;
	/**房屋状态：无效 值:8*/
	public final static Byte DIC_HOUSE_STATUS_INVALID = 8;
	/**房屋状态：收定 值:9*/
	public final static Byte DIC_HOUSE_STATUS_COLLECT_DEPOSIT = 9;
	/**房屋状态：转售 值:101*/
	public final static Byte DIC_HOUSE_STATUS_TRANSSALE = 101;
	/**房屋状态：转租 值:102*/
	public final static Byte DIC_HOUSE_STATUS_TRANSLEASE = 102;
	/**房屋状态：转有效 值:103*/
	public final static Byte DIC_HOUSE_STATUS_TRANSAVAILABLE = 103;
	/**房屋状态：转私盘 值:104*/
	public final static Byte DIC_HOUSE_STATUS_TRANSPRIVATE = 104;
	/*数据字典HOUSE_LEVEL*/
	/**
	 * 房源级别：普通 值:1
	 */
	public final static Byte DIC_HOUSE_LEVEL_COMMON = 1;
	/**
	 * 房源级别：推荐 值:2
	 */
	public final static Byte DIC_HOUSE_LEVEL_COMMEND = 2;
	/**
	 * 房源级别：加密 值:3
	 */
	public final static Byte DIC_HOUSE_LEVEL_PASSWORD = 3;
	/**
	 * 房源级别：笋盘(以前的聚焦改为了笋盘) 值:4
	 */
	public final static Byte DIC_HOUSE_LEVEL_FOCUS = 4;

	// TODO 审核配置
	/**跟进审核需要配置的项*/
	public static final Map<Byte, String> AUDIT_TRACK_TYPE_MAP = new LinkedHashMap<>();
	/**请假需要配置的项*/
	public static final Map<Byte, String> AUDIT_OA_LEAVE_TYPE_MAP = new LinkedHashMap<>();
	/**外出审核需要配置的项*/
	public static final Map<Byte, String> AUDIT_OA_OUT_TYPE_MAP = new LinkedHashMap<>();
	/**权证合同*/
	public static final Map<Byte, String> AUDIT_DEAL_TYPE_MAP = new LinkedHashMap<>();
	/**投诉审核**/
	public static final Map<Byte, String> AUDIT_COMPLAINT_TYPE_MAP = new LinkedHashMap<>();
	/**审核类型中文*/
	public static final Map<Byte, String> AUDIT_TYPE_CLASSIC_MAP = new LinkedHashMap<>();
	/**审核类型电话*/
	public static final Map<Byte, String> AUDIT_TYPE_VIEW_PHONE_MAP = new LinkedHashMap<>();
	/**审核类型中文*/
	/**某些跟进类型不展示租售房源**/
	public static final Set<Byte> SHOW_SALE_LEASE_TYPE_SET = new HashSet<>();
	static{
		/**这里的增删改要同步给前端的筛选*/
		//AUDIT_TRACK_TYPE_MAP.put(Const.DIC_TRACK_TYPE_VIEW_PHONE, "查看电话");
		AUDIT_TRACK_TYPE_MAP.put(Const.DIC_TRACK_TYPE_FUNCAN, "房勘");
		AUDIT_TRACK_TYPE_MAP.put(Const.DIC_TRACK_TYPE_DAIKAN, "带看");
		AUDIT_TRACK_TYPE_MAP.put(Const.DIC_TRACK_TYPE_YUE_KAN, "约看");
		AUDIT_TRACK_TYPE_MAP.put(Const.DIC_TRACK_TYPE_LIMITED, "限时委托");
		AUDIT_TRACK_TYPE_MAP.put(Const.DIC_TRACK_TYPE_ALONE, "独家委托");
		AUDIT_TRACK_TYPE_MAP.put(Const.DIC_TRACK_TYPE_RENT, "包租委托");
		AUDIT_TRACK_TYPE_MAP.put(Const.DIC_TRACK_TYPE_GENERAL_ENTRUSTMENT, "普通委托");
		AUDIT_TRACK_TYPE_MAP.put(Const.DIC_TRACK_TYPE_STATUS_TRANSAVAILABLE, "转有效");
		AUDIT_TRACK_TYPE_MAP.put(Const.DIC_TRACK_TYPE_BARGAIN, "议价");
		AUDIT_TRACK_TYPE_MAP.put(Const.DIC_TRACK_TYPE_UPDATE_HOUSE_BUILD, "楼盘变更");
		AUDIT_TRACK_TYPE_MAP.put(Const.DIC_TRACK_TYPE_STATUS_TRANSSALE, "可售");
		AUDIT_TRACK_TYPE_MAP.put(Const.DIC_TRACK_TYPE_STATUS_TRANSLEASE, "可租");
		AUDIT_TRACK_TYPE_MAP.put(Const.DIC_TRACK_TYPE_HOUSE_LEVEL_PASSWORD, "加密");
		AUDIT_TRACK_TYPE_MAP.put(Const.DIC_TRACK_TYPE_HOUSE_LEVEL_COMMEND, "推荐");
		AUDIT_TRACK_TYPE_MAP.put(Const.DIC_TRACK_TYPE_HOUSE_LEVEL_FOCUS, "笋盘");//只有房源才有
		AUDIT_TRACK_TYPE_MAP.put(Const.DIC_TRACK_TYPE_STATUS_SCHEDULE, "预订");
		AUDIT_TRACK_TYPE_MAP.put(Const.DIC_TRACK_TYPE_STATUS_SPECIAL, "封盘");
		AUDIT_TRACK_TYPE_MAP.put(Const.DIC_TRACK_TYPE_STATUS_RESPITE, "暂缓");
		AUDIT_TRACK_TYPE_MAP.put(Const.DIC_TRACK_TYPE_STATUS_INNERDEAL, "内成交");
		AUDIT_TRACK_TYPE_MAP.put(Const.DIC_TRACK_TYPE_STATUS_OUTDEAL, "外成交");
		AUDIT_TRACK_TYPE_MAP.put(Const.DIC_TRACK_TYPE_STATUS_WRITEOFF, "删除");
		AUDIT_TRACK_TYPE_MAP.put(Const.DIC_TRACK_TYPE_STATUS_INVALID, "无效");
		AUDIT_TRACK_TYPE_MAP.put(Const.DIC_TRACK_TYPE_STATUS_TRANSPRIVATE, "转私盘");
		AUDIT_TRACK_TYPE_MAP.put(Const.DIC_TRACK_TYPE_STATUS_AVAILABLE, "有效");
		AUDIT_TRACK_TYPE_MAP.put(Const.DIC_TRACK_TYPE_SUBMIT_KEY, "提交钥匙");
		AUDIT_TRACK_TYPE_MAP.put(Const.DIC_TRACK_TYPE_BORROW_KEY, "钥匙借用");
		AUDIT_TRACK_TYPE_MAP.put(Const.DIC_TRACK_TYPE_RETURN_KEY, "钥匙归还");
		AUDIT_TRACK_TYPE_MAP.put(Const.DIC_TRACK_TYPE_DESTROY_KEY, "钥匙注销");
		AUDIT_TRACK_TYPE_MAP.put(Const.DIC_TRACK_TYPE_CASE_TRANSFER, "公盘转盘");
		AUDIT_TRACK_TYPE_MAP.put(Const.DIC_TRACK_TYPE_PRIVATE_TRANSFER, "房源转盘");
		AUDIT_TRACK_TYPE_MAP.put(Const.DIC_TRACK_TYPE_CANCEL_WEITUO, "取消委托");
		AUDIT_TRACK_TYPE_MAP.put(Const.DIC_TRACK_TYPE_VIEW_PHONE_SCHEDULE, "查看预订电话");
		AUDIT_TRACK_TYPE_MAP.put(Const.DIC_TRACK_TYPE_VIEW_PHONE_SPECIAL, "查看封盘电话");
		AUDIT_TRACK_TYPE_MAP.put(Const.DIC_TRACK_TYPE_VIEW_PHONE_RESPITE, "查看暂缓电话");
		AUDIT_TRACK_TYPE_MAP.put(Const.DIC_TRACK_TYPE_VIEW_PHONE_INNERDEAL, "查看内成交电话");
		AUDIT_TRACK_TYPE_MAP.put(Const.DIC_TRACK_TYPE_VIEW_PHONE_OUTDEAL, "查看外成交电话");
		AUDIT_TRACK_TYPE_MAP.put(Const.DIC_TRACK_TYPE_VIEW_PHONE_AVAILABLE, "查看有效电话");
		AUDIT_TRACK_TYPE_MAP.put(Const.DIC_TRACK_TYPE_VIEW_PHONE_ENTRUST_ALONE, "查看独家委托电话");
		AUDIT_TRACK_TYPE_MAP.put(Const.DIC_TRACK_TYPE_VIEW_PHONE_ENTRUST_LIMITED, "查看限时委托电话");
		AUDIT_TRACK_TYPE_MAP.put(Const.DIC_TRACK_TYPE_VIEW_PHONE_ENTRUST_RENT, "查看包租委托电话");
		AUDIT_TRACK_TYPE_MAP.put(Const.DIC_TRACK_TYPE_CANCEL_SCHEDULE, "取消预订");
		AUDIT_TRACK_TYPE_MAP.put(Const.DIC_TRACK_TYPE_CANCEL_SPECIAL, "取消封盘");
		AUDIT_TRACK_TYPE_MAP.put(Const.DIC_TRACK_TYPE_CANCEL_RESPITE, "暂缓转有效");
		AUDIT_TRACK_TYPE_MAP.put(Const.DIC_TRACK_TYPE_CANCEL_PASSWORD, "取消加密");
		AUDIT_TRACK_TYPE_MAP.put(Const.DIC_TRACK_TYPE_CANCEL_COMMEND, "取消推荐");
		AUDIT_TRACK_TYPE_MAP.put(Const.DIC_TRACK_TYPE_HOUSE_LEVEL_CANCEL_FOCUS, "取消笋盘");// 只有房源才有
		AUDIT_TYPE_VIEW_PHONE_MAP.put(Const.DIC_TRACK_TYPE_VIEW_PHONE_SCHEDULE, "查看预订电话");
		AUDIT_TYPE_VIEW_PHONE_MAP.put(Const.DIC_TRACK_TYPE_VIEW_PHONE_SPECIAL, "查看封盘电话");
		AUDIT_TYPE_VIEW_PHONE_MAP.put(Const.DIC_TRACK_TYPE_VIEW_PHONE_RESPITE, "查看暂缓电话");
		AUDIT_TYPE_VIEW_PHONE_MAP.put(Const.DIC_TRACK_TYPE_VIEW_PHONE_INNERDEAL, "查看内成交电话");
		AUDIT_TYPE_VIEW_PHONE_MAP.put(Const.DIC_TRACK_TYPE_VIEW_PHONE_OUTDEAL, "查看外成交电话");
		AUDIT_TYPE_VIEW_PHONE_MAP.put(Const.DIC_TRACK_TYPE_VIEW_PHONE_AVAILABLE, "查看有效电话");
		AUDIT_TYPE_VIEW_PHONE_MAP.put(Const.DIC_TRACK_TYPE_VIEW_PHONE_ENTRUST_ALONE, "查看独家委托电话");
		AUDIT_TYPE_VIEW_PHONE_MAP.put(Const.DIC_TRACK_TYPE_VIEW_PHONE_ENTRUST_LIMITED, "查看限时委托电话");
		AUDIT_TYPE_VIEW_PHONE_MAP.put(Const.DIC_TRACK_TYPE_VIEW_PHONE_ENTRUST_RENT, "查看包租委托电话");


		AUDIT_OA_LEAVE_TYPE_MAP.put((byte)1, "病假");
		AUDIT_OA_LEAVE_TYPE_MAP.put((byte)2, "事假");
		AUDIT_OA_LEAVE_TYPE_MAP.put((byte)3, "年假");
		AUDIT_OA_LEAVE_TYPE_MAP.put((byte)4, "婚假");
		AUDIT_OA_LEAVE_TYPE_MAP.put((byte)5, "丧假");
		AUDIT_OA_LEAVE_TYPE_MAP.put((byte)6, "调休");
		AUDIT_OA_LEAVE_TYPE_MAP.put((byte)7, "其他");

		AUDIT_OA_OUT_TYPE_MAP.put((byte)1,  "带看");
		AUDIT_OA_OUT_TYPE_MAP.put((byte)2,  "实勘");
		AUDIT_OA_OUT_TYPE_MAP.put((byte)3,  "跑盘");
		AUDIT_OA_OUT_TYPE_MAP.put((byte)4,  "派单");
		AUDIT_OA_OUT_TYPE_MAP.put((byte)5,  "培训");
		AUDIT_OA_OUT_TYPE_MAP.put((byte)6,  "陪看");
		AUDIT_OA_OUT_TYPE_MAP.put((byte)7,  "驻点");
		AUDIT_OA_OUT_TYPE_MAP.put((byte)8,  "物业交接");
		AUDIT_OA_OUT_TYPE_MAP.put((byte)9,  "主推盘卫生打扫");
		AUDIT_OA_OUT_TYPE_MAP.put((byte)10, "陪勘");
		AUDIT_OA_OUT_TYPE_MAP.put((byte)11, "师陪勘");
		AUDIT_OA_OUT_TYPE_MAP.put((byte)12, "师陪看");
		AUDIT_OA_OUT_TYPE_MAP.put((byte)13, "空看");
		AUDIT_OA_OUT_TYPE_MAP.put((byte)14, "其他");

		AUDIT_DEAL_TYPE_MAP.put((byte)1, "初审");
		AUDIT_DEAL_TYPE_MAP.put((byte)2, "复审");
		AUDIT_DEAL_TYPE_MAP.put((byte)3, "结算");
		AUDIT_DEAL_TYPE_MAP.put((byte)4, "合同作废");
		AUDIT_DEAL_TYPE_MAP.put((byte)5, "撤销初审");
		AUDIT_DEAL_TYPE_MAP.put((byte)6, "撤销复审");
		AUDIT_DEAL_TYPE_MAP.put((byte)7, "撤销结算");
		AUDIT_DEAL_TYPE_MAP.put((byte)8, "应收");
		AUDIT_DEAL_TYPE_MAP.put((byte)9, "实收");
		AUDIT_DEAL_TYPE_MAP.put((byte)10, "撤销应收审核");
		AUDIT_DEAL_TYPE_MAP.put((byte)11, "撤销实收审核");

		AUDIT_COMPLAINT_TYPE_MAP.put((byte)1, "委托不实");
		AUDIT_COMPLAINT_TYPE_MAP.put((byte)2, "照片不实");
		AUDIT_COMPLAINT_TYPE_MAP.put((byte)3, "钥匙不实");
		AUDIT_COMPLAINT_TYPE_MAP.put((byte)4, "房源不实");
		AUDIT_COMPLAINT_TYPE_MAP.put((byte)5, "电话不实");
		AUDIT_COMPLAINT_TYPE_MAP.put((byte)6, "房源重复");


		AUDIT_TYPE_CLASSIC_MAP.put(Const.DIC_TRACK_TYPE_VIEW_PHONE_SCHEDULE, "[ 查看电话 ]");
		AUDIT_TYPE_CLASSIC_MAP.put(Const.DIC_TRACK_TYPE_VIEW_PHONE_SPECIAL, "[ 查看电话 ]");
		AUDIT_TYPE_CLASSIC_MAP.put(Const.DIC_TRACK_TYPE_VIEW_PHONE_RESPITE, "[ 查看电话 ]");
		AUDIT_TYPE_CLASSIC_MAP.put(Const.DIC_TRACK_TYPE_VIEW_PHONE_INNERDEAL, "[ 查看电话 ]");
		AUDIT_TYPE_CLASSIC_MAP.put(Const.DIC_TRACK_TYPE_VIEW_PHONE_OUTDEAL, "[ 查看电话 ]");
		AUDIT_TYPE_CLASSIC_MAP.put(Const.DIC_TRACK_TYPE_VIEW_PHONE_AVAILABLE, "[ 查看电话 ]");
		AUDIT_TYPE_CLASSIC_MAP.put(Const.DIC_TRACK_TYPE_VIEW_PHONE_ENTRUST_ALONE, "[ 查看电话 ]");
		AUDIT_TYPE_CLASSIC_MAP.put(Const.DIC_TRACK_TYPE_VIEW_PHONE_ENTRUST_LIMITED, "[ 查看电话 ]");
		AUDIT_TYPE_CLASSIC_MAP.put(Const.DIC_TRACK_TYPE_VIEW_PHONE_ENTRUST_RENT, "[ 查看电话 ]");
		AUDIT_TYPE_CLASSIC_MAP.put(Const.DIC_TRACK_TYPE_LIMITED, "[ 签订委托 ]");
		AUDIT_TYPE_CLASSIC_MAP.put(Const.DIC_TRACK_TYPE_ALONE, "[ 签订委托 ]");
		AUDIT_TYPE_CLASSIC_MAP.put(Const.DIC_TRACK_TYPE_RENT, "[ 签订委托 ]");
		AUDIT_TYPE_CLASSIC_MAP.put(Const.DIC_TRACK_TYPE_GENERAL_ENTRUSTMENT, "[ 签订委托 ]");
		AUDIT_TYPE_CLASSIC_MAP.put(Const.DIC_TRACK_TYPE_UPDATE_HOUSE_BUILD, "[ 修改信息 ]");
		AUDIT_TYPE_CLASSIC_MAP.put(Const.DIC_TRACK_TYPE_SUBMIT_KEY, "[ 提交钥匙 ]");
		AUDIT_TYPE_CLASSIC_MAP.put(Const.DIC_TRACK_TYPE_BORROW_KEY, "[ 钥匙借用 ]");
		AUDIT_TYPE_CLASSIC_MAP.put(Const.DIC_TRACK_TYPE_RETURN_KEY, "[ 钥匙归还 ]");
		AUDIT_TYPE_CLASSIC_MAP.put(Const.DIC_TRACK_TYPE_DESTROY_KEY, "[ 钥匙注销 ]");

		AUDIT_TYPE_CLASSIC_MAP.put(Const.DIC_TRACK_TYPE_BARGAIN, "[ 房源议价 ]");

		AUDIT_TYPE_CLASSIC_MAP.put(Const.DIC_TRACK_TYPE_STATUS_SCHEDULE, "[ 状态变更 ]");
		AUDIT_TYPE_CLASSIC_MAP.put(Const.DIC_TRACK_TYPE_STATUS_WRITEOFF, "[ 状态变更 ]");
		AUDIT_TYPE_CLASSIC_MAP.put(Const.DIC_TRACK_TYPE_STATUS_INVALID, "[ 状态变更 ]");
		AUDIT_TYPE_CLASSIC_MAP.put(Const.DIC_TRACK_TYPE_STATUS_SPECIAL, "[ 状态变更 ]");
		AUDIT_TYPE_CLASSIC_MAP.put(Const.DIC_TRACK_TYPE_STATUS_RESPITE, "[ 状态变更 ]");
		AUDIT_TYPE_CLASSIC_MAP.put(Const.DIC_TRACK_TYPE_STATUS_TRANSAVAILABLE, "[ 状态变更 ]");
		AUDIT_TYPE_CLASSIC_MAP.put(Const.DIC_TRACK_TYPE_STATUS_INNERDEAL, "[ 状态变更 ]");
		AUDIT_TYPE_CLASSIC_MAP.put(Const.DIC_TRACK_TYPE_STATUS_OUTDEAL, "[ 状态变更 ]");
		AUDIT_TYPE_CLASSIC_MAP.put(Const.DIC_TRACK_TYPE_STATUS_AVAILABLE, "[ 状态变更 ]");
		AUDIT_TYPE_CLASSIC_MAP.put(Const.DIC_TRACK_TYPE_CANCEL_SCHEDULE, "[ 状态变更 ]");
		AUDIT_TYPE_CLASSIC_MAP.put(Const.DIC_TRACK_TYPE_CANCEL_SPECIAL, "[ 状态变更 ]");
		AUDIT_TYPE_CLASSIC_MAP.put(Const.DIC_TRACK_TYPE_CANCEL_RESPITE, "[ 状态变更 ]");

		AUDIT_TYPE_CLASSIC_MAP.put(Const.DIC_TRACK_TYPE_HOUSE_LEVEL_COMMEND, "[ 级别变更 ]");
		AUDIT_TYPE_CLASSIC_MAP.put(Const.DIC_TRACK_TYPE_HOUSE_LEVEL_PASSWORD, "[ 级别变更 ]");
		AUDIT_TYPE_CLASSIC_MAP.put(Const.DIC_TRACK_TYPE_HOUSE_LEVEL_FOCUS, "[ 级别变更 ]");
		//陈文超-取消
//		AUDIT_TYPE_CLASSIC_MAP.put(Const.DIC_TRACK_TYPE_CANCEL_PASSWORD, "[ 级别变更 ]");
//		AUDIT_TYPE_CLASSIC_MAP.put(Const.DIC_TRACK_TYPE_CANCEL_COMMEND, "[ 级别变更 ]");
//		AUDIT_TYPE_CLASSIC_MAP.put(Const.DIC_TRACK_TYPE_HOUSE_LEVEL_CANCEL_FOCUS, "[ 级别变更 ]");

		AUDIT_TYPE_CLASSIC_MAP.put(Const.DIC_TRACK_TYPE_FUNCAN, "[ 房源实勘 ]");
		AUDIT_TYPE_CLASSIC_MAP.put(Const.DIC_TRACK_TYPE_DAIKAN, "[ 带看 ]");
		AUDIT_TYPE_CLASSIC_MAP.put(Const.DIC_TRACK_TYPE_CANCEL_WEITUO, "[ 取消委托 ]");
		AUDIT_TYPE_CLASSIC_MAP.put(Const.DIC_TRACK_TYPE_YUE_KAN, "[ 客源约看 ]");

		AUDIT_TYPE_CLASSIC_MAP.put(Const.DIC_TRACK_TYPE_KEY_EXPLAIN, "[ 钥匙说明 ]");

		AUDIT_TYPE_CLASSIC_MAP.put(Const.DIC_TRACK_TYPE_CANCEL_SCHEDULE, "[ 取消预订 ]");
		AUDIT_TYPE_CLASSIC_MAP.put(Const.DIC_TRACK_TYPE_CANCEL_SPECIAL, "[ 取消封盘 ]");
		AUDIT_TYPE_CLASSIC_MAP.put(Const.DIC_TRACK_TYPE_CANCEL_RESPITE, "[ 暂缓转有效 ]");
		AUDIT_TYPE_CLASSIC_MAP.put(Const.DIC_TRACK_TYPE_CANCEL_PASSWORD, "[ 取消加密 ]");
		AUDIT_TYPE_CLASSIC_MAP.put(Const.DIC_TRACK_TYPE_CANCEL_COMMEND, "[ 取消推荐 ]");
		AUDIT_TYPE_CLASSIC_MAP.put(Const.DIC_TRACK_TYPE_HOUSE_LEVEL_CANCEL_FOCUS, "[ 取消笋盘 ]");
		AUDIT_TYPE_CLASSIC_MAP.put(Const.DIC_TRACK_TYPE_KEY_BORROW_OUT, "[ 外借钥匙 ]");
		AUDIT_TYPE_CLASSIC_MAP.put(Const.DIC_TRACK_TYPE_PROPERTY_RETURN_KEY, "[ 外借归还钥匙]");
		AUDIT_TYPE_CLASSIC_MAP.put(Const.DIC_TRACK_TYPE_BORROW_TIME_OUT, "[ 外借超时 ]");
		AUDIT_TYPE_CLASSIC_MAP.put(Const.DIC_TRACK_TYPE_HOUSE_CANCEL_FUNCAN, "[ 撤销房勘 ]");
		
		
		
		SHOW_SALE_LEASE_TYPE_SET.add(Const.DIC_TRACK_TYPE_FUNCAN);
		SHOW_SALE_LEASE_TYPE_SET.add(Const.DIC_TRACK_TYPE_KEY);
		SHOW_SALE_LEASE_TYPE_SET.add(Const.DIC_TRACK_TYPE_LIMITED);
		SHOW_SALE_LEASE_TYPE_SET.add(Const.DIC_TRACK_TYPE_ALONE);
		SHOW_SALE_LEASE_TYPE_SET.add(Const.DIC_TRACK_TYPE_CASH);
		SHOW_SALE_LEASE_TYPE_SET.add(Const.DIC_TRACK_TYPE_RENT);
		SHOW_SALE_LEASE_TYPE_SET.add(Const.DIC_TRACK_TYPE_SUBMIT_KEY);
		SHOW_SALE_LEASE_TYPE_SET.add(Const.DIC_TRACK_TYPE_BORROW_KEY);
		SHOW_SALE_LEASE_TYPE_SET.add(Const.DIC_TRACK_TYPE_RETURN_KEY);
		SHOW_SALE_LEASE_TYPE_SET.add(Const.DIC_TRACK_TYPE_DESTROY_KEY);
		SHOW_SALE_LEASE_TYPE_SET.add(Const.DIC_TRACK_TYPE_PHOTO_UPLOAD);
		SHOW_SALE_LEASE_TYPE_SET.add(Const.DIC_TRACK_TYPE_PHOTO_DELETE);
		SHOW_SALE_LEASE_TYPE_SET.add(Const.DIC_TRACK_TYPE_PHOTO_TOP);
		SHOW_SALE_LEASE_TYPE_SET.add(Const.DIC_TRACK_TYPE_VIDEO_UPLOAD);
		SHOW_SALE_LEASE_TYPE_SET.add(Const.DIC_TRACK_TYPE_VIDEO_DELETE);
		SHOW_SALE_LEASE_TYPE_SET.add(Const.DIC_TRACK_TYPE_VR_UPLOAD);
		SHOW_SALE_LEASE_TYPE_SET.add(Const.DIC_TRACK_TYPE_VR_DELETE);
	}

	/**跟进类别：钥匙借用 值:105*/
	public final static Byte DIC_TRACK_TYPE_KEY_BORROW = 105;
	/**跟进类别：钥匙归还 值:106*/
	public final static Byte DIC_TRACK_TYPE_KEY_RETURN = 106;

	/**跟进的子类型 1:查看核心跟进*/
	public final static Byte DIC_TRACK_INCLUDE_TRACK_IMPORT_DATA = 1;
	/**跟进的子类型 2:提交钥匙跟进*/
	public final static Byte DIC_TRACK_INCLUDE_TRACK_UPLOADKEY = 2;
	/**跟进的子类型 3:上传图片跟进*/
	public final static Byte DIC_TRACK_INCLUDE_TRACK_UPLOADIMAGE = 3;
	/**跟进的子类型 4:上传视频跟进*/
	public final static Byte DIC_TRACK_INCLUDE_TRACK_UPLOADVIDEO = 4;
	/**跟进的子类型 5:优优好房跟进*/
	public final static Byte DIC_TRACK_INCLUDE_TRACK_DIDI = 5;
	/**跟进的子类型 6:删除图片跟进*/
	public final static Byte DIC_TRACK_INCLUDE_TRACK_DELIMAGE = 6;
	/**跟进的子类型 7:编辑图片跟进*/
	public final static Byte DIC_TRACK_INCLUDE_TRACK_EDITIMAGE = 7;
	/**跟进的子类型 8:删除视频跟进*/
	public final static Byte DIC_TRACK_INCLUDE_TRACK_DELVIDEO = 8;
	/**跟进的子类型 9:登记房客源跟进*/
	public final static Byte DIC_TRACK_INCLUDE_TRACK_REGISTER = 9;
	/**跟进的子类型 10:提交无钥匙跟进*/
	public final static Byte DIC_TRACK_INCLUDE_TRACK_NOKEY = 10;
	/**跟进的子类型 11:720度全景相机图片跟进--陈文超-2016-05-11*/
	public final static Byte DIC_TRACK_INCLUDE_TRACK_PHOTO720 = 11;
	/**跟进的子类型 12:点亮真房源跟进类型 陈文超-2016-05-25*/
	public final static Byte DIC_TRACK_INCLUDE_TRACK_TRUEHOUSE = 12;
	/**跟进的子类型 13: 鸿基广告房源跟进类型 */
	public final static Byte DIC_TRACK_INCLUDE_TRACK_ADS_CASE = 13;
	/**跟进的子类型 14:房源发布到微店 陈文超-2016-06-07*/
	public final static Byte DIC_TRACK_INCLUDE_TRACK_MICROSHOP_PUBLISH = 14;//发布微店--目前用于720设备统计 陈文超 2016-06-07
	/**跟进的子类型 15:房源从微店下架 陈文超-2016-06-07*/
	public final static Byte DIC_TRACK_INCLUDE_TRACK_MICROSHOP_DOWN = 15;//下架微店--目前用于720设备统计 陈文超 2016-06-07
	/**重盘提醒 16**/
	public final static Byte DIC_TRACK_INCLUDE_TRACK_REPAEAT_REMIND = 16;//下架微店--目前用于720设备统计 陈文超 2016-06-07
	/**合作房源**/
	public final static Byte DIC_TRACK_INCLUDE_TRACK_SHAREHOUSE = 19;//合作房源
	/**门店配置分享联卖池房源-上架**/
	public final static Byte DIC_TRACK_INCLUDE_TRACK_SHAREHOUSEFLAG_UP = 20;
	/**门店配置分享联卖池房源-下架**/
	public final static Byte DIC_TRACK_INCLUDE_TRACK_SHAREHOUSEFLAG_DOWN = 21;
	/** 淘宝池操作 **/
	public final static Byte DIC_TRACK_INCLUDE_TRACK_TAOBAO = 22;
	/** 房源核验 **/
	public final static Byte DIC_TRACK_INCLUDE_HOUSE_CHECK = 23;
	/*数据字典TASK_TYPE*/
	/**任务类型：跟踪审核 值:1*/
	public final static Byte DIC_TASK_TYPE_EXAMIN = 1;
	/**任务类型：信息审核 值:2*/
	public final static Byte DIC_TASK_TYPE_VIEWEXAMIN = 2;
	/**任务类型：提醒任务 值:3*/
	public final static Byte DIC_TASK_TYPE_REMIND = 3;
	/**任务类型：留言任务 值:4*/
	public final static Byte DIC_TASK_TYPE_LEAVEWORD = 4;
	/**任务类型：钥匙借用 值:5*/
	public final static Byte DIC_TASK_TYPE_KEY_BORROW = 5;
	/**任务类型：钥匙归还 值:6*/
	public final static Byte DIC_TASK_TYPE_KEY_RETURN = 6;
	/**任务类型：合作提醒 值:7*/
	public final static Byte DIC_TASK_TYPE_COLL_REMIND = 7;
	/**任务类型：合作提醒 值:8*/
	public final static Byte DIC_TASK_TYPE_REPLY_REMIND = 8;
	/**任务类型：权证提醒 值:9*/
	public final static Byte DIC_TASK_TYPE_WARRANT_REMIND = 9;
	/**任务类型：查看信息警告 值:10*/
	public final static Byte DIC_TASK_TYPE_WARNING = 10;
	/**任务类型：投诉提醒 值:11*/
	public final static Byte DIC_TASK_TYPE_COMPLAINT = 11;
	/**任务类型：申诉提醒 值:12*/
	public final static Byte DIC_TASK_TYPE_APPEAL = 12;
	/**任务类型：真房源申诉提醒 值:14*/
	public final static Byte DIC_TASK_TYPE_TRUEHOUSE_APPEAL = 14;
	/**任务类型：真房源罚金提醒 值:15*/
	public final static Byte DIC_TASK_TYPE_TRUEHOUSE_FINE = 15;

	/**审核结果：审核任务同意 值:1*/
	public final static Byte DIC_TASK_EXAMIN_RESULT_AGREEN = 1;
	/**审核结果：审核任务不同意 值:2*/
	public final static Byte DIC_TASK_EXAMIN_RESULT_DISAGREEN = 2;
	
	/** 终生会员:1**/
	public final static Byte DIC_FEE_USER = 1;
	//朱科 提醒任务类别
	/** 核心信息  **/
	public final static Byte DIC_TASK_TYPE_CORE_INFORMATION = 1;//
	public final static String DIC_TASK_TYPE_CORE_INFORMATION_STR = "[ 核心信息 ]";
	/** 合同提醒  **/
	public final static Byte DIC_TASK_TYPE_CONTRACT_REMIND = 4;
	public final static String DIC_TASK_TYPE_CONTRACT_REMIND_STR = "[ 合同提醒 ]";
	/** 权证提醒  **/
	public final static Byte DIC_TASK_TYPE_AUTHORITY_REMIND = 5;
	public final static String DIC_TASK_TYPE_AUTHORITY_REMIND_STR = "[ 权证提醒 ]";
	/** 律师审核  **/
	public final static Byte DIC_TASK_TYPE_LAWYER_AUDIT = 6;
	public final static String DIC_TASK_TYPE_LAWYER_AUDIT_STR = "[ 律师审核 ]";
	/** 跟进提醒  **/
	public final static Byte DIC_TASK_TYPE_TRACK_REMIND = 7;//
	public final static String DIC_TASK_TYPE_TRACK_REMIND_STR = "[ 跟进提醒 ]";
	/** 人工审核  **/
	public final static Byte DIC_TASK_TYPE_WORK_AUDIT = 8;//
	public final static String DIC_TASK_TYPE_WORK_AUDIT_STR = "[ 人工审核 ]";
	/** 自动审核  **/
	public final static Byte DIC_TASK_TYPE_AUTOMATIC_AUDIT = 9;//
	public final static String DIC_TASK_TYPE_AUTOMATIC_AUDIT_STR = "[ 自动审核 ]";
	/** 提醒任务  **/
	public final static Byte DIC_TASK_TYPE_REMIND_TASK = 10;//
	public final static String DIC_TASK_TYPE_REMIND_TASK_STR = "[ 提醒任务 ]";
	/** 淘宝池告知  **/
	public final static Byte DIC_TASK_TYPE_PLATE_NOTIFY = 11;
	public final static String DIC_TASK_TYPE_PLATE_NOTIFY_STR = "[ 淘宝池告知 ]";
	/** 公盘告知  **/
	public final static Byte DIC_TASK_TYPE_PUBLIC_NOTIFY= 12;
	public final static String DIC_TASK_TYPE_PUBLIC_NOTIFY_STR = "[ 公盘告知 ]";
	/** 带看提醒  **/
	public final static Byte DIC_TASK_TYPE_TAKE_REMIND = 13;
	public final static String DIC_TASK_TYPE_TAKE_REMIND_STR = "[ 带看提醒 ]";
	/** 跟进提醒  **/
	public final static Byte DIC_TASK_TYPE_FOLLOW_REMIND = 14;
	public final static String DIC_TASK_TYPE_FOLLOW_REMIND_STR = "[ 投诉通知 ]";
	/** 房勘提醒  **/
	public final static Byte DIC_TASK_TYPE_ROOMEXPLORATION_REMIND = 15;
	public final static String DIC_TASK_TYPE_ROOMEXPLORATION_REMIND_STR = "[ 房勘提醒 ]";
	/** 推荐到期  **/
	public final static Byte DIC_TASK_TYPE_RECOMMENDOUT_REMIND = 16;
	public final static String DIC_TASK_TYPE_RECOMMENDOUT_REMIND_STR = "[ 推荐到期 ]";
	/** 委托到期  **/
	public final static Byte DIC_TASK_TYPE_TRUSTOUT_REMIND = 17;
	public final static String DIC_TASK_TYPE_TRUSTOUT_REMIND_STR = "[ 委托到期 ]";
	/** 预订到期  **/
	public final static Byte DIC_TASK_TYPE_BOOKOUT_REMIND = 18;
	public final static String DIC_TASK_TYPE_BOOKOUT_REMIND_STR = "[ 预订到期 ]";
	/** 加密到期  **/
	public final static Byte DIC_TASK_TYPE_ENCRYPTIONOUT_REMIND = 19;
	public final static String DIC_TASK_TYPE_ENCRYPTIONOUT_REMIND_STR = "[ 加密到期 ]";
	/** 封盘到期  **/
	public final static Byte DIC_TASK_TYPE_SHUTOUT_REMIND = 20;
	public final static String DIC_TASK_TYPE_SHUTOUT_REMIND_STR = "[ 封盘到期 ]";
	/** 暂缓到期  **/
	public final static Byte DIC_TASK_TYPE_DELAYEDOUT_REMIND = 21;
	public final static String DIC_TASK_TYPE_DELAYEDOUT_REMIND_STR = "[ 暂缓到期 ]";
	/** 租期提醒  **/
	public final static Byte DIC_TASK_TYPE_LEASE_REMIND = 22;//
	public final static String DIC_TASK_TYPE_LEASE_REMIND_STR = "[ 租期提醒 ]";
	/** 删除提醒  **/
	public final static Byte DIC_TASK_TYPE_DELETE_REMIND = 23;
	public final static String DIC_TASK_TYPE_DELETE_REMIND_STR = "[ 删除提醒 ]";
	/** 数据移交  **/
	public final static Byte DIC_TASK_TYPE_DATA_TURN = 24;
	public final static String DIC_TASK_TYPE_DATA_TURN_STR = "[ 数据移交 ]";
	/** 业务跟进  **/
	public final static Byte DIC_TASK_TYPE_BUSINESS_TRACKING = 25;//
	public final static String DIC_TASK_TYPE_BUSINESS_TRACKING_STR = "[ 业务跟进 ]";
	/** 注销提醒  **/
	public final static Byte DIC_TASK_TYPE_LOGOUT_REMIND = 26;//
	public final static String DIC_TASK_TYPE_LOGOUT_REMIND_STR = "[ 注销提醒 ]";
	/** 审核提醒  **/
	public final static Byte DIC_TASK_TYPE_AUDIT_REMIND = 27;//
	public final static String DIC_TASK_TYPE_AUDIT_REMIND_STR = "[ 审核提醒 ]";
	/** 罚金提醒  **/
	public final static String DIC_TASK_TYPE_TRUEHOUSEFINE_REMIND = "28";//
	public final static String DIC_TASK_TYPE_TRUEHOUSEFINE_REMIND_STR = "[ 罚金提醒 ]";
	/** 投诉提醒  **/
	public final static Byte DIC_TASK_TYPE_TRUEHOUSEEXPLAIN_REMIND = 29;//
	public final static String DIC_TASK_TYPE_TRUEHOUSEEXPLAIN_REMIND_STR = "[ 投诉提醒 ]";
	/** 投诉警告  **/
	public final static String DIC_TASK_TYPE_COMPLAINTS_REMIND = "30";//
	public final static String DIC_TASK_TYPE_COMPLAINTS_REMIND_STR = "[ 投诉警告 ]";
	/** 成交提醒  **/
	public final static Byte DIC_TASK_TYPE_BARGAIN_REMIND = 31;
	public final static String DIC_TASK_TYPE_BARGAIN_REMIND_STR = "[ 成交提醒 ]";
	/** 装修提醒 **/
	public final static Byte DIC_TASK_TYPE_RENOVATION_REMIND = 32;
	public final static String DIC_TASK_TYPE_RENOVATION_REMIND_STR = "[ 装修提醒 ]";
	/** 代扣代缴 **/
	public final static Byte DIC_TASK_TYPE_GENERATION_REMIND = 33;
	public final static String DIC_TASK_TYPE_GENERATION_REMIND_STR = "[ 代扣代缴提醒 ]";
	/** 奖励 **/
	public final static Byte DIC_TASK_TYPE_REWARD_REMIND = 34;
	public final static String DIC_TASK_TYPE_REWARD_REMIND_STR = "[ 奖励通知 ]";
	/** 罚款 **/
	public final static Byte DIC_TASK_TYPE_PUNISHMENT_REMIND = 35;
	public final static String DIC_TASK_TYPE_PUNISHMENT_REMIND_STR = "[ 罚款通知 ]";
	/** 楼盘变更 **/
	public final static Byte DIC_TASK_TYPE_CHANGE_BUILD = 36;
	public final static String DIC_TASK_TYPE_CHANGE_BUILD_STR = "[ 楼盘变更 ]";
	/** 约看提醒 **/
	public final static Byte DIC_TASK_TYPE_YUEKAN = 37;
	public final static String DIC_TASK_TYPE_YUEKAN_STR = "[ 约看提醒 ]";
	/** 去电提醒 **/
	public final static Byte DIC_TASK_TYPE_DAIL_PHONE_COMMON = 38;
	public final static String DIC_TASK_TYPE_DAIL_PHONE_COMMON_STR = "[ 去电提醒 ]";
	/** 合同变更 **/
	public final static Byte DIC_TASK_TYPE_DEAL_UPDATE = 39;
	public final static String DIC_TASK_TYPE_DEAL_UPDATE_STR = "[ 合同变更 ]";
	/** 钥匙管理 **/
	public final static Byte DIC_TASK_TYPE_KEY = 40;
	public final static String DIC_TASK_TYPE_KEY_STR = "[ 钥匙管理 ]";
	/** 复看提醒 **/
	public final static Byte DIC_TASK_TYPE_FUKAN = 58;
	public final static String DIC_TASK_TYPE_KEY_FUKAN = "[ 复看提醒 ]";
    /** 笋盘到期 41(数据库有,但是此处没有,先占个位)**/
    /** 房源重复提醒 42(数据库有,但是此处没有,先占个位)**/

    /**
     * 房源重复提醒
     **/
    public final static Byte DIC_TASK_TYPE_HOUSE_REPEAT = 43;
    public final static String DIC_TASK_TYPE_HOUSE_REPEAT_STR = "[ 房源重复提醒 ]";
	/**
	 * 房勘人撤销通知
	 **/
	public final static Byte DIC_TASK_TYPE_HOUSE_FUNCAN_USER_CANCEL = 44;
	public final static String DIC_TASK_TYPE_HOUSE_FUNCAN_USER_CANCEL_STR = "[ 房勘人撤销通知 ]";
	/**
	 * 限时委托撤销通知
	 **/
	public final static Byte DIC_TASK_TYPE_LIMITED_CANCEL = 45;
	public final static String DIC_TASK_TYPE_LIMITED_CANCEL_STR = "[ 限时委托撤销通知 ]";
	/**
	 * 独家委托撤销通知
	 **/
	public final static Byte DIC_TASK_TYPE_ALONE_CANCEL = 46;
	public final static String DIC_TASK_TYPE_ALONE_CANCEL_STR = "[ 独家委托撤销通知 ]";
	/**
	 * 包租委托撤销通知
	 **/
	public final static Byte DIC_TASK_TYPE_RENT_CANCEL = 47;
	public final static String DIC_TASK_TYPE_RENT_CANCEL_STR = "[ 包租委托撤销通知 ]";
	/**
	 * 普通委托撤销通知
	 **/
	public final static Byte DIC_TASK_TYPE_GENERAL_ENTRUSTMENT_CANCEL = 48;
	public final static String DIC_TASK_TYPE_GENERAL_ENTRUSTMENT_CANCEL_STR = "[ 普通委托撤销通知 ]";
	/**
	 * 钥匙撤销通知
	 **/
	public final static Byte DIC_TASK_TYPE_KEY_CANCEL = 49;
	public final static String DIC_TASK_TYPE_KEY_CANCEL_STR = "[ 钥匙撤销通知 ]";
	/**
	 * 笋盘推荐提醒
	 **/
	public final static Byte DIC_TASK_TYPE_FOCUS = 50;
	public final static String DIC_TASK_TYPE_FOCUS_STR = "[ 笋盘推荐提醒 ]";
	
	/***
	 * 议价提醒
	 */
	public final static Byte DIC_TASK_TYPE_BARGAIN = 51;
	public final static String DIC_TASK_TYPE_BARGAIN_STR = "[ 议价提醒 ]";

	/***
	 * 几天未登陆预警提醒
	 */
	public final static Byte NOT_ONLINE_SOMEDAYS = 52;
	
	public final static Byte DIC_TASK_TYPE_REG_HOUSE = 53;
	public final static String DIC_TASK_TYPE_REG_HOUSE_STR = "[ 房源登记 ]";

	
	/***
	 * 新房客户提醒
	 */
	public final static Byte DIC_TASK_TYPE_NEW_CSUT = 54;
	public final static String DIC_TASK_TYPE_NEW_CSUT_STR = "[ 报备提醒 ]";
	
	/**
	/**
	 * 1:我要续期 -- 出现情况：关注的楼盘自己已经竞价成功，并且自己已经预约下一期，而且是出价最高的。
	 */
	public final static Byte DIC_BUILD_BIDD_FLAG_1 = 1;
	/**
	 * 2:立即抢驻 -- 出现情况：关注的楼盘还没有用户参与竞价
	 */
	public final static Byte DIC_BUILD_BIDD_FLAG_2 = 2;
	/**
	 * 3:预约下期 -- 出现情况：关注的楼盘他人已经竞价成功，并且自己没有出价预约下一期
	 */
	public final static Byte DIC_BUILD_BIDD_FLAG_3 = 3;
	/**
	 * 4:预约被超出 -- 出现情况：关注的楼盘他人/自己已经竞价成功，并且自己出价预约下一期时 被后面的人超越。
	 */
	public final static Byte DIC_BUILD_BIDD_FLAG_4 = 4;
	/**
	 * 5:等待下期
	 */
	public final static Byte DIC_BUILD_BIDD_FLAG_5 = 5;

	/**
	 * 新版本使用的错误码
	 * @author 张宏利
	 * @since 2016年11月15日
	 */
	public static class ResponseCode {
		/** 成功 **/
		public static final int SUCCESS = 200;
		/** 提示性状态 需要客户端配合展示 **/
		public static final int CONFIRM_CODE = 300;
		/** accessToken非法或过期，需要重新登录 **/
		public static final int TOKEN_TIMEOUT = 400;
		/** 业务接口缺少参数，errMsg会返回错误信息 **/
		public static final int MISSING_PARAMETER = 401;
		/** API 未授权 **/
		public static final int UNAUTHORIZED = 402;
		/** 接口调用频率超限 **/
		public static final int CALL_FREQUENCY_GAUGE = 403;
		/** 请升级至新版使用此功能 **/
		public static final int NEED_UPGRADE = 405;
		/** 服务器端未知错误 **/
		public static final int OTHER_FAIL = 500;
	}
	
	/**
	 * APP使用的跳转
	 * @author 尹振兴
	 * @since 2018年1月24日
	 */
	public static class ResponseErrorCode {
		/** 刷新登录 **/
		public static final String REFRESH_TOKEN = "-4001";
		/** 跳转实名认证 **/
		public static final String USER_VALIDATE = "-4002";
		/** 充值房豆 :系统弹出**/
		public static final String USER_RECHARGE_COIN = "-4003";
		/** 充值vip :系统弹出**/
		public static final String USER_RECHARGE_VIP = "-4004";
		/** 订单被他人抢走了 :系统弹出**/
		public static final String USER_ROBENTRUST_FAILE = "-40041";
		/** 联卖没有权限 : 系统弹出**/
		public static final String USER_UNION_FORBIDDEN = "-4033";
		/** 跳转绑定资金账户 **/
		public static final String BIND_ACCOUNT = "-4005";
		/** 跳转房源编辑 ,主要用于敏感词会过滤**/
		public static final String HOUSE_EDIT = "-4006";
		/** 实名认证  && VIP的弹窗 **/
		public static final String RECHARGE_VIP_VALIDATE = "-4007";
		/** 实名认证  && O2O的弹窗  **/
		public static final String RECHARGE_OTO_VALIDATE = "-4008";
		/** ios客户端崩溃 **/
		public static final String CLIENT_CRASH = "-5001";
		/** 小区专家未登记房源 :系统弹出**/
		public static final String BUILD_EXPERT_NO_HOUSE = "-4009";
		/** 小区专家未点亮网络推广 :系统弹出**/
		public static final String BUILD_EXPERT_NONETPUSH_HOUSE = "-4010";
		/** 小区专家，无图片 :系统弹出**/
		public static final String BUILD_EXPERT_NOPHOTO_HOUSE = "-4011";
		/** 当前界面充值保证金：系统弹出**/
		public static final String CURR_PAGE_USER_RECHARGE_BOND = "-4012";
		/** 经纪人所在公司未开通微店**/
		public static final String NOT_OPEN_WEIXIN  = "-4013";
		/** 客源用户未关注微信**/
		public static final String CUSTOMER_NOT_GZ_WEIXIN = "-4014";
		/** 网络推广核验编号**/
		public static final String NEED_EDIT_HOUSE = "-4015";
		/** 充值现金余额 **/
		public static final String RECHARGE_MONEY = "-4016";
		/** 真房源投诉中，不能操作 **/
		public static final String TRUE_HOUSE_IN_COMPLAINT = "-4017";
		/** 新赢销版，需要引导升级 */
		public static final String UPGRADE_GUIDE = "-4018";
		/** 新赢销版充值房豆送VIP **/
		public static final String RECHARGE_COIN_GIFT_VIP = "-4019";

		/** 使用房豆查看历史数据 */
		public static final String USE_BEAN_VIEW_HISTORY_SOSO_CODE = "-4020";
		/** 通用弹框 **/
		public static final String COMMON_ALERT = "-4021";
		/** soso查看数据需要用VIP*/
		public static final String OT_BE_VIP_CODE = "-4022";
		/**免费精英版充值vip和点亮真房源**/
		public static final String RECHARGE_VIP_TRUEHOUSE = "-4023";
		/**
		 * 新赢销版充值房豆送VIP 针对真房源VIP优惠逻辑
		 * 非VIP：100元点亮 5条真房源
		 *  VIP：100元点亮 10条真房源
		 */
		public static final String TRUE_HOUSE_HINT_BECOME_VIP = "-4024";
		
		/** 实名认证  && 预存房豆  **/
		public static final String RECHARGE_COIN_VALIDATE = "-4025";
		
		/** 取消委托错误码  **/
		public static final String CANCEL_ENTRUST_ERROR = "-4026";
		
		/** 真房源图片张数不足  **/
		public static final String TRUE_HOUSE_IMG_ERROR = "-4028";
		
		/**新赢销版CODE**/
		public static final String NEW_MARKET_CODE = "-4030";
		public static final String KDB_UNION_CODE = "-4040";
				/**点亮真房源未充值保证金且非会员**/
		public static final String TRUE_HOUSE_NO_DEPOSIT_MONEY_AND_NO_VIP = "-4101";
		
		/**认证会员点亮总条数达上限提示升级PLUS**/
		public static final String TRUE_HOUSE_RIGHT_COUNT_OVER_TO_PLUS_VIP = "-4102";
		
		/**PLUS会员点亮总条数达上限提示**/
		public static final String TRUE_HOUSE_PLUS_ALL_COUNT_OVER = "-4103";
		
		/**非会员点亮条数用光提示购买或者升级PLUS**/
		public static final String TRUE_HOUSE_RIGHT_COUNT_OVER_TO_BUY_OR_TO_PLUS_VIP = "-4104";
		 
		/** 房豆不足，充值房豆或者提示去分享房源赚豆 :系统弹出**/
		public static final String USER_RECHARGE_OR_SHARE_HOUSE_GET_COIN = "-4050";
	}

	public static class AdminCode {
		/** 非法访问 **/
		public static final String SERVICE_INVALID_ACCESS = "9";
		/** 系统错误，一般写到catch里面 **/
		public static final String SYSTEM_ERROR = "1";
	}

	public static class MsgCode {
		public static final String SUCCES = "succes";
		public static final Integer SUCCES_NUM = 1;

		public static final String ERROR = "error";
		public static final Integer ERROR_NUM = 500;

		public static final Integer ERROR_PARAM_NUM = 403;
		public static final String EXCEPTION = "exception";

	}

	public static class VoipConst {
		/** 拨打VOIP不扣费类型 **/
		public static Set<Byte> CALL_VOIP_NOT_FREE = new HashSet<Byte>();

		/** 需要回掉的类型 **/
		public static Set<Byte> CALL_VOIP_CALL_BACK = new HashSet<Byte>();

		/** 回调接口类型 **/
		public static Set<String> CALL_BACK_TYPE = new HashSet<String>();

		/** 出售 **/
		public static Byte VOIP_TARGET_TYPE_1 = 1;
		/** 2：出租 **/
		public static Byte VOIP_TARGET_TYPE_2 = 2;
		/** 3：求购 **/
		public static Byte VOIP_TARGET_TYPE_3 = 3;
		/** 4：求租 **/
		public static Byte VOIP_TARGET_TYPE_4 = 4;
		/** 搜搜出售 **/
		public static Byte VOIP_TARGET_TYPE_5 = 5;
		/** 搜搜出租 **/
		public static Byte VOIP_TARGET_TYPE_6 = 6;
		/** 搜搜转铺 **/
		public static Byte VOIP_TARGET_TYPE_7 = 7;
		/** 搜搜合租 **/
		public static Byte VOIP_TARGET_TYPE_8 = 8;
		/** 直供出售 **/
		public static Byte VOIP_TARGET_TYPE_9 = 9;
		/** 直供出租 **/
		public static Byte VOIP_TARGET_TYPE_10 = 10;
		/** 直供求购 **/
		public static Byte VOIP_TARGET_TYPE_11 = 11;
		/** 直供求租 **/
		public static Byte VOIP_TARGET_TYPE_12 = 12;
		/** 需求出售 **/
		public static Byte VOIP_TARGET_TYPE_13 = 13;
		/** 需求出租 **/
		public static Byte VOIP_TARGET_TYPE_14 = 14;
		/** 需求求购 **/
		public static Byte VOIP_TARGET_TYPE_15 = 15;
		/** 需求求租 **/
		public static Byte VOIP_TARGET_TYPE_16 = 16;
		/** 滴滴求购 **/
		public static Byte VOIP_TARGET_TYPE_17 = 17;
		/** 滴滴求租 **/
		public static Byte VOIP_TARGET_TYPE_18 = 18;
		/****/
		public static Byte VOIP_TARGET_TYPE_19 = 19;
		/****/
		public static Byte VOIP_TARGET_TYPE_20 = 20;
		/****/
		public static Byte VOIP_TARGET_TYPE_21 = 21;
		/****/
		public static Byte VOIP_TARGET_TYPE_22 = 22;
		/** YOU+出售 **/
		public static Byte VOIP_TARGET_TYPE_23 = 23;
		/** YOU+出租 **/
		public static Byte VOIP_TARGET_TYPE_24 = 24;
		/** YOU+楼盘 **/
		public static Byte VOIP_TARGET_TYPE_25 = 25;
		/** 装修公司拨打 **/
		public static Byte VOIP_TARGET_TYPE_26 = 26;
		/****/
		public static Byte VOIP_TARGET_TYPE_27 = 27;

		static {
			CALL_VOIP_NOT_FREE.add(VOIP_TARGET_TYPE_17);
			CALL_VOIP_NOT_FREE.add(VOIP_TARGET_TYPE_18);
			CALL_VOIP_NOT_FREE.add(VOIP_TARGET_TYPE_19);
			CALL_VOIP_NOT_FREE.add(VOIP_TARGET_TYPE_20);

			CALL_VOIP_CALL_BACK.add(VOIP_TARGET_TYPE_19);
			CALL_VOIP_CALL_BACK.add(VOIP_TARGET_TYPE_20);
			CALL_VOIP_CALL_BACK.add(VOIP_TARGET_TYPE_26);

			CALL_BACK_TYPE.add("vType");
			CALL_BACK_TYPE.add("Billtype");
		}

		/** IP拨号返回值 余额不足 **/
		public static Integer RESULT_IP_CALL_0 = 0;
		/** IP拨号返回值 拨打成功 **/
		public static Integer RESULT_IP_CALL_1 = 1;
		/** IP拨号返回值 拨打异常 **/
		public static Integer RESULT_IP_CALL_2 = 2;
		/** IP拨号返回值 IP_POOL不足 **/
		public static Integer RESULT_IP_CALL_3 = 3;

		/** IP拨打通道 华为 **/
		public static Byte VOIP_CALL_CHANEL_HW = 0;
		/** IP拨打通道 云之讯 **/
		public static Byte VOIP_CALL_CHANEL_YZX = 1;

	}

	public static class SolrConst {
		/** SOLR扫描数据时间间隔 单位毫秒 **/
		public static Integer SOLR_SCANNER_INTERVAL = 60 * 1000;

		/** SOLR提交时间间隔 单位毫秒 **/
		public static Integer SOLR_SUBMIT_INTERVAL = 3 * 60 * 1000;

		/** SOLR推送时间间隔 单位毫秒 **/
		public static Integer SOLR_PUSH_INTERVAL = 1;

		/** SOLR检查服务器时间间隔 单位毫秒 **/
		public static Integer SOLR_CHECK_STATUS_INTERVAL = 60 * 1000;

		/** SOLR扫描分页大小 **/
		public static Integer SOLR_SCANNER_PAGE_SIZE = 150;

		/** SOLR 来源 房源 **/
		public static Byte SOLR_SOURCE_1 = 1;
		/** SOLR 来源 搜搜中介 **/
		public static Byte SOLR_SOURCE_2 = 2;

	}

	/**
	 * CRM数据字典，门店状态类型 CUST_STATUS
	 *
	 * @author Administrator
	 */
	public static class getDeptCustStatus {
		/** 意向 */
		public final static String DIC_CUST_STATUS_AVAILABLE = "AVAILABLE";
		/** 注销 */
		public final static String DIC_CUST_STATUS_FAILURE = "FAILURE";
		/** 试用 */
		public final static String DIC_CUST_STATUS_TRY = "TRY";
		/** 暂停 */
		public final static String DIC_CUST_STATUS_SUSPEND = "SUSPEND";
		/** 正式 */
		public final static String DIC_CUST_STATUS_FORMAL = "FORMAL";
		/** 停用 */
		public final static String DIC_CUST_STATUS_PAUSAL = "PAUSAL";

		/* CRM，门店付费状态 DEPT_FLAG */
		/** 意向 */
		public final static Integer DIC_DEPT_FLAG_AVAILABLE = -1;
		/** 注销 */
		public final static Integer DIC_DEPT_FLAG_FAILURE = -3;
		/** 试用 */
		public final static Integer DIC_DEPT_FLAG_TRY = 1;
		/** 暂停 */
		public final static Integer DIC_DEPT_FLAG_SUSPEND = 0;
		/** 正式 */
		public final static Integer DIC_DEPT_FLAG_FORMAL = 2;
		/** 停用 */
		public final static Integer DIC_DEPT_FLAG_PAUSAL = -2;
	}

	public static class DbInfo {
		public final static String HFT_ADMINDB = "hft_admindb";
		public final static String HFT_ADMINDB_R = "hft_admindb_r";

		public final static String HFT_AGENCYDB = "hft_agencydb";
		public final static String HFT_AGENCYDB_R = "hft_agencydb_r";

		public final static String HFT_FAFUNDB = "hft_fafundb";
		public final static String HFT_FAFUNDB_R = "hft_fafundb_r";

		public final static String HFT_SEARCHDB = "hft_searchdb";
		public final static String HFT_SEARCHDB_R = "hft_searchdb_r";

		public final static String HFT_SEARCH2DB = "hft_searchdb2";
		public final static String HFT_SEARCH2DB_R = "hft_searchdb2_r";

		public final static String HFT_ADMINDB_RPT = "hft_admindb_rpt";
		public final static String HFT_ADMINDB_RPT_R = "hft_admindb_rpt_r";

		public final static String HFT_REPORT = "hft_reportdb";
		public final static String HFT_REPORT_R = "hft_reportdb_r";
		
		public final static String HFT_COMMDB = "hft_commdb";
		public final static String HFT_COMMDB_R = "hft_commdb_r";
	}

	/**
	 * index 参数一经确定不能改变，否则数据库里的数据会乱
	 *
	 * @author 张宏利
	 * @since 2016年4月15日
	 */
	public enum StatisticDetailType {
		DJ_COUNT(1,10,"djCount")			,//新增登记√	1
		ZYX_COUNT(2,0,"zyxCount")			,//转有效√	2
		SSZR_COUNT(3,0,"sszrCount")			,//搜搜转入√	3
		ZP_COUNT(4,0,"zpCount")				,//转盘√		4
		FP_COUNT(5,0,"fpCount")				,//分配√		5
		XG_COUNT(6,0,"xgCount")				,//修改√		6
		ZTBG_COUNT(7,0,"ztbgCount")			,//状态变更√	7
		WT_COUNT(8,0,"wtCount")				,//委托√		8
		GJ_COUNT(9,1,"gjCount")				,//去电√		9
		FK_COUNT(10,5,"fkCount")			,//房勘√		10
		YSTJ_COUNT(11,10,"ystjCount")		,//钥匙提交√	11
		YJ_COUNT(12,0,"yjCount")			,//议价√		12
		TPSC_COUNT(13,3,"tpscCount")		,//图片上传√	13
		SPSC_COUNT(14,25,"spscCount")		,//视频上传√	14
		CKDH_COUNT(15,1,"ckdhCount")		,//查看电话√	15
		IPCALL_COUNT(16,0,"ipcallCount")	,//拨号√		16
		WLFB_COUNT(17,2,"wlfbCount")		,//网络发布	17
		WLSX_COUNT(18,0,"wlsxCount")		,//网络刷新	18
		DK_COUNT(19,20,"dkCount")			,//带看、带盘√	19
		CJ_COUNT(20,60,"cjCount")			,//成交√		20
		SX_COUNT(21,0,"sxCount")			,//速销房√	21
		SPDK_COUNT(22,0,"spdkCount")		,//视频带看√	22
		KFDP_COUNT(23,0,"kfdpCount")		,//看房点评√	23
		PYQ_COUNT(24,0,"pyqCount")			,//朋友圈(多图分享)√	24
		VR_COUNT(25,0,"vrCount")			,//VR上传√	25
		DKUP_COUNT(26,0,"dkupCount")		,//一带三以上√	26
		DKDOWN_COUNT(27,0,"dkdownCount")	,//一带三以下√	27
		ZFY_COUNT(28,0,"zfyCount")			,//真房源√	28
		ZX_COUNT(29,0,"zxCount")			,//注销√		29
		QFTG_COUNT(30,0,"qftgCount")		,//群发推广√	30
		XQZJ_COUNT(31,0,"xqzjCount")		,//小区专家√	31
		FYTG_COUNT(32,0,"fytgCount")		,//房源推广√	32
		FY_COUNT(33,0,"fyCount")			,//房源分享√	33
		WD_COUNT(34,0,"wdCount")			,//微店分享√	34
		FDK_COUNT(35,0,"fdkCount")			,//带客量√	35
		IPDGJ_COUNT(36,0,"ipdgjCount")		,//IP拨打单跟进√	36
		IPZGJ_COUNT(37,0,"ipzgjCount")		,//IP拨打总跟进√	37
		DHDGJ_COUNT(38,0,"dhdgjCount")		,//查看电话单跟进√	38
		DHZGJ_COUNT(39,0,"dhzgjCount")		,//查看电话总跟进√	39
		DGJ_COUNT(40,0,"dgjCount")			,//房源单跟进√		40
		XSWT_COUNT(41,0,"xswtCount")		,//限时委托√		41
		DJWT_COUNT(42,0,"djwtCount")		,//独家委托√		42
		BZWT_COUNT(43,0,"bzwtCount")		,//包租委托√		43
		PTWT_COUNT(44,0,"ptwtCount")		,//普通委托√		44
		KYYK_COUNT(45,0,"kyykCount")		,//客源约看		45
		MT_COUNT(46,0,"mtCount")		    ,//面谈				46
		DZHF_COUNT(47,0,"dzhfCount")        ,//店长回访			47
		PK_COUNT(48,0,"pkCount")            ,//陪看			48
		HZDK_COUNT(49,0,"hzdkCount")        ,//合作带看			49
		QXZH_COUNT(50,0,"qxzhCount")        ,//暂缓转有效     50
		YD_COUNT(51,0,"ydCount")			,//预定   51
		DKJJ_COUNT(52,0,"dkjjCount")		,//带看笋盘   52--陈文超添加(以前的聚焦改为了笋盘)
		KKJJ_COUNT(53,0,"kkjjCount")		,//空看笋盘   53(以前的聚焦改为了笋盘)
		FKINFO_SYBC_COUNT(62,0,"qxfkCount")		;//取消房堪


		/**
		 * 跑分对应分数
		 */
		private Integer score;
		private Integer index;
		private String humpName;


		/**
		 *
		 * @author 张宏利
		 * @since 2016年4月29日
		 * @param index
		 *            编号，一经确定不能改变，否则数据库里的数据会乱
		 * @param score
		 *            该工作量所代表的分数，运营分析算分时使用，adminWeb项目暂时用不上吧
		 */
		StatisticDetailType(Integer index, Integer score, String humpName) {
			this.setIndex(index);
			this.setScore(score);
			this.setHumpName(humpName);
		}

		/**
		 * 拖过驼峰的名字找类型
		 * @author 张宏利
		 * @since 2017年8月2日
		 * @param name
		 * @return
		 */
		public static StatisticDetailType serachIndexByName(String name){
			for (StatisticDetailType type : StatisticDetailType.values()) {
				if(type.getHumpName().equals(name)){
					return type;
				}
			}
			return null;
		}

		@Override
		public String toString() {
			return String.valueOf(getIndex());
		}

		public Integer getScore() {
			return score;
		}

		public void setScore(Integer score) {
			this.score = score;
		}

		public Integer getIndex() {
			return index;
		}

		public void setIndex(Integer index) {
			this.index = index;
		}

		public String getHumpName() {
			return humpName;
		}

		public void setHumpName(String humpName) {
			this.humpName = humpName;
		}
	}

	public static class UserStatus {
		/** 用户状态：正常使用 */
		public final static String DIC_USER_STATUS_FORMAL = "1";
		/** 用户状态：暂停使用 */
		public final static String DIC_USER_STATUS_JOBLESS = "3";
		/** 用户状态：未激活等待审核状态 */
		public final static String DIC_USER_STATUS_PENDINGREVIEW = "4";
		/**
		 * 登陆用户被注销
		 */
		public final static String DIC_LOGIN_WRITEOFF_1 = "1";
	}

	/**
	 * 缓存相关缓存名
	 *
	 * @author 张宏利
	 * @since 2016年5月5日
	 */
	public static class CacheStructure {
		// 统计详细信息表查询是否存在的缓存名
		public final static String hfterpdb_StatisticDetail_CountCache = "hfterpdb_StatisticDetail_CountCache";
		public final static String hfterpdb_StatisticDetail_CountCache_Key = "hfterpdb_StatisticDetail_CountCache_Key_";

		//在key值后不追加CITY_ID
		public final static String NOTAPPENDCITYID="NOTAPPENDCITYID";
		//本地缓存标记  对版本号不做校验  该类数据 无需变更的情况  切忌频繁修改
		public final static String NOTVALIDATE="NOTVALIDATE";

		public final static String ROOT_Cache = "ROOT";
		// 用户正常登陆的缓存名
		public final static String LOGIN_ARCHIVE_ID = "LOGIN_ARCHIVE_ID_";
		// erp对应的缓存头
		public final static String ARCHIVE_ID_ERP = "ARCHIVE_ID_ERP_";
		// app对应的缓存头
		public final static String ARCHIVE_ID_APP = "ARCHIVE_ID_APP_";
		// archiveId对应的会话数据key
		public final static String ARCHIVE_ID_OPERATOR = "ARCHIVE_ID_OPERATOR_";
		// 网页监控使用的缓存名
		public final static String DEBUG_LOCK_ARCHIVE_ID = "DEBUG_LOCK_ARCHIVE_ID_";
		// 精英版和第三方登陆时，密码输入错误超过6次后锁定600秒的key
		public final static String LOCK_ARCHIVE_ID = "LOCK_ARCHIVE_ID_";

		public final static String hfterpdb_funCompCache="hfterpdb_funCompCache";
		public final static String hfterpdb_funCompCache_CompId="hfterpdb_funCompCache_COMP_ID_";
		public final static String hfterpdb_funCompCache_CompId_by_CompNO="hfterpdb_funCompCache_CompId_by_COMP_NO_";//存放COMP_ID  by CompNo

		public final static String treasureCoin_Ranking = "treasureCoin_Ranking";
		public final static String treasureCoin_Ranking_Last = "treasureCoin_Ranking_Last_";
		public final static String treasureCoin_Ranking_Old = "treasureCoin_Ranking_Old_";

		public final static String hfterpdb_sysParaCache="hfterpdb_sysParaCache";
		public final static String hfterpdb_sysParaCache_map_by_CompId="hfterpdb_sysParaCache_map_by_CompId_";

		public static final String hfterpdb_funAreaCache = "hfterpdb_funAreaCache";
		public static final String hfterpdb_funAreaCache_by_COMP_ID="hfterpdb_funAreaCache_by_COMP_ID_";//存放AREA_ID 集合  by CompId

		public static final String hfterpdb_funRegionCache = "hfterpdb_funRegionCache";
		public static final String hfterpdb_funRegionCache_by_COMP_ID = "hfterpdb_funRegionCache_by_COMP_ID_";
		public static final String hfterpdb_funRegionCache_map_by_COMP_ID = "hfterpdb_funRegionCache_map_by_COMP_ID_";

		public final static String hfterpdb_funDeptsCache = "hfterpdb_funDeptsCache";
		public final static String hfterpdb_funDeptsCache_by_COMP_ID = "hfterpdb_funDeptsCache_by_COMP_ID_";
		public final static String hfterpdb_funDeptsCache_map_by_COMP_ID = "hfterpdb_funDeptsCache_map_by_COMP_ID_";

		public static final String hfterpdb_funDeptsgroupCache = "hfterpdb_funDeptsgroupCache";
		public final static String hfterpdb_funDeptsgroupCache_by_COMP_ID = "hfterpdb_funDeptsgroupCache_by_COMP_ID_";


		public static final String hfterpdb_funUsersCache = "hfterpdb_funUsersCache";
		public static final String hfterpdb_funUsersCache_map_by_DEPT_ID = "hfterpdb_funUsersCache_map_by_DEPT_ID_";

		public static final String hfterpdb_funUsersBaseInfoCache = "hfterpdb_funUsersBaseInfoCache";
		public static final String hfterpdb_GeneralManagerUserId_by_COMP_ID = "hfterpdb_GeneralManagerUserId_by_COMP_ID_";
		public static final String hfterpdb_funUsersBaseInfoCache_map_by_COMP_ID = "hfterpdb_funUsersBaseInfoCache_map_by_COMP_ID_";

		public static final String hfterpdb_userOpersCache = "hfterpdb_userOpersCache";
		public static final String hfterpdb_userOpersCache_map_by_USER_ID = "hfterpdb_userOpersCache_map_by_USER_ID_";

		public static final String hfterpdb_funSecitonCache = "hfterpdb_funSecitonCache";
		public static final String hfterpdb_funSecitonCache_map_by_CITY_ID = "hfterpdb_funSecitonCache_map_by_CITY_ID_"+NOTAPPENDCITYID;

		public static final String hfterpdb_roleOpersCache = "hfterpdb_roleOpersCache";
		public static final String hfterpdb_ep_advance_roleOpers_by_ROLE_ID =  "hfterpdb_roleOpersCache_ep_advance_by_ROLE_ID_"+NOTAPPENDCITYID+NOTVALIDATE;
		public static final String hfterpdb_pro_advance_roleOpers_by_ROLE_ID = "hfterpdb_roleOpersCache_pro_advance_by_ROLE_ID_"+NOTAPPENDCITYID+NOTVALIDATE;
		public static final String hfterpdb_smp_advance_roleOpers_by_ROLE_ID = "hfterpdb_roleOpersCache_smp_advance_by_ROLE_ID_"+NOTAPPENDCITYID+NOTVALIDATE;
		public static final String hfterpdb_ep_common_roleOpers_by_ROLE_ID =  "hfterpdb_roleOpersCache_ep_common_by_ROLE_ID_"+NOTAPPENDCITYID+NOTVALIDATE;
		public static final String hfterpdb_pro_common_roleOpers_by_ROLE_ID = "hfterpdb_roleOpersCache_pro_common_by_ROLE_ID_"+NOTAPPENDCITYID+NOTVALIDATE;
		public static final String hfterpdb_smp_common_roleOpers_by_ROLE_ID = "hfterpdb_roleOpersCache_smp_common_by_ROLE_ID_"+NOTAPPENDCITYID+NOTVALIDATE;

		//业务缓存  仅仅服务器缓存  本地缓存被屏蔽  无需版本号验证
		public static final String BS_hfterpdb_funViewLogCache = "BS_hfterpdb_funViewLogCache";
		public static final String BS_hfterpdb_funViewLogCache_By_USER_ID = "BS_hfterpdb_ajia_funViewLogCache_By_USER_ID_";

		public static final String BS_OpenApi_ROOT_Cache = "BS_OpenApi_ROOT_Cache";
		public static final String BS_OpenApi_ROOT_Cache_autoLogin = "BS_OpenApi_ROOT_Cache_autoLogin_";

		//跑分系统相关功能的缓存  陈文超负责
		public static final String BS_hftadminRptdb_Cache = "BS_hftadminRptdb_Cache";
		//RPT自定义缓存数据KEY 全城或者门店的最高分统计数据缓存    跑分
		public static final String BS_hftadminRptdb_Cache_RANGE_MAX_SCORE_CACHE_KEY = "BS_hftadminRptdb_Cache_RANGE_MAX_CACHE_KEY";
		//RPT自定义缓存数据KEY 全城或者门店的平均分分统计数据缓存	 跑分
		public static final String BS_hftadminRptdb_Cache_RANGE_AVG_SCORE_CACHE_KEY = "BS_hftadminRptdb_Cache_RANGE_AVG_CACHE_KEY";
		//首页前五名的跑分用户数据缓存
		public static final String BS_hftadminRptdb_Cache_TOP5_SCORE_CACHE_KEY = "BS_hftadminRptdb_Cache_TOP5_SCORE_CACHE_KEY";
		//跑分功能首页的几个指标的排名情况
		public static final String BS_hftadminRptdb_Cache_EACH_SCORE_CACHE_KEY = "BS_hftadminRptdb_Cache_EACH_SCORE_CACHE_KEY";

		public static final String hfterpdb_funRolesCache="hfterpdb_funRolesCache";
		public static final String hfterpdb_funRolesCache_map = "hfterpdb_funRolesCache_map_"+NOTAPPENDCITYID;
		public static final String hfterpdb_funRolesCache_Lower_Roles_Map = "hfterpdb_funRolesCache_Lower_Roles_Map_"+NOTAPPENDCITYID;
		public static final String hfterpdb_funRolesCache_Mix_Lower_Roles_Map = "hfterpdb_funRolesCache_Mix_Lower_Roles_Map_"+NOTAPPENDCITYID;

		// admin库公用缓存名
		public static final String hftadmindb_commonCache = "hftadmindb_commonCache";
		// admin库字典缓存
		public static final String hftadmindb_commonCache_dicDefinitions_map_by_Type = "hftadmindb_commonCache_dicDefinitions_map_by_Type_"+NOTAPPENDCITYID;
		public static final String hftadmindb_commonCache_funCityCache_map = "hftadmindb_commonCache_funCityCache_map_"+NOTAPPENDCITYID;
		public static final String hftadmindb_commonCache_funProvince_map = "hftadmindb_commonCache_funProvince_map_"+NOTAPPENDCITYID;
		public static final String hftadmindb_commonCache_sysPara_map = "hftadmindb_commonCache_sysPara_map_"+NOTAPPENDCITYID;
		public static final String hftadmindb_commonCache_kjlCityRela_map = "hftadmindb_commonCache_kjlCityRela_map_"+NOTAPPENDCITYID;
		public static final String hftadmindb_commonCache_funTags_map = "hftadmindb_commonCache_funTags_map_"+NOTAPPENDCITYID;
		public static final String hftadmindb_commonCache_DatasourceConfig_map = "hftadmindb_commonCache_DatasourceConfig_map_"+NOTAPPENDCITYID;
		public static final String hftadmindb_commonCache_discountConfig_map = "hftadmindb_commonCache_discountConfig_map_"+NOTAPPENDCITYID;
		// 跑分缓存
		public static final String hftadmindb_commonCache_RptImStandard_map = "hftadmindb_commonCache_RptImStandard_map_"+NOTAPPENDCITYID;

		// erp库公用缓存名
		public static final String hfterpdb_commonCache = "hfterpdb_commonCache";
		// 所有erp库fun_city都一样，只需缓存一份即可，不用加城市ID
		public static final String hfterpdb_commonCache_funCity_map_by_Type = "hfterpdb_commonCache_funCity_map_"+NOTAPPENDCITYID;
		public static final String hfterpdb_commonCache_funProvince_map = "hftadmindb_commonCache_funProvince_map_"+NOTAPPENDCITYID;
		public static final String hfterpdb_commonCache_funReg_map = "hftadmindb_commonCache_funReg_map_"+NOTAPPENDCITYID;
		public static final String hfterpdb_commonCache_funOpers_map = "hfterpdb_commonCache_funOpers_map_"+NOTAPPENDCITYID;
		public static final String hfterpdb_commonCache_advOpers_map = "hfterpdb_commonCache_advOpers_map_"+NOTAPPENDCITYID;
		public static final String hfterpdb_commonCache_dicDefinition_map_map = "hfterpdb_commonCache_dicDefinition_map_map_"+NOTAPPENDCITYID;
		public static final String hfterpdb_commonCache_dicDefinition_map_list = "hfterpdb_commonCache_dicDefinition_map_list_"+NOTAPPENDCITYID;
		// 模板表头
		public static final String hfterpdb_commonCache_funHead_map = "hfterpdb_commonCache_funHead_map_"+NOTAPPENDCITYID;
		// 统计分析--房源统计缓存名
		public static final String hfterpdb_house_statisticsCache = "hfterpdb_house_statisticsCache";
		public static final String hfterpdb_house_statisticsCache_Data = "hfterpdb_house_statisticsCache_Data_";
		public static final String hfterpdb_house_statisticsCache_bottom = "hfterpdb_house_statisticsCache_bottom_";
		// 统计分析--房源统计缓存名
		public static final String hfterpdb_cust_statisticsCache = "hfterpdb_cust_statisticsCache";
		public static final String hfterpdb_cust_statisticsCache_Data = "hfterpdb_cust_statisticsCache_Data_";
		public static final String hfterpdb_cust_statisticsCache_bottom = "hfterpdb_cust_statisticsCache_bottom_";

		// 缓存网页调试数据
		public static final String debug_ActionPack_Cache = "debug_ActionPack_Cache";
		// 缓存网页调试数据，通过archiveId
		public static final String debug_ActionPack_Cache_map_BY_archiveId = "debug_ActionPack_Cache_map_BY_archiveId_"+NOTAPPENDCITYID;
	}

	/**
	 * ERP返回的错误码，这是老版本的，仅作为参考，已废弃，请使用：{@link ResponseCode}
	 * @author 张宏利
	 */
	@Deprecated
	public static class ErpErrorCode {
		public final static int RECORD_NOT_EXIST = 150000; // 记录对象不存在
		public final static int INVALID_REQUEST = 20001; //非法请求
		public static final int SERVICE_SUCCESS = 0;// 请求成功
		public static final int SYSTEM_ERROR = 1;// 系统错误，一般写到catch里面
		public static final int LOGIN_NO_ACCESS = -3;// 用户没有登录
		public static final int LOGIN_USER_NOT_EXIST = -4;// 用户名不存在
		public static final int LOGIN_PASSWORD_DONOT_MATCH = -5;// 密码错误
		public static final int LOGIN_INVALID_SESSION = -6;// 登陆已失效
		public static final int SERVICE_CLIENT_NO_REPLY = 7; // 返回客户端失败
		public static final int SERVICE_CLIENT_PLEASE_REQUEST_AGIN = 8;// 请重新发送请求
		public static final int SERVICE_INVALID_ACCESS = -9;//非法访问
		public static final int SERVICE_PLEASE_REGISTE = 10;//请重新注册
		public static final int SERVICE_CONFIRM_REG = 11;//确认注册
		public static final int LOGIN_PLEASE_REGIST = 12;// 用户没有登录
		public static final int SERVICE_NOT_FOUND_CONNECTION_ID = 13;// 没有找到链接
		public static final int LOGIN_FAILURE = -14;// 登录失败
		public static final int LOGIN_REFUSEDPROLOGIN = -15;// 拒绝登录，请漫游
		public static final int LOGIN_INVALID_RELOGIN_COMMOND = -20;//需要重新登陆
		public static final int INTERFACE_OPERATOR_BUSY = -200;//系统忙
		public static final int INTERFACE_OPERATOR_BLOCKED = -201;//系统忙
	}
	/**
	 * 该类用于通知前端客户端，服务器端数据状态已被修改，要重新登录软件
	 * @author 陈文超
	 * @date Oct 16, 2015 5:19:26 PM
	 */
	public static enum LogInEnum {
		SystemPara_UP("1"), // 系统参数被修改
		RoleOrOper_UP("2"), // 用户角色和权限被修改
		UserStatus_UP("3"), // 用户状态被修改
		WriteOff_UP("4"), // 用户注销被修改
		DEPT_DOWN("5"), // 您所在门店已被管理员关停，如有疑问请联系门店管理员！
		MAC_CHANGE("6"), // 您所在门店路由地址已经更改，请联系门店管理员后重新登录！
		VERSION_CHANGE("7"), // 您门店使用的软件已经更换版本，请重新登录后体验！
		DEPT_FORMALLY("8"), // 您的门店已转为正式门店，请重新登录后体验！
		DEPT_CHANGE("9"), // 您所在门店已被管理员调动，请重新登录！
		AREA_CHANGE("10"), // 您门店所在大区已被管理员调动，请重新登录！
		UA_ID_CHANGE("11"), // 您的资金账户已被他人绑定，若不是本人操作请联系客服！
		LEAVE_DEPT("12"), // 您所在已被管理员从门店注销，如有疑问请联系客服！
		MODIFY_PWD("101");// 修改密码配合移动踢人
		String value;
		LogInEnum(String value) {
			this.value = value;
		}
		public String getValue() {
			return value;
		}
		public void setValue(String value) {
			this.value = value;
		}
	}

	/**
	 * IP电话拨打调用的来源
	 * @author 陈文超
	 * @date 2016年6月8日 下午4:59:34
	 */
	public static class IpCallPhoneSource {
		/**
		 * IP电话拨打应用来源
		 * 好房通ERP
		 * 0：ERP
		 */
		public final static String DIC_IP_CALL_LOG_SOURCE_0 = "0";
		/**
		 * 好房A+
		 * 1：APP
		 */
		public final static String DIC_IP_CALL_LOG_SOURCE_1 = "1";
		/**
		 * 优优好房
		 * 2：UUAPP
		 */
		public final static String DIC_IP_CALL_LOG_SOURCE_2 = "2";
	}

	/**
	 * 优优好房的委托信息状态
	 */
	public static class VIP_QUEUE_STATUS {
//		状态(0无效1正常,2成交)征对求购求租,出售出租暂未使用
		/**
		 * 委托状态-无效-值：0
		 */
		public final static Integer DIC_VIP_QUEUE_STATUS_CANCEL_0 = 0;
		/**
		 * 委托状态-正常-值：1
		 */
		public final static Integer DIC_VIP_QUEUE_STATUS_NORMAL_1 = 1;
		/**
		 * 委托状态-成交-值：2
		 */
		public final static Integer DIC_VIP_QUEUE_STATUS_DEAL_2 = 2;

	}

	/**
	 * 优优好房的委托信息经纪人接单状态
	 */
	public static class WF_PUSH_LOG_PUSH_STATUS {
//		推送状态（需求：1正常2接单3带看4成交0拒绝）(房源：2正常3已联系4转入系统5同意房勘6转入系统7房勘完成0拒绝)
		/**
		 *客源 推送状态-正常-值：1
		 */
		public final static Byte DIC_CUST_WF_PUSH_LOG_PUSH_STATUS_NORMAL_1 = 1;
		/**
		 *客源 推送状态-接单-值：2
		 */
		public final static Byte DIC_CUST_WF_PUSH_LOG_PUSH_STATUS_NORMAL_2 = 2;
		/**
		 *客源 推送状态-带看-值：3
		 */
		public final static Byte DIC_CUST_WF_PUSH_LOG_PUSH_STATUS_SEE_3 = 3;
		/**
		 *客源 推送状态-成交-值：4
		 */
		public final static Byte DIC_CUST_WF_PUSH_LOG_PUSH_STATUS_DEAL_4 = 4;
		/**
		 *客源 推送状态-拒绝-值：0
		 */
		public final static Byte DIC_CUST_WF_PUSH_LOG_PUSH_STATUS_REJECT_0 = 0;
		/**
		 *房源 推送状态-正常(接单)-值：2
		 */
		public final static Byte DIC_HOUSE_WF_PUSH_LOG_PUSH_STATUS_NORMAL_2 = 2;
		/**
		 *房源 推送状态-联系 -值：3
		 */
		public final static Byte DIC_HOUSE_WF_PUSH_LOG_PUSH_STATUS_CONTACT_3 = 3;
		/**
		 *房源 推送状态-申请房勘 -值：4
		 */
		public final static Byte DIC_HOUSE_WF_PUSH_LOG_PUSH_STATUS_APPLY_4 = 4;
		/**
		 *房源 推送状态-同意房勘 -值：5
		 */
		public final static Byte DIC_HOUSE_WF_PUSH_LOG_PUSH_STATUS_AGREE_5 = 5;
		/**
		 *房源 推送状态-转入系统 -值：6
		 */
		public final static Byte DIC_HOUSE_WF_PUSH_LOG_PUSH_STATUS_TRANS_6 = 6;
		/**
		 *房源 推送状态-房勘完成 -值：7
		 */
		public final static Byte DIC_HOUSE_WF_PUSH_LOG_PUSH_STATUS_KAN_FINISH_7 = 7;
		/**
		 *房源 推送状态-拒绝 -值：0
		 */
		public final static Byte DIC_HOUSE_WF_PUSH_LOG_PUSH_STATUS_REJECT_0 = 0;
	}

	/**
	 * 优优好房的委托信息需求状态
	 * 需求状态（0取消、1正常、2成交）
	 */
	public static class WF_PUSH_LOG_REQUIRE_STATUS {
		/**
		 * 需求状态-取消-值：0
		 */
		public final static Integer DIC_VIP_QUEUE_STATUS_CANCEL_0 = 0;
		/**
		 * 需求状态-正常-值：1
		 */
		public final static Integer DIC_VIP_QUEUE_STATUS_NORMAL_1 = 1;
		/**
		 * 需求状态-成交-值：2
		 */
		public final static Integer DIC_VIP_QUEUE_STATUS_DEAL_2 = 2;

	}

	/**
	 * @TODO 帖子类型
	 * @author lcb
	 *
	 */
	public static class BULLETIN_BOUND {
		// 0:本店信息
		public final static Integer BULLETIN_BOUND_0 = 0;
		// 1:公司信息
		public final static Integer BULLETIN_BOUND_1 = 1;
		// 2:同城交流
		public final static Integer BULLETIN_BOUND_2 = 2;
		// 3:经纪天地
		public final static Integer BULLETIN_BOUND_3 = 3;
		// 4:商家信息
		public final static Integer BULLETIN_BOUND_4 = 4;
		// 5:业务知识
		public final static Integer BULLETIN_BOUND_5 = 5;
		// 6:开单秘籍
		public final static Integer BULLETIN_BOUND_6 = 6;
		// 7:加盟圈
		public final static Integer BULLETIN_BOUND_7 = 7;
		// 8:成交喜报(审核通过)
		public final static Integer BULLETIN_BOUND_8 = 8;
	}
	/* 数据字典PRICE_UNIT_ALL出售单位 */
	/** 万元:14 */
	public final static Byte DIC_PRICE_UNIT_ALL_SALE = 14;
	
	/* 数据字典PRICE_UNIT租金单位 */
	/** 元/月 值:1 */
	public final static Byte DIC_PRICE_UNIT_PERMONTH = 1;
	/** 元/天 值:2 */
	public final static Byte DIC_PRICE_UNIT_PERDAY = 2;
	/** 元/平米*月 值:3 */
	public final static Byte DIC_PRICE_UNIT_PERCENTIARE = 3;
	/** 元/平米*天 值:4 */
	public final static Byte DIC_PRICE_UNIT_PERDAYCENT = 4;
	/** 元/年 值:5 */
	public final static Byte DIC_PRICE_UNIT_PERYEAR = 5;

	/** 非真房源 值：0 */
	public final static Byte DIC_INFO_TRUE_INFO_FLAG_0 = 0;
	/** 真房源 值：1 */
	public final static Byte DIC_INFO_TRUE_INFO_FLAG_1 = 1;
	/** 被投诉的真房源 值：2 */
	public final static Byte DIC_INFO_TRUE_INFO_FLAG_2 = 2;
	
	/**
	 * 房源图片的最大值：15
	 */
	public final static Integer HOUSE_PHOTO_MAX = 20;

	/*数据字典KEY_STATUS*/
	/**钥匙状态：借出 值:1*/
	public final static Integer DIC_KEY_STATUS_LEND = 1;
	/**钥匙状态：存档 值:2*/
	public final static Integer DIC_KEY_STATUS_ARCHIVE = 2;
	/**钥匙状态：注销 值:3*/
	public final static Integer DIC_KEY_STATUS_DELETE = 3;
	
	/**钥匙状态：提交 值:4*/
	public final static Integer KEY_STATUS_SUBMIT = 4;
	
	/**钥匙状态：扣押金 值:5*/
	public final static Integer KEY_STATUS_DEPOSIT = 5;
	/**trackClassic 业务跟进*/
	public final static String DIC_TRACKCLASSIC_1 = "[ 业务跟进 ]";
	/**trackClassic 业务变更*/
	public final static String DIC_TRACKCLASSIC_2 = "[ 房源移交 ]";
	/**trackClassic 自动审核*/
	public final static String DIC_TRACKCLASSIC_3 = "[ 自动审核 ]";
	/**trackClassic 业务申请*/
	public final static String DIC_TRACKCLASSIC_4 = "[ 业务申请 ]";
	/**trackClassic 人工审核*/
	public final static String DIC_TRACKCLASSIC_5 = "[ 人工审核 ]";
	/**trackClassic 核心信息*/
	public final static String DIC_TRACKCLASSIC_6 = "[ 查看电话 ]";
	/**trackClassic 数据修改*/
	public final static String DIC_TRACKCLASSIC_7 = "[ 修改信息 ]";
	/**trackClassic 房源登记*/
	public final static String DIC_TRACKCLASSIC_8 = "[ 房源登记 ]";
	/**trackClassic 客源登记*/
	public final static String DIC_TRACKCLASSIC_9 = "[ 客源登记 ]";
	/**trackClassic 图片管理*/
	public final static String DIC_TRACKCLASSIC_10 = "[ 图片管理 ]";
	/**trackClassic 业务转换*/
	public final static String DIC_TRACKCLASSIC_11 = "[ 业务转换 ]";
	/**trackClassic 取消委托*/
	public final static String DIC_TRACKCLASSIC_12 = "[ 取消委托 ]";
	/**trackClassic 提交钥匙*/
	public final static String DIC_TRACKCLASSIC_13 = "[ 提交钥匙 ]";
	/**trackClassic 退还钥匙*/
	public final static String DIC_TRACKCLASSIC_14 = "[ 退还钥匙 ]";
	/**trackClassic 优优好房*/
	public final static String DIC_TRACKCLASSIC_15 = "[ 优优好房 ]";
	/**trackClassic 视频管理*/
	public final static String DIC_TRACKCLASSIC_16 = "[ 视频管理 ]";
	/**trackClassic 全景图片*/
	public final static String DIC_TRACKCLASSIC_17 = "[ 图片管理 ]";
	/**trackClassic 房源空看*/
	public final static String DIC_TRACKCLASSIC_18 = "[ 房源空看 ]";
	/**trackClassic 普通跟进*/
	public final static String DIC_TRACKCLASSIC_19 = "[ 普通跟进 ]";
	/**trackClassic 普通跟进*/
	public final static String DIC_TRACKCLASSIC_20 = "[ 委托到期 ]";
	/**trackClassic 重盘提醒*/
	public final static String DIC_TRACKCLASSIC_21 = "[ 重盘提醒 ]";
	/**trackClassic 去电*/
	public final static String DIC_TRACKCLASSIC_22 = "[ 去电 ]";
	/**trackClassic 面谈*/
	public final static String DIC_TRACKCLASSIC_23 = "[ 面谈 ]";
	/**trackClassic 店长回访*/
	public final static String DIC_TRACKCLASSIC_24 = "[ 店长回访 ]";
	/**trackClassic 约看*/
	public final static String DIC_TRACKCLASSIC_25 = "[ 约看 ]";
    /**trackClassic 合作带看*/
	public final static String DIC_TRACKCLASSIC_26 = "[ 合作带看 ]";
	/**trackClassic 查看底价*/
	public final static String DIC_TRACKCLASSIC_27 = "[ 查看底价 ]";
	/**trackClassic 文件管理*/
	public final static String DIC_TRACKCLASSIC_28 = "[ 文件管理 ]";
	/**trackClassic 撤销房勘*/
	public final static String DIC_TRACKCLASSIC_29 = "[ 撤销房勘 ]";
	/**trackClassic 钥匙注销*/
	public final static String DIC_TRACKCLASSIC_30 = "[ 钥匙注销 ]";
	/**trackClassic 删除VR*/
	public final static String DIC_TRACKCLASSIC_31 = "[ 删除VR ]";
	/**trackClassic 删除图片*/
	public final static String DIC_TRACKCLASSIC_32 = "[ 删除图片 ]";
	/**trackClassic 删除视频*/
	public final static String DIC_TRACKCLASSIC_33 = "[ 删除视频 ]";
	/**trackClassic 钥匙信息修改*/
	public final static String DIC_TRACKCLASSIC_34 = "[ 钥匙信息修改 ]";

	/**taskTitle [ 申请变更状态 ]*/
	public final static String DIC_TASK_SUBJECT_HEAD_1 = "[ 申请变更状态 ]";
	/**taskTitle [ 申请委托审核 ]*/
	public final static String DIC_TASK_SUBJECT_HEAD_2 = "[ 申请委托审核 ]";
	/**taskTitle [ 申请房勘审核 ]*/
	public final static String DIC_TASK_SUBJECT_HEAD_3 = "[ 申请房勘审核 ]";
	/**taskTitle [ 申请带看审核 ]*/
	public final static String DIC_TASK_SUBJECT_HEAD_4 = "[ 申请带看审核 ]";
	/**taskTitle [ 租期提醒 ]*/
	public final static String DIC_TASK_SUBJECT_HEAD_5 = "[ 租期提醒 ]";
	/**taskTitle [ 申请房勘审核 ]*/
	public final static String DIC_TASK_SUBJECT_HEAD_6 = "[ 申请房勘审核 ]";
	/**taskTitle [ 申请借用钥匙 ]*/
	public final static String DIC_TASK_SUBJECT_HEAD_7 = "[ 申请借用钥匙 ]";
	/**taskTitle [ 申请归还钥匙 ]*/
	public final static String DIC_TASK_SUBJECT_HEAD_8 = "[ 申请归还钥匙 ]";
	/**taskTitle [ 跟进提醒 ]*/
	public final static String DIC_TASK_SUBJECT_HEAD_9 = "[ 投诉通知 ]";
	/**taskTitle [ 人工审核 ]*/
	public final static String DIC_TASK_SUBJECT_HEAD_10 = "[ 人工审核 ]";
	/**taskTitle [ 成交提醒 ]*/
	public final static String DIC_TASK_SUBJECT_HEAD_11 = "[ 成交提醒 ]";
	/**taskTitle [ 申诉提醒 ]*/
	public final static String DIC_TASK_SUBJECT_HEAD_12 = "[ 申诉提醒 ]";
	/**taskTitle [ 申请提交钥匙 ]*/
	public final static String DIC_TASK_SUBJECT_HEAD_13 = "[ 申请提交钥匙 ]";
	/**taskTitle [ 申请退还钥匙 ]*/
	public final static String DIC_TASK_SUBJECT_HEAD_14 = "[ 申请退还钥匙 ]";
	/**taskTitle [ 成交提醒 ]*/
	public final static String DIC_TASK_SUBJECT_HEAD_15 = "[ 成交提醒 ]";
	/**taskTitle [ 申请查看信息 ]*/
	public final static String DIC_TASK_SUBJECT_HEAD_16 = "[ 申请查看信息 ]";
	/**taskTitle [ 申请议价审核 ]*/
	public final static String DIC_TASK_SUBJECT_HEAD_17 = "[ 申请议价审核 ]";
	/**taskTitle [ 查看记录 ]*/
	public final static String DIC_TASK_SUBJECT_HEAD_18 = "[ 查看记录 ]";
	/**taskTitle [ 注销提醒 ]*/
	public final static String DIC_TASK_SUBJECT_HEAD_19 = "[ 注销提醒 ]";
	/**taskTitle [ 审核任务失效 ]*/
	public final static String DIC_TASK_SUBJECT_HEAD_20 = "[ 审核任务失效 ]";
	/**taskTitle [ 优优好房 ]*/
	public final static String DIC_TASK_SUBJECT_HEAD_21 = "[ 优优好房 ]";
	/**taskTitle [ 申请加密审核 ]*/
	public final static String DIC_TASK_SUBJECT_HEAD_22 = "[ 申请加密审核 ]";
	/**taskTitle [ 申请推荐审核 ]*/
	public final static String DIC_TASK_SUBJECT_HEAD_23 = "[ 申请推荐审核 ]";
	/**taskTitle [ 广告房源  ]*/
	public final static String DIC_TASK_SUBJECT_HEAD_24 = "[ 广告房源 ]";
	/**taskTitle [ 投诉提醒 ]*/
	public final static String DIC_TASK_SUBJECT_HEAD_25 = "[ 投诉提醒 ]";
	/**taskTitle [ 权证提醒 ]*/
	public final static String DIC_TASK_SUBJECT_HEAD_26 = "[ 权证提醒 ]";
	/**taskTitle [ 律师审核 ]*/
	public final static String DIC_TASK_SUBJECT_HEAD_27 = "[ 律师审核 ]";
	/**taskTitle [ 合同修改 ]*/
	public final static String DIC_TASK_SUBJECT_HEAD_28 = "[ 合同修改 ]";
    /**taskTitle [ 注销审核 ]*/
    public final static String DIC_TASK_SUBJECT_HEAD_29 = "[ 注销审核 ]";
	/**taskTitle [ 变更楼盘 ]*/
	public final static String DIC_TASK_SUBJECT_HEAD_30 = "[ 变更楼盘 ]";
	/**taskTitle [ 核心信息 ]*/
	public final static String DIC_TASK_SUBJECT_HEAD_31 = "[ 核心信息]";
	/*数据字典CASE_TYPE*/
	/**跟踪类别：出售房源 1*/
	public final static Integer DIC_CASE_TYPE_SALE_FUN = 1;
	/**跟踪类别：出租房源 2*/
	public final static Integer DIC_CASE_TYPE_LEASE_FUN = 2;
	/**跟踪类别：求购客户 3*/
	public final static Integer DIC_CASE_TYPE_BUY_CUST = 3;
	/**跟踪类别：求租客户 4*/
	public final static Integer DIC_CASE_TYPE_RENT_CUST = 4;
	/**类型：搜搜砖铺*/
	public final static Integer DIC_CASE_TYPE_SHOP_MAIN = 5;
	/**类型：搜搜合租*/
	public final static Integer DIC_CASE_TYPE_HEZU = 6;
	/**跟踪类别：出售合同 101*/
	public final static Integer DIC_CASE_TYPE_SALE_DEAL = 101;
	/**跟踪类别：出租合同 102*/
	public final static Integer DIC_CASE_TYPE_RENT_DEAL = 102;
	/**类型：金融 103*/
	public final static Integer DIC_CASE_TYPE_FINANCIAL = 103;
	/*数据字典EXAMIN_RESULT任务结果*/
	/**同意*/
	public final static Byte DIC_EXAMIN_RESULT_AGREEN = 1;
	/**不同意*/
	public final static Byte DIC_EXAMIN_RESULT_DISAGREEN = 2;

	/**未审核 值：0*/
	public final static Byte DIC_DEAL_COMPLETE_INIT = 0;//未审核
	/**初审核通过 值：1*/
	public final static Byte DIC_DEAL_FIRSTCOMPLETE_OK = 1;//审核通过 更改为初审 2016-05-06 flj
	/**复审通过 值：2*/
	public final static Byte DIC_DEAL_REPEATCOMPLETE_OK = 2;//审核不通过 更改为复审 2016-05-06 flj
	/**作废 值：3*/
	public final static Byte DIC_DEAL_COMPLETE_FAIL = 3;//审核不通过 更改为复审 2016-05-06 flj
	
	/* 数据字典DEAL_STATUS */
	/** 未履行 值: 0 */
	public final static Byte DIC_DEAL_STATUS_NODO = 0;
	public final static String DIC_DEAL_STATUS_NODODIC_CN_MSG = "未履行";
	/** 履行中 值:1 */
	public final static Byte DIC_DEAL_STATUS_DOING = 1;
	public final static String DIC_DEAL_STATUS_DOINGDIC_CN_MSG = "履行中";
	/** 已办结 值:2 */
	public final static Byte DIC_DEAL_STATUS_TRANSACT = 2;
	public final static String DIC_DEAL_STATUS_TRANSACTDIC_CN_MSG = "已办结";
	/** 未办结 值:3 */
	public final static Byte DIC_DEAL_STATUS_NOTTRANSACT = 3;
	/** 未作废 值：4 */
	public final static Byte DIC_DEAL_COMPLETE_NOTFAIL = 4;// 未作废2016-05-06flj
	/** 合同状态 5：已撤销 */
	public final static Byte DIC_DEAL_STATUS_CLOSE = 5;
	/** 合同状态 6：未结算 */
	public final static Byte DIC_DEAL_STATUS_NOTDEAL = 6;
	/** 尚未分配:0 */
	public final static Byte DIC_DEAL_STATUS_NOTASSIGNED = 0;
	/** 待结算 值:1 */
	public final static Byte DIC_DEAL_STATUS_WAITDEAL = 1;// 以前待结算值为3，在2016-05-23这期需求里面待结算值改为1，已结算改为2，新增尚未分配状态，合同创建的时候默认状态为尚未分配
	/** 已结算 值:2 */
	public final static Byte DIC_DEAL_STATUS_DEALOVER = 2;// 以前已结算为4，同上改为2.

	/*数据字典HOUSE_SOURCE*/
	/**房源来源：到店 值:1*/
	public final static Byte DIC_HOUSE_SOURCE_DIAN = 1;
	/**房源来源：开发 值:2*/
	public final static Byte DIC_HOUSE_SOURCE_DEVELOP = 2;
	/**房源来源：搜搜 值:3*/
	public final static Byte DIC_HOUSE_SOURCE_SOSO = 3;
	/**房源来源：发发 值:4*/
	public final static Byte DIC_HOUSE_SOURCE_FAFA = 4;
	/**房源来源：分配 值:5*/
	public final static Byte DIC_HOUSE_SOURCE_ALLOT = 5;
	/**房源来源：间接 值:6*/
	public final static Byte DIC_HOUSE_SOURCE_INDIRECT = 6;
	/**房源来源：现收 值:7*/
	public final static Byte DIC_HOUSE_SOURCE_CASH = 7;
	/**房源来源：搜房网 值:8*/
	public final static Byte DIC_HOUSE_SOURCE_SOUFUN_FAFA = 8;
	/**房源来源：房东网 值:9*/
	public final static Byte DIC_HOUSE_SOURCE_FUNDON_FAFA = 9;
	/**房源来源：赶集网 值:10*/
	public final static Byte DIC_HOUSE_SOURCE_GANJI_FAFA = 10;
	/**房源来源：安居客 值:11*/
	public final static Byte DIC_HOUSE_SOURCE_ANJUKE_FAFA = 11;
	/**房源来源：58同城 值:12*/
	public final static Byte DIC_HOUSE_SOURCE_58_FAFA = 12;
	/**房源来源：好房在线 值:13*/
	public final static Byte DIC_HOUSE_SOURCE_HFZX = 13;
	/**房源来源：网络来源 用于鸿基 值:14*/
	public final static Byte DIC_HOUSE_SOURCE_WEB = 14;
	/**房源来源：网络来源 用于赶集推广 值:15*/
	public final static Byte DIC_HOUSE_SOURCE_GANJITUIGUANG_FAFA = 15;
	/**房源来源：优优好房 值:18*/
	public final static Byte DIC_HOUSE_SOURCE_DIDI_HOUSE = 18;
	/**房源来源：物业委托 值:24*/
	public final static Byte DIC_HOUSE_SOURCE_ENTRUST = 24;
	/**房源来源：联卖房源 值:25*/
	public final static Byte DIC_HOUSE_SOURCE_UNION = 25;
	
	/**
	 * 不是YOU+房源 值：0
	 */
	public final static Byte DIC_YOU_SHARE_FLAG_0 = 0;
	/**
	 * 标记为YOU+房源 值：1
	 */
	public final static Byte DIC_YOU_SHARE_FLAG_1 = 1;
	/** 钥匙状态 借出状态 1 */
	public final static Byte KEY_STATUS_BORROWOUT = 1;
	/** 钥匙状态 存档状态 2 */
	public final static Byte KEY_STATUS_HOLDON = 2;
	
	/**
	 * 数据的来源 HOUSE_SOURCE_WAY _ 1：本地 2：发发关联 3：发发转入
	 */
	/** 本地 值：1 */
	public final static Byte DIC_FAFA_HOUSE_SOURCE_WAY_1 = 1;
	/** 发发关联 值：2 */
	public final static Byte DIC_FAFA_HOUSE_SOURCE_WAY_2 = 2;
	/** 发发转入 值：3 */
	public final static Byte DIC_FAFA_HOUSE_SOURCE_WAY_3 = 3;

	/**
	 * 项目日志标示
	 *
	 * @author 陈文超
	 * @date 2017年6月1日 下午2:30:27
	 */
	public static class AccessLogProject {
		/**
		 * ERP日志
		 **/
		public static final int ACCESS_LOG_1 = 1;
		/**
		 * CRM 日志
		 **/
		public static final int ACCESS_LOG_2 = 2;
		/**
		 * YOUYOU日志
		 **/
		public static final int ACCESS_LOG_3 = 3;
		/**
		 * admin日志
		 */
		public static final int ACCESS_LOG_4 = 4;
		/**
		 * 新版掌通日志
		 */
		public static final int ACCESS_LOG_5 = 5;
		/**houseWeb日志**/
		public static final int ACCESS_LOG_6 = 6;
		/**newBuildWeb日志**/
		public static final int ACCESS_LOG_7 = 7;
	}
	/*上班类型*/
	/**
	 * 正常上班
	 */
	public final static String DIC_WORK_TYPE_ONWORK = "1";
	/**
	 * 上班(值)
	 */
	public final static String DIC_WORK_TYPE_DUTYWORK = "2";
	/**
	 * 上班(晚)
	 */
	public final static String DIC_WORK_TYPE_LATEWORK = "3";
	/**
	 * 正常下班
	 */
	public final static String DIC_WORK_TYPE_FREE = "4";
	/**
	 * 下班(值)
	 */
	public final static String DIC_WORK_TYPE_DUTYFREE = "5";
	/**
	 * 下班(早)
	 */
	public final static String DIC_WORK_TYPE_EARYFREE = "6";
	/*上班状态*/
	/**
	 * 准时
	 */
	public final static String DIC_WORK_STATUS_ONWORK = "1";
	/**
	 * 迟到
	 */
	public final static String DIC_WORK_STATUS_DUTYWORK = "2";
	/**
	 * 早退
	 */
	public final static String DIC_WORK_STATUS_LATEWORK = "3";
	/**
	 * 旷工
	 */
	public final static String DIC_WORK_STATUS_FREE = "4";
	/**
	 * 病假
	 */
	public final static String DIC_WORK_STATUS_DUTYFREE = "5";
	/**
	 * 事假
	 */
	public final static String DIC_WORK_STATUS_EARYFREE = "6";
	/**
	 * 休假
	 */
	public final static String DIC_WORK_STATUS_VACATION = "7";

	public static final Map<Integer,String> EXCEPTION_STATUS_NAME_MAP = new HashMap<Integer,String>();
	static{
		EXCEPTION_STATUS_NAME_MAP.put(106004, "数据错误");
		EXCEPTION_STATUS_NAME_MAP.put(101001, "标题字数不足");
		EXCEPTION_STATUS_NAME_MAP.put(101002, "标题字数过长");
		EXCEPTION_STATUS_NAME_MAP.put(101003, "非法标题");
		EXCEPTION_STATUS_NAME_MAP.put(101004, "数据错误");
		EXCEPTION_STATUS_NAME_MAP.put(101005, "标题含有数字");
		EXCEPTION_STATUS_NAME_MAP.put(101006, "标题含有电话");
		EXCEPTION_STATUS_NAME_MAP.put(101007, "房源描述超长");
		EXCEPTION_STATUS_NAME_MAP.put(101008, "房源描述字数不足");
		EXCEPTION_STATUS_NAME_MAP.put(101009, "房源描述含有数字");
		EXCEPTION_STATUS_NAME_MAP.put(101010, "房源描述含有电话");
		EXCEPTION_STATUS_NAME_MAP.put(101011, "非法房源描述");
		EXCEPTION_STATUS_NAME_MAP.put(101012, "户型错误(室)");
		EXCEPTION_STATUS_NAME_MAP.put(101013, "户型错误(室)");
		EXCEPTION_STATUS_NAME_MAP.put(101014, "户型错误(厅)");
		EXCEPTION_STATUS_NAME_MAP.put(101015, "户型错误(厅)");
		EXCEPTION_STATUS_NAME_MAP.put(101016, "户型错误(卫)");
		EXCEPTION_STATUS_NAME_MAP.put(101017, "户型错误(卫)");
		EXCEPTION_STATUS_NAME_MAP.put(101018, "重复房源(标题重复)");
		EXCEPTION_STATUS_NAME_MAP.put(101019, "重复房源(其他信息重复)");
		EXCEPTION_STATUS_NAME_MAP.put(106010, "验证码错误");

		EXCEPTION_STATUS_NAME_MAP.put(1010190, "验证码错误");
		EXCEPTION_STATUS_NAME_MAP.put(101999, "验证码错误");
		EXCEPTION_STATUS_NAME_MAP.put(1010000, "验证码错误");
	}

	/**
	 * 用户提示性消息记录表--admin.FUN_USER_MESSAGE
	 * 消息所属模块
	 *
	 * @author 张宏利
	 * @since 2016年9月2日
	 */
	public static class MsgModule {
		/**房源**/
		public final static Integer HOUSE = 1;
		/**客源**/
		public final static Integer CUST = 2;
		/**城市公盘**/
		public final static Integer YOUJIA = 3;
		/**搜搜推送**/
		public final static Integer SOSO_PUSH = 4;
	}

	/**
	 * 用户提示性消息记录表--admin.FUN_USER_MESSAGE
	 * 消息所属模块的详细类型
	 *
	 * @author 张宏利
	 * @since 2016年9月2日
	 */
	public static class MsgModuleType {
		/**强制写跟进**/
		public final static Integer WRITE_TRACK_BY_VIEW = 1;
		/**IP拨号**/
		public final static Integer IP_CALL = 2;
		/**查看电话**/
		public final static Integer VIEW_PHONE = 3;
		/**写跟进**/
		public final static Integer WRITE_TRACK = 4;
		/**修改信息**/
		public final static Integer UPDATE_HOUSE_CUST_INFO = 5;
		/**上传图片**/
		public final static Integer UPLOAD_PHOTO = 6;
		/**删除图片**/
		public final static Integer DELETE_PHOTO = 7;
		/**注销房源**/
		public final static Integer WRITEOFF_HOUSE_CUST = 8;
		/**创建合同的房源成交**/
		public final static Integer DEAL_HOUSE_CUST_BY_CONTRACT = 9;
		/**收藏的房源被注销**/
		public final static Integer FAVORITE_HOUSE_CUST_WRITEOFF = 10;
		/**收藏的房源被成交**/
		public final static Integer FAVORITE_HOUSE_CUST_DEAL = 11;
		/**提交钥匙**/
		public final static Integer SUBMIT_KEY = 12;
		/**优家房源被投诉**/
		public final static Integer YOU_HOUSE_CUST_COMPLAINED = 13;
		/**优家我参与的房源下架**/
		public final static Integer YOU_INVOLVEMENT_WRITEOFF = 14;
		/**优家新增的房客源**/
		public final static Integer YOU_HOUSE_CUST_NEW = 15;
		/**搜搜出售推送**/
		public final static Integer SOSO_PUSH_SALE = 16;
		/**搜搜出租推送**/
		public final static Integer SOSO_PUSH_LEASE = 17;
		/**搜搜转铺推送**/
		public final static Integer SOSO_PUSH_ZHUANPU = 18;
		/**搜搜合租推送**/
		public final static Integer SOSO_PUSH_HEZU = 19;
		/**搜搜求购推送**/
		public final static Integer SOSO_PUSH_BUY = 20;
		/**搜搜求租推送**/
		public final static Integer SOSO_PUSH_RENT = 21;
	}

	public final static String[] decodeFieldsCN = new String[]{
			"微信",
			"电话",
			"业主",
			"身份证",
			"栋座",
			"栋",
			"单元",
			"楼层",
			"楼",
			"号",
			"备注",
			"客户",
			"住址",
			"姓名",
			"共有人电话",
			"共有人身份证",
			"证件号",
			"证件类型",
			"共有人证件号",
			"共有人证件类型"
	};
	public final static String[] decodeFields = new String[] { "CELL_PHONE", "JOINT_CELL_PHONE", "ID_CARD", "SALE_ROOF", "SALE_UNIT", "SALE_NUM",
	"LEASE_ROOF", "LEASE_UNIT", "LEASE_NUM", "UNIT_FLOOR", };

	/**注销房客源的查看，不参与统计 值:0 */
	public final static Byte DIC_VIEW_STATUS_WRITEOFF = 0;
	/**有效查看，参与统计 值:1 */
	public final static Byte DIC_VIEW_STATUS_AVAILABLE = 1;
	/**task type flag [ 系统用户ID 统一使用999 包含：系统任务、系统跟进、系统留言等] */
	public final static Integer DIC_SYSTEM_USERID_999 = 999;
	/**优优好房用户ID 998 */
	public final static Integer DIC_SYSTEM_USERID_998 = 998;
	/**优优好房用户名 998*/
	public final static String DIC_SYSTEM_USERNAME_998 = "优优好房";
	/**系统默认用户名[ 公告不存在的用户名、 ]**/
	public final static String DIC_SYSTEM_USERNAME = "好房达人";

	/**房源数据的重复判断 ERP SYS_PARA 表中的参数*/
	/**允许录入重复数据，值：0 */
	public static final String DIC_SYSPARA_HOUSE_REPEAT_RULE_0 = "0";
	/**不允许录入地址重复的房源数据，值：1 */
	public static final String DIC_SYSPARA_HOUSE_REPEAT_RULE_1 = "1";
	/**不允许录入地址和电话同时重复的房源，值：2 */
	public static final String DIC_SYSPARA_HOUSE_REPEAT_RULE_2 = "2";

	/**选择队列，1=root*/
	public final static Integer DIC_JMS_SEND_PRODUCER_1 = 1;
	/**选择队列，2=软件购买队列*/
	public final static Integer DIC_JMS_SEND_PRODUCER_2 = 2;
	/**选择队列，3=延迟支付队列*/
	public final static Integer DIC_JMS_SEND_PRODUCER_3 = 3;
	/**选择队列，4=用户相关异步处理*/
	public final static Integer DIC_JMS_SEND_PRODUCER_4 = 4;
	/**选择队列，5=经济人跑分队列*/
	public final static Integer DIC_JMS_SEND_PRODUCER_5 = 5;

	/**代表是鸿基公司模式的公司 值为0，其他不管。最初该需求为鸿基公司定制，故以此命名。*/
	public final static String DIC_IS_HONGJI_COMP_MODEL = "0";
	public final static String DIC_IS_KEWEI_COMP_MODEL = "2";

	/** 房源相关人类型 相关人类型，1=所属人 2=接盘人 3=钥匙 4=房勘人 5=委托人 */
	public final static Integer HOUSE_RELATIVE_PEOPLE_TYPE_1 = 1;
	/** 房源相关人类型 相关人类型，1=所属人 2=售接盘人 3=钥匙 4=房勘人 5=委托人 */
	public final static Integer HOUSE_RELATIVE_PEOPLE_TYPE_2 = 2;
	/** 房源相关人类型 相关人类型，1=所属人 2=售接盘人 3=钥匙 4=房勘人 5=委托人 */
	public final static Integer HOUSE_RELATIVE_PEOPLE_TYPE_3= 3;
	/** 房源相关人类型 相关人类型，1=所属人 2=售接盘人 3=钥匙 4=房勘人 5=委托人 */
	public final static Integer HOUSE_RELATIVE_PEOPLE_TYPE_4 = 4;
	/** 房源相关人类型 相关人类型，1=所属人 2=售接盘人 3=钥匙 4=房勘人 5=委托人 */
	public final static Integer HOUSE_RELATIVE_PEOPLE_TYPE_5 = 5;
	/** 房源相关人类型 相关人类型，1=所属人 2=售接盘人 3=钥匙 4=房勘人 5=委托人 6=议价人 */
	public final static String HOUSE_RELATIVE_PEOPLE_TYPE_6 = "6";
	/** 房源相关人类型 相关人类型，1=所属人 2=售接盘人 3=钥匙 4=房勘人 5=委托人 6=议价人 7=楼盘责任人 */
	public final static Integer HOUSE_RELATIVE_PEOPLE_TYPE_7 = 7;
	/*数据映射日期*/
	/**全部 值：0*/
	public final static String DIC_DATE_SEARCH_TYPE_ALL = "0";
	/**一天 值：1*/
	public final static String DIC_DATE_SEARCH_TYPE_DAY = "1";
	/**一周 值：2*/
	public final static String DIC_DATE_SEARCH_TYPE_WEEK = "2";
	/**一月 值：3*/
	public final static String DIC_DATE_SEARCH_TYPE_MONTH = "3";
	/**一季 值：4*/
	public final static String DIC_DATE_SEARCH_TYPE_SEASON = "4";
	/**半年 值：5*/
	public final static String DIC_DATE_SEARCH_TYPE_HALFYEAR = "5";
	/**半年前 值：6*/
	public final static String DIC_DATE_SEARCH_TYPE_BEFORE_HALFYEAR = "6";
	/**一年 值：7*/
	public final static String DIC_DATE_SEARCH_TYPE_YEAR = "7";
	/**一年前 值：8*/
	public final static String DIC_DATE_SEARCH_TYPE_BEFORE_YEAR = "8";
	/**两年前 值：9*/
	public final static String DIC_DATE_SEARCH_TYPE_BEFORE_TWOYEAR = "9";
	/**今天 值：10*/
	public final static String DIC_DATE_SEARCH_TYPE_TODAY = "10";
	/**昨天 值:11*/
	public final static String DIC_DATE_SEARCH_TYPE_YESTERDAY = "11";
	/**本周 值:12*/
	public final static String DIC_DATE_SEARCH_TYPE_BENWEEK = "12";
	/**本月 值:13*/
	public final static String DIC_DATE_SEARCH_TYPE_BENMONTH = "13";
	/**本季 值：14*/
	public final static String DIC_DATE_SEARCH_TYPE_BENSEASON = "14";
	/**三天内 值：15*/
	public final static String DIC_DATE_SEARCH_TYPE_THREEDAYS = "15";
	/**
	 * 房源的地址判断重复逻辑 所以的字母均转换成大写 例如： a01 转换成 A01 然后作为 数字来判断，最后的判断结果 a01 = A01 =
	 * 101 栋的长度补充：1 = 01 = 001 = 0001= 00001 最长5位 2015-12-25以前的楼盘栋座规则是3-2-2-4
	 * 2015-12-25今天修改楼盘栋座规则为5-2-2-5
	 */
	/** 栋的判断重复 字母和数字长度控制 5 */
	public final static int DIC_ROOF_REPEAT_LENGTH_LIMIT = 5;
	/** 单元的判断重复 字母和数字长度控制 4 */
	public final static int DIC_UNIT_REPEAT_LENGTH_LIMIT = 4;
	/** 楼层的判断重复 字母和数字长度控制 2 */
	public final static int DIC_FLOOR_REPEAT_LENGTH_LIMIT = 2;
	/** 房号的判断重复 字母和数字长度控制 5 */
	public final static int DIC_NUM_REPEAT_LENGTH_LIMIT = 5;
	
	/** 优家楼盘资料当前查看状态 1已拨打，绿勾 */
	public final static Integer DIC_YOU_BUILD_VIEW_STATUS_1 = 1;
	/** 优家楼盘资料当前查看状态 2已拨打，红勾 */
	public final static Integer DIC_YOU_BUILD_VIEW_STATUS_2 = 2;
	/** 优家楼盘资料当前查看状态 3已转入系统出售，灰勾 */
	public final static Integer DIC_YOU_BUILD_VIEW_STATUS_3 = 3;
	/** 优家楼盘资料当前查看状态 4已转入系统出租，灰勾 */
	public final static Integer DIC_YOU_BUILD_VIEW_STATUS_4 = 4;


	/**普通合作**/
	public final static Byte DIC_INFO_CITY_SHARE_FLAG_1 = 1;
	/**隐号合作**/
	public final static Byte DIC_INFO_CITY_SHARE_FLAG_2 = 2;
	/**优家普通合作**/
	public final static Byte DIC_INFO_CITY_SHARE_FLAG_3 = 3;
	/** 优家隐号合作 **/
	public final static Byte DIC_INFO_CITY_SHARE_FLAG_4 = 4;
	
	
	/**
	 * 时间考勤结果状态 管理中心，考勤所属模块 0缺卡、1早退、2迟到、3旷工、4正常、5等待打卡、6严重迟到、7早退旷工、8迟到旷工、9事假、10病假
	 *
	 * @author 何明礼
	 * @since 2017年11月29日
	 */
	public static class TimeAttendanceResult {
		/**缺卡**/
		public final static Byte LACK_OF_CARD = 0;
		/**早退**/
		public final static Byte LEAVE_EARLY = 1;
		/**迟到**/
		public final static Byte BE_LATE = 2;
		/**旷工**/
		public final static Byte ABSENTEEISM = 3;
		/**正常**/
		public final static Byte NORMAL = 4;
		/**等待打卡**/
		public final static Byte WAITE_WORK = 5;
		/**严重迟到**/
		public final static Byte BE_LATE_BADLY = 6;
		/**早退旷工**/
		public final static Byte LEAVE_EARLY_ABSENTEEISM = 7;
		/**迟到旷工**/
		public final static Byte BE_LATE_ABSENTEEISM = 8;
		/**事假**/
		public final static Byte COMPASSIONATE_LEAVE = 9;
		/**病假**/
		public final static Byte SICK_LEAVE = 10;
		/**未就绪**/
		public final static Byte NOT_READY  = 11;
		/** 考勤结果对应字典**/
		public final static Map<Byte,String> ATT_RESULT_CN = new HashMap<>();
		/** 考勤结果权重对应字典**/
		public final static Map<Byte,Integer> ATT_RESULT_TRANSFER_WEIGHT = new HashMap<Byte,Integer>();
		/** 考勤结果权重对应字典**/
		public final static Map<String,String> ATT_WEIGHT_SHOW_ORDER = new HashMap<String,String>();
		/** 考勤结果权重对应字典**/
		public final static Map<String,String> ATT_MYSTATICS_SHOW_ORDER = new HashMap<String,String>();

		/**
		 * 打卡结果中文描述
		 */
		public final static Map<Byte, String> ATT_RESULT_DESC = new HashMap<Byte,String>();


		/** 权重对应考勤统计类型**/
		public final static Map<Integer, String> ATT_WEIGHT_MAP_ATT_TYPE = new HashMap<Integer, String>();

		static {
			//考勤结果对应字典
			ATT_RESULT_CN.put(LACK_OF_CARD,"缺卡");
			ATT_RESULT_CN.put(LEAVE_EARLY,"早退");
			ATT_RESULT_CN.put(BE_LATE,"迟到");
			ATT_RESULT_CN.put(ABSENTEEISM,"旷工");
			ATT_RESULT_CN.put(NORMAL,"正常");
			ATT_RESULT_CN.put(WAITE_WORK,"等待打卡");
			ATT_RESULT_CN.put(BE_LATE_BADLY,"严重迟到");
			ATT_RESULT_CN.put(LEAVE_EARLY_ABSENTEEISM,"早退旷工");
			ATT_RESULT_CN.put(BE_LATE_ABSENTEEISM,"迟到旷工");
			ATT_RESULT_CN.put(COMPASSIONATE_LEAVE,"事假");
			ATT_RESULT_CN.put(SICK_LEAVE,"病假");
			ATT_RESULT_CN.put(NOT_READY,"休息");

			//迟到>早退>缺卡>外勤>请假>正常打卡>休息
			ATT_RESULT_TRANSFER_WEIGHT.put(LEAVE_EARLY, 6);
			ATT_RESULT_TRANSFER_WEIGHT.put(ABSENTEEISM, 6);
			ATT_RESULT_TRANSFER_WEIGHT.put(BE_LATE, 6);
			ATT_RESULT_TRANSFER_WEIGHT.put(BE_LATE_BADLY, 6);
			ATT_RESULT_TRANSFER_WEIGHT.put(BE_LATE_ABSENTEEISM, 6);
			ATT_RESULT_TRANSFER_WEIGHT.put(LEAVE_EARLY_ABSENTEEISM, 5);
			ATT_RESULT_TRANSFER_WEIGHT.put(LACK_OF_CARD, 4);
			ATT_RESULT_TRANSFER_WEIGHT.put(Byte.valueOf("36"), 3);//代表外勤，特殊处理，取一个较大值，后期好做中间值的增加
			ATT_RESULT_TRANSFER_WEIGHT.put(COMPASSIONATE_LEAVE, 2);
			ATT_RESULT_TRANSFER_WEIGHT.put(SICK_LEAVE, 2);
			ATT_RESULT_TRANSFER_WEIGHT.put(NORMAL, 1);
			ATT_RESULT_TRANSFER_WEIGHT.put(NOT_READY, 0);

			//出勤天数和迟到早退都属于组合衍生出来的类型，type值尽量与其他的字段分开
			ATT_WEIGHT_MAP_ATT_TYPE.put(12, "出勤天数");
			ATT_WEIGHT_MAP_ATT_TYPE.put(11, "迟到早退");

			ATT_WEIGHT_MAP_ATT_TYPE.put(6, "迟到");
			ATT_WEIGHT_MAP_ATT_TYPE.put(5, "早退");
			ATT_WEIGHT_MAP_ATT_TYPE.put(4, "缺卡");
			ATT_WEIGHT_MAP_ATT_TYPE.put(3, "外勤");
			ATT_WEIGHT_MAP_ATT_TYPE.put(2, "请假");
			ATT_WEIGHT_MAP_ATT_TYPE.put(1, "正常打卡");
			ATT_WEIGHT_SHOW_ORDER.put("1", "1");
			ATT_WEIGHT_SHOW_ORDER.put("11", "2");
			ATT_WEIGHT_SHOW_ORDER.put("4", "3");
			ATT_WEIGHT_SHOW_ORDER.put("3", "4");
			ATT_WEIGHT_SHOW_ORDER.put("2", "5");
			ATT_MYSTATICS_SHOW_ORDER.put("12", "1");
			ATT_MYSTATICS_SHOW_ORDER.put("6", "2");
			ATT_MYSTATICS_SHOW_ORDER.put("5", "3");
			ATT_MYSTATICS_SHOW_ORDER.put("3", "4");
			ATT_MYSTATICS_SHOW_ORDER.put("4", "5");
			ATT_MYSTATICS_SHOW_ORDER.put("21", "6");
			ATT_MYSTATICS_SHOW_ORDER.put("2", "7");
		}
	}
	
	public static class REPEAT_WARM_MESSAGE {
		public final static Map<Integer, String> REPEAT_WARM_MESSAGE_MAP = new HashMap<Integer, String>();
		static {
			REPEAT_WARM_MESSAGE_MAP.put(0, "公司不允许录入重复客源");
			REPEAT_WARM_MESSAGE_MAP.put(1, "战区不允许录入重复客源");
			REPEAT_WARM_MESSAGE_MAP.put(2, "大区不允许录入重复客源");
			REPEAT_WARM_MESSAGE_MAP.put(3, "片区不允许录入重复客源");
			REPEAT_WARM_MESSAGE_MAP.put(4, "本店不允许录入重复客源");
			REPEAT_WARM_MESSAGE_MAP.put(5, "本组不允许录入重复客源");
		}
	}
	
	/**
	 * 能否查看核心信息
	 * @author 张卓
	 *
	 */
	public static class coreInfoStatue {
		/**
		 * 0不能查看
		 */
		public final static String DIC_CAN_SEE_STATUS_0 = "0";
		/**
		 * 1可以查看 
		 */
		public final static String DIC_CAN_SEE_STATUS_1 = "1";
		/**
		 * 2写查看理由
		 */
		public final static String DIC_CAN_SEE_STATUS_2 = "2";
		
		
	}
	
	/**
	 * 发送短信类型
	 * @author 张卓
	 *
	 */
	public static class sendType {
		/**
		 * 发送类型 1：修改手机号获取验证码
		 */
		public final static byte DIC_SEND_TYPE_1 = 1;
		/**
		 * 发送类型 2：修改资金账号获取验证码
		 */
		public final static byte DIC_SEND_TYPE_2 = 2;
		/**
		 * 发送类型 3：通用验证码
		 */
		public final static byte DIC_SEND_TYPE_3 = 3;
		/**
		 * 发送类型 4：委托书验证码
		 */
		public final static byte DIC_SEND_TYPE_4 = 4;
		/**
		 * 发送类型5：验证老手机号验证码
		 */
		public final static byte DIC_SEND_TYPE_5 = 5;
		/**
		 * 发送类型6：补全手机号码验证码
		 */
		public final static byte DIC_SEND_TYPE_6 = 6;
		/**
		 * 发送类型7：培训券微信领取验证
		 */
		public final static byte DIC_SEND_TYPE_7 = 7;
		/**
		 * 发送类型8：委托书验证码(优优好房)
		 */
		public final static byte DIC_SEND_TYPE_8 = 8;
		
	}
	public static class ERP_SYS_PARAM {
		/**
		 * PUBLIC
		 * 公房公客
		 */
		public static final String DIC_SYSTEM_RUN_MODEL_PUBLIC = "PUBLIC";
		/**
		 * PUBLIC
		 * 公房私客
		 */
		public static final String DIC_SYSTEM_RUN_MODEL_PUBFUN = "PUBFUN";
		/**
		 * PUBLIC
		 * 私房私客
		 */
		public static final String DIC_SYSTEM_RUN_MODEL_PRIVATE = "PRIVATE";
		/**
		 * PUBLIC
		 * 私房公客
		 */
		public static final String DIC_SYSTEM_RUN_MODEL_PUBCUST = "PUBCUST";
	}
	/**
	 * 是否隐号拨打
	 * 1：开启
	 * 0：关闭
	 */
	public final static String IS_OPEN_HIDEPHONE_1 = "1";
	/**
	 * 是否隐号拨打个人数据
	 * 1：开启
	 * 0：关闭
	 */
	public final static String IS_OPEN_HIDE_SELF_PHONE_1 = "1";

	/**钥匙审核类型，0=房源所属门店 1=钥匙所属门店**/
	public final static String KEY_EXAMINE_TYPE_0 = "0";

	/**钥匙审核类型，0=房源所属门店 1=钥匙所属门店**/
	public final static String KEY_EXAMINE_TYPE_1 = "1";

	/**APP上传图片**/
	public final static Byte PHOTO_SOURCE_0 = 0;

	/**图片状态**/
	public final static Byte TRANSMIT_FLAG_0 = 0;

	/**房勘上传的图片**/
	public final static Byte TRANSMIT_FLAG_4 = 4;

	/**视频状态 有效**/
	public final static int VIDEO_STATUS_0 = 0;

	/**删除**/
	public final static int VIDEO_STATUS__1 = -1;

	/**房勘上传**/
	public final static int VIDEO_STATUS_4 = 4;

	/**
	 * 用于标识公共数据创建来源
	 * 例如:写跟进,可能erp 和 移动端都需要写，但是过程中有些字段更新不一致，用该字段来区分数据来自哪里
	 *
	 * 服务器创建的数据来源 0 ERP、1 移动端、2新移动服务器
	 */
	public final static Byte SYS_DATA_SOURCE = 2;
	
	
	/**积分来源类型**/
	/**分享房源到朋友圈**/
	public static final String INTEGRAL_TYPE_1 = "1";
	
	/**分享房源到城市公盘**/
	public static final String INTEGRAL_TYPE_2 = "2";
	
	/**分享真房源到城市公盘**/
	public static final String INTEGRAL_TYPE_3 = "3";
	
	/**为房源上传3张及以上VR全景照片**/
	public static final String INTEGRAL_TYPE_4 = "4";
	
	/**为房源上传1个视频**/
	public static final String INTEGRAL_TYPE_5 = "5";
	
	/**好房抢单-接单**/
	public static final String INTEGRAL_TYPE_6 = "6";
	
	/**好房抢单-推荐房源**/
	public static final String INTEGRAL_TYPE_7 = "7";
	
	/**好房抢单-完成带看**/
	public static final String INTEGRAL_TYPE_8 = "8";
	
	/**好房抢单-房勘并转入房源**/
	public static final String INTEGRAL_TYPE_9 = "9";
	
	/**好房抢单-五星服务或房源好评**/
	public static final String INTEGRAL_TYPE_10 = "10";
	
	/**好房抢单-线上成交**/
	public static final String INTEGRAL_TYPE_11 = "11";
	
	/**点亮真房源，并同步发布到优优好房**/
	public static final String INTEGRAL_TYPE_12 = "12";
	
	/**充值房豆20个**/
	public static final String INTEGRAL_TYPE_13 = "13";
	
	/**充值房豆50个**/
	public static final String INTEGRAL_TYPE_14 = "14";
	
	/**充值房豆100个**/
	public static final String INTEGRAL_TYPE_15 = "15";
	
	/**充值房豆300个**/
	public static final String INTEGRAL_TYPE_16 = "16";
	
	/**竞价成为小区专家**/
	public static final String INTEGRAL_TYPE_17 = "17";
	
	/**房源竞价推广**/
	public static final String INTEGRAL_TYPE_18 = "18";
	
	/**购买好房大学课程**/
	public static final String INTEGRAL_TYPE_19 = "19";
	
	/**每日首次打开好房A+APP**/
	public static final String INTEGRAL_TYPE_20 = "20";
	
	/**好房A+中平安普惠功能登记的客户成功办理贷款**/
	public static final String INTEGRAL_TYPE_21 = "21";
	
	/**夺宝币来源，1=点亮真房源*/
	public final static Integer DIC_TREASURE_COIN_SOURCE_1 = 1;
	/**夺宝币来源，2=房源推广*/
	public final static Integer DIC_TREASURE_COIN_SOURCE_2 = 2;
	/**夺宝币来源，3=小区竞价*/
	public final static Integer DIC_TREASURE_COIN_SOURCE_3 = 3;
	/**夺宝币来源，4=新盘竞价*/
	public final static Integer DIC_TREASURE_COIN_SOURCE_4 = 4;
	/**
	 * 优优竞价正常1
	 **/
	public static final Integer HOUSE_BIDDING_YY_STATUS_1 = 1;

	public enum UP_TYPE {
		PIC(1),VIDEO(2),PANORAMA(3);
		private final int value;
		UP_TYPE(int value) {
			this.value = value;
		}

		public int getValue() {
			return value;
		}
	}

	public enum AuditRunTimeStatus {
		AUDIT_ING(0, "审核中"),
		AUDIT_ALLPASS(1, "已通过"),
		AUDIT_NOPASS(2, "未通过"),
		AUDIT_BACK(3, "已撤销"),
		AUDIT_BEYONDTIME(4, "已通过"),
		AUDIT_INVALID(5, "已失效");
		final int code;
		final String msg;

		AuditRunTimeStatus(int code, String msg) {
			this.code = code;
			this.msg = msg;
		}

		public int getCode() {
			return code;
		}

		public String getMsg() {
			return msg;
		}

		public static String getMsg(int code) {
			for (AuditRunTimeStatus auditStatus : AuditRunTimeStatus.values()) {
				if (auditStatus.code == code)
					return auditStatus.msg;
			}
			return "";
		}
	}

	public enum UserAuditStatus {
		AUDIT_INIT(0, ""),
		AUDIT_WAITING(1, "审核中"),
		AUDIT_PASS(2, "已通过"),
		AUDIT_AUTO(3, "已通过"),
		AUDIT_BEYONDTIME(4, "已通过"),
		AUDIT_NOPASS(5, "未通过"),
		AUDIT_USER_RUMTIME_BACK(6, "已撤销");
		final int code;
		final String msg;

		UserAuditStatus(int code, String msg) {
			this.code = code;
			this.msg = msg;
		}

		public int getCode() {
			return code;
		}

		public String getMsg() {
			return msg;
		}

		public static String getMsg(int code) {
			for (UserAuditStatus auditStatus : UserAuditStatus.values()) {
				if (auditStatus.code == code)
					return auditStatus.msg;
			}
			return "";
		}
	}

	/**
	 * 审核二期审核状态
	 */
	public enum  AuditStatus {
		AUDIT_ING(0, "审核中"),
		AUDIT_ALLPASS(1, "已通过"),
		AUDIT_NOPASS(2, "未通过"),
		AUDIT_BACK(3, "已撤销"),
		AUDIT_BEYONDTIME(4, "已通过"),
		AUDIT_INVALID(5, "已失效");
		final int code;
		final String msg;

		AuditStatus(int code, String msg) {
			this.code = code;
			this.msg = msg;
		}

		public int getCode() {
			return code;
		}

		public String getMsg() {
			return msg;
		}

		public static String getMsg(int code) {
			for (AuditStatus auditStatus : AuditStatus.values()) {
				if (auditStatus.code == code)
					return auditStatus.msg;
			}
			return "";
		}
	}

	public static class Mongo {
		/** Mongo 来源 erp房源和楼盘信息 **/
		public static Byte FUN_HOUSE_SOURCE_1 = 1;
		/** Mongo 来源 搜搜中介 **/
		public static Byte FUN_HOUSE_SOURCE_2 = 2;
		/** Mongo 来源 搜搜个人 **/
		public static Byte FUN_HOUSE_SOURCE_3 = 3;
		/** Mongo 来源 agency **/
		public static Byte FUN_HOUSE_SOURCE_4 = 4;
		/** Mongo 来源 搜搜合租 **/
		public static Byte FUN_HOUSE_SOURCE_5 = 5;
		/** Mongo 来源 新房联动 - 陈文超 - 该字典值的相关数据暂时没有导入mongo-后期可能导入  **/
		public static Byte FUN_HOUSE_SOURCE_6 = 6;
		/**公寓整租**/
		public static Byte FUN_HOUSE_SOURCE_7 = 7;
		/**公寓合租**/
		public static Byte FUN_HOUSE_SOURCE_8 = 8;
		/**旅居地产**/
		public static Byte FUN_HOUSE_SOURCE_9 = 9;
		/** mongodb删除标记 **/
		public static Byte MONGODB_DELETE = 1;

		/**获取楼盘地图最大随机次数 防止无线循环 虽然概率很小**/
		public static int MAX_RANDOM_SIZE = 10000;

		/**
		 * 普通wap站，无图数据要展示
		 */
		public static final int SHOW_PIC_1 = 1;
		/**
		 * 推广wap站，有1张图才展示
		 */
		public static final int SHOW_PIC_2 = 2;

	}

	public enum BuildLockFields {
		buildFloors,
		buildLadder,
		buildDoors,
		houseType,
		houseStruct,
		houseYear,
		floorStart,
		floorEnd,
		houseRoom,
		houseHall,
		houseWei,
		houseYang,
		houseDirect,
		houseArea,
		houseInnerarea;

		public static boolean isInEnum(String field) {
			for (BuildLockFields s : BuildLockFields.values()) {
				if (s.name().equalsIgnoreCase(field)) {
					return true;
				}
			}
			return false;
		}
	}


	/**
	 * 发发站点是否隐藏
	 */
	public final static class WebSiteInvisible {
		/**
		 * 隐藏
		 */
		public static final Byte GONE = 1;
		/**
		 * 不隐藏
		 */
		public static final Byte VISIBLE = 0;
	}

	public enum DicType {
		DIC_TYPE_CASE_TYPE("CASE_TYPE", "跟踪类型"), DIC_TYPE_TRACK_TYPE("TRACK_TYPE", "跟踪类别"), DIC_TYPE_HOUSE_SOURCE("HOUSE_SOURCE", "房源来源"), DIC_TYPE_HOUSE_LEVEL("HOUSE_LEVEL", "房源级别"), DIC_TYPE_HOUSE_CONSIGN("HOUSE_CONSIGN", "房源委托"), DIC_TYPE_PLATE_TYPE("PLATE_TYPE", "盘别"), DIC_TYPE_HOUSE_TYPE("HOUSE_TYPE", "房屋类型"), DIC_TYPE_HOUSE_FITMENT("HOUSE_FITMENT", "房屋装修"), DIC_TYPE_HOUSE_DIRECT("HOUSE_DIRECT", "房屋朝向"), DIC_TYPE_HOUSE_STRUCT("HOUSE_STRUCT", "房屋结构"), DIC_TYPE_HOUSE_USEAGE("HOUSE_USEAGE", "房屋用途"), DIC_TYPE_HOUSE_RIGHT("HOUSE_RIGHT", "房屋产权"), DIC_TYPE_HOUSE_ACCOUNT("HOUSE_ACCOUNT", "房屋结算"), DIC_TYPE_HOUSE_REGION("HOUSE_REGION", "行政区域"), DIC_TYPE_HOUSE_SECTORS("HOUSE_SECTORS", "房屋片区"), DIC_TYPE_HOUSE_ROUND("HOUSE_ROUND", "房屋环域"), DIC_TYPE_HOUSE_STATUS("HOUSE_STATUS", "房屋状态"), DIC_TYPE_RENT_ACCOUNT("RENT_ACCOUNT", "出租付款方式"), DIC_TYPE_USER_STATUS("USER_STATUS", "用户状态"), DIC_TYPE_USER_SCHLRECORD("USER_SCHLRECORD", "用户学历"), DIC_TYPE_USER_POLITY("USER_POLITY", "政治面貌"), DIC_TYPE_AGE_TYPE("AGE_TYPE", "年龄类型"), DIC_TYPE_GOAL_TYPE("GOAL_TYPE", "购房目的"), DIC_TYPE_ABILITY_TYPE("ABILITY_TYPE", "购买能力"), DIC_TYPE_LENGTH_TYPE("LENGTH_TYPE", "期限"), DIC_TYPE_BUY_PAYTYPE("BUY_PAYTYPE", "付款方式"), DIC_TYPE_CAREER_TYPE("CAREER_TYPE", "职业类型"), DIC_TYPE_TASK_STATUS("TASK_STATUS", "任务状态"), DIC_TYPE_TASK_TYPE("TASK_TYPE", "任务类型"), DIC_TYPE_EXAMIN_RESULT("EXAMIN_RESULT", "审核结果"), DIC_TYPE_USER_FOREIGN("USER_FOREIGN", "英语水平"), DIC_TYPE_KEY_STATUS("KEY_STATUS", "钥匙状态"), DIC_TYPE_BULLET_CLASSIC("BULLET_CLASSIC", "公告分类"), DIC_TYPE_WORK_TYPE("WORK_TYPE", "上班类型"), DIC_TYPE_WORK_STATUS("WORK_STATUS", "上班状态"), DIC_TYPE_MENUAL_TYPE("MENUAL_TYPE", "业务手册"), DIC_TYPE_HOUSE_STITUAT("HOUSE_STITUAT", "房屋现状"), DIC_TYPE_PRICE_UNIT("PRICE_UNIT", "租金单位"), DIC_TYPE_HOUSE_LIMITE("HOUSE_LIMITE", "租凭期限"), DIC_TYPE_HOUSE_SET("HOUSE_SET", "室内配套"), DIC_TYPE_EXPECT_BACKTIME("EXPECT_BACKTIME", "预计返回时间"), DIC_TYPE_ROLE_TYPE("ROLE_TYPE", "权限分类"), DIC_TYPE_DEAL_STATUS("DEAL_STATUS", "成交状态"), DIC_TYPE_TAX_TYPE("TAX_TYPE", "税费支付"), DIC_TYPE_MORTGAGE_TYPE("MORTGAGE_TYPE", "按揭方式"), DIC_TYPE_PAID_TYPE("PAID_TYPE", "消费类型"), DIC_TYPE_HALL_STRUCTURE("HALL_STRUCTURE", "厅结构"), DIC_TYPE_UG_TYPE("UG_TYPE", "地下类型"), DIC_TYPE_OWNER_TYPE("OWNER_TYPE", "商铺用途"), DIC_TYPE_OFFICE_LEVEL("OFFICE_LEVEL", "写字楼级别"), DIC_TYPE_SHOP_USAGE("SHOP_USAGE", "商铺用途"), DIC_TYPE_HOUSE_FEATURE("HOUSE_FEATURE", "项目特色"), DIC_TYPE_BUILD_TYPE("BUILD_TYPE", "建筑类别"), DIC_TYPE_PROPERTY_TYPE("PROPERTY_TYPE", "物业类别"), DIC_TYPE_PRICE_UNIT_ALL("PRICE_UNIT_ALL", "价格单位(所有)"), DIC_TYPE_HOUSE_PARK("HOUSE_PARK", "附近公园"), DIC_TYPE_HOUSE_UNIT("HOUSE_UNIT", "户型类别"), DIC_TYPE_BUILD_FITMENT("BUILD_FITMENT", "楼盘装修"), DIC_TYPE_BUILDPHOTO_TYPE("BUILDPHOTO_TYPE", "楼盘图片类型"),DIC_TYPE_VEHICLE_TYPE("VEHICLE_TYPE","交通工具"),DIC_TYPE_MENTALITY_TYPE("MENTALITY_TYPE","客户心态"),DIC_TYPE_BUY_QUALIFY("BUY_QUALIFY","购房资格"),DIC_TYPE_CREDIT_TYPE("CREDIT_TYPE","购房征信情况");
		String value;
		Integer provinceId;
		Integer cityId;
		String dicCnMsg;

		DicType(String value, String dicCnMsg) {
			this.value = value;
			this.dicCnMsg = dicCnMsg;
		}

		public String toString() {
			return this.value + ":" + dicCnMsg;
		}

		public boolean equals(String str) {
			return this.value.equals(str);
		}

		public boolean equals(Integer str) {
			return this.value.equals(String.valueOf(str));
		}

		public String dicValue() {
			return this.value;
		}

		public String dicCnMsg() {
			return this.dicCnMsg;
		}
	}

	public enum UserUpdateItem {
		ANSWER_COUNT,
		QUESTION_COUNT,
		GET_LIKES,
		GET_REWARD_AMOUNT,
	}

	/***
	 * 竞价相关
	 * @author 尹振兴
	 * 2017年7月13日 下午5:35:38
	 */
	public static class Bidding{
		/**
		 * 公司账户
		 */
		public final static Byte UA_TYPE_1 = 1;
		/***
		 * 个人账户
		 */
		public final static Byte UA_TYPE_2 = 2;

		/***
		 * 公司和个人账户都用了
		 */
		public final static Byte UA_TYPE_3 = 3;

		/***
		 * 过期并退款
		 */
		public final static Byte BIDDING_STATUS_0 = 0;

		/***
		 * 竞价中
		 */
		public final static Byte BIDDING_STATUS_1 = 1;

		/***
		 * 已上架
		 */
		public final static Byte BIDDING_STATUS_2 = 2;


		/***
		 * erp
		 */
		public final static Byte BIDD_SOURCE_1 = 1;

		/**
		 * app
		 */
		public final static Byte BIDD_SOURCE_2 = 2;

		/***
		 * 入驻天数
		 */
		public final static int ENTER_DAY = 30;
	}

	/**
	 * 视频审核标记 ，审核通过
	 */
	public final static Byte DIC_VIDEO_REVIEWFLAG_1 = 1;
	/**
	 * 视频审核标记，审核未通过
	 */
	public final static Byte DIC_VIDEO_REVIEWFLAG_2 = 2;
	/**
	 * VR真房源大于的数量
	 */
	public final static int DIC_TRUE_PANORAMAMAP = 2;

	/**支付打车押金**/
	public final static int PT_TYPE_29 = 29;

	/**真房源押金**/
	public final static int PT_TYPE_33 = 33;

	/**余额充值**/
	public final static int PT_TYPE_34 = 34;

	/**用户账号的类型---纯个人版(纯精英版,没有所属门店) 值：2*/
	public final static Integer DIC_USER_EDITION_2 = 2;


	public enum AnswerItem {
		COMMENT_COUNT,
		REWARD_COUNT,
		READ_COUNT,
		LIKES
	}

	/**
	 * B端余额（掌通经纪人）
	 * 系统最低提现额度
	 */
	public static final Double CASH_MONEY_MIN_LIMIT_4B = 50.0d;

	/**
	 * B端现金提现费率
	 * 千分之六，实际比例在程序中运算得到0.006
	 */
	public static final String APPLY_GET_MONEY_RATE = "0.6%";

	/**
	 * 现金余额是否开启自动审核
	 * 自动审核: 1
	 * 人工审核: 0
	 */
	public static byte OPEN_CASH_MONEY_PERSON_AUDIT = 1;
	/**
	 * 佣金提现是否开启自动审核
	 * 自动审核: 1
	 * 人工审核: 0
	 */
	public static byte OPEN_COMMISSION_PERSON_AUDIT = 1;

	/**
	 * 成交奖励是否开启自动审核
	 * 自动审核: 1
	 * 人工审核: 0
	 */
	public static byte OPEN_DEAL_PERSON_AUDIT = 1;

	/**
	 * 数据业务环境-1测试
	 */
	public final static byte RUN_ENVIRONMENT_1 = 1;
	/**
	 * 数据业务环境-2正式
	 */
	public final static byte RUN_ENVIRONMENT_2 = 2;
	/**
	 * 数据业务环境-3灰度
	 */
	public final static byte RUN_ENVIRONMENT_3 = 3;

	/**
	 * 到账期限
	 */
	public static final String ARRIVAL_DATE_RAGE = "24小时内";
	/**
	 * 每条保证金消费金额
	 */
	public static final BigDecimal PER_TRUE_HOUSE_BOND = new BigDecimal(10);

	/**
	 * ERP FUN_USERS 相关的状态、用户类型等数据
	 *
	 * @author 陈文超
	 * @date 2016年7月1日 下午7:38:53
	 */
	public static class ERP_FUN_USERS {
		/**
		 * 用户账号的类型---赢销版账号 值：-1
		 */
		public final static Byte DIC_USER_EDITION_WIN_PER__1 = -1;
		/**
		 * 用户账号的类型---企业版账号 值：0
		 */
		public final static Byte DIC_USER_EDITION_0 = 0;
		/**
		 * 用户账号的类型---专业版账号 值：1
		 */
		public final static Byte DIC_USER_EDITION_1 = 1;
		/**
		 * 用户账号的类型---纯个人版(纯精英版,没有所属门店) 值：2
		 */
		public final static Byte DIC_USER_EDITION_2 = 2;
	}

	/** 系统管理员 系统中暂时不显示出来 */
	public final static String DIC_ROLE_NAME_SYSTEM_MANAGE = "SYSTEM_MANAGE";
	/** 见习经纪人 */
	public final static String DIC_ROLE_NAME_PRACTY_BIZ = "PRACTY_BIZ";
	/** 正式经纪人 */
	public final static String DIC_ROLE_NAME_COMMON_BIZ = "COMMON_BIZ";
	/** 权证专员 */
	public final static String DIC_ROLE_NAME_PROPERTY_SERVER = "PROPERTY_SERVER";
	/** 客服专员 */
	public final static String DIC_ROLE_NAME_CUST_SERVER = "CUST_SERVER";
	/** 销售组长 */
	public final static String DIC_ROLE_NAME_BIZ_MANAGER = "BIZ_MANAGER";
	/** 店务秘书 */
	public final static String DIC_ROLE_NAME_SECRETARIAL = "SECRETARIAL";
	/** 门店经理 -- 通俗叫法“店长” 中介门店的店长 */
	public final static String DIC_ROLE_NAME_BRANCH_MANAGER = "BRANCH_MANAGER";
	/** 片区经理 */
	public final static String DIC_ROLE_NAME_REGION_MANAGER = "REGION_MANAGER";
	/** 大区经理 */
	public final static String DIC_ROLE_NAME_BIZ_GENERAL = "BIZ_GENERAL";
	/** 副总经理 */
	public final static String DIC_ROLE_NAME_DEPUTY_MANAGER = "DEPUTY_MANAGER";
	/** 总经理 */
	public final static String DIC_ROLE_NAME_GENERAL_MANAGER = "GENERAL_MANAGER";

	public final static String DIC_ROLE_NAME_COMMON_ADMIN = "COMMON_ADMIN";

	public static class TRUE_HOUSE_USE_STATUS {
		/**1：有效 **/
		public final static Byte TRUE_HOUSE_USE_STATUS_1 = 1;

		/**2：退款**/
		public final static Byte TRUE_HOUSE_USE_STATUS_2 = 2;

		/**3：转给c端**/
		public final static Byte TRUE_HOUSE_USE_STATUS_3 = 3;

		/** 4：冻结(被投诉了需要冻结) **/
		public final static Byte TRUE_HOUSE_USE_STATUS_4 = 4;

	}

	public static class rechargeCoinAlertBusiness {
		//抢单
		public static final String YYHF_QD_PAY = "YYHF_QD_PAY";
		//知道
		public static final String REWARD_FROM = "REWARD_FROM";
		//点赞
		public static final String LIKE_FROM = "LIKE_FROM";
		//知业
		public static final String ZHIYE = "ZHIYE";
		//搜搜
		public static final String SOSO = "SOSO";
		//小区竞价
		public static final String BIDDING = "BIDDING";
		//联卖消费房豆
		public static final String UNION_HOUSE_CONTACT = "UNION_HOUSE_CONTACT";
		
		//合作消费房豆
		public static final String HOUSE_COOPERATION = "HOUSE_COOPERATION";
		
	}
	/**
	 * 楼盘状态
	 * @author guohao
	 */
	public static class BUILD_STATUS {
		/**
		 * 待售
		 */
		public static final Byte FOR_SALE = 1;

		/**
		 * 在售
		 */
		public static final Byte SELLING = 2;

		/**
		 * 售完
		 */
		public static final Byte SOLD_OUT = 3;

		/**
		 * 招商
		 */
		public static final Byte MERCHANT = 4;

		/**
		 * 招租
		 */
		public static final Byte FOR_RENT = 5;
	}
	public enum BiddingStatus {
		BIDDING_STATUS_0("0", "过期并退款"), BIDDING_STATUS_1("1", "竞价中"), BIDDING_STATUS_2("2", "已上架");
		String value;
		String dicCnMsg;

		BiddingStatus(String value, String dicCnMsg) {
			this.value = value;
			this.dicCnMsg = dicCnMsg;
		}

		public String toString() {
			return this.value + ":" + dicCnMsg;
		}

		public boolean equals(String str) {
			return this.value.equals(str);
		}

		public boolean equals(Integer str) {
			return this.value.equals(String.valueOf(str));
		}

		public String dicValue() {
			return this.value;
		}

		public String dicCnMsg() {
			return this.dicCnMsg;
		}
	}

	/**
	 * 楼盘经纪人介绍字数限制
	 */
	public final static int BID_SELF_DESC_LIMIT = 200;


	public static class trueHouseStatus {

		/** 真房源标记状态   0未点亮   **/
		public final static Byte TRUE_FLAG_0 = 0;

		/**1=标记为真房源  **/
		public final static Byte TRUE_FLAG_1 = 1;

		/** 2=永久下架,不能再次变为真房源 **/
		public final static Byte TRUE_FLAG_2 = 2;

		/** 3=正在投诉中 **/
		public final static Byte TRUE_FLAG_3 = 3;

		/** 4=投诉后连带下架（不在优优展示）**/
		public final static Byte TRUE_FLAG_4 = 4;


		/** 投诉状态 投诉中  **/
		public final static Byte COMPLAINT_TYPE_0 = 0;

		/** 申诉中 **/
		public final static Byte COMPLAINT_TYPE_1 = 1;

		/** 24小时未处理，投诉成立 **/
		public final static Byte COMPLAINT_TYPE_2 = 2;

		/** 主动下架  **/
		public final static Byte COMPLAINT_TYPE_3 = 3;

		/** 人工处理，投诉成立  **/
		public final static Byte COMPLAINT_TYPE_4 = 4;

		/** 人工处理，投诉不成立 **/
		public final static Byte COMPLAINT_TYPE_5 = 5;

		/** 处理状态 0 未处理  **/
		public final static Byte DEAL_STATUS_0 = 0;

		/** 1投诉成功 **/
		public final static Byte DEAL_STATUS_1 = 1;

		/** 2 投诉失败 **/
		public final static Byte DEAL_STATUS_2 = 2;

		/** 处理类型 0未处理  **/
		public final static Byte DEAL_TYPE_0 = 0;

		/** 1 超时自动处理 **/
		public final static Byte DEAL_TYPE_1 = 1;

		/** 2 平台人工处理 **/
		public final static Byte DEAL_TYPE_2 = 2;

		/**下架状态 0 正常,未下架 **/
		public final static Byte DOWN_TYPE_0 = 0;

		/** 1 罚金下架 **/
		public final static Byte DOWN_TYPE_1 = 1;

		/** 2 主动下架 **/
		public final static Byte DOWN_TYPE_2 = 2;

	}

	/** 对经纪人星级评价对应的评价内容 **/
	public static final String[][] ARCHIVE_START_TAGS = new String[][]{
			{"讲解很不清晰", "专业知识不强", "反馈不及时", "服务态度不好"},
			{"讲解一般", "专业度不高", "反馈一般", "服务态度一般"},
			{"讲解有待提升", "专业度有待提升", "反馈一般", "服务态度一般"},
			{"讲解有待提升", "专业度有待提升", "反馈比较及时", "服务有待提升"}
	};

	/** 营销版通过实名赠送房豆 **/
	public static final int GIFT_COIN = 300;
	public static class VipQueue {
		/**
		 * 1正常
		 */
		public static final Integer DIC_WF_STATUS_NORMAL_1 = 1;
		/**
		 * 0无效
		 */
		public static final Integer DIC_WF_STATUS_NORMAL_0 = 0;

	}

	/**
	 * 房屋委托书的常量
	 */
	public static class HouseProxyConst{

		//证件类型常量
		/**1 = 身份证；**/
		public static final Byte TRUSTOR_ID_CARD_TYPE_1 = 1;
		/**2 = 护照；**/
		public static final Byte TRUSTOR_ID_CARD_TYPE_2 = 2;
		/**3 = 军官证；**/
		public static final Byte TRUSTOR_ID_CARD_TYPE_3 = 3;
		/**4 = 士兵证；**/
		public static final Byte TRUSTOR_ID_CARD_TYPE_4 = 4;
		/**5 = 回乡证；**/
		public static final Byte TRUSTOR_ID_CARD_TYPE_5 = 5;
		/**6 = 台胞证；**/
		public static final Byte TRUSTOR_ID_CARD_TYPE_6 = 6;

		//委托类型
		/**1 = 普通委托 **/
		public static final Byte PROXY_TYPE_1 = 1;

		//委托状态
		/**1 = 创建委托中 **/
		public static final Byte PROXY_STATUS_1 = 1;
		/**2 = 委托成功 **/
		public static final Byte PROXY_STATUS_2 = 2;
		/**3 = 委托失败 **/
		public static final Byte PROXY_STATUS_3 = 3;

		//删除状态
		/**0 = 不逻辑删除 **/
		public static final Byte IS_DELETE_0 = 0;
		/**1 = 逻辑删除 **/
		public static final Byte IS_DELETE_1 = 1;

		//受托方类型
		/**1 = 受托方类型是公司 **/
		public static final Byte DEPOSITARY_TYPE_1 = 1;
		/**2 = 受托方类型是经纪人 **/
		public static final Byte DEPOSITARY_TYPE_2 = 2;

		//委托人的验证类型
		/**1 = 扫脸验证 **/
		public static final Byte VALIDATION_TYPE_1 = 1;
		/**2 = 短信验证 **/
		public static final Byte VALIDATION_TYPE_2 = 2;

	}

	/**
	 * 培训券
	 */
	public static class TrainingVouchersConst {

		//培训券状态信息的类型-仅用于小秘书推送
		/**1 = 被使用（购买课程）**/
		public static final Byte TRAINING_VOUCHERS_STATUS_1 = 1;
		/**2 = 分享后被领取**/
		public static final Byte TRAINING_VOUCHERS_STATUS_2 = 2;
		/**3 = 未使用将过期**/
		public static final Byte TRAINING_VOUCHERS_STATUS_3 = 3;
	}

	/***
	 * 点亮合作房源送房豆
	 * @author 尹振兴
	 * @since 2018年6月11日
	 */
	public static class CityShareHouseConst{
		/** 未送 **/
		public static final Byte GIFT_STATUS_0 = 0;
		/** 已送 **/
		public static final Byte GIFT_STATUS_1 = 1;
		/** 已退 **/
		public static final Byte GIFT_STATUS_2 = 2;
	}


	/**
	 * 培训券状态
	 */
	public static class TrainingVouchersStatusConst {
		/**0 = 无效**/
		public static final Byte TRAINING_VOUCHERS_STATUS_0 = 0;
		/**1 = 有效**/
		public static final Byte TRAINING_VOUCHERS_STATUS_1 = 1;
	}

	/**
	 * 培训券来源
	 */
	public static class TrainingVouchersResourceConst {
		/**0 = 充值购买**/
		public static final Byte TRAINING_VOUCHERS_RESOURCE_0 = 0;
		/**2 = 分享获取**/
		public static final Byte TRAINING_VOUCHERS_RESOURCE_2 = 2;
	}

	/**
	 * 培训券记录使用类型
	 */
	public static class TrainingVouchersRecordsUseTypeConst {
		/**1 = 充值赠送**/
		public static final Byte TRAINING_VOUCHERS_TYPE_1 = 1;
		/**2 = 直接充值**/
		public static final Byte TRAINING_VOUCHERS_TYPE_2 = 2;
		/**3 = 购买课程**/
		public static final Byte TRAINING_VOUCHERS_TYPE_3 = 3;
		/**4 = 赠送他人**/
		public static final Byte TRAINING_VOUCHERS_TYPE_4 = 4;
		/**5 = 他人赠送**/
		public static final Byte TRAINING_VOUCHERS_TYPE_5 = 5;
		/**6 = 系统清空**/
		public static final Byte TRAINING_VOUCHERS_TYPE_6 = 6;
		/**7 = 现场验票**/
		public static final Byte TRAINING_VOUCHERS_TYPE_7 = 7;
	}

	/**
	 * 培训券记录使用类型
	 */
	public static class TrainingVouchersRecordsPaidCatigory {
		/**0 = 支出**/
		public static final Byte TRAINING_VOUCHERS_PAIDCATIGORY_0 = 0;
		/**1 = 获取**/
		public static final Byte TRAINING_VOUCHERS_PAIDCATIGORY_1 = 1;
	}

	/**
	 * 培训课程删除状态
	 */
	public static class TrainingCurriculumDelStatus {
		/**0 = 否**/
		public static final Byte TRAINING_CURRICULUM_DEL_STATUS_0 = 0;
		/**1 = 是**/
		public static final Byte TRAINING_CURRICULUM_DEL_STATUS_1 = 1;
	}

	/**
	 * 培训课程状态
	 */
	public static class TrainingCurriculumStatus {
		/**0 = 未开始**/
		public static final Byte TRAINING_CURRICULUM_STATUS_0 = 0;
		/**1 = 进行中**/
		public static final Byte TRAINING_CURRICULUM_STATUS_1 = 1;
		/**2 = 已结束**/
		public static final Byte TRAINING_CURRICULUM_STATUS_2 = 2;
	}

	public static class UserScoreType {
		/**
		 * 房增
		 */
		public final static Integer HOUSE_ADD = 1;
		/**
		 * 客增
		 */
		public final static Integer CUST_ADD = 2;
		/**
		 * 带看
		 */
		public final static Integer SCORE_DK = 3;
		/**
		 * 房勘
		 */
		public final static Integer SCORE_FK = 4;
		/**
		 * 空看
		 */
		public final static Integer SCORE_KFDP = 5;
		/**
		 * 视频上传
		 */
		public final static Integer SCORE_SPSC = 6;
		/**
		 * VR上传
		 */
		public final static Integer SCORE_VR = 7;
		/**
		 * 图片上传
		 */
		public final static Integer SCORE_TPSC = 8;
		/**
		 * 钥匙提交
		 */
		public final static Integer SCORE_YSTJ = 9;
		/**
		 * 跟进
		 */
		public final static Integer SCORE_GJ = 10;
		/**
		 * 小区专家
		 */
		public final static Integer SCORE_XQZJ = 11;
		/**
		 * 新盘顾问
		 */
		public final static Integer SCORE_XPGW = 12;
		/**
		 * 房源置顶
		 */
		public final static Integer SCORE_FYZD = 13;
		/**
		 * 点亮真房源
		 */
		public final static Integer SCORE_ZFY = 14;
		/**
		 * 房源群发
		 */
		public final static Integer SCORE_QFTG = 15;
		/**
		 * 房源分享
		 */
		public final static Integer SCORE_FY = 16;
		/**
		 * 发布合作
		 */
		public final static Integer SCORE_HZ = 17;
		/**
		 * 优优好房5星好评
		 */
		public final static Integer SCORE_YYHP = 18;
		/**
		 * 售单成交
		 */
		public final static Integer SALE_CJ = 19;
		/**
		 * 租单成交
		 */
		public final static Integer LEASE_CJ = 20;
		/**
		 * 每月登录不少于10天
		 */
		public final static Integer SCORE_LOGIN = 21;

		//以下类型都不是数据库类型，只为业务需求而添加
		/**
		 *	合同注销
		 */
		public final static Integer DEAL_ZX= 22;
		/**
		 *	合同注销
		 */
		public final static Integer KEY_ZX= 23;
	}

	public final static class AttachBizType{
		/**
		 * 合作签订带看确认书-2018-09-03弃用
		 */
		public final static String COOPERATE_BIZ_100001 = "100001";
		/**
		 * 合作房源扫码-2018-09-03弃用
		 */
		public final static String COOPERATE_BIZ_100002 = "100002";
		/**
		 * 客户已签订了带看确认书，可前往合作详情中进行查看-2018-09-03弃用
		 */
		public final static String COOPERATE_BIZ_100003 = "100003";
		/**
		 * 客户已签订了带看确认书，可前往客源详情中进行查看-2018-09-03弃用
		 */
		public final static String COOPERATE_BIZ_100004 = "100004";
		/**
		 * 合作流程变动推送
		 * 该功能只作为提现前端更新最新的合作数据和合作列表状态
		 */
		public final static String COOPERATE_BIZ_100005 = "100005";
	}

	/**
	 * 5:分组 < 4:门店 < 3:片区 < 2:大区 < 1:全公司
	 */
	/**
	 * 1:全公司范围的权限
	 */
	public final static int DIC_OPER_RANGE_LEVEL_SEQ_1 = 1;
	/**
	 * 2:大区范围的权限
	 */
	public final static int DIC_OPER_RANGE_LEVEL_SEQ_2 = 2;
	/**
	 * 3:片区范围的权限
	 */
	public final static int DIC_OPER_RANGE_LEVEL_SEQ_3 = 3;
	/**
	 * 4:门店范围的权限
	 */
	public final static int DIC_OPER_RANGE_LEVEL_SEQ_4 = 4;
	/**
	 * 5:分组范围的权限
	 */
	public final static int DIC_OPER_RANGE_LEVEL_SEQ_5 = 5;

	/**
	 * 跟进带看标记：无效带看 值:0
	 */
	public final static boolean DIC_TRACK_TARGET_FLAG_0 = false;
	/**
	 * 跟进带看标记：有效带看 值:1
	 */
	public final static boolean DIC_TRACK_TARGET_FLAG_1 = true;


	/**城市大公盘分享类型，1=普通分享*/
	public final static Byte CITYSHARE_COOPERATION_TYPE_1 = 1;
	/**城市大公盘分享类型，2=隐号分享*/
	public final static Byte CITYSHARE_COOPERATION_TYPE_2 = 2;
	/**城市大公盘分享类型，3=物业分享*/
	public final static Byte CITYSHARE_COOPERATION_TYPE_3 = 3;

	/**城市大公盘查看类型，1=免费查看*/
	public final static Byte CITYSHARE_PURCHASE_TYPE_1 = 4;
	/**城市大公盘查看类型，2=付费查看*/
	public final static Byte CITYSHARE_PURCHASE_TYPE_2 = 5;

	public final static Byte CITYSHARE_PURCHASE_TYPE_3 = 6;



	/**
	 * 正在投诉中的真房源 值：3
	 */
	public final static Byte DIC_INFO_TRUE_INFO_FLAG_3 = 3;

	/**
	 * 投诉状态 0 投诉中 1 申诉中 2 已处理
	 */
	public final static Byte DIC_TRUEHOUSE_COMPLAINT_TYPE_0 = 0;
	/**
	 * 投诉状态 0 投诉中 1 申诉中 2 已处理
	 */
	public final static Byte DIC_TRUEHOUSE_COMPLAINT_TYPE_1 = 1;
	/**
	 * 投诉状态 0 投诉中 1 申诉中 2 已处理
	 */
	public final static Byte DIC_TRUEHOUSE_COMPLAINT_TYPE_2 = 2;

	/**
	 * 处理状态 0 未处理
	 */
	public final static Byte DIC_TRUEHOUSE_DEAL_STATUS_0 = 0;
	/**
	 * 处理状态 1投诉成功
	 */
	public final static Byte DIC_TRUEHOUSE_DEAL_STATUS_1 = 1;
	/**
	 * 处理状态  2 投诉失败
	 */
	public final static Byte DIC_TRUEHOUSE_DEAL_STATUS_2 = 2;

	/**
	 * 下加状态 0 正常 1 缴纳罚金下架 2 自动下架所有真房源 3 已删除（投诉失败才会是该状态）
	 */
	public final static Byte DIC_TRUEHOUSE_DOWN_TYPE_0 = 0;
	/**
	 * 下加状态 0 正常 1 缴纳罚金下架 2 自动下架所有真房源 3 已删除（投诉失败才会是该状态）
	 */
	public final static Byte DIC_TRUEHOUSE_DOWN_TYPE_1 = 1;

	/**
	 * 合作状态
	 */
	public static class CooperateStatus {
		/**
		 * 发起
		 */
		public static final byte INIT = 0;

		/**
		 * 同意
		 */
		public static final byte AGREE = 1;
		/**
		 * 拒绝
		 */
		public static final byte REFUSE = 2;

		/**
		 * 成功
		 */
		public static final byte SUCCEED = 3;
		/**
		 * 终止
		 */
		public static final byte ABORT = 4;
		/**
		 * 带看
		 */
		public static final byte DAIKAN = 5;
	}
	/**
	 * 该房源与本公司其他房源电话重复，是否保存
	 */
	public final static Integer DIC_HOUSE_PHONE_REPEAT_1 = 1;
	/**
	 * 该房源与本公司同小区房源地址重复，是否保存
	 */
	public final static Integer DIC_HOUSE_PHONE_REPEAT_2 = 2;
	/**
	 * 该房源与本公司同小区房源电话、地址重复，是否保存
	 */
	public final static Integer DIC_HOUSE_PHONE_REPEAT_3 = 3;
	/**
	 * 该房源与本公司判重范围外的其他数据电话重复
	 */
	public final static Integer DIC_HOUSE_PHONE_REPEAT_4 = 4;
	/**
	 * 该房源与本公司判重范围外的其他数据地址重复
	 */
	public final static Integer DIC_HOUSE_PHONE_REPEAT_5 = 5;
	/**
	 * 该房源与本公司判重范围外的其他数据电话、地址重复
	 */


	/**
	 * 是否修改信息状态,比如出售房源取消加密,不修改SALE_STATUS。 (出租,出售,求租,求购同理)
	 * true 修改, false 不修改
	 */
	public static List<Byte> noNeedUpdateStatusTrackType = Arrays.asList(Const.DIC_TRACK_TYPE_CANCEL_PASSWORD, Const.DIC_TRACK_TYPE_CANCEL_COMMEND, Const.DIC_TRACK_TYPE_HOUSE_LEVEL_CANCEL_FOCUS);
	public final static Integer DIC_HOUSE_PHONE_REPEAT_6 = 6;

	/**
	 * 地址重复，请及时房勘！若其他房源优先房勘此房源将转为删除(重复房源未房勘前可重复录入前提：业主电话不同且未房堪)
	 */
	public final static Integer DIC_HOUSE_PHONE_REPEAT_7 = 7;
	
	
	/**
	 * 新版会员需验证的功能类型
	 */
	public static class PlusVipActionType {
		/**
		 * 使用赠送抢单
		 */
		public final static Byte ACTION_TYPE_1 = 1;
		/**
		 * 使用赠送联卖查看
		 */
		public final static Byte ACTION_TYPE_2 = 2;
		/**
		 * 使用差评申诉权
		 */
		public final static Byte ACTION_TYPE_3 = 3;
		/**
		 * 使用户型图库
		 */
		public final static Byte ACTION_TYPE_4 = 4;
		/**
		 * 使用签订委托书
		 */
		public final static Byte ACTION_TYPE_5 = 5;
		/**
		 * 使用签订带看确认书
		 */
		public final static Byte ACTION_TYPE_6 = 6;
		/**
		 * 使用与物业合作
		 */
		public final static Byte ACTION_TYPE_7 = 7;
	}

	/**
	 * http://172.16.140.91/zentaopms/www/index.php?m=story&f=view&storyID=9996
	 * http://172.16.140.91/zentaopms/www/index.php?m=story&f=view&storyID=9997
	 * 去电、面谈、店长回访、房勘、普通委托、独家委托、限时委托、包租委托、议价、可租/可售、加密、预订、封盘、推荐、暂缓、内成交、外成交、删除
	 * 去电、面谈、店长回访、约看、带看、加密、推荐、封盘、预订、暂缓、内成交、外成交、删除
	 * 消息推送:实时通知
	 */
	public static class PushMessageType {

		/**查看核心信息*/
		public final static Integer PUSH_GET_CORE_INFO = 1;
		/**生成合同*/
		public final static Integer PUSH_DEAL_GENERATE = 2;
		/**修改合同*/
		public final static Integer PUSH_DEAL_UPDATE = 3;
		/**去电*/
		public final static Integer PUSH_OTHER = 4;
		/**面谈*/
		public final static Integer PUSH_TALK = 5;
		/**店长回访*/
		public final static Integer PUSH_RETURN_VISIT = 6;
		/**房勘*/
		public final static Integer PUSH_FUNCAN = 7;
		/**普通委托*/
		public final static Integer PUSH_HOUSE_CONSIGN_GENERAL = 8;
		/**独家委托*/
		public final static Integer PUSH_HOUSE_CONSIGN_ALONE = 9;
		/**限时委托*/
		public final static Integer PUSH_HOUSE_CONSIGN_LIMITED = 10;
		/**包租委托*/
		public final static Integer PUSH_HOUSE_CONSIGN_RENT = 11;
		/**议价*/
		public final static Integer PUSH_BARGAIN = 12;
		/**可租*/
		public final static Integer PUSH_TRANSLEASE = 13;
		/**可售*/
		public final static Integer PUSH_TRANSSALE = 14;
		/**加密*/
		public final static Integer PUSH_HOUSE_LEVEL_PASSWORD = 15;
		/**预订*/
		public final static Integer PUSH_SCHEDULE = 16;
		/**封盘*/
		public final static Integer PUSH_SPECIAL = 17;
		/**推荐*/
		public final static Integer PUSH_HOUSE_LEVEL_COMMEND = 18;
		/**暂缓*/
		public final static Integer PUSH_RESPITE = 19;
		/**内成交*/
		public final static Integer PUSH_INNERDEAL = 20;
		/**外成交*/
		public final static Integer PUSH_OUTDEAL = 21;
		/**删除房源*/
		public final static Integer PUSH_HOUSE_DELETE = 22;
		/**约看*/
		public final static Integer PUSH_YUEKAN = 23;
		/**带看*/
		public final static Integer PUSH_DAIKAN = 24;
		/**提交钥匙*/
		public final static Integer PUSH_SUBMIT_KEY = 25;
		/**借用钥匙*/
		public final static Integer PUSH_BORROW_KEY = 26;
		/**归还钥匙*/
		public final static Integer PUSH_RETURN_KEY = 27;
		/**注销钥匙*/
		public final static Integer PUSH_DESTROY_KEY = 28;
		/**提醒*/
		public final static Integer PUSH_REMIND = 29;
	}
	/**
	 * @title 信息登记
	 * @author lcb
	 * @date 2019/4/10
	 **/
	public static class CASE_CREATE_FROME {
		// 从erp登记
		public static Byte CREATE_FROM_ERP     = 1;
		// 从掌通登记
		public static Byte CREATE_FROM_PALMTOP = 2;
	}

	/***
	 * 用户类型
	 * @author 尹振兴
	 * @since May 14, 2019
	 */
	public static class USER_SOURCE {
		// ERP用户
		public static Byte USER_SOURCE_AGENT = 1;
		// 开单豹用户
		public static Byte USER_SOURCE_KDB = 2;
	}


	public static class STATISTICS_TYPE {
		/**委托**/
		public static Byte STATISTICS_TYPE_8 = 8;
		/**房勘**/
		public static Byte STATISTICS_TYPE_10 = 10;
		/**提交钥匙**/
		public static Byte STATISTICS_TYPE_11 = 11;
		/**议价**/
		public static Byte STATISTICS_TYPE_12 = 12;
		/**查看电话**/
		public static Byte STATISTICS_TYPE_15 = 15;
		/**带看**/
		public static Byte STATISTICS_TYPE_19 = 19;
		/**签约（内成交）**/
		public static Byte STATISTICS_TYPE_20 = 20;
		/**带客**/
		public static Byte STATISTICS_TYPE_35 = 35;
	}

	/**
	 * 审核来源类型
	 * @Package com.myfun.repository.support.constant 
	 * @author 陈文超   
	 * @date 2020年2月29日 下午6:25:44
	 */
	public static class AUDIT_RESOURCE {
		/**跟进：值1**/
		public static Byte AUDIT_RESOURCE_TRACK = 1;
		/**请假：值2**/
		public static Byte AUDIT_RESOURCE_LEAVE = 2;
		/**外出：值3**/
		public static Byte AUDIT_RESOURCE_OUT = 3;
		/**合同：值4**/
		public static Byte AUDIT_RESOURCE_DEAL = 4;
		/**投诉：值5**/
		public static Byte AUDIT_RESOURCE_COMPLAINT = 5;
		/**通用审核：值6**/
		public static Byte AUDIT_RESOURCE_COMMON = 6;
		/**似乎是房基地-钥匙审核使用的，但这个参数一开始没按照规范定义在这个常量中，还需要根据业务商榷：值7**/
		public static Byte AUDIT_RESOURCE_FANGJIDI_KEY = 7;
		/**下架平台房源审核-门店配置版专用-陈文超：值8**/
		public static Byte AUDIT_RESOURCE_DOWN_PLATFORM_HOUSE = 8;
	}

	public static Map<Integer, List<Integer>> invalidRuleMap = new HashMap<>();

	static{
		// 转有效
		invalidRuleMap.put(21, Arrays.asList(new Integer[]{57, 58,59,60,61,62,63,64,62,65,66}));
		// 可售
		invalidRuleMap.put(23, Arrays.asList(new Integer[]{28,29,30}));
		// 可租
		invalidRuleMap.put(24, Arrays.asList(new Integer[]{28,29,30}));
		// 加密
		invalidRuleMap.put(17, Arrays.asList(new Integer[]{57, 58,59,60,61,62,63,64,62, 65,66, 80, 18, 26,27,28,29,30}));
		// 聚焦
		invalidRuleMap.put(80, Arrays.asList(new Integer[]{57, 58,59,60,61,62,63,64,62,65,66, 17, 26,27,28,29,30}));
		// 推荐
		invalidRuleMap.put(18, Arrays.asList(new Integer[]{57, 58,59,60,61,62,63,64,62,65,66, 17, 26,27,28,29,30}));
		// 预订
		invalidRuleMap.put(25, Arrays.asList(new Integer[]{57, 58,59,60,61,62,63,64,62,65,66 ,17,80,18, 26,27,28,29,30, 71, 72, 73, 81, 74}));
		// 封盘
		invalidRuleMap.put(26, Arrays.asList(new Integer[]{57, 58,59,60,61,62,63,64,62,65,66, 17,80,18,25, 27,28,29,30, 70, 72, 73, 81,74}));
		// 暂缓
		invalidRuleMap.put(27, Arrays.asList(new Integer[]{57, 58,59,60,61,62,63,64,62,65,66, 17, 80,18,25, 26,28,29,30,70,71,73,81,74}));
		// 内成交
		invalidRuleMap.put(28, Arrays.asList(new Integer[]{57, 58,59,60,61,62,63,64,62,65,66, 17,80,18,25,26,27,29,30,70,71,72,81,74}));
		// 外成交
		invalidRuleMap.put(29, Arrays.asList(new Integer[]{57, 58,59,60,61,62,63,64,62,65,66, 17, 80,18, 25,26,27,28,30,70,71,72,73}));
		// 删除
		invalidRuleMap.put(30, Arrays.asList(new Integer[]{57, 58,59,60,61,62,63,64,62,65,66,17 ,80,18,25,26,27,28,29,70,71,72,73, 81,74}));
		// 取消预订
		invalidRuleMap.put(70, Arrays.asList(new Integer[]{57, 58,59,60,61,62,63,64,62,65,66, 27,28,29,30,71,72,73,81,74}));
		// 取消封盘
		invalidRuleMap.put(71, Arrays.asList(new Integer[]{57, 58,59,60,61,62,63,64,62,65,66, 72,73,81 ,74}));
		// 暂缓转有效
		invalidRuleMap.put(72, Arrays.asList(new Integer[]{57, 58,59,60,61,62,63,64,62,65,66, 73,81 ,74}));
		// 取消加密
		invalidRuleMap.put(73, Arrays.asList(new Integer[]{57, 58,59,60,61,62,63,64,62,65,66, 81,74 }));
		// 取消聚焦
		invalidRuleMap.put(81, Arrays.asList(new Integer[]{57, 58,59,60,61,62,63,64,62,65,66}));
		// 取消推荐
		invalidRuleMap.put(74, Arrays.asList(new Integer[]{57, 58,59,60,61,62,63,64,62,65,66}));
		// 委托
		invalidRuleMap.put(6, Arrays.asList(new Integer[]{6,7,9,19,53}));
		invalidRuleMap.put(7, Arrays.asList(new Integer[]{6,7,9,19,53}));
		invalidRuleMap.put(9, Arrays.asList(new Integer[]{6,7,9,19,53}));
		invalidRuleMap.put(19, Arrays.asList(new Integer[]{6,7,9,19,53}));
		// 归还钥匙
		invalidRuleMap.put(34, Arrays.asList(new Integer[]{35}));
		// 注销钥匙
		invalidRuleMap.put(35, Arrays.asList(new Integer[]{33,34}));
		// 楼盘变更
		invalidRuleMap.put(20, Arrays.asList(new Integer[]{17,80,18, 25,26,27,28,29,30}));
		invalidRuleMap.put(54, Arrays.asList(new Integer[]{17,80,18, 25,26,27,28,29,30}));
		invalidRuleMap.put(55, Arrays.asList(new Integer[]{57, 58,59,60,61,62,63,64,62,65,66,17,80,18, 25,26,27,28,29,30}));
		DIC_KEY_TRACK.add(DIC_TRACK_TYPE_SUBMIT_KEY);
		DIC_KEY_TRACK.add(DIC_TRACK_TYPE_BORROW_KEY);
		DIC_KEY_TRACK.add(DIC_TRACK_TYPE_RETURN_KEY);
		DIC_KEY_TRACK.add(DIC_TRACK_TYPE_DESTROY_KEY);

	}

	/**
	 * 写笋盘跟进时用的房源标签, 所以TRACK_TAG表笋盘的TAG_ID统一比FUN_TAGS表TAGS_ID大10000来作为区分
	 **/
	public static int FOCUS_FUN_TAG_WITH_TRACK_TAG = 10000;


	public static class PartnerConfig{

		public static final Map<String, String> PARTNER_PARAM = new HashMap<>();
		static {
			//隐号拨打
			PARTNER_PARAM.put("IS_OPEN_HIDEPHONE","IMPLICIT_CALL_APART");
			PARTNER_PARAM.put("IS_OPEN_HIDE_SELF_PHONE_HOUSE","IMPLICIT_CALL_APART");
			PARTNER_PARAM.put("IS_OPEN_HIDE_SELF_PHONE_CUSTOMER","IMPLICIT_CALL_APART");
			PARTNER_PARAM.put("IPCALL_HIDEPHONE_COUNT","IMPLICIT_CALL_APART");
			PARTNER_PARAM.put("IPCALL_AREA_HIDEPHONE_COUNT","IMPLICIT_CALL_APART");
			PARTNER_PARAM.put("VOIP_USE_COMP_MONEY","IMPLICIT_CALL_APART");
			//转盘
			PARTNER_PARAM.put("HOUSE_TRANSFER_FOR_WHO","TRANS_PLATE_RULE_APART");
			PARTNER_PARAM.put("PRIVATE_HOUSE_TRANSFER","TRANS_PLATE_RULE_APART");
			PARTNER_PARAM.put("PUBLIC_HOUSE_TRANSFER","TRANS_PLATE_RULE_APART");
			PARTNER_PARAM.put("PUBLIC_CUST_TRANSFER","TRANS_PLATE_RULE_APART");
			PARTNER_PARAM.put("PRIVATE_HOUSE_TRANSFER_PUBLIC","TRANS_PLATE_RULE_APART");
			PARTNER_PARAM.put("PRIVATE_CUST_TRANSFER_PUBLIC","TRANS_PLATE_RULE_APART");

			//公盘淘宝池配置
			PARTNER_PARAM.put("SHARE_HOUSE_RANGE","PLATE_RANGE_APART");
			PARTNER_PARAM.put("SHARE_CUST_RANGE","PLATE_RANGE_APART");
			PARTNER_PARAM.put("PUBLIC_HOUSE_RANGE","PLATE_RANGE_APART");
			PARTNER_PARAM.put("PUBLIC_CUST_RANGE","PLATE_RANGE_APART");

			//核心信息
			PARTNER_PARAM.put("SHARE_FUN_CORE_DEPT","CORE_INFO_APART");
			PARTNER_PARAM.put("SHARE_FUN_CORE_OTHER","CORE_INFO_APART");
			PARTNER_PARAM.put("SHARE_CUST_CORE_DEPT","CORE_INFO_APART");
			PARTNER_PARAM.put("SHARE_CUST_CORE_OTHER","CORE_INFO_APART");
			PARTNER_PARAM.put("VIEW_HOUSE_COUNT_SELF","CORE_INFO_APART");
			PARTNER_PARAM.put("VIEW_HOUSE_COUNT_OTHER","CORE_INFO_APART");
			PARTNER_PARAM.put("VIEW_HOUSE_COUNT_OTHER_APP","CORE_INFO_APART");
			PARTNER_PARAM.put("VIEW_CUST_COUNT_SELF","CORE_INFO_APART");
			PARTNER_PARAM.put("VIEW_CUST_COUNT_OTHER","CORE_INFO_APART");
			PARTNER_PARAM.put("VIEW_CUST_COUNT_OTHER_APP","CORE_INFO_APART");

			//策略参数
//
//
//					"FANGKAN_RED_BUY", "RED_FANGKAN_PUBLIC_BUY", "TRACK_RED_BUY", "RED_TRACK_PUBLIC_BUY", "GET_PUBLIC_BUY", "GET_PUBLIC_RED_BUY",
//					"GET_RED_TRACK_PUBLIC_BUY", "PUBLIC_CANCEL_BUY", "PUBLIC_NOTGET_CANCEL_BUY",
//
//					"FANGKAN_RED_RENT", "RED_FANGKAN_PUBLIC_RENT", "TRACK_RED_RENT", "RED_TRACK_PUBLIC_RENT", "GET_PUBLIC_RENT", "GET_PUBLIC_RED_RENT",
//					"GET_RED_TRACK_PUBLIC_RENT", "PUBLIC_CANCEL_RENT", "PUBLIC_NOTGET_CANCEL_RENT"
//			);
			//策略参数自行配置
			PARTNER_PARAM.put("SPECIAL_PROTECT_DAYS","STRATEGY_PARAM_APART");
			PARTNER_PARAM.put("PASSWORD_RECORDS","STRATEGY_PARAM_APART");
			PARTNER_PARAM.put("INFO_MAX_SECRECY","STRATEGY_PARAM_APART");
			PARTNER_PARAM.put("SCHEDULE_PROTECT_DAYS","STRATEGY_PARAM_APART");
			PARTNER_PARAM.put("WARMDAY_OF_RENTDUE","STRATEGY_PARAM_APART");
			PARTNER_PARAM.put("RESPITE_PROTECT_DAYS","STRATEGY_PARAM_APART");
			PARTNER_PARAM.put("DEPT_COMMEND_RECORDS","STRATEGY_PARAM_APART");
			PARTNER_PARAM.put("COMMEND_RECORDS","STRATEGY_PARAM_APART");
			PARTNER_PARAM.put("INFO_MAX_COMMEND_DAYS","STRATEGY_PARAM_APART");
			PARTNER_PARAM.put("INFO_MAX_FOCUS_DAYS","STRATEGY_PARAM_APART");
			PARTNER_PARAM.put("FANGKAN_RED_SELL","STRATEGY_PARAM_APART");
			PARTNER_PARAM.put("RED_FANGKAN_PUBLIC_SELL","STRATEGY_PARAM_APART");
			PARTNER_PARAM.put("TRACK_RED_SELL","STRATEGY_PARAM_APART");
			PARTNER_PARAM.put("RED_TRACK_PUBLIC_SELL","STRATEGY_PARAM_APART");
			PARTNER_PARAM.put("GET_PUBLIC_SELL","STRATEGY_PARAM_APART");
			PARTNER_PARAM.put("GET_PUBLIC_RED_SELL","STRATEGY_PARAM_APART");
			PARTNER_PARAM.put("GET_RED_TRACK_PUBLIC_SELL","STRATEGY_PARAM_APART");
			PARTNER_PARAM.put("PUBLIC_CANCEL_SELL","STRATEGY_PARAM_APART");
			PARTNER_PARAM.put("PUBLIC_NOTGET_CANCEL_SELL","STRATEGY_PARAM_APART");
			PARTNER_PARAM.put("FANGKAN_RED_LEASE","STRATEGY_PARAM_APART");
			PARTNER_PARAM.put("RED_FANGKAN_PUBLIC_LEASE","STRATEGY_PARAM_APART");
			PARTNER_PARAM.put("TRACK_RED_LEASE","STRATEGY_PARAM_APART");
			PARTNER_PARAM.put("RED_TRACK_PUBLIC_LEASE","STRATEGY_PARAM_APART");
			PARTNER_PARAM.put("GET_PUBLIC_LEASE","STRATEGY_PARAM_APART");
			PARTNER_PARAM.put("GET_PUBLIC_RED_LEASE","STRATEGY_PARAM_APART");
			PARTNER_PARAM.put("GET_RED_TRACK_PUBLIC_LEASE","STRATEGY_PARAM_APART");
			PARTNER_PARAM.put("PUBLIC_CANCEL_LEASE","STRATEGY_PARAM_APART");
			PARTNER_PARAM.put("PUBLIC_NOTGET_CANCEL_LEASE","STRATEGY_PARAM_APART");
			PARTNER_PARAM.put("FANGKAN_RED_BUY","STRATEGY_PARAM_APART");
			PARTNER_PARAM.put("RED_FANGKAN_PUBLIC_BUY","STRATEGY_PARAM_APART");
			PARTNER_PARAM.put("TRACK_RED_BUY","STRATEGY_PARAM_APART");
			PARTNER_PARAM.put("RED_TRACK_PUBLIC_BUY","STRATEGY_PARAM_APART");
			PARTNER_PARAM.put("GET_PUBLIC_BUY","STRATEGY_PARAM_APART");
			PARTNER_PARAM.put("GET_PUBLIC_RED_BUY","STRATEGY_PARAM_APART");
			PARTNER_PARAM.put("GET_RED_TRACK_PUBLIC_BUY","STRATEGY_PARAM_APART");
			PARTNER_PARAM.put("PUBLIC_CANCEL_BUY","STRATEGY_PARAM_APART");
			PARTNER_PARAM.put("PUBLIC_NOTGET_CANCEL_BUY","STRATEGY_PARAM_APART");
			PARTNER_PARAM.put("FANGKAN_RED_RENT","STRATEGY_PARAM_APART");
			PARTNER_PARAM.put("RED_FANGKAN_PUBLIC_RENT","STRATEGY_PARAM_APART");
			PARTNER_PARAM.put("TRACK_RED_RENT","STRATEGY_PARAM_APART");
			PARTNER_PARAM.put("RED_TRACK_PUBLIC_RENT","STRATEGY_PARAM_APART");
			PARTNER_PARAM.put("GET_PUBLIC_RENT","STRATEGY_PARAM_APART");
			PARTNER_PARAM.put("GET_PUBLIC_RED_RENT","STRATEGY_PARAM_APART");
			PARTNER_PARAM.put("GET_RED_TRACK_PUBLIC_RENT","STRATEGY_PARAM_APART");
			PARTNER_PARAM.put("PUBLIC_CANCEL_RENT","STRATEGY_PARAM_APART");
			PARTNER_PARAM.put("PUBLIC_NOTGET_CANCEL_RENT","STRATEGY_PARAM_APART");
			PARTNER_PARAM.put("SALE_LIMIT","STRATEGY_PARAM_APART");
			PARTNER_PARAM.put("LEASE_LIMIT","STRATEGY_PARAM_APART");
		}

	}

	/**正常登记0**/
	public final static Byte HOUSE_VERIFY_0 = 0;
	/**审核中1**/
	public final static Byte HOUSE_VERIFY_1 = 1;
	/**审核不通过2**/
	public final static Byte HOUSE_VERIFY_2 = 2;
	/**申诉中3**/
	public final static Byte HOUSE_VERIFY_3 = 3;
	
    public static class ML_ENTRUST_INCALID_REASON {
        //1 删除委托 2.委托被撤销 3.委托签署时间超限 4.委托有效期时间超限  5.房源转暂缓 6.房源内成交 7房源外成交 8 房源转删除 9清空备案 10 修改价格 11.委托审核失败
        /** 委托被删除 **/
        public static byte INCALID_REASON_1 = 1;

        /** 委托被撤销 **/
        public static byte INCALID_REASON_2 = 2;

        /** 委托签署时间超限 **/
        public static byte INCALID_REASON_3 = 3;

        /** 委托有效期时间超限 **/
        public static byte INCALID_REASON_4 = 4;

        /** 房源转暂缓 **/
        public static byte INCALID_REASON_5 = 5;

        /** 房源内成交 **/
        public static byte INCALID_REASON_6 = 6;

        /** 房源外成交 **/
        public static byte INCALID_REASON_7 = 7;

        /** 房源转删除 **/
        public static byte INCALID_REASON_8 = 8;

        /** 清空备案 **/
        public static byte INCALID_REASON_9 = 9;

        /** 修改价格 **/
        public static byte INCALID_REASON_10 = 10;

        /** 委托审核失败 **/
        public static byte INCALID_REASON_11 = 11;
    }
    
    public static class ML_ENTRUST_STATUS  {
        //1=正常 2=已过期 3=已撤销 4=已删除 5=已驳回 6=转暂缓 7=内成交 8=外成交 9=转删除 10=未签署 11=待签署 12=清空备案 13=修改价格
        /** 正常 **/
        public static byte ENTRUST_STATUS_1 = 1;

        /** 已过期 **/
        public static byte ENTRUST_STATUS_2 = 2;

        /** 已撤销 **/
        public static byte ENTRUST_STATUS_3 = 3;

        /** 已删除 **/
        public static byte ENTRUST_STATUS_4 = 4;

        /** 已驳回 **/
        public static byte ENTRUST_STATUS_5 = 5;

        /** 转暂缓 **/
        public static byte ENTRUST_STATUS_6 = 6;

        /** 内成交 **/
        public static byte ENTRUST_STATUS_7 = 7;

        /** 外成交 **/
        public static byte ENTRUST_STATUS_8 = 8;

        /** 转删除 **/
        public static byte ENTRUST_STATUS_9 = 9;

        /** 未签署 **/
        public static byte ENTRUST_STATUS_10 = 10;

        /** 待签署 **/
        public static byte ENTRUST_STATUS_11 = 11;

        /** 清空备案 **/
        public static byte ENTRUST_STATUS_12 = 11;

        /** 修改价格 **/
        public static byte ENTRUST_STATUS_13 = 11;
    }
    
    /**
	 * 好房A+业务
	 * 陈文超，城市联卖池数据标记
	 * 值：7
	 */
	public final static Integer DIC_HOUSE_CITY_SHARE_FLAG_7 = 7;
	
	/**好房A+业务：房源下架到联卖池，房源: 不分享 >> 要分享**/
	public final static String DIC_HOUSE_CITY_SHARE_FLAG_DOWN_TYPE_0 = "0";
	public final static String DIC_HOUSE_CITY_SHARE_FLAG_DOWN_AUDIT_TYPE_CN = "下架过期房源";
	/**好房A+业务：房源上架到联卖池，房源: 不分享 >> 要分享**/
	public final static String DIC_HOUSE_CITY_SHARE_FLAG_UP_TYPE_1 = "1";
	
	/**集团平台系统运行模式-平台联卖 值：PLATFORM_UNION*/
	public final static String DIC_PLATFORM_SYSRUNMODEL_TYPE_UNION = "PLATFORM_UNION";
	/**集团平台系统运行模式-平台公盘 值：PLATFORM_PUBLIC*/
	public final static String DIC_PLATFORM_SYSRUNMODEL_TYPE_PUBLIC = "PLATFORM_PUBLIC";
	
	/**
	 * 联卖池数据下架类型
	 * 4：手动
	 */
	public final static Integer CITY_SHARE_FLAG_DOWN_TYPE_4 = 4;
	
	/**
	 * 联卖池数据下架类型
	 * 6：审核下架
	 */
	public final static Integer CITY_SHARE_FLAG_DOWN_TYPE_6 = 6;
	/**
	 * 联卖池数据下架类型
	 * 7：数据移交导致的下架
	 */
	public final static Integer CITY_SHARE_FLAG_DOWN_TYPE_7 = 7;
	
	/**
	 * 分享到联卖池的房源图片，至少需要的图片数量
	 */
	public final static Integer DIC_HOUSE_CITY_SHARE_FLAG_PIC_LIMIT = 3;
	
	/**
	 * 操作联卖房源分享或者取消后的消息类型
	 * 需要与houseCustWeb中ActiveMqPublisher.shareHouseAddOrCutHftBean结合使用
	 * 对应PlatformAwardHftBeanMessage类的type字段
	 * @Package com.myfun.framework.constant 
	 * @author 陈文超   
	 * @date 2020年3月24日 下午8:26:39
	 */
	public static class PlatformAwardHftBeanType{
		/**
		 * 分享奖励
		 */
		public final static Integer SHARE_CASE = 18;
		/**
		 * 出售单合作成交
		 */
		public final static Integer COOPERATION_SALE_CJ = 19;
		/**
		 * 出租单合作成交
		 */
		public final static Integer COOPERATION_LEASE_CJ = 20;
		/**
		 * 取消分享奖励
		 */
		public final static Integer CANCEL_SHARE_CASE = 21;
		/**
		 * 取消出售单合作成交
		 */
		public final static Integer CANCEL_SALE_CJ = 22;
		/**
		 * 取消出租单合作成交
		 */
		public final static Integer CANCEL_LEASE_CJ = 23;
	}
	
	/**
	 * 好房豆文案描述
	 */
	public final static String DIC_HF_BEAN_DESC = "房豆";
	
	/**
	 * 编辑数据地址信息后与平台房源重复时的提示
	 */
	public final static String PLATFORM_UNION_REPEAT_TIP_DESC = "该房源已被他人分享至联卖平台，请核实后再编辑！";

	/**
	 * storyId=12413 部分跟进取消通知栏推送，只保留消息，1、房源跟进：房勘、委托（独家、限时、普通、包租）、议价、可租、可售、加密、预订、封盘；2、客源跟进：加密、预订、封盘
	 */
	public static final List<Byte> NOT_PUSH_NOTIFY_BAR = new ArrayList<Byte>(11){{
		add(DIC_TRACK_TYPE_FUNCAN);//房堪
		add(DIC_TRACK_TYPE_LIMITED);//限时委托
		add(DIC_TRACK_TYPE_ALONE);//独家委托
		add(DIC_TRACK_TYPE_RENT);//包租委托
		add(DIC_TRACK_TYPE_BARGAIN);//议价
		add(DIC_TRACK_TYPE_HOUSE_LEVEL_PASSWORD);//加密
		add(DIC_TRACK_TYPE_GENERAL_ENTRUSTMENT);//普通委托
		add(DIC_TRACK_TYPE_STATUS_TRANSSALE);//可售
		add(DIC_TRACK_TYPE_STATUS_TRANSLEASE);//可租
		add(DIC_TRACK_TYPE_STATUS_SCHEDULE);//预订
		add(DIC_TRACK_TYPE_STATUS_SPECIAL);//封盘
	}};
}