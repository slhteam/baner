package com.ztkx.cbpay.platformutil.test;

import com.ztkx.cbpay.platformutil.baseconfig.BaseConfig;

public class BaseConfigTest {

	public void test() {
		BaseConfig.getInstence("E:\\svn_workspack\\cbpay\\src\\trunck\\platform_util\\config\\baseConf.properties");
		System.out.println(BaseConfig.getConfig("aaa"));
	}

}