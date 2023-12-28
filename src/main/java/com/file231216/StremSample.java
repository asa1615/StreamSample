package com.file231216;

import java.util.List;
import java.util.stream.Collectors;

public class main {
    public static void main(String[] args) {
        List<String> names = List.of("yamada","tanaka","yasuda","suzuki","iida");
        List<String> result = names.stream().filter(name -> name.contains("a")).toList();
    System.out.println(result);
        }
    }