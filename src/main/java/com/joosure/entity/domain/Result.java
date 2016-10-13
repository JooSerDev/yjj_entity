package com.joosure.entity.domain;

import java.io.Serializable;

/**
 * 默认返回结果<br>
 * errCode＝0时，表示成功；否则表示失败；<br>
 * 返回码400-500，表示授权错误；<br>
 * 返回码1000-1999，表示系统级错误；<br>
 * 返回码2000-2999，表示传入参数非法；<br>
 * 返回码3000-3999，表示数据库数据异常；<br>
 * 
 * @author shawn
 *
 */
@SuppressWarnings("serial")
public class Result implements Serializable {

	protected Integer errCode;
	protected String errMsg;

	public Result() {
	}

	public Result(Integer errCode) {
		this.errCode = errCode;
	}

	public Result(Integer errCode, String errMsg) {
		this.errCode = errCode;
		this.errMsg = errMsg;
	}

	public Integer getErrCode() {
		return errCode;
	}

	public void setErrCode(Integer errCode) {
		this.errCode = errCode;
	}

	public String getErrMsg() {
		return errMsg;
	}

	public void setErrMsg(String errMsg) {
		this.errMsg = errMsg;
	}

}
