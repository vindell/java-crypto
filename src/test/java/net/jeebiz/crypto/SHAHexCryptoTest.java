/**
 * Copyright (c) 2018, vindell (https://github.com/vindell).
 *
 * Licensed under the Apache License, Version 2.0 (the "License"); you may not
 * use this file except in compliance with the License. You may obtain a copy of
 * the License at
 *
 * http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS, WITHOUT
 * WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied. See the
 * License for the specific language governing permissions and limitations under
 * the License.
 */
package net.jeebiz.crypto;

import org.apache.commons.codec.EncoderException;

import net.jeebiz.crypto.algorithm.SHAHexCrypto;

public class SHAHexCryptoTest {
	
	/**
	 * 提供一个测试的主函数
	 * @throws EncoderException 
	 */
	public static void main(String[] args){
		
		SHAHexCrypto codec = SHAHexCrypto.getInstance();
		/*try {
			System.out.println(getMD5DigestHex("").toUpperCase());
		} catch (NoSuchAlgorithmException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}*/
		System.out.println("test:" + codec.encode("").toUpperCase());
		System.out.println("123:" + codec.encode("123").toUpperCase());
		System.out.println("123456789:" + codec.encode("123456789").toUpperCase());
		System.out.println("sarin:" + codec.encode("sarin").toUpperCase());
		System.out.println("123:" + codec.encode("123", 4).toUpperCase());
	}

	
}
