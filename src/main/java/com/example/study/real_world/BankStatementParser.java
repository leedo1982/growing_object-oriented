package com.example.study.real_world;

import java.util.List;

public interface BankStatementParser {
    BankTransaction parseFrom(String line);

    List<BankTransaction> parserLinesFrom(List<String> lines);
}
