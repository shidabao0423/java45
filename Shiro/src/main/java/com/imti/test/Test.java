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

/**@�ļ���: Test.java
 * @�๦��˵��: 
 * @����: ShiDaBao
 * @Email: 1471262032@qq.com
 * @����: 2020��6��29������11:05:41
 * @�޸�˵��:<br> 
 * <pre>
 * 	 <li>����: ShiDaBao</li> 
 * 	 <li>����: 2020��6��29������11:05:41</li> 
 *	 <li>����: </li>
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
			currentUser.login(Token); System.out.println("��¼�ɹ�");
			
			if(currentUser.isPermittedAll("user:select","user:add")){
				System.out.println("�û����и�Ȩ��");
				
			};
			/*for (String res : roles) {
				if(currentUser.hasRole(res)){
					
					System.out.println("�û�����"+res+"��ɫ");}
			}*/
				
			
		} catch (UnknownAccountException e ) {System.out.println("δ֪�˺ţ�");		
		}catch (IncorrectCredentialsException e) {System.out.println("�������");
		}catch (Exception e) {System.out.println("δ֪����");e.printStackTrace();
		}
	
	}

}
