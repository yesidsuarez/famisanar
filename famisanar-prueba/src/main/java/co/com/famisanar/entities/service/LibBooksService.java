package co.com.famisanar.entities.service;

import java.util.List;

import co.com.famisanar.dto.LibBooksDto;

public interface LibBooksService {

	List<LibBooksDto> searchLibBooks(String category);
}
