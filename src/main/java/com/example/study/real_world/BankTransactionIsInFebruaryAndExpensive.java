package com.example.study.real_world;

import java.time.Month;

public class BankTransactionIsInFebruaryAndExpensive implements BanTransactionFilter{
    @Override
    public boolean test(BankTransaction bankTransaction) {
        return bankTransaction.getDate().getMonth() == Month.FEBRUARY
                && bankTransaction.getAmount() >= 1000;
    }
}
