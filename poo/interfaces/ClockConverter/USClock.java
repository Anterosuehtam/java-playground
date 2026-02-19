package poo.interfaces.ClockConverter;

public non-sealed class USClock extends Clock{

    private String periodIndicator;

    public String getPeriodIndicator() {
        return periodIndicator;
    }

    public void setHour(int hour) {
        if ((hour >= 0) && (hour <= 11)) {
            this.periodIndicator = "AM";
            this.hour = (hour == 0) ? 12 : hour;
        } else if ((hour >= 12) && (hour <= 23)) {
            this.periodIndicator = "PM";
            this.hour = (hour == 12) ? 12 : hour - 12;
        } else {
            this.hour = 0;
            this.periodIndicator = "AM";
        }
    }

    @Override
    Clock convert(Clock clock) {
        this.second = clock.getSecond();
        this.minute = clock.getMinute();
        switch (clock) {
            case USClock usClock -> {
                this.hour = usClock.getHour();
                this.periodIndicator = usClock.getPeriodIndicator();
            }
            case BRLClock brlClock -> this.setHour(brlClock.getHour());
        }
        return this;
    }

    @Override
    public String getTime() {
        return super.getTime() + " " + this.periodIndicator;
    }
}
