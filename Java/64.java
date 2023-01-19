class Discount {
    public static void main(String[] args) {
        int discount = 10;
        int mrp = 50;
        /*
         * For (discount/100), value of sellingPrice = 50.0 [i.e discount/100 = int(10/100) = 0]
         * For (discount/100.0), value of sellingPrice = 45.0 [i.e discount/100 = double(10/100) = 0.1]
         * Why do i have to put the '.0' after 100 for the type casting to work?
         */
        double sellingPrice = mrp - (discount/100.0)*mrp;
        System.out.println("Final price: "+sellingPrice);
    }
}