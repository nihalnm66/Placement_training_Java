import java.util.Arrays;

public class MeetingRooms {
    public static boolean canAttendMeetings(int[][] intervals) {
        Arrays.sort(intervals, (a, b) -> a[0] - b[0]);
        for (int i = 1; i < intervals.length; i++) {
            if (intervals[i][0] < intervals[i - 1][1]) {
                return false;
            }
        }
        return true;
    }

    // public static boolean canAttendMeetings(int[][] intervals) {
    //     for (int i = 0; i < intervals.length; i++) {
    //         for (int j = i + 1; j < intervals.length; j++) {
    //             if (intervals[i][0] < intervals[j][1] &&
    //                 intervals[j][0] < intervals[i][1]) {
    //                 return false;
    //             }
    //         }
    //     }
    //     return true;
    // }
    public static void main(String[] args) {
        int[][] intervals1 = {{0, 30},{5, 10},{15, 20}};
        int[][] intervals2 = {{5, 8},{9, 15}};
        System.out.println(canAttendMeetings(intervals1)); 
        System.out.println(canAttendMeetings(intervals2)); 
    }
}