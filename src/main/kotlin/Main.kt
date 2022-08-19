fun main() {
    val amount = 1100
    val sale = 100
    val highSale = 0.05
    val melomanSale = 0.01
    val meloman = false
    val totalSale = if (amount <= 1000){
         amount
    }else if (amount in 1001..10000){
         amount - sale.toInt()
    }else {
        amount - (amount * highSale).toInt()
    }
    val amountWithSales = if (meloman) totalSale - (melomanSale * totalSale) else totalSale

println("Ваша сумма к оплате с учетом всех скидок $amountWithSales")

}




