package com.example.demo;

import java.io.FileInputStream;
import java.io.FileOutputStream;

import org.apache.commons.io.IOUtils;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.multipart.MultipartFile;

@RestController
public class FileOperation {
	@PostMapping(value="/{groupNum}/images",consumes=MediaType.MULTIPART_FORM_DATA_VALUE)
public String fileUp(@PathVariable("groupNum")String num,@RequestParam("image")MultipartFile imgFile) throws Exception {
		FileOutputStream fos = new FileOutputStream("target/"+imgFile.getOriginalFilename());
		IOUtils.copy(imgFile.getInputStream(), fos);
		return "groupNum:"+num+",file up success!";
	}
	@GetMapping(value="/showPictrue",produces=MediaType.IMAGE_PNG_VALUE)
	public byte[] fileDown() throws Exception {
		String file="src/main/resources/1.png";
		FileInputStream fis = new FileInputStream(file);
		return IOUtils.toByteArray(fis);
	}

}
