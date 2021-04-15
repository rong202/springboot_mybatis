package com.ali.springboot_mybatis.invoke;

public class TaskConst {

    public static final int TASK_WAIT_DEAL = 0;

    public static final int TASK_IN_DEAL = 1;

    public static final int TASK_ACCOMPLISH = 2;

    public static final String TASK_RESULT_SUCCESS = "TASK_SUCCESS";
    public static final String TASK_RESULT_FAIL = "TASK_FAIL";


    public static final int FLOW_IN_DEAL = 1;
    public static final int FLOW_ACCOMPLISH = 2;

    public static final String FLOW_RESULT_SUCCESS = "FLOW_SUCCESS";
    public static final String FLOW_RESULT_FAIL = "FLOW_FAIL";


    public static final String NO_PRE_TASK_ID = null;

    public static final String COMMON_TASK_FAIL_FINISH_CODE = "FAIL_FINISH";

    public static final String COMMON_TASK_FINISH_CODE = "FINISH";


    //------------------------------入区报关----------------------------------

    public static final String ENTRY_WAREHOUSING_MULTI = "ENTRY_WAREHOUSING_MULTI";
    public static final String ENTRY_WAREHOUSING_SINGLE = "ENTRY_WAREHOUSING_SINGLE";
    public static final String ENTRY_CUSTOMS = "ENTRY_CUSTOMS";
    public static final String ENTRY_CUSTOMS_CLEARANCE = "ENTRY_CUSTOMS_CLEARANCE";

    /**
     * 待对方接单
     */
    public static final int BILL_WAIT_ACCEPT = 0;

    /**
     * 对方已接单
     */
    public static final int BILL_ACCEPTED = 1;


    /**
     * 我放已放弃
     */
    public static final int BILL_DISCARDED = 2;


    /**
     * 对方已驳回
     */
    public static final int BILL_REJECTED = 3;


    /**
     * 发送失败
     */
    public static final int BILL_FAIL= 4;




    //-----------------------------出区报关------------------------------------------

    public static final String OUT_WAREHOUSING_MULTI = "OUT_WAREHOUSING_MULTI";
    public static final String OUT_WAREHOUSING_SINGLE = "OUT_WAREHOUSING_SINGLE";
    public static final String OUT_CUSTOMS = "OUT_CUSTOMS";
    public static final String OUT_CUSTOMS_CLEARANCE = "OUT_CUSTOMS_CLEARANCE";
    public static final String OUT_PAY_TAXES = "OUT_PAY_TAXES";


    public static final Integer OUTBOUND_CUSTOMS_DECLARATION_END = 2;
    public static final Integer ENTRY_DECLARATION_END = 2;


    //---------------------------------上线验车----------------------------------

    public static final String LAUNCHED_ONLINE_INSPECTION = "LAUNCHED_ON-LINE_INSPECTION";
    public static final String VEHICLE_PREPARATION = "VEHICLE_PREPARATION";
    public static final String COMPLETE_ONLINE_INSPECTION = "COMPLETE_ON-LINE_INSPECTION";


    //--------------------------------------十抽二------------------------------

    public static final String LAUNCHED_TEN_PUMPING_TWO = "LAUNCHED_TEN_PUMPING_TWO";
    public static final String NON_SAMPLE_CAR_PHOTO = "NON-SAMPLE_CAR_PHOTO";
    public static final String NON_SAMPLE_CAR_PHOTO_CONFIRM = "NON-SAMPLE_CAR_PHOTO_CONFIRM";
    public static final String SAMPLE_PREPARATION = "SAMPLE_PREPARATION";
    public static final String SAMPLE_CAR_CONFIRMATION = "SAMPLE_CAR_CONFIRMATION";


    //----------------------------------------------关单获取-------------------------------------------------
    public final static String ORDER_ACQUISITION_PENDING = "ORDER_ACQUISITION_PENDING";

    public final static String ORDER_ACQUISITION_PENDING_WX="ORDER_ACQUISITION_PENDING_WX";

    public final static String ORDER_ACQUISITION_PENDING_ACCEPT = "ORDER_ACQUISITION_PENDING_ACCEPT";

    public final static String ORDER_ACQUISITION_PENDING_ACCEPT_WX = "ORDER_ACQUISITION_PENDING_ACCEPT_WX";


//----------------------------------------------商检证书获取-------------------------------------

    public final static String CERTIFICATE_ACQUISITION_PENDING = "CERTIFICATE_ACQUISITION_PENDING";

    public final static String CERTIFICATE_ACQUISITION_PENDING_WX = "CERTIFICATE_ACQUISITION_PENDING_WX";

    public final static String CERTIFICATE_ACQUISITION_PENDING_ACCEPT = "CERTIFICATE_ACQUISITION_PENDING_ACCEPT";

    public final static String CERTIFICATE_ACQUISITION_PENDING_ACCEPT_WX = "CERTIFICATE_ACQUISITION_PENDING_ACCEPT_WX";



    //-----------------------------------------车辆查验-------------------------------------
    public final static String LAUNCH_CHECK = "LAUNCH_CHECK";


    public final static String CHECK_APPOINTMENT = "CHECK_APPOINTMENT";

    public final static String COMPLETE_INSPECTION = "COMPLETE_INSPECTION";



    //-------------------------------------车辆整理------------------------------------

    public final static String LAUNCH_ARRANGE = "LAUNCH_ARRANGE";



    public final static String COMPLETE_ARRANGE = "COMPLETE_ARRANGE";




}
