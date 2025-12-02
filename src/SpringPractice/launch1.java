package SpringPractice;

import servide.java;
import servide.service;
import servide.sprinboot;

public class launch1 {
    public static void main(String[] args) {
        service ser = new service();
        ser.setIcourse(new java());
        ser.setIcourse(new sprinboot());
      Boolean status =ser.buycourse(2300.0);
      if(status){
          System.out.println("payment done");
      }
      else {
          System.out.println("payment not done");
      }

    }
}
