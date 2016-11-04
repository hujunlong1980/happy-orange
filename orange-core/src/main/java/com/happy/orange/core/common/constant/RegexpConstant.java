/******************************************************************************
* Copyright (C) 2016 hujunlong
* All Rights Reserved.
* 本软件为hujunlong开发研制。未经本公司正式书面同意，其他任何个人、团体不得使用、
* 复制、修改或发布本软件.
*****************************************************************************/

package com.happy.orange.core.common.constant;

/**
* @ClassName: RegexpConstant
* @Description: 正则常量
* @author: hujunlong
* @history: 2016年11月3日  hujunlong  Create
*
*/

public class RegexpConstant {
	/**
	 * 匹配图象 <br>
	 *
	 * 格式: /相对路径/文件名.后缀 (后缀为gif,dmp,png)
	 *
	 * 匹配 : /forum/head_icon/admini2005111_ff.gif 或 admini2005111.dmp<br>
	 *
	 * 不匹配: c:/admins4512.gif
	 *
	 */
	public static final String icon_regexp = "^(/{0,1}\\w){1,}\\.(gif|dmp|png|jpg)$|^\\w{1,}\\.(gif|dmp|png|jpg)$";

	/**
	 * 匹配email地址 <br>
	 *
	 * 格式: XXX@XXX.XXX.XX
	 *
	 * 匹配 : foo@bar.com 或 foobar@foobar.com.au <br>
	 *
	 * 不匹配: foo@bar 或 $$$@bar.com
	 *
	 */
	public static final String email_regexp = "(?:\\w[-._\\w]*\\w@\\w[-._\\w]*\\w\\.\\w{2,3}$)";

	/**
	 * 匹配匹配并提取url <br>
	 *
	 * 格式: XXXX://XXX.XXX.XXX.XX/XXX.XXX?XXX=XXX
	 *
	 * 匹配 : http://www.suncer.com 或news://www<br>
	 *
	 * 提取(MatchResult matchResult=matcher.getMatch()):
	 *  			matchResult.group(0)= http://www.suncer.com:8080/index.html?login=true
	 *              matchResult.group(1) = http
	 *              matchResult.group(2) = www.suncer.com
	 *              matchResult.group(3) = :8080
	 *              matchResult.group(4) = /index.html?login=true
	 *
	 * 不匹配: c:\window
	 *
	 */
	public static final String url_regexp = "(\\w+)://([^/:]+)(:\\d*)?([^#\\s]*)";

	/**
	 * 匹配并提取http <br>
	 *
	 * 格式: http://XXX.XXX.XXX.XX/XXX.XXX?XXX=XXX 或 ftp://XXX.XXX.XXX 或 https://XXX
	 *
	 * 匹配 : http://www.suncer.com:8080/index.html?login=true<br>
	 *
	 * 提取(MatchResult matchResult=matcher.getMatch()):
	 *  			matchResult.group(0)= http://www.suncer.com:8080/index.html?login=true
	 *              matchResult.group(1) = http
	 *              matchResult.group(2) = www.suncer.com
	 *              matchResult.group(3) = :8080
	 *              matchResult.group(4) = /index.html?login=true
	 *
	 * 不匹配: news://www
	 *
	 */
	public static final String http_regexp = "(http|https|ftp)://([^/:]+)(:\\d*)?([^#\\s]*)";

	/**
	 * 匹配日期 <br>
	 *
	 * 格式(首位不为0): XXXX-XX-XX 或 XXXX XX XX 或 XXXX-X-X <br>
	 *
	 * 范围:1900--2099 <br>
	 *
	 * 匹配 : 2005-04-04 <br>
	 *
	 * 不匹配: 01-01-01
	 *
	 */
	public static final String date_regexp = "^((((19){1}|(20){1})d{2})|d{2})[-\\s]{1}[01]{1}d{1}[-\\s]{1}[0-3]{1}d{1}$";// 匹配日期

	/**
	 * 匹配电话 <br>
	 *
	 * 格式为: 0XXX-XXXXXX(10-13位首位必须为0) 或0XXX XXXXXXX(10-13位首位必须为0) 或 <br>
	 * (0XXX)XXXXXXXX(11-14位首位必须为0) 或 XXXXXXXX(6-8位首位不为0) 或
	 * XXXXXXXXXXX(11位首位不为0) <br>
	 *
	 * 匹配 : 0371-123456 或 (0371)1234567 或 (0371)12345678 或 010-123456 或
	 * 010-12345678 或 12345678912 <br>
	 *
	 * 不匹配: 1111-134355 或 0123456789
	 *
	 */
	public static final String phone_regexp = "^(?:0[0-9]{2,3}[-\\s]{1}|\\(0[0-9]{2,4}\\))[0-9]{6,8}$|^[1-9]{1}[0-9]{5,7}$|^[1-9]{1}[0-9]{10}$";

	/**
	 * 匹配身份证 <br>
	 *
	 * 格式为: XXXXXXXXXXXXXXX(15位) 或 XXXXXXXXXXXXXXXXXX(18位) <br>
	 *
	 * 匹配 : 0123456789123 <br>
	 *
	 * 不匹配: 0123456
	 *
	 */
	public static final String ID_card_regexp = "^\\d{15}|[0-9]{17}[0-9Xx]{1}$";

	/**
	 * 匹配邮编代码 <br>
	 *
	 * 格式为: XXXXXX(6位) <br>
	 *
	 * 匹配 : 012345 <br>
	 *
	 * 不匹配: 0123456
	 *
	 */
	public static final String ZIP_regexp = "^[0-9]{6}$";// 匹配邮编代码


	/**
	 * 不包括特殊字符的匹配 (字符串中不包括符号 数学次方号^ 单引号' 双引号" 分号; 逗号, 帽号: 数学减号- 右尖括号> 左尖括号<  反斜杠\ 即空格,制表符,回车符等 )<br>
	 *
	 * 格式为: x 或 一个一上的字符 <br>
	 *
	 * 匹配 : 012345 <br>
	 *
	 * 不匹配: 0123456
	 *
	 */
	public static final String non_special_char_regexp = "^[^'\"\\;,:-<>\\s].+$";// 匹配邮编代码


	/**
	 * 匹配非负整数（正整数 + 0)
	 */
	public static final String non_negative_integers_regexp = "^\\d+$";

	/**
	 * 匹配不包括零的非负整数（正整数 > 0)
	 */
	public static final String non_zero_negative_integers_regexp = "^[1-9]+\\d*$";

	/**
	 *
	 * 匹配正整数
	 *
	 */
	public static final String positive_integer_regexp = "^[0-9]*[1-9][0-9]*$";

	/**
	 *
	 * 匹配非正整数（负整数 + 0）
	 *
	 */
	public static final String non_positive_integers_regexp = "^((-\\d+)|(0+))$";

	/**
	 *
	 * 匹配负整数
	 *
	 */
	public static final String negative_integers_regexp = "^-[0-9]*[1-9][0-9]*$";

	/**
	 *
	 * 匹配整数
	 *
	 */
	public static final String integer_regexp = "^-?\\d+$";

	/**
	 *
	 * 匹配非负浮点数（正浮点数 + 0）
	 *
	 */
	public static final String non_negative_rational_numbers_regexp = "^\\d+(\\.\\d+)?$";

	/**
	 *
	 * 匹配正浮点数
	 *
	 */
	public static final String positive_rational_numbers_regexp = "^(([0-9]+\\.[0-9]*[1-9][0-9]*)|([0-9]*[1-9][0-9]*\\.[0-9]+)|([0-9]*[1-9][0-9]*))$";

	/**
	 *
	 * 匹配非正浮点数（负浮点数 + 0）
	 *
	 */
	public static final String non_positive_rational_numbers_regexp = "^((-\\d+(\\.\\d+)?)|(0+(\\.0+)?))$";

	/**
	 *
	 * 匹配负浮点数
	 *
	 */
	public static final String negative_rational_numbers_regexp = "^(-(([0-9]+\\.[0-9]*[1-9][0-9]*)|([0-9]*[1-9][0-9]*\\.[0-9]+)|([0-9]*[1-9][0-9]*)))$";

	/**
	 *
	 * 匹配浮点数
	 *
	 */
	public static final String rational_numbers_regexp = "^(-?\\d+)(\\.\\d+)?$";

	/**
	 *
	 * 匹配由26个英文字母组成的字符串
	 *
	 */
	public static final String letter_regexp = "^[A-Za-z]+$";

	/**
	 *
	 * 匹配由26个英文字母的大写组成的字符串
	 *
	 */
	public static final String upward_letter_regexp = "^[A-Z]+$";

	/**
	 *
	 * 匹配由26个英文字母的小写组成的字符串
	 *
	 */
	public static final String lower_letter_regexp = "^[a-z]+$";

	/**
	 *
	 * 匹配由数字和26个英文字母组成的字符串
	 *
	 */
	public static final String letter_number_regexp = "^[A-Za-z0-9]+$";

	/**
	 *
	 * 匹配由数字、26个英文字母或者下划线组成的字符串
	 *
	 */
	public static final String letter_number_underline_regexp = "^\\w+$";

}
