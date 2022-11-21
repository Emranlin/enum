public enum Week {
    MONDAY( "Дүйшөмбү күнү жава окуйм."),
    TUESDAY("Бейшемби күнү практикалык сабак."),
    WEDNESDAY("Шейшемби күнү англис тили жана жава окуйм. "),
    THURSDAY("Бейшемби күнү софт скиллс болот."),
    FRIDAY("Жума күнү жава окуйм."),
    SATURDAY("Ишемби күнү эс алам"),
    SUNDAY("Жекшемби күнү сабак даярдайм");
    private String timeTable;

    Week(String timeTable) {
        this.timeTable = timeTable;
    }

    public String getTimeTable() {
        return timeTable;
    }

    public void setTimeTable(String timeTable) {
        this.timeTable = timeTable;
    }
}

