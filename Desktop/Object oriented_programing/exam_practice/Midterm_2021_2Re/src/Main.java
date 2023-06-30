
public class Main {
        public static void main(String[] args) {
            String string = "In blandit lacus ac sapien dictum, elementum\n" +
                    "fringilla sem varius. Vestibulum consectetur\n" +
                    "metus at felis porttitor, a rhoncus neque\n" +
                    "consectetur. Integer vehicula felis non metus\n" +
                    "eleifend, in blandit risus ullamcorper. Phasellus\n" +
                    "mauris nisi, facilisis et quam placerat, congue\n" +
                    "venenatis diam. Praesent in erat odio. Phasellus\n" +
                    "sit amet efficitur sem. Ut quis mi venenatis,\n" +
                    "feugiat justo eu, rhoncus velit. Suspendisse\n" +
                    "iaculis tempus sapien. Integer mauris neque,\n" +
                    "posuere sed mi at, aliquet facilisis nibh. Cras\n" +
                    "vel blandit lorem. Aliquam suscipit, nisl id\n" +
                    "condimentum condimentum, purus magna maximus sem,\n" +
                    "vitae vehicula diam nisi ac enim.";

            String[] splitStrings = string.split("\\s+");

            Speech speech = new Speech(splitStrings);
            SpeechHistogram speechHistogram = new SpeechHistogram(speech);

            speechHistogram.calculateHistogram();
            speechHistogram.print();
        }
    }