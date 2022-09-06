package com.cucn.CP;

/**
 * @Description
 * @author mazhuxin
 * @date 2022年4月29日下午7:50:06
 */
public class Test {
	private static CookerProxy proxy;
    public static void main(String[] args) {
        proxy = new CookerProxy(new Aunt());
        proxy.cooking();
        proxy = new CookerProxy(new CommonCooker());
        proxy.cooking();
        proxy = new CookerProxy(new BigCooker());
        proxy.cooking();
    }

}
