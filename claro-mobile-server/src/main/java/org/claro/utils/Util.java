package org.claro.utils;

import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.security.SecureRandom;

public class Util {

	public static String gerarCode() {
		return hexEncode(result());
	}

	private static byte[] result() {
		try {
			SecureRandom prng = SecureRandom.getInstance("SHA1PRNG");
			String randomNum = new Integer(prng.nextInt()).toString();
			MessageDigest sha = MessageDigest.getInstance("SHA-1");
			return sha.digest(randomNum.getBytes());
		} catch (NoSuchAlgorithmException e) {
			return null;
		}
	}

	private static String hexEncode(byte[] aInput) {
		StringBuilder result = new StringBuilder();
		char[] digits = { '0', '1', '2', '3', '4', '5', '6', '7', '8', '9',
				'a', 'b', 'c', 'd', 'e', 'f' };
		for (int idx = 0; idx < aInput.length; ++idx) {
			byte b = aInput[idx];
			result.append(digits[(b & 0xf0) >> 4]);
			result.append(digits[b & 0x0f]);
		}
		return result.toString();
	}
}
