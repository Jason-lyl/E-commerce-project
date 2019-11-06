package com.mmall.service;

import com.github.pagehelper.PageInfo;
import com.mmall.common.ServerResponse;
import com.mmall.pojo.Shipping;

import javax.servlet.http.HttpSession;

/**
 * @author jason
 * @2019/11/6
 */

public interface IShippingService {

    public ServerResponse add (Integer userId, Shipping shipping);

    public ServerResponse<String> delete (Integer userId, Integer shippingId);

    public ServerResponse update (Integer userId, Shipping shipping);

    public ServerResponse<Shipping> select (Integer userId, Integer shippingId);

    public ServerResponse<PageInfo> list (Integer userId, Integer pageNum, Integer pageSize);


    }
