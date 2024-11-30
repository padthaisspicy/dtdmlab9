public class Test1 {
    public static void main(String[] args) {
        FractionLinkedList fractionList = new FractionLinkedList();

        Fraction fraction1 = new Fraction(3, 4);
        Fraction fraction2 = new Fraction(5, 6);

        fractionList.add(fraction1);
        fractionList.add(fraction2);

        System.out.println("Fraction List: " + fractionList);

        Fraction searchFraction = new Fraction(3, 4);
        if (fractionList.contains(searchFraction)) {
            System.out.println(searchFraction + " is in the list.");
        } else {
            System.out.println(searchFraction + " is not in the list.");
        }

        Fraction removeFraction = new Fraction(1, 2);
        fractionList.remove(removeFraction);
        System.out.println("Updated Fraction List: " + fractionList);
        int index = 1;
        Fraction retrievedFraction = fractionList.get(index);
        System.out.println("Fraction at index " + index + ": " + retrievedFraction);
    }
}

