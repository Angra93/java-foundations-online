package ru.itsjava.collections.lists.collectionHW;

import lombok.AllArgsConstructor;
import lombok.Data;

@AllArgsConstructor
@Data
public class Book {
    private final String title;
    private String author;
    private int numberOfPages;


}
