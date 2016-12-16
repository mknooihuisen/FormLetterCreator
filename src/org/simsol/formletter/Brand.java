package org.simsol.formletter;

import java.util.Calendar;


/**
 * Simple Brand management class for standardization of branding throughout program. 
 * TODO: Add GIT version control number dynamically
 * @author Michael Knooihuisen
 *
 */
public class Brand {
	
	
	public static final String APP_NAME = "Form Letter Creator";
	
	public static final String MAJOR_VERSION = "0.1.";
	
	public static final int MINOR_VERSION = 1;
	
	public static final int YEAR_CREATED = 2016;
	
	
	public static final String [] COPYRIGHT_HOLDERS = {"Michael Knooihuisen", "SALLY"};
	
	
	public static final String ADDITIONAL = "Looking for a Programmer for hire?  http://simplysolutionscoding.com";
	
	public static String getLongVersion() {
		return MAJOR_VERSION + MINOR_VERSION;
		
	}
	
	/**
	 * 
	 * @return the fully qualified application name
	 */
	public static String getFullName() {
		return APP_NAME + " " + getLongVersion();
	}
	
	/**
	 * 
	 * @return Full copyright text
	 */
	public static String getCopyright() {
		//make sure copyright includes current year
		int y = Calendar.getInstance().get(Calendar.YEAR);
		String val = "Copyright \u00a9 2016";
		
		//display multiple years?
		if(YEAR_CREATED != y) {
			val += "-" + y;
		}
		
		val += " ";
		
		int num = COPYRIGHT_HOLDERS.length;
		
		//intelligently create copyright line
		for(int i = 0; i < num; i++) {
			val += COPYRIGHT_HOLDERS[i];
			
			if(i < num - 2) {
				val += ", ";
			} else if(i < num - 1) {
				val += " and ";
			}
			
		}
		
		//append license
		val += ".  Licensed Under MIT.";
		return val;
	}
	
	public static void main(String [] agr) {
		System.out.println(getCopyright());
	}
	
	
	/**
	 * 
	 * @return Full Copyright text along with additional information
	 */
	public static String getFullCopyright() {
		return getCopyright() + "\n" + ADDITIONAL;
	}
}
