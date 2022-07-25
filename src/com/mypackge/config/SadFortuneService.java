package com.mypackge.config;

public class SadFortuneService implements FortuneService {

	@Override
	public String getFortune() {
		return "Bad luck is upon you today";
	}

}
