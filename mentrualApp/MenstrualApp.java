import java.time.LocalDate;

public class MenstrualApp{
    
    public LocalDate getFlowStartDate(LocalDate lastPeriodStartDate){
        return lastPeriodStartDate;
    }

    public LocalDate getFlowEndDate(LocalDate lastPeriodStartDate, int periodDuration){
        return lastPeriodStartDate.plusDays(periodDuration);
    }

    public LocalDate getNextFlowStartDate(LocalDate lastPeriodStartDate, int cycleDuration){
        return lastPeriodStartDate.plusDays(cycleDuration);
    }
    



}
