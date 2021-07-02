package com.example.study.real_world.chapter02;

import java.util.List;

public interface BankStatementParser {
    BankTransaction parseFrom(String line);

    List<BankTransaction> parserLinesFrom(List<String> lines);
}
