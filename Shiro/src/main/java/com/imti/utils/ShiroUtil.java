package com.imti.utils;

import org.apache.shiro.SecurityUtils;
import org.apache.shiro.config.IniSecurityManagerFactory;
import org.apache.shiro.mgt.SecurityManager;
import org.apache.shiro.subject.Subject;
import org.apache.shiro.util.Factory;

/**@�ļ���: ShiroUtil.java
 * @�๦��˵��: 
 * @����: ShiDaBao
 * @Email: 1471262032@qq.com
 * @����: 2020��6��29������3:47:36
 * @�޸�˵��:<br> 
 * <pre>
 * 	 <li>����: ShiDaBao</li> 
 * 	 <li>����: 2020��6��29������3:47:36</li> 
 *	 <li>����: </li>
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
