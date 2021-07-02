package com.example.study.real_world;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.time.Month;
import java.util.List;

public class BankStatementAnalyzer {
    private static final String RESOURCES = "src/main/resources/";
    private static final BankStatementCSVParser bankStatementCSVParser = new BankStatementCSVParser();

    public static void main(final String... args) throws IOException {

        final String fileName = args[0];

    }


    public void analyze(final String fileName, final BankStatementParser bankStatementParser) throws IOException {
        final Path path = Paths.get(RESOURCES + fileName);
        final List<String> lines = Files.readAllLines(path);

        final List<BankTransaction> bankTransactions = bankStatementParser.parserLinesFrom(lines);
        final BankTransactionProcessor bankTransactionProcessor = new BankTransactionProcessor(bankTransactions);

        collectSummary(bankTransactionProcessor);

    }

    private static void collectSummary(BankTransactionProcessor bankTransactionProcessor) {
        System.out.println("The total for all transactions is " + bankTransactionProcessor.calculateTotalAmount());
        System.out.println("The total for all transactions in january is " + bankTransactionProcessor.selectInMoth(Month.JANUARY));
        System.out.println("The total for all transactions in February is " + bankTransactionProcessor.selectInMoth(Month.FEBRUARY));
        System.out.println("The total salary received is " + bankTransactionProcessor.calculateTotalForCategory("Salary"));

    }


}
