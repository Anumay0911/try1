package com.example.demo.handler;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;

import org.springframework.web.multipart.MultipartFile;

public class fileHandler {
	
	public static boolean saveFile(MultipartFile mf,String path) {
		try {
			InputStream is=mf.getInputStream();
			byte[] b=new byte[is.available()];
			is.read(b);
			FileOutputStream fos=new FileOutputStream(path+"\\"+mf.getOriginalFilename());
			fos.write(b);
			fos.close();
			return true;
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return false;
	}

}
