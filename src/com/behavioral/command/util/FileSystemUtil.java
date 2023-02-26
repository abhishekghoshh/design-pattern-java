package com.behavioral.command.util;

import com.behavioral.command.FileSystem;
import com.behavioral.command.UnixFileSystem;
import com.behavioral.command.WindowsFileSystem;

public class FileSystemUtil {
	
	public static FileSystem getFileSystem(){
        String osName = System.getProperty("os.name");
        System.out.println("Underlying OS is : "+osName);
        
        if(osName.contains("Windows")){
            return new WindowsFileSystem();
        }else if(osName.contains("Unix")){
            return new UnixFileSystem();
        }else {
        	throw new RuntimeException("Unknown operating system");
        }
    }
}
