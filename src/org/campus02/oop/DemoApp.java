package org.campus02.oop;

public class DemoApp {
    public static void main(String[] args) {

        PaymentJournal pmj = new PaymentJournal();

        CashPayment p1 = new CashPayment(233.54, "EUR");
        CreditCardPayment p2 = new CreditCardPayment(423.75, "SEK", "12345678", "1234");
        MaestroPayment p3 = new MaestroPayment(123.45, "GBP", "987654321");

        pmj.add(p1);
        pmj.add(p1);
        pmj.add(p1);
        pmj.add(p2);
        pmj.add(p2);
        pmj.add(p2);
        pmj.add(p2);
        pmj.add(p2);
        pmj.add(p2);
        pmj.add(p2);
        pmj.add(p3);
        pmj.add(p3);


        System.out.println("Total Transaction Costs: " + pmj.totalTransactionCosts());
        System.out.println("Payments per Currency: " + pmj.getPaymentsPerCurrency());

    }
}
