package com.imti.test;



import java.util.ArrayList;
import java.util.List;

import org.apache.shiro.SecurityUtils;
import org.apache.shiro.authc.IncorrectCredentialsException;
import org.apache.shiro.authc.UnknownAccountException;
import org.apache.shiro.authc.UsernamePasswordToken;
import org.apache.shiro.config.IniSecurityManagerFactory;
import org.apache.shiro.mgt.SecurityManager;
import org.apache.shiro.subject.Subject;
import org.apache.shiro.util.Factory;

import com.imti.utils.ShiroUtil;

/**@文件名: Test.java
 * @类功能说明: 
 * @作者: ShiDaBao
 * @Email: 1471262032@qq.com
 * @日期: 2020年6月29日上午11:05:41
 * @修改说明:<br> 
 * <pre>
 * 	 <li>作者: ShiDaBao</li> 
 * 	 <li>日期: 2020年6月29日上午11:05:41</li> 
 *	 <li>内容: </li>
 * </pre>
 */
public class Test {
	public static void main(String[] args) {
		/*Factory<SecurityManager> securityManagerFactory=new IniSecurityManagerFactory("classpath:jdbcShiro.ini");
		SecurityManager securityManager=securityManagerFactory.getInstance();
		SecurityUtils.setSecurityManager(securityManager);
		Subject currentUser=SecurityUtils.getSubject();*/
		Subject currentUser=ShiroUtil.getSubject();
		/*List<String> roles=new ArrayList<String>();
		roles.add("role1");
		roles.add("role2");*/
	
		UsernamePasswordToken Token=new UsernamePasswordToken("jack", "123");
		try {
			currentUser.login(Token); System.out.println("登录成功");
			
			if(currentUser.isPermittedAll("user:select","user:add")){
				System.out.println("用户具有该权限");
				
			};
			/*for (String res : roles) {
				if(currentUser.hasRole(res)){
					
					System.out.println("用户具有"+res+"角色");}
			}*/
				
			
		} catch (UnknownAccountException e ) {System.out.println("未知账号！");		
		}catch (IncorrectCredentialsException e) {System.out.println("密码错误！");
		}catch (Exception e) {System.out.println("未知错误");e.printStackTrace();
		}
	
	}

}
