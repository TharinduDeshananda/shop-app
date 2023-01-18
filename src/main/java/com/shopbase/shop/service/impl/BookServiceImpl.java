package com.shopbase.shop.service.impl;

import com.shopbase.shop.dto.request.book.BookRequestDto;
import com.shopbase.shop.entity.Book;
import com.shopbase.shop.repository.BookRepository;
import com.shopbase.shop.service.BookService;
import lombok.Data;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.modelmapper.ModelMapper;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

@Service
@Data
@RequiredArgsConstructor
public class BookServiceImpl implements BookService {

    private final BookRepository bookRepository;
    private final ModelMapper modelMapper;

    @Override
    public Page<Book> getAllBoks(int index, int size) {
        return bookRepository.findAll(PageRequest.of(index,size));
    }

    @Override
    public void saveBook(BookRequestDto requestDto) {
        try {

            Book book = modelMapper.map(requestDto,Book.class);
            bookRepository.save(book);

        } catch (Exception e) {

            throw e;
        }
    }
}
