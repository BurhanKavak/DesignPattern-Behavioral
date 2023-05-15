public class Main {
    public static void main(String[] args) {
        ChannelCollection channels = populateChannels();
        ChannelIterator baseIterator = channels.iterator(ChannelTypeEnum.ALL);
        while (baseIterator.hasNext()) {
            Channel c = baseIterator.next();
            System.out.println(c.toString());
        }
        System.out.println("************");

        ChannelIterator turkiyeIterator = channels.iterator(ChannelTypeEnum.TURKIYE);
        while (turkiyeIterator.hasNext()) {
            Channel c = turkiyeIterator.next();
            System.out.println(c.toString());
        }

    }

    private static ChannelCollection populateChannels() {
        ChannelCollection channels = new ChannelCollectionImpl();
        channels.addChannel(new Channel(98.5,ChannelTypeEnum.TURKIYE));
        channels.addChannel(new Channel(99.5,ChannelTypeEnum.TURKIYE));
        channels.addChannel(new Channel(100.5,ChannelTypeEnum.ENGLISH));
        channels.addChannel(new Channel(101.5,ChannelTypeEnum.ENGLISH));
        channels.addChannel(new Channel(102.5,ChannelTypeEnum.FRENCH));
        channels.addChannel(new Channel(103.5,ChannelTypeEnum.TURKIYE));
        channels.addChannel(new Channel(104.5,ChannelTypeEnum.ENGLISH));
        channels.addChannel(new Channel(105.5,ChannelTypeEnum.FRENCH));
        return channels;
    }
}