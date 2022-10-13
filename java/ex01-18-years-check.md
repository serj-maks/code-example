Scanner sc = new Scanner(System.in);
final int MIN_AGE = 18; //Minimum age requirement
int[] list = new int[5];
System.out.println("Enter the age of people:");
for (int i = 0; i < 5; i++) {
    list[i] = sc.nextInt();
}
System.out.println("Result for eligibility:");
for (int i = 0; i < 5; i++) {
    if (list[i] >= MIN_AGE) {
        System.out.println(i + " is Eligible");
    } else {
        System.out.println(i + " is Not Eligible");
    }
}
