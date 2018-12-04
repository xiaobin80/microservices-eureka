package com.tdtc.eureka.feign;

import org.springframework.stereotype.Component;

import com.tdtc.eureka.feign.FindAllClient.UserdetailsClient;

import feign.hystrix.FallbackFactory;

@Component
public class UserdetailsFallbackFactory implements FallbackFactory<UserdetailsClient> {

	@Override
	public UserdetailsClient create(Throwable throwable) {
		String msg = throwable.getMessage();
		
		return new UserdetailsClient(){

			@Override
			public String findAll() {
				// TODO Auto-generated method stub
				return "Error message:" + msg;
			}
			
		};
	}

}
