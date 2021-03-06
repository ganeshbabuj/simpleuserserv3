package com.example.simpleuserserv3.resource;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class UserCollection {

    private long totalItems;
    private long totalPages;
    private int page;
    private int pageSize;

    private List<User> items;

}
