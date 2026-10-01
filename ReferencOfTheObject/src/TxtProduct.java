 public  class TxtProduct
    {
        public static void main(String [] args)
    {
        Product p1 = new Product("leptop", "dell", 53000);
        Product p2 = new Product("mouse", "logicTech", 530);
        p1.showDetails();
        System.out.println("***********************************");
        p2.showDetails();
    }
    }