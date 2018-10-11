package ai.testweb.test;

public enum DateFormatStr {
	CHINA("yyyy-mm-dd"),CHINA_DATETIME("yyyy-mm-dd hh24:mi:ss"),CHINA_TIME("hh24:mi:ss"),US("mm-dd-yyyy"),US_DATETIME("mm-dd-yyyy hh24:mi:ss");
	private String dateFormat;
	public String getDateFormat() {
		return dateFormat;
	}
	private DateFormatStr(String format_str){
		dateFormat=format_str;
	}
}