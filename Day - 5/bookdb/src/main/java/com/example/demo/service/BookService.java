
package com.example.demo.service;

import java.util.List;
import java.util.Optional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.example.demo.model.Book;
import com.example.demo.repository.BookRepository;

@Service
public class BookService
{
@Autowired
BookRepository repository;
public boolean addStudent(Book book)
{
repository.save(book);
return true;
}
public List<Book>getBook()
{
return repository.findAll();
}
public Optional<Book>getBookById(int id)
{
return repository.findById(id);
}
public Book updateStudent(Book book)
{
repository.save(book);
return book;
}
public boolean deleteBookById(int id)
{
repository.deleteById(id);
return true;
}
}
