package com.evergrande.springboot.test;

import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.TypeReference;

import java.util.LinkedHashMap;

/**
 * Created with IntelliJ IDEA.
 *
 * @Author: CuiCan
 * @Date: 2017/6/26
 * @Time: 18:07
 * @Description:
 */
public class FastJsonTest {

    public static void main(String[] args) {

        String str = "{\"status\":\"200\",\"message\":\"\",\"id\":171,\"configName\":\"首页\",\"configType\":\"1\",\"isInterface\":1,\"isTask\":1,\"remark\":null,\"details\":{\"list\":{\"id\":1190,\"values\":[{\"hours_desc\":\"23-24时\",\"apply_cnt\":0,\"apply_amt\":0.000000,\"first_review_finish_cnt\":0,\"second_review_finish_cnt\":0,\"final_review_finish_cnt\":0,\"review_accept_cnt\":0,\"sign_finish_cnt\":0,\"sign_finish_amt\":0.000000,\"loan_batch_success_cnt\":0,\"loan_batch_success_amt\":0.00},{\"hours_desc\":\"22-23时\",\"apply_cnt\":0,\"apply_amt\":0.000000,\"first_review_finish_cnt\":0,\"second_review_finish_cnt\":0,\"final_review_finish_cnt\":0,\"review_accept_cnt\":0,\"sign_finish_cnt\":0,\"sign_finish_amt\":0.000000,\"loan_batch_success_cnt\":0,\"loan_batch_success_amt\":0.00},{\"hours_desc\":\"21-22时\",\"apply_cnt\":0,\"apply_amt\":0.000000,\"first_review_finish_cnt\":0,\"second_review_finish_cnt\":0,\"final_review_finish_cnt\":0,\"review_accept_cnt\":0,\"sign_finish_cnt\":0,\"sign_finish_amt\":0.000000,\"loan_batch_success_cnt\":0,\"loan_batch_success_amt\":0.00},{\"hours_desc\":\"20-21时\",\"apply_cnt\":0,\"apply_amt\":0.000000,\"first_review_finish_cnt\":0,\"second_review_finish_cnt\":0,\"final_review_finish_cnt\":0,\"review_accept_cnt\":0,\"sign_finish_cnt\":0,\"sign_finish_amt\":0.000000,\"loan_batch_success_cnt\":0,\"loan_batch_success_amt\":0.00},{\"hours_desc\":\"19-20时\",\"apply_cnt\":0,\"apply_amt\":0.000000,\"first_review_finish_cnt\":0,\"second_review_finish_cnt\":0,\"final_review_finish_cnt\":0,\"review_accept_cnt\":0,\"sign_finish_cnt\":0,\"sign_finish_amt\":0.000000,\"loan_batch_success_cnt\":0,\"loan_batch_success_amt\":0.00},{\"hours_desc\":\"18-19时\",\"apply_cnt\":0,\"apply_amt\":0.000000,\"first_review_finish_cnt\":0,\"second_review_finish_cnt\":0,\"final_review_finish_cnt\":0,\"review_accept_cnt\":0,\"sign_finish_cnt\":0,\"sign_finish_amt\":0.000000,\"loan_batch_success_cnt\":0,\"loan_batch_success_amt\":0.00},{\"hours_desc\":\"17-18时\",\"apply_cnt\":0,\"apply_amt\":0.000000,\"first_review_finish_cnt\":0,\"second_review_finish_cnt\":0,\"final_review_finish_cnt\":0,\"review_accept_cnt\":0,\"sign_finish_cnt\":0,\"sign_finish_amt\":0.000000,\"loan_batch_success_cnt\":0,\"loan_batch_success_amt\":0.00},{\"hours_desc\":\"16-17时\",\"apply_cnt\":0,\"apply_amt\":0.000000,\"first_review_finish_cnt\":0,\"second_review_finish_cnt\":0,\"final_review_finish_cnt\":0,\"review_accept_cnt\":0,\"sign_finish_cnt\":0,\"sign_finish_amt\":0.000000,\"loan_batch_success_cnt\":0,\"loan_batch_success_amt\":0.00},{\"hours_desc\":\"15-16时\",\"apply_cnt\":0,\"apply_amt\":0.000000,\"first_review_finish_cnt\":0,\"second_review_finish_cnt\":0,\"final_review_finish_cnt\":0,\"review_accept_cnt\":0,\"sign_finish_cnt\":0,\"sign_finish_amt\":0.000000,\"loan_batch_success_cnt\":0,\"loan_batch_success_amt\":0.00},{\"hours_desc\":\"14-15时\",\"apply_cnt\":0,\"apply_amt\":0.000000,\"first_review_finish_cnt\":0,\"second_review_finish_cnt\":0,\"final_review_finish_cnt\":0,\"review_accept_cnt\":0,\"sign_finish_cnt\":0,\"sign_finish_amt\":0.000000,\"loan_batch_success_cnt\":0,\"loan_batch_success_amt\":0.00},{\"hours_desc\":\"13-14时\",\"apply_cnt\":0,\"apply_amt\":0.000000,\"first_review_finish_cnt\":0,\"second_review_finish_cnt\":0,\"final_review_finish_cnt\":0,\"review_accept_cnt\":0,\"sign_finish_cnt\":0,\"sign_finish_amt\":0.000000,\"loan_batch_success_cnt\":0,\"loan_batch_success_amt\":0.00},{\"hours_desc\":\"12-13时\",\"apply_cnt\":0,\"apply_amt\":0.000000,\"first_review_finish_cnt\":0,\"second_review_finish_cnt\":0,\"final_review_finish_cnt\":0,\"review_accept_cnt\":0,\"sign_finish_cnt\":0,\"sign_finish_amt\":0.000000,\"loan_batch_success_cnt\":0,\"loan_batch_success_amt\":0.00},{\"hours_desc\":\"11-12时\",\"apply_cnt\":0,\"apply_amt\":0.000000,\"first_review_finish_cnt\":0,\"second_review_finish_cnt\":0,\"final_review_finish_cnt\":0,\"review_accept_cnt\":0,\"sign_finish_cnt\":0,\"sign_finish_amt\":0.000000,\"loan_batch_success_cnt\":0,\"loan_batch_success_amt\":0.00},{\"hours_desc\":\"10-11时\",\"apply_cnt\":0,\"apply_amt\":0.000000,\"first_review_finish_cnt\":0,\"second_review_finish_cnt\":0,\"final_review_finish_cnt\":0,\"review_accept_cnt\":0,\"sign_finish_cnt\":0,\"sign_finish_amt\":0.000000,\"loan_batch_success_cnt\":0,\"loan_batch_success_amt\":0.00},{\"hours_desc\":\"9-10时\",\"apply_cnt\":0,\"apply_amt\":0.000000,\"first_review_finish_cnt\":0,\"second_review_finish_cnt\":0,\"final_review_finish_cnt\":0,\"review_accept_cnt\":0,\"sign_finish_cnt\":0,\"sign_finish_amt\":0.000000,\"loan_batch_success_cnt\":0,\"loan_batch_success_amt\":0.00},{\"hours_desc\":\"8-9时\",\"apply_cnt\":0,\"apply_amt\":0.000000,\"first_review_finish_cnt\":0,\"second_review_finish_cnt\":0,\"final_review_finish_cnt\":0,\"review_accept_cnt\":0,\"sign_finish_cnt\":0,\"sign_finish_amt\":0.000000,\"loan_batch_success_cnt\":0,\"loan_batch_success_amt\":0.00},{\"hours_desc\":\"7-8时\",\"apply_cnt\":0,\"apply_amt\":0.000000,\"first_review_finish_cnt\":0,\"second_review_finish_cnt\":0,\"final_review_finish_cnt\":0,\"review_accept_cnt\":0,\"sign_finish_cnt\":0,\"sign_finish_amt\":0.000000,\"loan_batch_success_cnt\":0,\"loan_batch_success_amt\":0.00},{\"hours_desc\":\"6-7时\",\"apply_cnt\":0,\"apply_amt\":0.000000,\"first_review_finish_cnt\":0,\"second_review_finish_cnt\":0,\"final_review_finish_cnt\":0,\"review_accept_cnt\":0,\"sign_finish_cnt\":0,\"sign_finish_amt\":0.000000,\"loan_batch_success_cnt\":0,\"loan_batch_success_amt\":0.00},{\"hours_desc\":\"5-6时\",\"apply_cnt\":0,\"apply_amt\":0.000000,\"first_review_finish_cnt\":0,\"second_review_finish_cnt\":0,\"final_review_finish_cnt\":0,\"review_accept_cnt\":0,\"sign_finish_cnt\":0,\"sign_finish_amt\":0.000000,\"loan_batch_success_cnt\":0,\"loan_batch_success_amt\":0.00},{\"hours_desc\":\"4-5时\",\"apply_cnt\":0,\"apply_amt\":0.000000,\"first_review_finish_cnt\":0,\"second_review_finish_cnt\":0,\"final_review_finish_cnt\":0,\"review_accept_cnt\":0,\"sign_finish_cnt\":0,\"sign_finish_amt\":0.000000,\"loan_batch_success_cnt\":0,\"loan_batch_success_amt\":0.00},{\"hours_desc\":\"3-4时\",\"apply_cnt\":0,\"apply_amt\":0.000000,\"first_review_finish_cnt\":0,\"second_review_finish_cnt\":0,\"final_review_finish_cnt\":0,\"review_accept_cnt\":0,\"sign_finish_cnt\":0,\"sign_finish_amt\":0.000000,\"loan_batch_success_cnt\":0,\"loan_batch_success_amt\":0.00},{\"hours_desc\":\"2-3时\",\"apply_cnt\":0,\"apply_amt\":0.000000,\"first_review_finish_cnt\":0,\"second_review_finish_cnt\":0,\"final_review_finish_cnt\":0,\"review_accept_cnt\":0,\"sign_finish_cnt\":0,\"sign_finish_amt\":0.000000,\"loan_batch_success_cnt\":0,\"loan_batch_success_amt\":0.00},{\"hours_desc\":\"1-2时\",\"apply_cnt\":0,\"apply_amt\":0.000000,\"first_review_finish_cnt\":0,\"second_review_finish_cnt\":0,\"final_review_finish_cnt\":0,\"review_accept_cnt\":0,\"sign_finish_cnt\":0,\"sign_finish_amt\":0.000000,\"loan_batch_success_cnt\":0,\"loan_batch_success_amt\":0.00},{\"hours_desc\":\"0-1时\",\"apply_cnt\":0,\"apply_amt\":0.000000,\"first_review_finish_cnt\":0,\"second_review_finish_cnt\":0,\"final_review_finish_cnt\":0,\"review_accept_cnt\":0,\"sign_finish_cnt\":0,\"sign_finish_amt\":0.000000,\"loan_batch_success_cnt\":0,\"loan_batch_success_amt\":0.00},{\"hours_desc\":\"当天累计\",\"apply_cnt\":0,\"apply_amt\":0.000000,\"first_review_finish_cnt\":0,\"second_review_finish_cnt\":0,\"final_review_finish_cnt\":0,\"review_accept_cnt\":0,\"sign_finish_cnt\":0,\"sign_finish_amt\":0.000000,\"loan_batch_success_cnt\":0,\"loan_batch_success_amt\":0.00},{\"hours_desc\":\"历史累计\",\"apply_cnt\":9,\"apply_amt\":7130000.000000,\"first_review_finish_cnt\":0,\"second_review_finish_cnt\":5,\"final_review_finish_cnt\":1,\"review_accept_cnt\":5,\"sign_finish_cnt\":2,\"sign_finish_amt\":2000.000000,\"loan_batch_success_cnt\":4,\"loan_batch_success_amt\":228700.00}],\"errorMessage\":\"\"}}}";

        LinkedHashMap<String, String> jsonMap = JSON.parseObject(str, new TypeReference<LinkedHashMap<String, String>>() {
        });

    }

}