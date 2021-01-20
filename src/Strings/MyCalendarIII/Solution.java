package Strings.MyCalendarIII;

import java.util.ArrayList;


public class Solution{
    public class Event{
        int start;
        int end;

        public Event(int start, int end){
            this.start = start;
            this.end = end;
        }

        public int getStart() {
            return start;
        }

        public void setStart(int start) {
            this.start = start;
        }

        public int getEnd() {
            return end;
        }

        public void setEnd(int end) {
            this.end = end;
        }

        public boolean detectOverlap(Event e){
            return (e.start >= this.start && e.start < this.end) || (this.start >= e.start && this.start < e.end);
        }

        public String toString(){
            return "{ 'start' => " + this.start + ", 'end' => " + this.end + "}";
        }
    }

    public class MyCalendarThree {
        ArrayList<Event> calendar;

        public MyCalendarThree() {
            calendar = new ArrayList<>();
        }

        public int book(int start, int end) {
            calendar.add(new Event(start, end));

            return analyzeK(calendar);
        }

        private int analyzeK(ArrayList<Event> input){
            System.out.println(input.toString());
            int max = 0;

            if(input.size() == 1){
                return 1;
            }

            for(int i = 0; i< calendar.size(); i++){
                Event mainEvent = calendar.get(i);
                int result = 0;
                for(int j = i+1; j < calendar.size(); j++){
                    Event curr = calendar.get(j);
                    if(mainEvent.detectOverlap(curr)){
                        max++;
                    }
                    System.out.println("Main Array: "+input );
                    ArrayList<Event> newInput = new ArrayList<>(input.subList(i, input.size()));
                    System.out.println("SubArray: "+newInput.toString());
                    result = analyzeK(newInput);

                }
                if(result > max) max = result;
            }
            return max;
        }
    }
//    @Test
//    void main() {
//        MyCalendarThree cal = new MyCalendarThree();
//        assertEquals(1, cal.book(24,40)); // returns 1
//        System.out.println("===========================");
//        assertEquals(1, cal.book(43,50)); // returns 1
//        System.out.println("===========================");
//        assertEquals(2, cal.book(27,43)); // returns 2
//        System.out.println("===========================");
//        assertEquals(2, cal.book(5,21)); // returns 3
//        System.out.println("===========================");
//        assertEquals(3, cal.book(30,40)); // returns 3
//        System.out.println("===========================");
//        assertEquals(3, cal.book(14,29)); // returns 3
//        System.out.println("===========================");
//        assertEquals(3, cal.book(3,19)); // returns 3
//        System.out.println("===========================");
//        assertEquals(3, cal.book(3,14)); // returns 3
//        System.out.println("===========================");
//        assertEquals(4, cal.book(25,39)); // returns 3
//        System.out.println("===========================");
//        assertEquals(4, cal.book(6,19)); // returns 3
//        System.out.println("===========================");
//
//    }
}