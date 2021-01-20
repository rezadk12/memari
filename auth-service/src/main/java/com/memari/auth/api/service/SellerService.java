package com.memari.auth.api.service;

import com.memari.auth.api.model.User;
import com.quebic.common.service.GenericService;

import rx.Single;

public interface SellerService extends GenericService<User>{
	Single<User> registerOtherSeller(User seller);
}
