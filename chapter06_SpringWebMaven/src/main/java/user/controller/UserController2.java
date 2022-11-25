package user.controller;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Iterator;
import java.util.List;

import javax.servlet.http.HttpSession;

import org.springframework.stereotype.Component;
import org.springframework.util.FileCopyUtils;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.multipart.MultipartFile;

@Component
@RequestMapping(value = "user")
public class UserController2 {

	@GetMapping(value = "uploadForm")
	public String uploadForm() {
		return "/user/uploadForm";
	}
//	@PostMapping(value = "upload")
//	@ResponseBody
//	public String upload(@RequestParam MultipartFile img, HttpSession session) { // submit을 통해 넘어오는 값의 name과 반드시 같아야 mapping된다.
////	String filePath = "D:\\Projects\\mhmSpring\\chapter06_SpringWebMaven\\src\\main\\webapp\\WEB-INF\\storage";
//		String filePath = session.getServletContext().getRealPath("/WEB-INF/storage");
//		System.out.println("실제폴더 위치 : "+filePath);
//		String fileName = img.getOriginalFilename();
//		
//		File file = new File(filePath,fileName);
//		
//		try {
////			FileCopyUtils.copy(img.getInputStream(),new FileOutputStream(file)); // 가상폴더로 복사
//			img.transferTo(file);
//		} catch (IOException e) {
//			// TODO Auto-generated catch block
//			e.printStackTrace();
//		}
//		
//		return "<img src='../storage/"+fileName+"' width='300' height='300'/>";
//	}
	
//	@PostMapping(value = "upload")
//	@ResponseBody
//	public void upload(@RequestParam MultipartFile[] img, HttpSession session) {
//		String filePath = session.getServletContext().getRealPath("/WEB-INF/storage");
//		System.out.println("실제폴더 위치 : "+filePath);
//		
//		String fileName;
//		File file;
//		if (img[0] !=null) {
//			fileName = img[0].getOriginalFilename();
//			file = new File(filePath,fileName);
//			
//			try {
//				img[0].transferTo(file);
//			} catch (IOException e) {
//				// TODO Auto-generated catch block
//				e.printStackTrace();
//			}
//		}
//		if (img[1] !=null) {
//			fileName = img[1].getOriginalFilename();
//			file = new File(filePath,fileName);
//			
//			try {
//				img[1].transferTo(file);
//			} catch (IOException e) {
//				// TODO Auto-generated catch block
//				e.printStackTrace();
//			}
//		}
//	}
	
	@PostMapping(value = "upload")
	@ResponseBody
	public void upload(@RequestParam("img[]") List<MultipartFile> list, HttpSession session) {
		String filePath = session.getServletContext().getRealPath("/WEB-INF/storage");
		System.out.println("실제폴더 위치 : "+filePath);
		String fileName;
		File file;
		
		for (MultipartFile img : list) {
			fileName = img.getOriginalFilename();
			file = new File(filePath,fileName);
			try {
				img.transferTo(file);
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}
	
	@PostMapping(value = "upload2", produces = "text/html; charset=UTF-8")
	@ResponseBody
	public String upload2(@RequestParam MultipartFile img, HttpSession session) { // submit을 통해 넘어오는 값의 name과 반드시 같아야 mapping된다.
		String filePath = session.getServletContext().getRealPath("/WEB-INF/storage");
		System.out.println("실제폴더 위치 : "+filePath);
		String fileName = img.getOriginalFilename();
		
		File file = new File(filePath,fileName);
		
		try {
			img.transferTo(file);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		return "<img src='../storage/"+fileName+"' width='300' height='300'/>";
	}

}
