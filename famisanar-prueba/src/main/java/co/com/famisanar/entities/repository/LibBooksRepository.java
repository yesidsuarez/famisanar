package co.com.famisanar.entities.repository;

import java.util.List;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import co.com.famisanar.entity.LibBooks;

@Repository
public interface LibBooksRepository extends CrudRepository<LibBooks, Integer> {

	@Query("SELECT b.bookTitle, "
			+ "b.libAuthors.autFirstName, "
			+ "b.libAuthors.autLasttName, "
			+ "b.bookIsbn, "
			+ "b.bookPrice, "
			+ "b.libBookCategories.catDescripcion, "
			+ "b.bookDescripcion"
			+ "FROM LibBooks b "
			+ "WHERE b.libBookCategories.catDescripcion = :category")
	List<LibBooks> getLibBooksByCategory(@Param("category") String category);
	//ordenados por autor y titulo.
}
