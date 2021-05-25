package com.programacion.db;

import java.io.Serializable;

public class Libro implements Serializable {
	private int id;
	private String isbn;
	private String title;
	private int autor_id;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getIsbn() {
		return isbn;
	}

	public void setIsbn(String isbn) {
		this.isbn = isbn;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public int getAutor_id() {
		return autor_id;
	}

	public void setAutorid(int autorid) {
		this.autor_id = autor_id;
	}

}
