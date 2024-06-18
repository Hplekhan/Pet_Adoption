package com.excel.pet.response;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@Builder
public class Success<T> {

	/*T -> Any type of Data*/
	private T data;
	private String message;
	private boolean isError;
}
