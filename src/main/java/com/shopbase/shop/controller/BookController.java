package com.shopbase.shop.controller;

import com.shopbase.shop.dto.request.book.BookRequestDto;
import com.shopbase.shop.entity.Book;
import com.shopbase.shop.service.BookService;
import lombok.RequiredArgsConstructor;
import org.springframework.data.domain.Page;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RequestMapping("v1/book")
@RestController
@RequiredArgsConstructor
public class BookController {
    private final BookService bookService;

    @GetMapping("")
    public ResponseEntity<Page<Book>> getAllBooks(@RequestParam(required = false,defaultValue = "0") int index,@RequestParam(required = false,defaultValue = "10") int size){

        return ResponseEntity.ok(bookService.getAllBoks(index,size));
    }
    @PostMapping("")
    public ResponseEntity saveBook(@RequestBody BookRequestDto requestDto){
        bookService.saveBook(requestDto);
        return ResponseEntity.ok("Done");
    }
}
