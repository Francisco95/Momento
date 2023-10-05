package project.momento.imgup.controller;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.io.ByteArrayResource;
import org.springframework.core.io.FileSystemResource;
import org.springframework.http.HttpEntity;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpMethod;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.util.FileCopyUtils;
import org.springframework.util.LinkedMultiValueMap;
import org.springframework.util.MultiValueMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.client.HttpServerErrorException;
import org.springframework.web.client.RestTemplate;
import org.springframework.web.multipart.MultipartFile;

import project.momento.imgup.dto.ImgupDto;
import project.momento.imgup.service.ImgupService;

@Controller
public class ImgupController {
	
//	 @Autowired
//	 private ImgupService imgupService;
	

	/*
	 * 이미지 페이지 이동
	 * param
	 */
	@RequestMapping(value="/imgup.com", produces="application/text;charset=utf-8") /* value주소 이름*/
	public String imgupMain( Model model) {
	    return "content/imgup";
	}
	
	/*
	 * 이미지 저장
	 * param 
	 * return  
	 */
	@PostMapping(value = "/imgUpload.com",produces="application/text;charset=utf-8") /* value주소 이름*/
	public String imgupdate(ImgupDto imgupDto) throws IOException {
		System.out.println(imgupDto.getImgFile());
		MultipartFile uploadFile = imgupDto.getImgFile();
		System.out.println(uploadFile.getBytes());
		RestTemplate restTemplate = new RestTemplate();
	    String url = "http://127.0.0.1:5000/predict";
	    HttpHeaders headers = new HttpHeaders();
	    headers.setContentType(MediaType.MULTIPART_FORM_DATA);

	    MultiValueMap<String, Object> body = new LinkedMultiValueMap<>();
	    ByteArrayResource contentsAsResource;
	    try {
	        contentsAsResource = new ByteArrayResource(uploadFile.getBytes()) {
	            @Override
	            public String getFilename() {
	                return uploadFile.getOriginalFilename();
	            }
	        };
	        body.add("image", contentsAsResource);
	    } catch (IOException e) {
	        e.printStackTrace();
	    }

	    HttpEntity<MultiValueMap<String, Object>> requestEntity = new HttpEntity<>(body, headers);
	    ResponseEntity<String> response = restTemplate.postForEntity(url, requestEntity, String.class);
	    System.out.println("HTTP Status: " + response.getStatusCode());
	    System.out.println("Response Body: " + response.getBody());
		return "content/chart";
	}
}