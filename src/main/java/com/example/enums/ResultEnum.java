package com.example.enums;

import lombok.Getter;

/**
 * Created by qidd on 2018-3-11
 */
@Getter
public enum ResultEnum {
    CANCEL_SUCCESS(21, "卖家端订单取消成功"),
    PARAM_ERROR(1, "参数不正确"),
    PRODUCT_NOT_EXIST(10, "商品不存在"),
    PRODUCT_STOCK_ERROR(11, "库存错误"),
    ORDER_NOT_EXIST(12, "订单不存在"),
    ORDERDETAIL_NOT_EXIST(13, "订单详情不存在"),
    ORDER_STATUS_ERROR(14, "订单状态错误"),
    ORDER_UPDATE_FAIL(15, "订单更新失败"),
    ORDER_DETAIL_EMPTY(16, "订单详情为空"),
    CART_EMPTY(18, "购物车不能为空"),
    ORDER_PAY_STATUS_ERROR(17, "订单支付状态不正确"),
    ORDER_OWNER_ERROR(18, "订单不属于当前用户"),
    WECHAT_MP_ERROR(19, "微信方面错误"),
    WXPAY_NOTIFY_MONEY_VERIFY_ERROR(20, "金额校验不通过"),
    ORDER_FINISH_SUCCESS(22, "订单完结成功"),
    PRODUCT_STATUS_ERROR(23, "商品状态错误"),
    LOGIN_FAIL(24, "登陆失败，登录信息不正确"), LOGOUT_SUCCESS(25, "登出成功");

    private Integer code;

    private String message;

    public Integer getCode() {
        return code;
    }

    public void setCode(Integer code) {
        this.code = code;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    ResultEnum(Integer code, String message) {
        this.code = code;
        this.message = message;
    }


}
