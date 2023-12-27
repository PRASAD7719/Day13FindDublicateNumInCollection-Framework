/* Find Dublicate num by using collection Framework
 * 
 */
package main1;

import java.util.HashSet;

public class Day13FindDublicateNum {
	public static void main(String[] args) {
		
	
	
	String s="Welcome to java";
	
	HashSet<Character>set=new HashSet<>();
	
	for(int i=0;i<s.length();i++)
		set.add(s.charAt(i));
	
	for(Character ch:set)
		System.out.print(ch);

 }
}