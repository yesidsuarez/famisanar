package co.com.famisanar.entity;

import java.time.LocalDate;
import java.time.LocalDateTime;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;

@Entity
@Table(name = "LIB_BOOKS")
public class LibBooks {

	@Id
	@Column(name = "BOOK_ID")
	private Integer bookId;

	@ManyToOne
	@JoinColumn(name = "BOOK_AUT_ID")
	private LibAuthors libAuthors;

	@ManyToOne
	@JoinColumn(name = "BOOK_CAT_ID")
	private LibBookCategories libBookCategories;

	@Column(name = "BOOK_ISBN")
	private String bookIsbn;

	@Column(name = "BOOK_PUBLISHED_DATE")
	private LocalDate bookPublishedDate;

	@Column(name = "BOOK_TITLE")
	private String bookTitle;

	@Column(name = "BOOK_PRICE")
	private Double bookPrice;

	@Column(name = "BOOK_DESCRIPCION")
	private String bookDescripcion;

	@Column(name = "BOOK_IMAGE")
	private byte[] bookImage;

	@Column(name = "BOOK_MIMETYPE")
	private String bookMimetype;

	@Column(name = "BOOK_FILENAME")
	private String bookFilename;

	@Column(name = "BOOK_IMAGE_LAST_UPDATE")
	private LocalDateTime bookImageLastUpdate;

	public Integer getBookId() {
		return bookId;
	}

	public void setBookId(Integer bookId) {
		this.bookId = bookId;
	}

	public LibAuthors getLibAuthors() {
		return libAuthors;
	}

	public void setLibAuthors(LibAuthors libAuthors) {
		this.libAuthors = libAuthors;
	}

	public LibBookCategories getLibBookCategories() {
		return libBookCategories;
	}

	public void setLibBookCategories(LibBookCategories libBookCategories) {
		this.libBookCategories = libBookCategories;
	}

	public String getBookIsbn() {
		return bookIsbn;
	}

	public void setBookIsbn(String bookIsbn) {
		this.bookIsbn = bookIsbn;
	}

	public LocalDate getBookPublishedDate() {
		return bookPublishedDate;
	}

	public void setBookPublishedDate(LocalDate bookPublishedDate) {
		this.bookPublishedDate = bookPublishedDate;
	}

	public String getBookTitle() {
		return bookTitle;
	}

	public void setBookTitle(String bookTitle) {
		this.bookTitle = bookTitle;
	}

	public Double getBookPrice() {
		return bookPrice;
	}

	public void setBookPrice(Double bookPrice) {
		this.bookPrice = bookPrice;
	}

	public String getBookDescripcion() {
		return bookDescripcion;
	}

	public void setBookDescripcion(String bookDescripcion) {
		this.bookDescripcion = bookDescripcion;
	}

	public byte[] getBookImage() {
		return bookImage;
	}

	public void setBookImage(byte[] bookImage) {
		this.bookImage = bookImage;
	}

	public String getBookMimetype() {
		return bookMimetype;
	}

	public void setBookMimetype(String bookMimetype) {
		this.bookMimetype = bookMimetype;
	}

	public String getBookFilename() {
		return bookFilename;
	}

	public void setBookFilename(String bookFilename) {
		this.bookFilename = bookFilename;
	}

	public LocalDateTime getBookImageLastUpdate() {
		return bookImageLastUpdate;
	}

	public void setBookImageLastUpdate(LocalDateTime bookImageLastUpdate) {
		this.bookImageLastUpdate = bookImageLastUpdate;
	}
}
