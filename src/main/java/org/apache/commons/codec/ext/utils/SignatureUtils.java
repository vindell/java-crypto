package org.apache.commons.codec.ext.utils;

import java.security.GeneralSecurityException;
import java.security.PrivateKey;
import java.security.PublicKey;
import java.security.Signature;

/**
 * 
 * @description:签名工具类
 * @author <a href="mailto:hnxyhcwdl1003@163.com">wandalong</a>
 * @date 2014-9-26
 */
public class SignatureUtils {
	
	public static Signature getSignature(String algorithm) throws GeneralSecurityException{
		return Signature.getInstance(algorithm);  
	}
	
	
	public static Signature getSignature(String algorithm, String provider) throws GeneralSecurityException{
		return Signature.getInstance(algorithm,provider);  
	}	
	
	public static byte[] sign(byte[] data,Signature signature,PrivateKey privateKey) throws GeneralSecurityException{
		signature.initSign(privateKey);
 		signature.update(data);
 		//用私钥对信息生成数字签名
 		return signature.sign();
	}
	
	public static boolean verify(byte[] data,byte[] sign,Signature signature,PublicKey publicKey) throws GeneralSecurityException{
		signature.initVerify(publicKey);
 		signature.update(data);
 		// 验证签名是否正常
 		return signature.verify(sign);
	}
	
}