package com.example.demo.model;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;

@Entity
public class Book
{
@Id
private int id;
private String bookName;
private float price;
private String authorName;
public int getId()
{
return id;
}
public String getBookName() {
return bookName;
}
public void setBookName(String bookName) {
this.bookName = bookName;
}
public float getPrice() {
return price;
}
public void setPrice(float price) {
this.price = price;
}
public String getAuthorName() {
return authorName;
}
public void setAuthorName(String authorName) {
this.authorName = authorName;
}
public void setId(int id) {
this.id = id;
}
@Override
public String toString() {
return "Book [id=" + id + ", bookName=" + bookName + ", price=" + price + ", authorName=" + authorName + "]";
}
}