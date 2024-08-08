package com.example.androidmentorshipassignments.assignment3

//8. Bank Account Management
// - Create a class `BankAccount` with properties `accountNumber`, `accountHolderName`, and
//`balance`.
// - Implement methods `deposit(amount: Double)` and `withdraw(amount: Double)` to update the
//balance.
// - Create an array of `BankAccount` objects representing different accounts.
// - Use a loop to perform some deposits and withdrawals, and print the final balance of each
//account.
// - **Bonus:** Add a method `displayAccountInfo()` to print the account's details.

fun main(){

    val account1 = BankAccount(3787230748374,"Mary",28763333)
    val account2 = BankAccount(3787230709090,"Gary",1989289882)
    val account3 = BankAccount(3787230748383,"Hary",12223)
    val account4 = BankAccount(3787230737723,"Jary",98898)
    val account5 = BankAccount(3787273672687,"Lary",987)


    account2.deposit(230.45)
    account4.deposit(78.5)
    account3.deposit(890.0)
    account5.deposit(878.0)
    account1.deposit(234990.0)

    account2.withdraw(120.0)
    account1.withdraw(2837287987.0)

    val accounts = arrayOf(account1,account2,account3,account4,account5)

    for(account in accounts){
        account.displayAccountInfo()
        println("${account.accountHolderName} has $${account.balance} balance in Account")
    }

}

class BankAccount(val accountNumber: Long, val accountHolderName: String , var balance: Long){

    fun deposit(amount: Double):Long{
        if(amount > 0){
            balance += amount.toLong()
            println("$$amount amount deposited in $accountNumber Account Number, Now the Balance is: $$balance")
        }else{
            println("Kindly write the valid amount to be added")
        }
        return balance

    }

    fun withdraw(amount: Double): Long{
        if(amount != 0.0 && amount <= balance){
            balance -= amount.toLong()
            println("$$amount amount withdrew from $accountNumber Account Number, Now the Balance is: $$balance")
        }
        else{
            println("Kindly write the amount less than your balance in the Account Number: $accountNumber by $accountHolderName")
        }
        return balance
    }

    fun displayAccountInfo(){
        println("$accountHolderName has $accountNumber Account Number")
    }
}
