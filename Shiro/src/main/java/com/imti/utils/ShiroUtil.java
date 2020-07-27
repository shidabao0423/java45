package com.imti.utils;

import org.apache.shiro.SecurityUtils;
import org.apache.shiro.config.IniSecurityManagerFactory;
import org.apache.shiro.mgt.SecurityManager;
import org.apache.shiro.subject.Subject;
import org.apache.shiro.util.Factory;

/**@文件名: ShiroUtil.java
 * @类功能说明: 
 * @作者: ShiDaBao
 * @Email: 1471262032@qq.com
 * @日期: 2020年6月29日下午3:47:36
 * @修改说明:<br> 
 * <pre>
 * 	 <li>作者: ShiDaBao</li> 
 * 	 <li>日期: 2020年6月29日下午3:47:36</li> 
 *	 <li>内容: </li>
 * </pre>
 */
public class ShiroUtil {
	public static Subject getSubject(){
		Factory<SecurityManager> securityManagerFactory=new IniSecurityManagerFactory("classpath:shiro_permission.ini");
	    SecurityManager securityManager=securityManagerFactory.getInstance();
	    SecurityUtils.setSecurityManager(securityManager);
	    Subject currentUser=SecurityUtils.getSubject();
		return currentUser;
	}
	

}
