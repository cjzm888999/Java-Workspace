package com.test;


/**
 * ������
 * @author xiaanming
 *
 */
public class Test {
	public static void main(String[]args){
		/**
		 * new һ��С��
		 */
		Li li = new Li();

		/**
		 * new һ��С��
		 */
		Wang wang = new Wang(li);
		
		/**
		 * С����С������
		 */
		wang.askQuestion("1 + 1 = ?");
	}
}


