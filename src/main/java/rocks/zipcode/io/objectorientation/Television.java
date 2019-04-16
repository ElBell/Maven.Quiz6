package rocks.zipcode.io.objectorientation;

public class Television {
    private boolean isTurnedOn;
    private TVChannel tvChannel;

    public Television() {
    }

    public Television(boolean isTurnedOn, TVChannel tvChannel) {
        this.isTurnedOn = isTurnedOn;
        this.tvChannel = tvChannel;
    }

    public void turnOn() {
        isTurnedOn = true;
    }

    public void setChannel(Integer channel) {
        if (!isTurnedOn) {throw new IllegalStateException();}
        tvChannel = TVChannel.getByOrdinal(channel);
    }

    public TVChannel getChannel() {
        return tvChannel;
    }
}
