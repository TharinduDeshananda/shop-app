package com.shopbase.shop.service;

import com.shopbase.shop.dto.request.book.BookRequestDto;
import com.shopbase.shop.entity.Book;
import org.springframework.data.domain.Page;

public interface BookService {

    Page<Book> getAllBoks(int index,int size);
    void saveBook(BookRequestDto requestDto);
}
