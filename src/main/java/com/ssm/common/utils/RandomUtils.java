package com.ssm.common.utils;

import java.util.Random;
import java.util.UUID;

/**
 * 
 * 随机方法
 *
 */
public class RandomUtils {

	public static String getRandomChar(int count) {
		String str="";
		for (int i = 0; i < count; i++) {
			int highPos;
			int lowPos;
			Random random=new Random();
			highPos=(176+Math.abs(random.nextInt(39)));
			lowPos=(161+Math.abs(random.nextInt(93)));
			byte[] b=new byte[2];
			b[0]=(Integer.valueOf(highPos)).byteValue();
			b[1]=(Integer.valueOf(lowPos)).byteValue();
			try {
				str=str+new String(b,"GBK");
			} catch (Exception e) {
				e.printStackTrace();
			}
		}
		return str;
	}
	//生成11位唯一性的随机号
    public static String getUUID(){
        //随机生成一位整数
        int random = (int) (Math.random()*9+1);
        String valueOf = String.valueOf(random);
        //生成uuid的hashCode值
        int hashCode = UUID.randomUUID().toString().hashCode();
        //可能为负数
        if(hashCode<0){
            hashCode = -hashCode;
        }
        String value = valueOf + String.format("%010d", hashCode);
        return value;
    }
	public static void main(String[] args) {
		for (int i = 0; i < 15; i++) {
			System.out.println(getUUID());
		}

	}
}
