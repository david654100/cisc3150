public class encoding {
    public static void main(String[] args) {
                 {
            System.out.println("Default Charset=" + Charset.defaultCharset());
            System.setProperty("file.encoding", "Latin-1");
            System.out.println("file.encoding=" + System.getProperty("file.encoding"));
            System.out.println("Default Charset=" + Charset.defaultCharset());
            System.out.println("Default Charset in Use=" + getDefaultCharSet());
        }

        private static String getDefaultCharSet() {
            OutputStreamWriter writer = new OutputStreamWriter(new ByteArrayOutputStream());
            String enc = writer.getEncoding();
            return enc;
        }
}}
