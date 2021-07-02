package com.example.study.real_world;

@FunctionalInterface
public interface BanTransactionFilter {
    boolean test(BankTransaction bankTransaction);
}
