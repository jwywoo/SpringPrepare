package com.sparta.springprepare;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@NoArgsConstructor
@Getter
@Setter
public class Memo {
    private String username;
    private String contents;
}


class Main {
    public static void main(String[] args) {
        Memo memo = new Memo();
        System.out.println(memo.getUsername());
    }
}