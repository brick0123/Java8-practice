package time;

import java.time.*;
import java.time.format.DateTimeFormatter;
import java.time.temporal.ChronoUnit;
import java.util.Date;
import java.util.GregorianCalendar;

public class TimeApp {
    public static void main(String[] args) {
        // 기계
        Instant instant = Instant.now(); // 현재 시간을 기계 시간으로
        System.out.println(instant); // 기준시 UTC (GMT)

        ZoneId zone = ZoneId.systemDefault();
        System.out.println("zone = " + zone);
        ZonedDateTime zonedDateTime = instant.atZone(zone);
        System.out.println("zonedDateTime = " + zonedDateTime);

        //-----------------------------------

        // 사람
        LocalDateTime now = LocalDateTime.now();
        System.out.println(now);

        LocalDateTime birthDay = LocalDateTime.of(1994, Month.JANUARY, 23, 0, 0);
        System.out.println("birthDay = " + birthDay);

        ZonedDateTime nowInSeuld = ZonedDateTime.now(ZoneId.of("Asia/Seoul"));// 특정 지역
        System.out.println("nowInSeuld = " + nowInSeuld);

        // -------------------------------
        // 기간 표현

        LocalDate today = LocalDate.now();
        LocalDate thisYearBirthDay = LocalDate.of(2020, Month.JULY, 15);

        Period period = Period.between(today, thisYearBirthDay);
        System.out.println(period.getDays());

        Period until = today.until(thisYearBirthDay);
        System.out.println(until.getDays());
        System.out.println(until.get(ChronoUnit.DAYS));

        // machine용 시간 , 인스턴스로 비교
        Instant now2 = Instant.now();
        Instant plus2 = now2.plus(10, ChronoUnit.SECONDS);
//        now2.plus(10, ChronoUnit.DAYS); // immutable하기 때문에 변경되지 않는다!!!!!!!!!! 새로운 인스턴스를 만들어야함
        Duration between = Duration.between(now2, plus2);

        // formatting
        LocalDateTime now3 = LocalDateTime.now();
        DateTimeFormatter MMddyy = DateTimeFormatter.ofPattern("MM/dd/yyyy");
        System.out.println(now3.format(MMddyy));

        DateTimeFormatter isoDateTime = DateTimeFormatter.ISO_DATE_TIME;
        System.out.println(now3.format(isoDateTime));

        LocalDate parse = LocalDate.parse("07/15/1999", MMddyy);
        System.out.println("parse = " + parse);

        // 레거시 API 지원
        Date date = new Date();

        Instant instant3 = date.toInstant(); // date -> time
        Date newDate = Date.from(instant3); // time -> date

        GregorianCalendar gregorianCalendar = new GregorianCalendar();
        LocalDate dateTime = gregorianCalendar.toInstant().atZone(ZoneId.systemDefault()).toLocalDate();

    }


}
