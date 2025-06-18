// public class Account{

// private double accountBalance;
// private String accountName;
// private int accountNo;

//    Account(double accountBalance, String accountName, int accountNo){
//       this.accountBalance = accountBalance;
//       this.accountName = accountName;
//       this.accountNo= accountNo;

//    }
//    //SETTERS
//    public void setBal (double bal){
//       accountBalance = bal;
//    }
//    public void setName (String Nam){
//        accountName = Nam;
//    }
//    public void setNo (int No){
//       accountNo = No;
//    }
//    //GETTERS
//    public double getBal (){
//       return accountBalance;
//    }
//    public String getName(){
//       return accountName;
//    }
//    public int getNo(){
//       return accountNo;
//    }
// }


// 1. Abstract Account class
abstract public class Account {
   protected int id;
   protected String name;
   private DataSource myData;

   public void performOperation(DataSource _myData) {
      myData = _myData;
      myData.execute();
   }
}
