public class Exercise02 { 
private static final int MINUTES_IN_AN_HOUR = 60; 
private static final int SECONDS_IN_A_MINUTE = 60; 
public static void main(String[] args) { 
int seconds = 195; 
int minutes = 118;
int hours = 3;
System.out.println(timeConversion(seconds)); 
System.out.println(timeConversion(minutes));
System.out.println(timeConversion(hours));
}
private static String timeConversion(int totalSeconds) { 
int hours = totalSeconds / MINUTES_IN_AN_HOUR / SECONDS_IN_A_MINUTE; int minutes = (totalSeconds - (hoursToSeconds(hours)))
/ SECONDS_IN_A_MINUTE;
int seconds = totalSeconds - ((hoursToSeconds(hours)) + (minutesToSeconds(minutes))); 
return hours + " hours " + minutes + " minutes " + seconds + " seconds"; 
} 
private static int hoursToSeconds(int hours) {
return hours * MINUTES_IN_AN_HOUR * SECONDS_IN_A_MINUTE; 
} 
private static int minutesToSeconds(int minutes) {
return minutes * SECONDS_IN_A_MINUTE; 
} 
}