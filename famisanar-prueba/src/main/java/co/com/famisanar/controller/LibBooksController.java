package co.com.famisanar.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import co.com.famisanar.dto.LibBooksDto;
import co.com.famisanar.entities.service.LibBooksService;

@RestController
@RequestMapping("/api/book")
public class LibBooksController {
	
	@Autowired
	private LibBooksService libBooksService;
	
	@GetMapping("{category}")
	public List<LibBooksDto> getBooks(@PathVariable String category){
		return libBooksService.searchLibBooks(category);
	}

}
