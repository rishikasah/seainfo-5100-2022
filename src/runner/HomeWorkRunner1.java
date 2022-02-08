package runner;
import homework1.*;

// Runner class used for executing other classes
public class HomeWorkRunner1 {

    public static void main(String[] args) {

        System.out.println();
        System.out.println("---- PALINDROME -------");
        String test1 = "A man, a plan, a canal: Panama";
        String test2 = "race a car";
        String test3 = " ";
        Palindrome pl = new Palindrome();

        System.out.println(" ");
        System.out.println(pl.isPalindrome(test1));
        System.out.println(pl.isPalindrome(test2));
        System.out.println(pl.isPalindrome(test3));

        System.out.println();
        System.out.println("---- UNIQUE CHARACTER -------");
        test1 = "abcd21jk"; // true
        test2 = "hutg654mnd!nk9"; //False

        UniqueCharacter unique = new UniqueCharacter();

        System.out.println("String Unique Characters Test");
        System.out.println(unique.hasAllUniqueCharacters(test1));
        System.out.println(unique.hasAllUniqueCharacters(test2));

        System.out.println();
        System.out.println("---- DUPLICATES IN STRING -------");
        DuplicatesInString dup = new DuplicatesInString();
        System.out.println(dup.stringHasDuplicates("hello hi how are you, hello again"));
        System.out.println(dup.stringHasDuplicates("HeyIamfun"));

        System.out.println();
        System.out.println("---- ARE ANAGRAMS -------");
        Anagrams anagrams = new Anagrams();
        System.out.println(anagrams.isAnagram("listen", "silent"));
        System.out.println(anagrams.isAnagram("fasten", "silent"));

        System.out.println(anagrams.isAnagram2("listen", "silent"));
        System.out.println(anagrams.isAnagram2("fasten", "silent"));

        System.out.println();
        System.out.println("---- LEAP YEAR -------");
        LeapYear year = new LeapYear();
        System.out.println(year.isLeapYear(2100));
        System.out.println(year.isLeapYear(2400));

        System.out.println();
        System.out.println("---- PHONE BILL -------");
        PhoneBill bill =  new PhoneBill();
        System.out.println(bill.generatePhoneBill(154));

        // Ranson Ware
        System.out.println();
        System.out.println("---- RANSOM NOTE -------");
        RansomNote note = new RansomNote();
        System.out.println(note.ransomNoteConstructed("a","b"));
        System.out.println(note.ransomNoteConstructed("aa","ab"));
        System.out.println(note.ransomNoteConstructed("aa","aab"));
        System.out.println();

        // Prompt Grade
        System.out.println();
        System.out.println("---- PROMPT GRADE -------");
        PromptGrade pg = new PromptGrade();
        System.out.println(pg.promptGrade('a'));
        System.out.println(pg.promptGrade('D'));
        System.out.println(pg.promptGrade('1'));
        System.out.println();

        // Book Class
        System.out.println();
        System.out.println("---- BOOK CLASS------");
        Book b = new Book("Harry Potter", 1234, "Fiction", 58.43);
        System.out.println(b.getPrice());
        b.setPrice(43.23);
        System.out.println(b.getPrice());

        // Box Class
        System.out.println();
        System.out.println("---- BOX CLASS------");
        Box box = new Box(9, 6, 10);
        System.out.println(box.volume());
    }
}
