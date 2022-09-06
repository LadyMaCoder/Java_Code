package com.cucn.CP;

/**
 * @Description
 * @author mazhuxin
 * @date 2022年4月29日下午5:14:46
 */
public class CookerProxy {
	private ICooker welcomeCooker;

	public CookerProxy(ICooker welcomeCooker) {
		this.welcomeCooker = welcomeCooker;
	}
	public void cooking() {
        System.out.println("Action");
        welcomeCooker.cooking();
        System.out.println("Cut");
    }
	
}
