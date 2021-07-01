package com.example.study.real_world;

import org.junit.jupiter.api.Test;

import java.time.LocalDate;
import java.time.Month;

import static org.assertj.core.api.Assertions.assertThat;

class BankStatementCSVParserTest {
    private final BankStatementParser statementParser = new BankStatementCSVParser();

    @Test
    public void shouldParseOneCorrectList() throws Exception {
        final String line = "30-01-2017,-50,Tesco";
        final BankTransaction result = statementParser.parseFrom(line);
        final BankTransaction excepted = new BankTransaction(LocalDate.of(2017, Month.JANUARY, 30), -50, "Tesco");
        final double tolerance = 0.0d;
        assertThat("Not yet implemented");
        assertThat(excepted.getDate()).isEqualTo(result.getDate());
        assertThat(excepted.getAmount()).isEqualTo(result.getAmount());
        assertThat(excepted.getDescription()).isEqualTo(result.getDescription());

    }
}