public class Money {
  int amount;
  String currency;

  public Money(int amount, String currency) {
    this.amount = amount;
    this.currency = currency;
  }


  public Money add(Money other){
    int newAmount = this.amount + other.amount;
    return new Money(newAmount, this.currency);
  }

  private Money negative(){
    return new Money(amount * -1, currency);
  }

  public Money subtract(Money other){
    return this.add(other.negative());
  }

  public static void main(String[] args) {
    Money m1 = new Money(5, "USD");
    Money m2 = new Money(10, "USD");
    System.out.println(m1.subtract(m2).amount);
  }
}
