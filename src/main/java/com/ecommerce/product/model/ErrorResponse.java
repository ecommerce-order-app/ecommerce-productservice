package com.ecommerce.product.model;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class ErrorResponse {
	private String errorMessage;
	private String errorCode;
	
//	public ErrorResponse() {
//		super();
//	}
//
//	public ErrorResponse(String errorMessage, String errorCode) {
//		super();
//		this.errorMessage = errorMessage;
//		this.errorCode = errorCode;
//	}
	public String getErrorMessage() {
		return errorMessage;
	}
	public void setErrorMessage(String errorMessage) {
		this.errorMessage = errorMessage;
	}
	public String getErrorCode() {
		return errorCode;
	}
	public void setErrorCode(String errorCode) {
		this.errorCode = errorCode;
	}
	
	
}
