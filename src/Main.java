// Author: Arni Tamayo
// Date: 08/10/2026
// Class/Method:
// Purpose:

/*

*/


void main(){
    Scanner sc = new Scanner(System.in);
    int minutes = sc.nextInt();
    double basicBill = (minutes / 3.0) * 5;
    double addedBill = basicBill + 5.5;
    double discountedBill = addedBill;
    if(addedBill > 30) discountedBill -= addedBill * 0.05;
    System.out.printf("Basic: %.2f \n",basicBill);
    System.out.println(addedBill);
    System.out.println(discountedBill);
}









