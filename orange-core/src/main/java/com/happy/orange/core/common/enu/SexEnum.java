/******************************************************************************
* Copyright (C) 2016 hujunlong
* All Rights Reserved.
* 本软件为hujunlong开发研制。未经本公司正式书面同意，其他任何个人、团体不得使用、
* 复制、修改或发布本软件.
*****************************************************************************/

package com.happy.orange.core.common.enu;

/**
* @ClassName: SexEnum
* @Description: 性别枚举类
* @author: hujunlong
* @history: 2016年11月4日  hujunlong  Create
*
*/

public enum SexEnum {
	MALE("male","男"),
	FEMALE("female","女"),
	NEUTRAL("neutral","中性");

	private final String code;
	private final String desc;

	SexEnum(String code, String desc) {
		this.code = code;
		this.desc = desc;
	}

	/**
	 * @return the code
	 */
	public String getCode() {
		return code;
	}

	/**
	 * @return the desc
	 */
	public String getDesc() {
		return desc;
	}

	public static boolean isSex(String code) {
		for (SexEnum itEnum : SexEnum.values()) {
			if (itEnum.getCode().equals(code)) {
				return true;
			}
		}
		return false;
	}
}
