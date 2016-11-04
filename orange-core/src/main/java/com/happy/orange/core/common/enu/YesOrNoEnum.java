/******************************************************************************
* Copyright (C) 2016 hujunlong
* All Rights Reserved.
* 本软件为hujunlong开发研制。未经本公司正式书面同意，其他任何个人、团体不得使用、
* 复制、修改或发布本软件.
*****************************************************************************/

package com.happy.orange.core.common.enu;

/**
* @ClassName: YesOrNoEnum
* @Description: 判读用枚举类
* @author: hujunlong
* @history: 2016年11月4日  hujunlong  Create
*
*/

public enum YesOrNoEnum {
	YES("yes","是"),
	NO("no","否");

	private final String code;
	private final String desc;

	YesOrNoEnum(String code, String desc) {
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

	public static boolean isYesOrNo(String code) {
		for (YesOrNoEnum itEnum : YesOrNoEnum.values()) {
			if (itEnum.getCode().equals(code)) {
				return true;
			}
		}
		return false;
	}
}
