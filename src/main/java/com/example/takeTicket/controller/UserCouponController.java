package com.example.takeTicket.controller;

import java.util.List;

import com.example.takeTicket.domain.CustCouponRecord;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.example.takeTicket.exception.CouponException;
import com.example.takeTicket.service.UserCouponService;
import com.example.takeTicket.vo.ResponseBody;
import com.example.takeTicket.vo.ResponseHeader;
import com.example.takeTicket.vo.UserCoupon;
import com.example.takeTicket.vo.UserCouponAllInfoVo;

/**
 * Created by cxy on 2018/11/19
 */
@RestController
@RequestMapping("/coupon")
public class UserCouponController {

    @Autowired
    UserCouponService userCouponService;

    /**
     * 销毁优惠券
     * @param userCouponId
     * @return
     * @throws CouponException
     */
    @RequestMapping(value = "/destroy",method =RequestMethod.GET)
    public ResponseBody<CustCouponRecord> destroyCoupon(@RequestParam("userCouponId")String userCouponId) throws CouponException {
        //ResponseHeader responseHeader=new ResponseHeader();
        ResponseBody<CustCouponRecord> responseBody=new ResponseBody<>();
        CustCouponRecord custCouponRecord=userCouponService.destroyCoupon(userCouponId);
        responseBody.setData(custCouponRecord);
        return responseBody;
    }

    /**
     * 查询优惠券信息
     * @param userCouponId
     * @return
     * @throws CouponException
     */
    @RequestMapping(value = "/selectbyid",method = RequestMethod.GET)
    public ResponseBody<UserCoupon> selectById(@RequestParam("userCouponId")String userCouponId,@RequestParam("shopId")String shopId)  throws CouponException{
        ResponseBody<UserCoupon> responseBody=new ResponseBody<>();
        UserCoupon userCoupon=userCouponService.selectById(userCouponId,shopId);
        responseBody.setData(userCoupon);

        return responseBody;

    }
    
    /**
     * 查询客户优惠券一览
     * @param userCouponId
     * @return
     * @throws CouponException
     */
    @RequestMapping(value = "/selectCouponListByCust",method = RequestMethod.GET)
    public ResponseBody<List<UserCouponAllInfoVo>> selectCouponListByCust(@RequestParam("custId")String custId,@RequestParam("couponStatus")String couponStatus)  throws CouponException{
        ResponseBody<List<UserCouponAllInfoVo>> responseBody=new ResponseBody<>();
       
        responseBody.setData(userCouponService.selectCouponListByCust(custId, couponStatus));

        return responseBody;

    }

}
