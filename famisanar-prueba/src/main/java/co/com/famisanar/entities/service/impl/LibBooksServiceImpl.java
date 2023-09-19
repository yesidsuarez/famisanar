package co.com.famisanar.entities.service.impl;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import co.com.famisanar.dto.LibBooksDto;
import co.com.famisanar.entities.repository.LibBooksRepository;
import co.com.famisanar.entities.service.LibBooksService;
import co.com.famisanar.entity.LibBooks;

@Service
public class LibBooksServiceImpl implements LibBooksService{

	@Autowired
	private LibBooksRepository libBooksRepository;
	
	@Override
	public List<LibBooksDto> searchLibBooks(String category) {
		List<LibBooks> books = libBooksRepository.getLibBooksByCategory(category); 
		List<LibBooksDto> foundBooks = new ArrayList<>();
		
		for (LibBooks libBooks : books) {
			LibBooksDto libBooksDto = new LibBooksDto();
			libBooksDto.setTitle(libBooks.getBookTitle());
			libBooksDto.setAuthor(libBooks.getLibAuthors().getAutFirstName() + libBooks.getLibAuthors().getAutLastName());
			libBooksDto.setIsbn(libBooks.getBookIsbn());
			libBooksDto.setPrice(libBooks.getBookPrice());
			libBooksDto.setCategory(libBooks.getLibBookCategories().getCatDescripcion());
			libBooksDto.setDescription(libBooks.getBookDescripcion());
			
			foundBooks.add(libBooksDto);
		}
		
		return foundBooks;
	}

}
