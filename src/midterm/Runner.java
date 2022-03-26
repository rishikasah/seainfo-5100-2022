package midterm;

public class Runner {



    public static void main(String[] args) {

        GPA g = new GPA(4, "A+", 100);
        Student st = new Student("St", 1, g, true);
        Student st1 = new Student("St1",2,g, false);
        System.out.println(" ---- Before Change");
        System.out.println(st.name + " " + st.id);
        st.gpa.display();
        System.out.println(st1.name + " " + st1.id);
        st1.gpa.display();

        g.setGpa(3.6f);
        g.setGrade("B+");
        g.setPercent(89f);

        System.out.println(" ---- After Change");

        System.out.println(st.name + " " + st.id);
        st.gpa.display();
        System.out.println(st1.name + " " + st1.id + " " + st1.gpa);
        st1.gpa.display();
        // Question 3
        Psychiatrist psy = new Psychiatrist();
        Moody happy = new Happy();
        Moody sad = new Sad();

        psy.examine(happy);
        psy.observe(happy);

        psy.examine(sad);
        psy.observe(sad);



        // Question 5
        Camera c1 = Camera.getInstance();

        c1.setCameraName("Nikon");

        Camera c2 = Camera.getInstance();
        System.out.println(c1.getCameraName());
        System.out.println(c2.getCameraName());

        c2.setCameraName("Kodak");
        System.out.println(c1.getCameraName());
        System.out.println(c2.getCameraName());

        // Question 6
        LongestSubstring s = new LongestSubstring();
        System.out.println(s.findLongestSubstring("abcabcbb"));
        System.out.println(s.findLongestSubstring("bbbbb"));
        System.out.println(s.findLongestSubstring("pwwkew"));
    }
}
