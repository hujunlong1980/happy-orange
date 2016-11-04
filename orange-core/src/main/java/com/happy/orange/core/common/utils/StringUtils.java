/******************************************************************************
* Copyright (C) 2016 hujunlong
* All Rights Reserved.
* 本软件为hujunlong开发研制。未经本公司正式书面同意，其他任何个人、团体不得使用、
* 复制、修改或发布本软件.
*****************************************************************************/

package com.happy.orange.core.common.utils;

/**
* @ClassName: StringUtils
* @Description: 字符串工具类
* @author: hujunlong
* @history: 2016年11月4日  hujunlong  Create
*
*/

public class StringUtils {

    /**
     * <p>Checks if a String is empty ("") or null.</p>
     * @param value
     * @return
     */
    public static boolean isEmpty(String value) {
        return value == null || value.length() == 0;
    }
    /**
     * <p>Checks if a String is not empty ("") and null.</p>
     * @param value
     * @return
     */
    public static boolean isNotEmpty(String value) {
    	return !isEmpty(value);
    }
    /**
     * <p>Checks if a String is empty ("") or null or have half space(' ') or have full space(' ') or have ISO控制字符.</p>
     * @param str
     * @return
     */
    public static boolean isEmptyForHttp(String value)
    {
      int length = value.length();
      if (isEmpty(value)) {
    	  return true;
      }
      for (int index = 0; index < length; index++) {
    	  char ch = value.charAt(index);
    	  if (!(ch == ' ' || ch == ' ' || Character.isISOControl(ch))) {
    		  return false;
    	  }
      }
      return true;
    }
    /**
     * <p>Checks if a String is whitespace, empty ("") or null.</p>
     * @param value
     * @return
     */
    public static boolean isBlank(String value) {
    	if(isEmpty(value)){
    		return true;
    	}
        int strLen = value.length();
        for (int i = 0; i < strLen; i++) {
            if (!Character.isWhitespace(value.charAt(i))) {
                return false;
            }
        }
        return true;
    }
    /**
     * <p>Checks if a String is not whitespace, empty ("") and null.</p>
     * @param value
     * @return
     */
    public static boolean isNotBlank(String value) {
    	return !isBlank(value);
    }
    /**
     * <p>Removes whitespace from both ends of this String
     * @param str
     * @return
     */
    public static String trim(String value) {
        return value == null ? null : value.trim();
    }
    /**
     * Returns a new string that is a substring of this string. The
     * substring begins at the specified <code>0</code> and
     * extends to the character at index <code>maxlength - 1</code>.
     * Thus the length of the substring is <code>maxlength</code>.
     * if <code>isappend</code> is true,appends the specified string 【...】 to this substring
     * <p>
     *
     * @param value
     * @param maxlength
     * @param isappend
     * @return
     */
    public static String truncate(String value, int maxlength, boolean isappend) {
      if ((value == null) || (value.length() <= maxlength))
        return value;
      if (isappend) {
    	  return new StringBuilder().append(value.substring(0, maxlength)).append("...").toString();
      }
      return value.substring(0, maxlength);
    }

}
