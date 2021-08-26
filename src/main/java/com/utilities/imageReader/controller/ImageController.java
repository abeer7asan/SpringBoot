package com.utilities.imageReader.controller;

import java.io.DataInputStream;
import java.io.FileInputStream;
import java.io.FileNotFoundException;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;
import org.springframework.core.io.InputStreamResource;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/imageservice")
@Configuration
@PropertySource("classpath:application.properties")

public class ImageController {

	private static final Logger log = LoggerFactory.getLogger(ImageController.class);
	@Value("${service.imagePath}")
	private String imagePath;
	
	@GetMapping(value = "/img/{imageId}", produces = MediaType.IMAGE_JPEG_VALUE)
	public ResponseEntity<InputStreamResource> getImage(@PathVariable(value = "imageId") String imageId)
			throws FileNotFoundException {
		log.info("********  getImage service started");
		String file = imagePath + imageId;
		DataInputStream reader;

		reader = new DataInputStream(new FileInputStream(file));

		return ResponseEntity.ok().contentType(MediaType.IMAGE_JPEG).body(new InputStreamResource(reader));
	}
	
	
	@ExceptionHandler({ FileNotFoundException.class })
    public String handleException() {
		return "File Not Found";
        
    }

}
