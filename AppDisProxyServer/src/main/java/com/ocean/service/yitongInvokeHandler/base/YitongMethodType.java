package com.ocean.service.yitongInvokeHandler.base;
/** * @author Alex & E-mail:569246607@qq.com
      @date   2017年10月10日 
      @version 1.0 
 */
public enum YitongMethodType {
	APP_LIST_SEARCH(1,"appListSearch"),
	PACKAGE_SEARCH(2,"packageSearch"),
	KEYWORD_SEARCH(2,"keywordSearch");
    private int value;
    private String name;
    private YitongMethodType(int value,String name){
    	this.value=value;
    	this.name=name;
    }
	public int getValue() {
		return value;
	}
	public void setValue(int value) {
		this.value = value;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
}
