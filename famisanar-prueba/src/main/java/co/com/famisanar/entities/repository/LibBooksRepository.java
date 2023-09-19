package co.com.famisanar.entities.repository;

import java.util.List;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import co.com.famisanar.entity.LibBooks;

@Repository
public interface LibBooksRepository extends CrudRepository<LibBooks, Integer> {

	@Query("SELECT b "
			+ "FROM LibBooks b "
			+ "WHERE b.libBookCategories.catDescripcion = :category "
			+ "ORDER BY b.libAuthors.autId DESC, b.bookTitle ASC")
	List<LibBooks> getLibBooksByCategory(@Param("category") String category);
}
