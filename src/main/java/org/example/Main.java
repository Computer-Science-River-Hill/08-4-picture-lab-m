package org.example;

public class Main {
  public static void main(String[] args) {  
        Picture pict = new Picture("images/arch.jpg");
        pict.show();
        pict.zeroBlue();
        pict.show();
        PictureTester.main(args);
      }
} 
