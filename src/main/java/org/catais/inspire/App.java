package org.catais.inspire;

import java.io.IOException;

import com.sun.syndication.io.FeedException;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
    	try {
//        	FeedWriter feedWriter = new FeedWriter();
        	FeedWriter3 feedWriter = new FeedWriter3();
    	} catch (FeedException e) {
    		e.printStackTrace();
    	} catch (IOException e) {
    		e.printStackTrace();
    	}
    	
    	
        System.out.println( "Hello World!" );
    }
}
