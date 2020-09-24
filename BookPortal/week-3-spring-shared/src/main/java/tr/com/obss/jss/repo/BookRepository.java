package tr.com.obss.jss.repo;

import java.util.List;
import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;
import tr.com.obss.jss.entity.Book;

@Repository
public interface BookRepository  extends JpaRepository<Book, Long> {
	
	List<Book> findByTitleIsContainingAndOperationTypeIsNotNullAndActiveTrueOrderByIdDesc(String title);
	
	List<Book> findByAuthorIsContainingAndIdIsNotNullAndOperationTypeIsNotNullAndActiveTrueOrderByIdDesc(String author);
	
    @Query(value = "select * from Book u where u.id = :id ORDER BY title asc", nativeQuery = true)
    Optional<Book> getByIdNative(long id);
}
