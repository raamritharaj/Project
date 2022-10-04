package inheritanceProgram1;
  class House
     {
          float w=58;
        void msg()
       {
          System.out.println("Every person live in house");
         }
        }
       class Bighouse extends House
      {
          int e=101;
           double q=190.000;
        void msg()
          {
             System.out.println("Somepeople have the big house");
               }
            void msg1()
                  {
               System.out.println("We have a dream to buy house");
                  }
              }
           class Bangala extends Bighouse
              {
                public static void main (String[] args)
              {
                 House a = new House();
                     a.msg();
                        System.out.println("w value is"+a.w);
                   Bighouse b = new Bighouse();
                      b.msg();
                       b.msg1();

                   System.out.println("e value is"+b.e);
                      System.out.println("q value is"+b.q);
                  }
           }


        
